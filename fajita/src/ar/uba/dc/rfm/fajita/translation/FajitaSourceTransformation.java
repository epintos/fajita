package ar.uba.dc.rfm.fajita.translation;

import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.FAJITA_BENCHMARK_METHOD_TAG;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.FAJITA_GOAL_TAG;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.FAJITA_INITIALIZATION_METHOD;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.KIASAN_REPOK_METHOD;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.ROOPS_ANNOTATION_BENCHMARK_CLASS;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.ROOPS_ANNOTATION_BENCHMARK_METHOD;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.ROOPS_ANNOTATION_NROFGOALS;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.ROOPS_REACHED_METHOD;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.createFajitaGoal;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.getContainingClass;
import static ar.uba.dc.rfm.fajita.translation.FajitaJavaCodeTranslator.getFullName;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import recoder.CrossReferenceServiceConfiguration;
import recoder.ProgramFactory;
import recoder.convenience.TreeWalker;
import recoder.java.Comment;
import recoder.java.CompilationUnit;
import recoder.java.DocComment;
import recoder.java.Identifier;
import recoder.java.Import;
import recoder.java.PackageSpecification;
import recoder.java.SourceVisitor;
import recoder.java.Statement;
import recoder.java.StatementBlock;
import recoder.java.declaration.AnnotationUseSpecification;
import recoder.java.declaration.ClassDeclaration;
import recoder.java.declaration.DeclarationSpecifier;
import recoder.java.declaration.FieldDeclaration;
import recoder.java.declaration.MethodDeclaration;
import recoder.java.declaration.ParameterDeclaration;
import recoder.java.declaration.Throws;
import recoder.java.declaration.modifier.Private;
import recoder.java.declaration.modifier.Protected;
import recoder.java.declaration.modifier.Public;
import recoder.java.declaration.modifier.Static;
import recoder.java.expression.literal.BooleanLiteral;
import recoder.java.expression.operator.CopyAssignment;
import recoder.java.expression.operator.Minus;
import recoder.java.expression.operator.Negative;
import recoder.java.reference.MethodReference;
import recoder.java.reference.TypeReference;
import recoder.java.reference.UncollatedReferenceQualifier;
import recoder.java.statement.Return;
import recoder.kit.ProblemReport;
import recoder.kit.Transformation;
import recoder.list.generic.ASTArrayList;
import recoder.list.generic.ASTList;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaConfiguration.CoverageCriteria;

/**
 * This class is the base source transformation performed by Fajita. For each
 * particular coverage criteria different behavior might be added.
 */
public abstract class FajitaSourceTransformation extends Transformation {

	/** Compilation unit to be transformed. */
	protected final CompilationUnit compilationUnit;

	/** Fajita runtime configuration. */
	protected final FajitaConfiguration configuration;

	/**
	 * Constructor for a <code>FajitaGoalTransformation</code>.
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
	public FajitaSourceTransformation(FajitaConfiguration configuration,
			CrossReferenceServiceConfiguration recoder,
			CompilationUnit compilationUnit) {
		super(recoder);
		this.configuration = configuration;
		this.compilationUnit = compilationUnit;
	}

	/**
	 * This method actually performs the transformation of the input code.
	 * 
	 * @return a <code>ProblemrReport</code> that fulfills the interface
	 *         required by the <code>recoder.Transformation</code> base class.
	 * 
	 */
	@Override
	public abstract ProblemReport execute();

	/**
	 * This method actually performs the transformation of the input code.
	 * 
	 * @return a <code>ProblemrReport</code> that fulfills the interface
	 *         required by the <code>recoder.Transformation</code> base class.
	 * 
	 */
	protected ProblemReport execute(
			FajitaSourceTransformVisitor<?> transformVisitor) {
		TreeWalker treeWalker = new TreeWalker(compilationUnit);
		while (treeWalker.next())
			treeWalker.getProgramElement().accept(transformVisitor);
		return setProblemReport(NO_PROBLEM);
	}

