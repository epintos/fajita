package ar.uba.dc.rfm.fajita.translation;

import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.KIASAN_REPOK_METHOD;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.getContainingClass;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.getContainingMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import recoder.CrossReferenceServiceConfiguration;
import recoder.ProgramFactory;
import recoder.convenience.TreeWalker;
import recoder.java.CompilationUnit;
import recoder.java.Expression;
import recoder.java.Identifier;
import recoder.java.PackageSpecification;
import recoder.java.SourceVisitor;
import recoder.java.Statement;
import recoder.java.StatementBlock;
import recoder.java.declaration.MethodDeclaration;
import recoder.java.declaration.VariableDeclaration;
import recoder.java.expression.ParenthesizedExpression;
import recoder.java.expression.literal.BooleanLiteral;
import recoder.java.expression.operator.BinaryAndAssignment;
import recoder.java.expression.operator.BinaryOrAssignment;
import recoder.java.expression.operator.BinaryXOrAssignment;
import recoder.java.expression.operator.CopyAssignment;
import recoder.java.expression.operator.DivideAssignment;
import recoder.java.expression.operator.Equals;
import recoder.java.expression.operator.GreaterOrEquals;
import recoder.java.expression.operator.GreaterThan;
import recoder.java.expression.operator.LessOrEquals;
import recoder.java.expression.operator.LessThan;
import recoder.java.expression.operator.LogicalAnd;
import recoder.java.expression.operator.LogicalOr;
import recoder.java.expression.operator.MinusAssignment;
import recoder.java.expression.operator.ModuloAssignment;
import recoder.java.expression.operator.NotEquals;
import recoder.java.expression.operator.PlusAssignment;
import recoder.java.expression.operator.ShiftLeftAssignment;
import recoder.java.expression.operator.ShiftRightAssignment;
import recoder.java.expression.operator.TimesAssignment;
import recoder.java.expression.operator.UnsignedShiftRightAssignment;
import recoder.java.reference.MethodReference;
import recoder.java.reference.TypeReference;
import recoder.java.reference.UncollatedReferenceQualifier;
import recoder.java.statement.For;
import recoder.java.statement.If;
import recoder.java.statement.Return;
import recoder.java.statement.While;
import recoder.kit.ProblemReport;
import recoder.list.generic.ASTArrayList;
import recoder.list.generic.ASTList;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaException;

/**
 * This class holds the logic for instrumenting the branch coverage criteria.
 * Given a parsed compilation unit this class will, through the method execute,
 * transform the input AST removing the roops goal syntax and adding the
 * necessary constructions to perform branch coverage using Taco.
 */
public class MultipleConditionTransformation extends FajitaSourceTransformation {

    private Map<String, String> methodsType = new HashMap<>();

    /**
     * Constructor for a <code>BranchTransformation</code>.
     * 
     * @param configuration
     *            a <code>FajitaConfiguration</code> with the necessary data to
     *            transform the input code.
     * 
     * @param recoder
     *            a class from the recoder project that acts as starting point
     *            of the library and has different possible configurations.
     * 
     * @param compilationUnit
     *            the compilation unit parsed as an AST to be transformed upon
     *            execution.
     * 
     */
    public MultipleConditionTransformation(FajitaConfiguration configuration, CrossReferenceServiceConfiguration recoder,
            CompilationUnit compilationUnit) {
        super(configuration, recoder, compilationUnit);
    }

    /**
     * This method actually performs the transformation of the input code.
     * 
     * @return a <code>ProblemrReport</code> that fulfills the interface
     *         required by the <code>recoder.Transformation</code> base class.
     * 
     */
    @Override
    public ProblemReport execute() {
        FajitaBranchDiscoveryVisitor eraserVisitor = new FajitaBranchDiscoveryVisitor(configuration, this, getReachableMethods());

        TreeWalker treeWalker = new TreeWalker(compilationUnit);
        while (treeWalker.next())
            treeWalker.getProgramElement().accept(eraserVisitor);

        MethodTypeVisitor methodTypeVisitor = new MethodTypeVisitor(configuration, this, getReachableMethods());

        TreeWalker treeWalker2 = new TreeWalker(compilationUnit);
        while (treeWalker2.next())
            treeWalker2.getProgramElement().accept(methodTypeVisitor);

        return execute(new FajitaSourceTransformVisitor<MultipleConditionTransformation>(configuration, this));
    }

