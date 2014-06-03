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
import recoder.java.Identifier;
import recoder.java.JavaNonTerminalProgramElement;
import recoder.java.PackageSpecification;
import recoder.java.ProgramElement;
import recoder.java.SourceVisitor;
import recoder.java.Statement;
import recoder.java.StatementBlock;
import recoder.java.declaration.MethodDeclaration;
import recoder.java.declaration.Modifier;
import recoder.java.declaration.ParameterDeclaration;
import recoder.java.declaration.VariableDeclaration;
import recoder.java.declaration.VariableSpecification;
import recoder.java.expression.Assignment;
import recoder.java.expression.Literal;
import recoder.java.expression.literal.BooleanLiteral;
import recoder.java.expression.operator.BinaryAndAssignment;
import recoder.java.expression.operator.BinaryOrAssignment;
import recoder.java.expression.operator.BinaryXOrAssignment;
import recoder.java.expression.operator.CopyAssignment;
import recoder.java.expression.operator.DivideAssignment;
import recoder.java.expression.operator.MinusAssignment;
import recoder.java.expression.operator.ModuloAssignment;
import recoder.java.expression.operator.PlusAssignment;
import recoder.java.expression.operator.ShiftLeftAssignment;
import recoder.java.expression.operator.ShiftRightAssignment;
import recoder.java.expression.operator.TimesAssignment;
import recoder.java.expression.operator.UnsignedShiftRightAssignment;
import recoder.java.reference.MethodReference;
import recoder.java.reference.UncollatedReferenceQualifier;
import recoder.java.statement.EmptyStatement;
import recoder.java.statement.For;
import recoder.java.statement.If;
import recoder.java.statement.While;
import recoder.kit.ProblemReport;
import recoder.list.generic.ASTArrayList;
import recoder.list.generic.ASTList;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;

/**
 * This class holds the logic for instrumenting the branch coverage criteria.
 * Given a parsed compilation unit this class will, through the method execute,
 * transform the input AST removing the roops goal syntax and adding the
 * necessary constructions to perform branch coverage using Taco.
 */
public class AllUsesTransformation extends FajitaSourceTransformation {

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
	public AllUsesTransformation(FajitaConfiguration configuration,
			CrossReferenceServiceConfiguration recoder,
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
		FajitaBranchDiscoveryVisitor eraserVisitor = new FajitaBranchDiscoveryVisitor(
				configuration, this, getReachableMethods());

		TreeWalker treeWalker = new TreeWalker(compilationUnit);
		while (treeWalker.next())
			treeWalker.getProgramElement().accept(eraserVisitor);

		return execute(new FajitaSourceTransformVisitor<AllUsesTransformation>(
				configuration, this));
	}

	/** Returns a set with the names of the methods in the class to check. */
	private Set<String> getClassMethods() {
		Set<String> classMethods = new HashSet<String>();

		FajitaClassMethodDiscoveryVisitor methodDiscoveryVisitor = new FajitaClassMethodDiscoveryVisitor(
				configuration.getClassToCheck(), classMethods);
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
			treeWalker.getProgramElement().accept(
					reachableMethodDiscoveryVisitor);

		Set<String> remainingMethods = new HashSet<String>();
		remainingMethods.add(configuration.getMethodToCheck());

		while (!remainingMethods.isEmpty()) {
			String method = remainingMethods.iterator().next();
			remainingMethods.remove(method);
			if (reachableMethods.add(method)
					&& referencedMethods.containsKey(method))
				remainingMethods.addAll(referencedMethods.get(method));
		}

		return reachableMethods;
	}

	/**
	 * This private class holds the logic to discover the amount of methods the
	 * class to check has defined.
	 */
	private static class FajitaClassMethodDiscoveryVisitor extends
			SourceVisitor {

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
		FajitaClassMethodDiscoveryVisitor(String className,
				Set<String> classMethods) {
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
			if (className.equals(packagePrefix + getContainingClass(x))
					&& !x.getName().startsWith(KIASAN_REPOK_METHOD)) {
				classMethods.add(x.getName());
			}
		}

	}

