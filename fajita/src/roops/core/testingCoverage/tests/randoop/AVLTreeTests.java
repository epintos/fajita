package roops.core.testingCoverage.tests.randoop;

import junit.framework.TestCase;
import ar.uba.dc.rfm.tools.TestCoverageTool;

public class AVLTreeTests extends TestCase {

	public static boolean debug = false;

	public void test1() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test1");
		}

		roops.core.testingCoverage.base.AvlNode var0 = new roops.core.testingCoverage.base.AvlNode();

		TestCoverageTool.pathReport(var0);
	}

	public void test2() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test2");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		TestCoverageTool.pathReport(var0);
	}

	public void test3() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test3");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test4() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test4");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		TestCoverageTool.pathReport(var0);
	}

	public void test5() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test5");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var9 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test6() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test6");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test7() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test7");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var9 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(1);
		boolean var12 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test8() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test8");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test9() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test9");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		TestCoverageTool.pathReport(var0);
	}

	public void test10() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test10");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test11() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test11");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test12() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test12");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(10);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test13() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test13");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		TestCoverageTool.pathReport(var0);
	}

	public void test14() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test14");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test15() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test15");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test16() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test16");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.pathReport(var0);
	}

	public void test17() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test17");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test18() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test18");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var10 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchNode((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test19() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test19");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.pathReport(var0);
	}

	public void test20() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test20");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test21() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test21");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test22() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test22");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var15 = var0.searchNode((-1));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var15);

		TestCoverageTool.pathReport(var0);
	}

	public void test23() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test23");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var15 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var15);

		TestCoverageTool.pathReport(var0);
	}

	public void test24() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test24");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test25() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test25");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test26() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test26");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchNode(1);
		boolean var4 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test27() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test27");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test28() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test28");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test29() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test29");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test30() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test30");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test31() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test31");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		boolean var8 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test32() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test32");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchNode(10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test33() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test33");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test34() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test34");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test35() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test35");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode((-1));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test36() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test36");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMax();
		boolean var10 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test37() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test37");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test38() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test38");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test39() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test39");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test40() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test40");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.pathReport(var0);
	}

	public void test41() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test41");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test42() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test42");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.pathReport(var0);
	}

	public void test43() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test43");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var9 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test44() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test44");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test45() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test45");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test46() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test46");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test47() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test47");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		boolean var10 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test48() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test48");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test49() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test49");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test50() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test50");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test51() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test51");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(100);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test52() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test52");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test53() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test53");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test54() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test54");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test55() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test55");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test56() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test56");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test57() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test57");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var9 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test58() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test58");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test59() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test59");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test60() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test60");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		TestCoverageTool.pathReport(var0);
	}

	public void test61() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test61");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test62() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test62");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var9 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		TestCoverageTool.pathReport(var0);
	}

	public void test63() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test63");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var10 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test64() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test64");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchNode(0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test65() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test65");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var9 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test66() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test66");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test67() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test67");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var4 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test68() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test68");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test69() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test69");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchNode(10);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test70() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test70");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test71() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test71");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		boolean var8 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test72() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test72");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test73() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test73");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test74() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test74");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test75() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test75");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var6 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test76() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test76");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode((-1));
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test77() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test77");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test78() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test78");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test79() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test79");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		TestCoverageTool.pathReport(var0);
	}

	public void test80() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test80");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test81() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test81");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode((-1));
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchNode(10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test82() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test82");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.pathReport(var0);
	}

	public void test83() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test83");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test84() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test84");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var16 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var16);

		TestCoverageTool.pathReport(var0);
	}

	public void test85() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test85");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test86() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test86");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test87() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test87");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		boolean var6 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test88() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test88");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test89() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test89");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		boolean var10 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test90() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test90");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.pathReport(var0);
	}

	public void test91() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test91");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var11 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMin();
		boolean var15 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var15 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test92() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test92");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test93() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test93");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.pathReport(var0);
	}

	public void test94() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test94");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		TestCoverageTool.pathReport(var0);
	}

	public void test95() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test95");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(1);
		boolean var10 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test96() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test96");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test97() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test97");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.pathReport(var0);
	}

	public void test98() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test98");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test99() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test99");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test100() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test100");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test101() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test101");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test102() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test102");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		TestCoverageTool.pathReport(var0);
	}

	public void test103() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test103");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test104() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test104");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchNode((-1));
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		TestCoverageTool.pathReport(var0);
	}

	public void test105() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test105");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.pathReport(var0);
	}

	public void test106() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test106");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchNode(100);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test107() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test107");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.pathReport(var0);
	}

	public void test108() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test108");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				100);
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchMax();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test109() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test109");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchNode((-1));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test110() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test110");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test111() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test111");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test112() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test112");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var5 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test113() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test113");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var3 = var0.searchNode(10);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		TestCoverageTool.pathReport(var0);
	}

	public void test114() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test114");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test115() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test115");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		TestCoverageTool.pathReport(var0);
	}

	public void test116() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test116");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMax();
		boolean var3 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test117() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test117");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var11 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var13 = var0.searchNode(1);
		roops.core.testingCoverage.base.AvlNode var14 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var14);

		TestCoverageTool.pathReport(var0);
	}

	public void test118() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test118");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		TestCoverageTool.pathReport(var0);
	}

	public void test119() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test119");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test120() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test120");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMin();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test121() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test121");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		TestCoverageTool.pathReport(var0);
	}

	public void test122() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test122");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchNode((-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchMax();
		boolean var5 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test123() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test123");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		boolean var3 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchNode(0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test124() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test124");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var5 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test125() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test125");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchMin();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test126() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test126");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var11 = var0.searchNode(0);
		boolean var12 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test127() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test127");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var12 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test128() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test128");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var10 = var0.searchNode(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		TestCoverageTool.pathReport(var0);
	}

	public void test129() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test129");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(10);
		roops.core.testingCoverage.base.AvlNode var7 = var0.searchMax();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.pathReport(var0);
	}

	public void test130() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test130");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		boolean var1 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var5 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchNode(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		TestCoverageTool.pathReport(var0);
	}

	public void test131() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test131");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		boolean var7 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test132() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test132");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				10);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var9 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.base.AvlNode var12 = var0.searchNode(1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		TestCoverageTool.pathReport(var0);
	}

	public void test133() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test133");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchNode(0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.base.AvlNode var8 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);
		boolean var14 = var0.repOK();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchNodeTest(var0,
				(-1));
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test134() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test134");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMaxTest(var0);
		boolean var4 = var0.repOK();
		roops.core.testingCoverage.base.AvlNode var5 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var6 = var0.searchMin();
		roops.core.testingCoverage.path.AvlTreeSearchMin.searchMinTest(var0);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		TestCoverageTool.pathReport(var0);
	}

	public void test135() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test135");
		}

		roops.core.testingCoverage.path.AvlTreeSearchMin var0 = new roops.core.testingCoverage.path.AvlTreeSearchMin();
		roops.core.testingCoverage.base.AvlNode var1 = var0.searchMax();
		roops.core.testingCoverage.base.AvlNode var2 = var0.searchMin();
		roops.core.testingCoverage.base.AvlNode var4 = var0.searchNode(1);
		roops.core.testingCoverage.path.AvlTreeSearchMin
				.searchNodeTest(var0, 1);
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.pathReport(var0);
	}

}