    /** Returns a set with the names of the methods in the class to check. */
    private Set<String> getClassMethods() {
        Set<String> classMethods = new HashSet<String>();

        String classToCheck = configuration.getClassToCheck();
        String[] splitClassToCheck = classToCheck.split("\\.");
        classToCheck = "";
        for (int idx = 0; idx < splitClassToCheck.length - 2; idx++) {
            classToCheck += splitClassToCheck[idx] + ".";
        }
        if (splitClassToCheck.length > 1) {
            classToCheck += splitClassToCheck[splitClassToCheck.length - 2] + "Instrumented.";
        }
        classToCheck += splitClassToCheck[splitClassToCheck.length - 1];

        FajitaClassMethodDiscoveryVisitor methodDiscoveryVisitor = new FajitaClassMethodDiscoveryVisitor(classToCheck, classMethods);
        TreeWalker treeWalker = new TreeWalker(compilationUnit);
        while (treeWalker.next())
            treeWalker.getProgramElement().accept(methodDiscoveryVisitor);

        return classMethods;
    }

    /** Returns the set of reachable methods from the method under test. */
    private Set<String> getReachableMethods() {
        Set<String> reachableMethods = new HashSet<String>();

        Map<String, Set<String>> referencedMethods = new HashMap<String, Set<String>>();
        FajitaReachableMethodDiscoveryVisitor reachableMethodDiscoveryVisitor = new FajitaReachableMethodDiscoveryVisitor(
                getClassMethods(), referencedMethods);
        TreeWalker treeWalker = new TreeWalker(compilationUnit);
        while (treeWalker.next())
            treeWalker.getProgramElement().accept(reachableMethodDiscoveryVisitor);

        Set<String> remainingMethods = new HashSet<String>();
        remainingMethods.add(configuration.getMethodToCheck());

        while (!remainingMethods.isEmpty()) {
            String method = remainingMethods.iterator().next();
            remainingMethods.remove(method);
            if (reachableMethods.add(method) && referencedMethods.containsKey(method))
                remainingMethods.addAll(referencedMethods.get(method));
        }

        return reachableMethods;
    }

    /**
     * This private class holds the logic to discover the amount of methods the
     * class to check has defined.
     */
    private static class FajitaClassMethodDiscoveryVisitor extends SourceVisitor {

        /** The name of the class being analyzed. */
        private final String className;

        /** A set with the discovered methods. */
        private final Set<String> classMethods;

        /** The file package name if any. */
        private String packagePrefix = "";

        /**
         * Constructor for a <code>FajitaClassMethodDiscoveryVisitor</code>
         * 
         * @param configuration
         *            a <code>FajitaConfiguration</code> with the necessary data
         *            to discover the target goals.
         */
        FajitaClassMethodDiscoveryVisitor(String className, Set<String> classMethods) {
            this.className = className;
            this.classMethods = classMethods;
        }

        /**
         * This method is executed for each package specification in the
         * analyzed compilation unit. The package name is stored in order to be
         * able to determine the full name of the classes declared inside the
         * compilation unit.
         */
        @Override
        public void visitPackageSpecification(PackageSpecification x) {
            packagePrefix = x.getPackageReference().toSource().trim() + ".";
        }

        /**
         * This method is executed for each method declaration in the analyzed
         * compilation unit. If the declaration belongs to the class under test
         * it's stored in the discovered methods set.
         */
        @Override
        public void visitMethodDeclaration(MethodDeclaration x) {
            if (className.equals(packagePrefix + getContainingClass(x)) && !x.getName().startsWith(KIASAN_REPOK_METHOD)) {
                classMethods.add(x.getName());
            }
        }

    }

    /**
     * This private class holds the logic to discover the reachable methods from
     * the method under test.
     */
    private static class FajitaReachableMethodDiscoveryVisitor extends SourceVisitor {

        /** The set of methods of the class under test. */
        private final Set<String> classMethods;

        /** A mapping of which methods are called from other methods. */
        private final Map<String, Set<String>> referencedMethods;