	/**
	 * This private class is the one actually in charge of instrumenting the
	 * goal coverage technique for each java construction. To achieve this it
	 * needs to know the number of goals being analyzed, which is computed by
	 * the <code>FajitaGoalDiscoveryVisitor</code>.
	 */
	public static class FajitaSourceTransformVisitor<T extends FajitaSourceTransformation>
			extends SourceVisitor {

		/** Fajita runtime configuration. */
		protected final FajitaConfiguration configuration;

		/** The transformation class invoking this source visitor. */
		protected final T transformation;

		/** The file package name if any. */
		protected String packageName = "";

		/** Indicates if the RoopsArray class is imported in the code. */
		protected boolean importsRoopsArray = false;

		/**
		 * Constructor for a <code>FajitaGoalTransformVisitor</code>.
		 * 
		 * @param configuration
		 *            a <code>FajitaConfiguration</code> with the necessary data
		 *            to transform the target code.
		 * 
		 * @param transformation
		 *            a <code>Transformation</code> with the necessary logic to
		 *            apply the recoder transformations to the visited code.
		 * 
		 */
		public FajitaSourceTransformVisitor(FajitaConfiguration configuration,
				T transformation) {
			this.configuration = configuration;
			this.transformation = transformation;
		}

		/**
		 * This method is executed for each annotation used in the analyzed
		 * compilation unit. It removes all the roops annotations.
		 */
		@Override
		public void visitAnnotationUse(AnnotationUseSpecification a) {
			String roopsAnnotations = "(" + ROOPS_ANNOTATION_NROFGOALS + "|"
					+ ROOPS_ANNOTATION_BENCHMARK_METHOD + "|"
					+ ROOPS_ANNOTATION_BENCHMARK_CLASS + ")";
			if (a.getTypeReference().getName().matches(roopsAnnotations))
				transformation.detach(a);
		}

		/**
		 * This method is executed for each method referenced in the analyzed
		 * compilation unit. If it is an invocation to the roops.reached method
		 * it's removed.
		 * 
		 * @see GoalTransformation for the actual goal coverage translation
		 */
		@Override
		public void visitMethodReference(MethodReference x) {
			if (x.getName().equals(ROOPS_REACHED_METHOD))
				transformation.detach(x);
		}

		/**
		 * This method is executed for each method declared in the analyzed
		 * compilation unit. If it is the method under test some JML notation is
		 * added in order to force AlloyCli to search for every counter example.
		 * If it is a Kiasan repOK method it's changed to allways return true.
		 * And if it is an auxiliary function for such repOK, it's simply
		 * removed.
		 * 
		 * @see ClassTransformation for the actual "argumentless" boolean method
		 *      translation.
		 */
		@Override
		public void visitMethodDeclaration(MethodDeclaration x) {
			// ichraf
			ProgramFactory programFactory = transformation.getProgramFactory();

			if (x.getName().contains(KIASAN_REPOK_METHOD)) {
				// IGNORE REP_OK METHOD
				BooleanLiteral trueLiteral = programFactory
						.createBooleanLiteral(true);
				Return repOKReturn = programFactory.createReturn(trueLiteral);
				ASTList<Statement> block = new ASTArrayList<Statement>();
				block.add(repOKReturn);
				StatementBlock statementBlock = programFactory
						.createStatementBlock(block);
				transformation.replace(x.getBody(), statementBlock);
			}

			if (x.getName().startsWith(KIASAN_REPOK_METHOD + "_")) {
				transformation.detach(x);
			}

			String class_to_check = configuration.getClassToCheck();
			String[] splitClassToCheck = class_to_check.split("\\.");
			class_to_check = "";
			for (int idx = 0; idx < splitClassToCheck.length - 2; idx++) {
				class_to_check += splitClassToCheck[idx] + ".";
			}
			if (splitClassToCheck.length > 1) {
				class_to_check += splitClassToCheck[splitClassToCheck.length - 2]
						+ "Instrumented.";
			}
			class_to_check += splitClassToCheck[splitClassToCheck.length - 1];

			if (x.getName().equals(configuration.getMethodToCheck())
					&& class_to_check.equals(packageName
							+ getContainingClass(x))
					&& (configuration.getCoverageCriteria() != CoverageCriteria.DUAL_CLASS_BRANCH_COVERAGE || configuration
							.getDualClassBranchIteration() > 0)) {
				// ADD FALSE POST CONDITION TO THE METHOD UNDER TEST
				DocComment docComment = programFactory
						.createDocComment(FAJITA_BENCHMARK_METHOD_TAG);
				ASTList<Comment> comments = new ASTArrayList<Comment>();
				comments.add(docComment);
				x.setComments(comments);

				// ADD GOAL INITIALIZATION AT THE BEGINING OF THE METHOD
				Identifier goalInitializationId = programFactory
						.createIdentifier(FAJITA_INITIALIZATION_METHOD);
				MethodReference goalInitialization = programFactory
						.createMethodReference(goalInitializationId);
				ASTList<Statement> newBody = new ASTArrayList<Statement>();
				newBody.add(goalInitialization);
				newBody.addAll(x.getBody().getBody());
				StatementBlock newStatementBlock = programFactory
						.createStatementBlock(newBody);
				transformation.replace(x.getBody(), newStatementBlock);

			}

			// Ignore IFinitization

			if (x.getName().startsWith("fin")) {
				// IGNORE FINITIZATION
				// Return repOKReturn = programFactory.createReturn(new
				// NullLiteral());
				// ASTList<Statement> block = new ASTArrayList<Statement>();
				// block.add(repOKReturn);
				// StatementBlock statementBlock =
				// programFactory.createStatementBlock(block);
				// transformation.replace(x.getBody(), statementBlock);
				transformation.detach(x);
			}
		}

		// @Override
		// public void visitCompilationUnit(CompilationUnit cu){
		// super.visitCompilationUnit(cu);
		// if
		// (this.getClass().getName().contains("FajitaJavaCodeKoratRemoverTranslator")){
		//
		//
		// ASTList<Import> imps = cu.getImports();
		// ASTList<Import> newImps = new ASTArrayList<Import>();
		// for (Import impp : imps){
		// if (!impp.toSource().contains("korat") &&
		// !impp.toSource().contains("Serializable")
		// && !impp.toSource().contains("KoritaConfig") &&
		// !impp.toSource().contains("java.util")){
		// newImps.add(impp);
		// }
		// }
		// cu.setImports(newImps);
		//
		// for (int indx = 0; indx < cu.getChildCount(); indx++){
		// ProgramElement pe = cu.getChildAt(indx);
		// if (pe instanceof ClassDeclaration){
		// Implements i = ((ClassDeclaration) pe).getImplementedTypes();
		// if (i != null){
		// ASTList<TypeReference> supertypes = i.getSupertypes();
		// ASTList<TypeReference> newSups = new ASTArrayList<TypeReference>();
		// for (TypeReference tr : supertypes){
		// if (!tr.getIdentifier().getText().contains("Serializable"))
		// newSups.add(tr);
		// }
		// if (newSups.size() > 0)
		// i.setSupertypes(newSups);
		// else
		// i.getASTParent().replaceChild(i, new Implements());
		//
		// }
		//
		// for (int idx = 0; idx < ((ClassDeclaration)pe).getChildCount();
		// idx++){
		// ProgramElement fieldCandidate = ((ClassDeclaration)
		// pe).getChildAt(idx);
		// if (fieldCandidate instanceof FieldDeclaration){
		// ASTList<FieldSpecification> fieldSpecs =
		// ((FieldDeclaration)fieldCandidate).getFieldSpecifications();
		// for (FieldSpecification fs : fieldSpecs){
		// if (fs.getIdentifier().toString().contains("serialVersionUID")){
		// fieldCandidate.getASTParent().replaceChild(fieldCandidate, null);
		// break;
		// }
		// }
		// }
		// }
		//
		// }
		//
		// }
		//
		//
		//
		// }
		// }

		// @Override
		// public void visitFieldReference(FieldReference fr){
		// if (fr.getName().contains("serialVersionUID")){
		// }
		// }

		/**
		 * This method is executed for the package specification in the analyzed
		 * compilation unit, if any. The package name is stored in order to be
		 * able to build the full name of the classes declared within.
		 */
		@Override
		public void visitPackageSpecification(PackageSpecification x) {
			packageName = x.getPackageReference().toSource().trim() + ".";
		}

		/**
		 * This method is executed for each class declaration in the analyzed
		 * compilation unit. If is is the class under test one distinguished
		 * variable is added per target goal. Some goal initialization logic for
		 * those goals is added as well.
		 */
		@Override
		public void visitClassDeclaration(ClassDeclaration x) {
			String fullName = packageName + getFullName(x);

			if (!this.getClass().getName()
					.contains("FajitaJavaCodeGoalPrinterTranslator")/*
																	 * && !this.
																	 * getClass
																	 * ()
																	 * .getName
																	 * ()
																	 * .contains
																	 * (
																	 * "FajitaJavaCodeKoratRemoverTranslator"
																	 * )
																	 */) {

				// CHECK IF WE ARE VISITING THE DECLARATION OF CLASS TO CHECK

				String classToCheck = configuration.getClassToCheck();
				String[] splitClassToCheck = classToCheck.split("\\.");
				classToCheck = "";
				for (int idx = 0; idx < splitClassToCheck.length - 2; idx++) {
					classToCheck += splitClassToCheck[idx] + ".";
				}
				if (splitClassToCheck.length > 1) {
					classToCheck += splitClassToCheck[splitClassToCheck.length - 2]
							+ "Instrumented.";
				}
				classToCheck += splitClassToCheck[splitClassToCheck.length - 1];

				if (fullName.equals(classToCheck)) {
					ProgramFactory programFactory = transformation
							.getProgramFactory();

					ASTList<DeclarationSpecifier> initializationSpecifiers = new ASTArrayList<DeclarationSpecifier>();
					initializationSpecifiers.add(new Public());
					initializationSpecifiers.add(new Static());

					// ADD THE NECESSARY DISTINGUISHED VARIABLES TO THE
					// DECLARATION
					for (int i = 0; i < configuration.getDiscoveredGoals(); i++) {
						if (configuration.getCoveredGoals().contains(i))
							continue;
						Identifier fajitaGoalId = programFactory
								.createIdentifier(FAJITA_GOAL_TAG + "_" + i);
						Identifier booleanId = programFactory
								.createIdentifier("boolean");
						TypeReference booleanReference = programFactory
								.createTypeReference(booleanId);
						FieldDeclaration fieldDeclaration = programFactory
								.createFieldDeclaration(
										initializationSpecifiers,
										booleanReference, fajitaGoalId, null);
						x.getMembers().add(fieldDeclaration);
					}

					// ADD SPECIAL ROOPS ARRAY DECLARATION SO TACO DOES NOT
					// DETECT IT AS UNUSED
					if (importsRoopsArray) {
						Identifier roopsArrayVar = programFactory
								.createIdentifier("myRoopsArray");
						Identifier roopsArrayId = programFactory
								.createIdentifier("RoopsArray");
						TypeReference roosArrayReference = programFactory
								.createTypeReference(roopsArrayId);
						FieldDeclaration fieldDeclaration = programFactory
								.createFieldDeclaration(
										initializationSpecifiers,
										roosArrayReference, roopsArrayVar, null);
						x.getMembers().add(fieldDeclaration);
					}

					// CREATE GOAL INITIALIZATION STATEMENTS
					ASTList<Statement> initializationBody = new ASTArrayList<Statement>();

					for (int i = 0; i < configuration.getDiscoveredGoals(); i++) {
						if (!configuration.getCoveredGoals().contains(i)) {
							CopyAssignment goalInitializationStatement = createFajitaGoal(
									programFactory, i, false);
							initializationBody.add(goalInitializationStatement);
						}
					}

					// XXX: Hack to reuse the source transformation for
					// dual-class-branch-coverage.
					if (configuration.getCoverageCriteria() == CoverageCriteria.DUAL_CLASS_BRANCH_COVERAGE
							&& configuration.getDualClassBranchIteration() == 0) {
						initializationBody.addAll(configuration
								.getDualInitializationStatements());
					}

					if (configuration.getCoverageCriteria() == CoverageCriteria.ALL_DEF_USES) {
						addVariablesDeclarations(x,
								configuration.getAllUsesAuxVariables());
						initializationBody
								.addAll(buildAuxVariablesIntialization(configuration
										.getAllUsesAuxVariables()));
					}

					// / // INSERT GOAL FOR DETECTING LOOP EXHAUSTION
					// / if (configuration.isIncrementalLoopUnroll()) {
					// / CopyAssignment goalInitializationStatement =
					// createLoopExhaustion(programFactory, false);
					// / initializationBody.add(goalInitializationStatement);
					// / }

					// USE THE SPECIAL ROOPS ARRAY INSTANCE SO TACO DOES NOT
					// DETECT IT AS UNUSED
					if (importsRoopsArray) {
						Identifier roopsArrayVar = programFactory
								.createIdentifier("myRoopsArray");
						UncollatedReferenceQualifier fajitaGoal = programFactory
								.createUncollatedReferenceQualifier(roopsArrayVar);
						CopyAssignment copyAssignment = programFactory
								.createCopyAssignment(fajitaGoal,
										programFactory.createNullLiteral());
						initializationBody.add(copyAssignment);
					}

					StatementBlock initializationStatementBlock = programFactory
							.createStatementBlock(initializationBody);

					// CREATE A GOAL INITIALIZATION METHOD
					Identifier initializationId = programFactory
							.createIdentifier(FAJITA_INITIALIZATION_METHOD);
					Identifier voidId = programFactory.createIdentifier("void");
					TypeReference voidReference = programFactory
							.createTypeReference(voidId);
					ASTList<ParameterDeclaration> initializationParameters = new ASTArrayList<ParameterDeclaration>();
					Throws initializationThrows = programFactory.createThrows();

					MethodDeclaration initializaionDeclaration = programFactory
							.createMethodDeclaration(initializationSpecifiers,
									voidReference, initializationId,
									initializationParameters,
									initializationThrows);

					initializaionDeclaration
							.setBody(initializationStatementBlock);

					// ADD THE INITIALIZATION METHOD TO THE DECLARATION OF THE
					// CLASS
					x.getMembers().add(initializaionDeclaration);
					configuration.getAllUsesAuxVariables().clear();
				}
			}
		}

		private void addVariablesDeclarations(ClassDeclaration x,
				List<String> allUsesAuxVariables) {
			for (String variable : allUsesAuxVariables) {
				ASTList<DeclarationSpecifier> initializationSpecifiers = new ASTArrayList<DeclarationSpecifier>();
				initializationSpecifiers.add(new Public());
				initializationSpecifiers.add(new Static());
				ProgramFactory factory = transformation.getProgramFactory();
				Identifier fajitaGoalId = factory.createIdentifier(variable);
				Identifier booleanId = factory.createIdentifier("boolean");
				TypeReference booleanReference = factory
						.createTypeReference(booleanId);
				FieldDeclaration fieldDeclaration = factory
						.createFieldDeclaration(initializationSpecifiers,
								booleanReference, fajitaGoalId, null);
				x.getMembers().add(fieldDeclaration);
			}
		}

		private Collection<? extends Statement> buildAuxVariablesIntialization(
				List<String> allUsesAuxVariables) {
			List<Statement> retList = new LinkedList<Statement>();
			for (String variable : allUsesAuxVariables) {
				ProgramFactory factory = transformation.getProgramFactory();
				Identifier fajitaGoalId = factory.createIdentifier(variable);
				UncollatedReferenceQualifier fajitaGoal = factory
						.createUncollatedReferenceQualifier(fajitaGoalId);
				BooleanLiteral reachedLiteral = factory
						.createBooleanLiteral(false);
				CopyAssignment copyAssignment = factory.createCopyAssignment(
						fajitaGoal, reachedLiteral);
				retList.add(copyAssignment);
			}
			return retList;
		}

		/**
		 * This method is executed for each private declaration in the analyzed
		 * compilation unit. Such declarations are changed into a public scope
		 * in order to allow the junit-test generation module to build the test
		 * cases using the reflection API.
		 */
		@Override
		public void visitPrivate(Private x) {
			transformation.replace(x, new Public());
		}

		/**
		 * This method is executed for each protected declaration in the
		 * analyzed compilation unit. Such declarations are changed into a
		 * public scope in order to allow the junit-test generation module to
		 * build the test cases using the reflection API.
		 */
		@Override
		public void visitProtected(Protected x) {
			transformation.replace(x, new Public());
		}

		/**
		 * This method is executed for each use of the '-' unary operator, which
		 * returns the given value * -1. Since Taco does not support this
		 * operation we translate -x into (0-x) in order to avoid bugs.
		 */
		@Override
		public void visitNegative(Negative x) {
			ProgramFactory programFactory = transformation.getProgramFactory();
			Minus minus = programFactory.createMinus(
					programFactory.createIntLiteral(0), x.getExpressionAt(0));
			transformation.replace(x,
					programFactory.createParenthesizedExpression(minus));
		}

		/**
		 * This method is executed for each import declaration. It's used to
		 * detect if the RoopsArray class is imported, and if it is a dummy
		 * declaration and use is added to the code in order to fulfill Taco
		 * requirements.
		 */
		@Override
		public void visitImport(Import x) {
			TypeReference type = x.getTypeReference();
			if (type != null && type.getName().equals("RoopsArray"))
				importsRoopsArray = true;
		}

		// / @Override
		// / public void visitWhile(While x) {
		// / if (configuration.getClassToCheck().equals(packageName +
		// getContainingClass(x)) &&
		// / configuration.isIncrementalLoopUnroll())
		// / {
		// / ProgramFactory programFactory = transformation.getProgramFactory();
		// /
		// / Expression guard = x.getGuard();
		// /
		// / Statement loopExahustionGoal = createLoopExhaustion(programFactory,
		// true);
		// /
		// / New newException = programFactory.createNew(
		// / null,
		// / programFactory.createTypeReference(
		// / programFactory.createIdentifier("RuntimeException")),
		// / new ASTArrayList<Expression>());
		// / Throw throwStatement = programFactory.createThrow(newException);
		// /
		// / ASTList<Statement> body = new ASTArrayList<Statement>();
		// / body.add(loopExahustionGoal);
		// / body.add(throwStatement);
		// /
		// / Then thenBlock = programFactory.createThen(new
		// StatementBlock(body));
		// /
		// / If loopExhaustionCheck = programFactory.createIf(
		// / programFactory.createParenthesizedExpression(guard),
		// / thenBlock
		// / );
		// /
		// / ASTList<Statement> newWhile = new ASTArrayList<Statement>();
		// / newWhile.add(programFactory.createWhile(guard, x.getBody()));
		// / newWhile.add(loopExhaustionCheck);
		// / StatementBlock newWhileWithIf =
		// programFactory.createStatementBlock(newWhile);
		// /
		// / transformation.replace(x, newWhileWithIf);
		// / }
		// / }

	}

}