	/**
	 * This private class holds the logic to discover the reachable methods from
	 * the method under test.
	 */
	private static class FajitaReachableMethodDiscoveryVisitor extends
			SourceVisitor {

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
		public FajitaReachableMethodDiscoveryVisitor(Set<String> classMethods,
				Map<String, Set<String>> referencedMethods) {
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
			if (containigMethod != null
					&& classMethods.contains(containigMethod)
					&& classMethods.contains(x.getName())) {
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
	 * This private class holds the logic to discover all the branches in the
	 * code under test.
	 */
	private static class FajitaBranchDiscoveryVisitor extends SourceVisitor {

		/** Fajita runtime configuration. */
		private final FajitaConfiguration configuration;

		/** The transformation class invoking this source visitor. */
		private final AllUsesTransformation transformation;

		/** The set of methods reachable from the method under test. */
		private final Set<String> reachableMethods;

		/** Flag that indicates AST transversal through a reachable method. */
		private boolean visitingReachableMethod = false;

		/** The file package name if any. */
		private String packagePrefix = "";

		private int myVariableIndex = 0;

		private Map<String, List<UncollatedReferenceQualifier>> definitions = new HashMap<>();

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
		public FajitaBranchDiscoveryVisitor(FajitaConfiguration configuration,
				AllUsesTransformation transformation,
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
			visitingReachableMethod = reachableMethods.contains(x.getName())
					&& configuration.getClassToCheck().equals(
							packagePrefix + getContainingClass(x));
			definitions.clear();
			StatementBlock block = (StatementBlock) x.getBody();
			StatementBlock replacement = analyzeStamentBlock(block, x);
			transformation.replace(block, replacement);
		}

		private StatementBlock analyzeStamentBlock(StatementBlock block,
				MethodDeclaration x) {
			ASTList<Statement> list = block.getBody();
			ASTList<Statement> backup = analyzeList(list, false, x);
			return new StatementBlock(backup);
		}

		private ASTList<Statement> analyzeList(ASTList<Statement> list,
				boolean isInsideBlock, MethodDeclaration x) {
			if (visitingReachableMethod) {
				ASTList<Statement> backup = new ASTArrayList<>(list);
				int i = 0;
				int paramsIndex = 0;
				if (x.getParameterDeclarationCount() == 0){
					i = 1;
				}
				
				for (VariableDeclaration vc : x.getParameters()) {
					i = handleVariableDeclaration(vc, backup, i++,
							isInsideBlock);
					paramsIndex++;
					if (x.getParameterDeclarationCount() == paramsIndex){
						i++;
					}
				}
				
				for (Statement st : list) {
					if (isAssignment(st)) {
						i = handleAssignment((Assignment) st, backup, i,
								isInsideBlock);
					} else if (st instanceof If) {
						If iff = (If) st;
						handleIf(iff, x);
					} else if (st instanceof While) {
						While whilee = (While) st;
						handleWhile(whilee, x);
					} else if (st instanceof For) {
						For forr = (For) st;
						handleFor(forr, x);
					} else if (st instanceof VariableDeclaration) {
						VariableDeclaration vd = (VariableDeclaration) st;
						i = handleVariableDeclaration(vd, backup, i++,
								isInsideBlock);
					}
					i++;
				}
				return backup;
			}
			return list;
		}

		private int handleVariableDeclaration(VariableDeclaration vd,
				ASTList<Statement> backup, int i, boolean isInsideBlock) {
			HashSet<String> uses = new HashSet<>();
			List<UncollatedReferenceQualifier> lhs = getLeftHandSide(vd);
			List<? extends VariableSpecification> decSp = vd.getVariables();
			for (VariableSpecification each : decSp) {
				if (each.getInitializer()!=null){
				recursiveHandler(each.getInitializer(), uses);
				}
			}
			i = handleAllUses(uses, backup, i);
			for (UncollatedReferenceQualifier each : lhs) {
				if (!isInsideBlock) {
					clearDefinitionsFor(each.getName());
				}
				i = addNewDefinition(each, backup, i);
			}
			return i;
		}

		private void handleFor(For forr, MethodDeclaration x) {
			StatementBlock stb = (StatementBlock) forr.getBody();
			ASTList<Statement> toAdd = analyzeList(stb.getBody(), true, x);
			transformation.replace(stb, new StatementBlock(toAdd));
		}

		private void handleWhile(While whilee, MethodDeclaration x) {
			StatementBlock stb = (StatementBlock) whilee.getBody();
			ASTList<Statement> toAdd = analyzeList(stb.getBody(), true, x);
			transformation.replace(stb, new StatementBlock(toAdd));
		}

		private void handleIf(If iff, MethodDeclaration x) {
			StatementBlock stb = (StatementBlock) iff.getThen().getBody();
			ASTList<Statement> toAdd = analyzeList(stb.getBody(), true, x);
			transformation.replace(stb, new StatementBlock(toAdd));
			if (iff.getElse() != null) {
				stb = (StatementBlock) iff.getElse().getBody();
				toAdd = analyzeList(stb.getBody(), true, x);
				transformation.replace(stb, new StatementBlock(toAdd));
			}
		}

		private int handleAssignment(Assignment ass, ASTList<Statement> body,
				int index, boolean isInsideBlock) {
			HashSet<String> uses = new HashSet<>();
			UncollatedReferenceQualifier lhs = getLeftHandSide(ass);
			recursiveHandler(ass.getChildAt(1), uses);
			index = handleAllUses(uses, body, index);
			if (!isInsideBlock) {
				clearDefinitionsFor(lhs.getName());
			}
			index = addNewDefinition(lhs, body, index);
			return index;
		}

		private void clearDefinitionsFor(String name) {
			definitions
					.put(name, new ArrayList<UncollatedReferenceQualifier>());
		}

		private int handleAllUses(HashSet<String> uses,
				ASTList<Statement> body, int index) {
			ProgramFactory factory = transformation.getProgramFactory();
			for (String use : uses) {
				for (UncollatedReferenceQualifier urq : getFromMap(use)) {
					int goalId = configuration.getDiscoveredGoals();
					configuration.setDiscoveredGoals(goalId + 1);

					if (!configuration.getCoveredGoals().contains(goalId)) {
						CopyAssignment ca = createFajitaGoalWithURQ(factory,
								goalId, urq);
						body.add(index++, ca);
					}
				}
			}
			return index;
		}

		private int addNewDefinition(UncollatedReferenceQualifier urq,
				ASTList<Statement> body, int index) {
			CopyAssignment copyAssignment = createMyVariable(true);
			body.add(index++, copyAssignment);
			index = setAllOtherToFalse(urq.getName(), body, index);
			getFromMap(urq.getName())
					.add((UncollatedReferenceQualifier) copyAssignment
							.getChildAt(0));
			return index;
		}

		private CopyAssignment createMyVariable(boolean status) {
			ProgramFactory factory = transformation.getProgramFactory();
			Identifier fajitaGoalId = factory
					.createIdentifier("variable_definition" + "_"
							+ myVariableIndex++);
			UncollatedReferenceQualifier fajitaGoal = factory
					.createUncollatedReferenceQualifier(fajitaGoalId);
			BooleanLiteral reachedLiteral = factory
					.createBooleanLiteral(status);
			CopyAssignment copyAssignment = factory.createCopyAssignment(
					fajitaGoal, reachedLiteral);
			configuration.getAllUsesAuxVariables().add(fajitaGoal.getName());
			return copyAssignment;
		}

		private CopyAssignment setMyVariableTo(
				UncollatedReferenceQualifier urq, boolean status) {
			ProgramFactory factory = transformation.getProgramFactory();
			BooleanLiteral reachedLiteral = factory
					.createBooleanLiteral(status);
			CopyAssignment copyAssignment = factory.createCopyAssignment(urq,
					reachedLiteral);
			return copyAssignment;
		}

		private int setAllOtherToFalse(String variable,
				ASTList<Statement> body, int index) {
			for (UncollatedReferenceQualifier urq : getFromMap(variable)) {
				body.add(index++, setMyVariableTo(urq, false));
			}
			return index;
		}

		private CopyAssignment createFajitaGoalWithURQ(ProgramFactory factory,
				int goalId, UncollatedReferenceQualifier urq) {
			Identifier fajitaGoalId = factory
					.createIdentifier(FajitaJavaCodeTranslator.FAJITA_GOAL_TAG
							+ "_" + goalId);
			UncollatedReferenceQualifier fajitaGoal = factory
					.createUncollatedReferenceQualifier(fajitaGoalId);
			CopyAssignment copyAssignment = factory.createCopyAssignment(
					fajitaGoal, urq);
			return copyAssignment;
		}

		private List<UncollatedReferenceQualifier> getFromMap(String name) {
			List<UncollatedReferenceQualifier> list = definitions.get(name);
			if (list == null) {
				list = new ArrayList<>();
				definitions.put(name, list);
			}
			return list;
		}

		private UncollatedReferenceQualifier getLeftHandSide(Assignment ass) {
			return (UncollatedReferenceQualifier) ass.getChildAt(0);
		}

		private List<UncollatedReferenceQualifier> getLeftHandSide(
				VariableDeclaration vd) {
			List<UncollatedReferenceQualifier> retList = new ArrayList<>();
			List<? extends VariableSpecification> decSp = vd.getVariables();
			for (VariableSpecification each : decSp) {
				Identifier id = new Identifier(each.getName());
				retList.add(new UncollatedReferenceQualifier(id));
			}
			return retList;
		}

		private void recursiveHandler(ProgramElement pe, Set<String> identifiers) {
			if (pe instanceof Modifier) {
				// do nothing
			} else if (pe instanceof EmptyStatement) {
				// do nothing
			} else if (pe instanceof Identifier) {
				Identifier id = (Identifier) pe;
				if (id.getParent() instanceof UncollatedReferenceQualifier) {
					identifiers.add(id.getText());
				}
			} else if (pe instanceof Literal) {
				// do nothing, again
			} else {
				JavaNonTerminalProgramElement ntpe = (JavaNonTerminalProgramElement) pe;
				int childCount = ntpe.getChildCount();
				for (int i = 0; i < childCount; i++) {
					ProgramElement child = ntpe.getChildAt(i);
					recursiveHandler(child, identifiers);
				}
			}
		}

		private boolean isAssignment(Statement st) {
			return (st instanceof BinaryAndAssignment)
					|| (st instanceof BinaryOrAssignment)
					|| (st instanceof BinaryXOrAssignment)
					|| (st instanceof CopyAssignment)
					|| (st instanceof DivideAssignment)
					|| (st instanceof MinusAssignment)
					|| (st instanceof ModuloAssignment)
					|| (st instanceof PlusAssignment)
					|| (st instanceof ShiftLeftAssignment)
					|| (st instanceof ShiftRightAssignment)
					|| (st instanceof TimesAssignment)
					|| (st instanceof UnsignedShiftRightAssignment);
		}
	}

}