        /**
         * Constructor for a <code>FajitaReachableMethodDiscoveryVisitor</code>.
         * 
         * @param classMethods
         *            the methods declared for the class under test.
         * 
         * @param referencedMethods
         *            a mapping where to store the invocation schema.
         * 
         */
        public FajitaReachableMethodDiscoveryVisitor(Set<String> classMethods, Map<String, Set<String>> referencedMethods) {
            this.classMethods = classMethods;
            this.referencedMethods = referencedMethods;
        }

        /**
         * This method is call for each method reference made in the analyzed
         * code. If the method belongs to the class under test and is being
         * invoked from inside the class it's added to the invocation mapping.
         */
        @Override
        public void visitMethodReference(MethodReference x) {
            String containigMethod = getContainingMethod(x);
            if (containigMethod != null && classMethods.contains(containigMethod) && classMethods.contains(x.getName())) {
                Set<String> methods = referencedMethods.get(containigMethod);
                if (methods == null) {
                    methods = new HashSet<String>();
                    referencedMethods.put(containigMethod, methods);
                }
                methods.add(x.getName());
            }
        }

    }

    /**
     * This private class holds the logic to discover the reachable methods from
     * the method under test.
     */
    private static class MethodTypeVisitor extends SourceVisitor {

        /** Fajita runtime configuration. */
        private final FajitaConfiguration configuration;

        /** The transformation class invoking this source visitor. */
        private final MultipleConditionTransformation transformation;

        /** The set of methods reachable from the method under test. */
        private final Set<String> reachableMethods;

        /**
         * Constructor for a <code>FajitaReachableMethodDiscoveryVisitor</code>.
         * 
         * @param classMethods
         *            the methods declared for the class under test.
         * 
         * @param referencedMethods
         *            a mapping where to store the invocation schema.
         * 
         */
        public MethodTypeVisitor(FajitaConfiguration configuration, MultipleConditionTransformation transformation,
                Set<String> reachableMethods) {
            this.configuration = configuration;
            this.transformation = transformation;
            this.reachableMethods = reachableMethods;
        }

        @Override
        public void visitTypeReference(TypeReference x) {
            super.visitTypeReference(x);
        }

        @Override
        public void visitMethodDeclaration(MethodDeclaration x) {
            String methodName = x.getName();
            try {
                if (x.getTypeReferenceAt(0) != null) {
                    String returnType = x.getTypeReferenceAt(0).getName();
                    transformation.methodsType.put(methodName, returnType);
                }
            } catch (Exception e) {
                
            }
        }

    }

    /**
     * This private class holds the logic to discover all the branches in the
     * code under test.
     */
    private static class FajitaBranchDiscoveryVisitor extends SourceVisitor {

        /** Fajita runtime configuration. */
        private final FajitaConfiguration configuration;

        /** The transformation class invoking this source visitor. */
        private final MultipleConditionTransformation transformation;

        /** The set of methods reachable from the method under test. */
        private final Set<String> reachableMethods;

        /** Flag that indicates AST transversal through a reachable method. */
        private boolean visitingReachableMethod = false;

        /** The file package name if any. */
        private String packagePrefix = "";

        /**
         * Constructor for a <code>FajitaBranchDiscoveryVisitor</code>.
         * 
         * @param configuration
         *            a <code>FajitaConfiguration</code> with the necessary data
         *            to discover the target goals.
         * 
         * @param transformation
         *            a <code>Transformation</code> with the necessary logic to
         *            apply the recoder transformations to the visited code.
         * 
         * @param reachableMethods
         *            the set with the names of reachable methods from the
         *            method under test.
         * 
         */
        public FajitaBranchDiscoveryVisitor(FajitaConfiguration configuration, MultipleConditionTransformation transformation,
                Set<String> reachableMethods) {
            this.configuration = configuration;
            this.transformation = transformation;
            this.reachableMethods = reachableMethods;
        }

        /**
         * This method is executed for each package specification in the
         * analyzed compilation unit. The package name is stored in order to be
         * able to determine the full name of the classes declared inside the
         * compilation unit.
         */
        @Override
        public void visitPackageSpecification(PackageSpecification x) {
            packagePrefix = x.getPackageReference().toSource().trim() + ".";
        }

        /**
         * This method is called for each method declaration and it's used to
         * determine if we are analyzing a reachable method.
         */
        @Override
        public void visitMethodDeclaration(MethodDeclaration x) {
            String classToCheck = configuration.getClassToCheck();
            String[] splitClassToCheck = classToCheck.split("\\.");
            classToCheck = "";
            for (int idx = 0; idx < splitClassToCheck.length - 2; idx++) {
                classToCheck += splitClassToCheck[idx] + ".";
            }
            if (splitClassToCheck.length > 1) {
                classToCheck += splitClassToCheck[splitClassToCheck.length - 2] + "Instrumented.";
            }
            classToCheck += splitClassToCheck[splitClassToCheck.length - 1];

            visitingReachableMethod = reachableMethods.contains(x.getName()) && classToCheck.equals(packagePrefix + getContainingClass(x));
            StatementBlock block = (StatementBlock) x.getBody();
            StatementBlock replacement = analyzeStamentBlock(block);
            transformation.replace(block, replacement);
        }

        private StatementBlock analyzeStamentBlock(StatementBlock block) {
            ASTList<Statement> list = block.getBody();
            ASTList<Statement> backup = analyzeList(list);
            return new StatementBlock(backup);
        }

        private ASTList<Statement> analyzeList(ASTList<Statement> list) {
            if (visitingReachableMethod) {
                ASTList<Statement> backup = new ASTArrayList<>(list);
                int i = 0;
                List<Expression> expressions = new ArrayList<>();
                for (Statement st : list) {
                    if (isAssignment(st)) {
                        // not interested for the moment
                    } else if (st instanceof If) {
                        If iff = (If) st;
                        handleIf(iff, expressions);
                    } else if (st instanceof While) {
                        While whilee = (While) st;
                        handleWhile(whilee, expressions);
                    } else if (st instanceof For) {
                        For forr = (For) st;
                        handleFor(forr, expressions);
                    } else if (st instanceof VariableDeclaration) {
                        // not interested for the moment
                    } else if (st instanceof Return) {
                        recursiveExpressionExplorer(((Return) st).getExpression(), expressions, true);
                    }
                    i = addNewGoals(expressions, i, backup);
                    expressions.clear();
                    i++;
                }
                return backup;
            }
            return list;
        }

        private int addNewGoals(List<Expression> expressions, int i, ASTList<Statement> backup) {
            for (Expression exp : expressions) {
                if (!containsRepOK(exp)) {
                    int goalId = configuration.getDiscoveredGoals();
                    configuration.setDiscoveredGoals(goalId + 1);
                    if (!configuration.getCoveredGoals().contains(goalId)) {
                        ProgramFactory programFactory = transformation.getProgramFactory();
                        Identifier fajitaGoalId = programFactory.createIdentifier(FajitaJavaCodeTranslator.FAJITA_GOAL_TAG + "_" + goalId);
                        UncollatedReferenceQualifier fajitaGoal = programFactory.createUncollatedReferenceQualifier(fajitaGoalId);
                        CopyAssignment copyAssignment = programFactory.createCopyAssignment(fajitaGoal, exp);
                        backup.add(i++, copyAssignment);
                    }
                }
            }
            return i;
        }

        private boolean containsRepOK(Expression ex) {
            if (ex instanceof LogicalAnd) {
                LogicalAnd and = (LogicalAnd) ex;
                return containsRepOK(and.getExpressionAt(0)) || containsRepOK(and.getExpressionAt(1));
            } else if (ex instanceof LogicalOr) {
                LogicalOr or = (LogicalOr) ex;
                return containsRepOK(or.getExpressionAt(0)) || containsRepOK(or.getExpressionAt(1));
            } else if (ex instanceof GreaterOrEquals) {
                return false;
            } else if (ex instanceof GreaterThan) {
                return false;
            } else if (ex instanceof LessOrEquals) {
                return false;
            } else if (ex instanceof LessThan) {
                return false;
            } else if (ex instanceof ParenthesizedExpression) {
                ParenthesizedExpression pe = (ParenthesizedExpression) ex;
                return containsRepOK(pe.getExpressionAt(0));
            } else if (ex instanceof Equals) {
                Equals eq = (Equals) ex;
                return containsRepOK(eq.getExpressionAt(0)) || containsRepOK(eq.getExpressionAt(1));
            } else if (ex instanceof NotEquals) {
                return false;
            } else if (ex instanceof UncollatedReferenceQualifier) {
                return false;
            } else if (ex instanceof MethodReference) {
                MethodReference mr = (MethodReference) ex;
                return mr.getName().equals("repOK");
            }
            return false;
        }

        private void handleFor(For forr, List<Expression> expressions) {
            // For not supported
            // Expression ex = forr.getExpressionAt(0);
            // recursiveExpressionExplorer(ex, expressions);
            StatementBlock stb = (StatementBlock) forr.getBody();
            ASTList<Statement> toAdd = analyzeList(stb.getBody());
            transformation.replace(stb, new StatementBlock(toAdd));
        }

        private void handleWhile(While whilee, List<Expression> expressions) {
            Expression ex = whilee.getExpressionAt(0);
            recursiveExpressionExplorer(ex, expressions, false);
            StatementBlock stb = (StatementBlock) whilee.getBody();
            ASTList<Statement> toAdd = analyzeList(stb.getBody());
            transformation.replace(stb, new StatementBlock(toAdd));
        }

        private void handleIf(If iff, List<Expression> expressions) {
            Expression ex = iff.getExpression();
            recursiveExpressionExplorer(ex, expressions, false);
            StatementBlock stb = (StatementBlock) iff.getThen().getBody();
            ASTList<Statement> toAdd = analyzeList(stb.getBody());
            transformation.replace(stb, new StatementBlock(toAdd));
            if (iff.getElse() != null) {
                if (iff.getElse().getBody() instanceof If) {
                    handleIf((If) iff.getElse().getBody(), expressions);
                } else {
                    stb = (StatementBlock) iff.getElse().getBody();
                    toAdd = analyzeList(stb.getBody());
                    transformation.replace(stb, new StatementBlock(toAdd));
                }
            }
        }

        private void recursiveExpressionExplorer(Expression ex, List<Expression> expressions, boolean isReturn) {
            if (ex instanceof LogicalAnd) {
                LogicalAnd and = (LogicalAnd) ex;
                recursiveExpressionExplorer(and.getExpressionAt(0), expressions, isReturn);
                recursiveExpressionExplorer(and.getExpressionAt(1), expressions, isReturn);
            } else if (ex instanceof LogicalOr) {
                LogicalOr or = (LogicalOr) ex;
                recursiveExpressionExplorer(or.getExpressionAt(0), expressions, isReturn);
                recursiveExpressionExplorer(or.getExpressionAt(1), expressions, isReturn);
            } else if (ex instanceof GreaterOrEquals) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof GreaterThan) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof LessOrEquals) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof LessThan) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof ParenthesizedExpression) {
                ParenthesizedExpression pe = (ParenthesizedExpression) ex;
                recursiveExpressionExplorer(pe.getExpressionAt(0), expressions, isReturn);
            } else if (ex instanceof Equals) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof NotEquals) {
                Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                expressions.add(n);
                expressions.add(ex);
            } else if (ex instanceof UncollatedReferenceQualifier) {
                if (!isReturn) {
                    Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                    expressions.add(n);
                    expressions.add(ex);
                }
            } else if (ex instanceof MethodReference) {
                MethodReference mr = (MethodReference) ex;
                if (transformation.methodsType.get(mr.getName()) == "boolean") {
                    Equals n = new Equals(new ParenthesizedExpression(ex), new BooleanLiteral());
                    expressions.add(n);
                    expressions.add(ex);
                }
            }
        }

        private boolean isAssignment(Statement st) {
            return (st instanceof BinaryAndAssignment) || (st instanceof BinaryOrAssignment) || (st instanceof BinaryXOrAssignment)
                    || (st instanceof CopyAssignment) || (st instanceof DivideAssignment) || (st instanceof MinusAssignment)
                    || (st instanceof ModuloAssignment) || (st instanceof PlusAssignment) || (st instanceof ShiftLeftAssignment)
                    || (st instanceof ShiftRightAssignment) || (st instanceof TimesAssignment)
                    || (st instanceof UnsignedShiftRightAssignment);
        }
    }

}
