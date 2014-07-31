package roops.core.testingCoverage.tests.randoop;

import junit.framework.TestCase;
import ar.uba.dc.rfm.tools.TestCoverageTool;

public class LinkedListTests extends TestCase {

	public static boolean debug = false;

	public void test1() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test1");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test2() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test2");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var2 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test3() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test3");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test4() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test4");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test5() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test5");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var3 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test6() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test6");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test7() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test7");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var5 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test8() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test8");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test9() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test9");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test10() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test10");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var6 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test11() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test11");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test12() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test12");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test13() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test13");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var5 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test14() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test14");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test15() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test15");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var2 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test16() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test16");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		java.lang.Object var12 = var0.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test17() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test17");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var52 = var49
				.getNextNode();
		var38.setPreviousNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var54 = var49
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var54);

		TestCoverageTool.report(var0);
	}

	public void test18() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test18");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test19() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test19");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var7 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test20() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test20");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var3 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test21() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test21");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		var42.setValue((java.lang.Object) (byte) 100);
		var39.setPreviousNode(var42);
		var12.setPreviousNode(var42);
		java.lang.Object var47 = var12.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var47);

		TestCoverageTool.report(var0);
	}

	public void test22() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test22");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (short) 0);
		var5.setNextNode(var6);
		roops.core.testingCoverage.base.LinkedListNode var10 = var5
				.getNextNode();
		var5.setValue((java.lang.Object) 'a');
		var1.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		var14.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		var19.setValue((java.lang.Object) false);
		var14.setPreviousNode(var19);
		var5.setNextNode(var19);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var10);

		TestCoverageTool.report(var0);
	}

	public void test23() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test23");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test24() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test24");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test25() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test25");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test26() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test26");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var6 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test27() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test27");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var5 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test28() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test28");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var7 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test29() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test29");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var6 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test30() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test30");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		java.lang.Object var5 = var1.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var5 + "' != '" + (short) 0 + "'",
				var5.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test31() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test31");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test32() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test32");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var3 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test33() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test33");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var49 = var38
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = new roops.core.testingCoverage.base.LinkedListNode();
		var50.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var53 = var50
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		var54.setValue((java.lang.Object) false);
		var54.setValue((java.lang.Object) 0L);
		var50.setPreviousNode(var54);
		roops.core.testingCoverage.base.LinkedListNode var62 = var54
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (byte) 100);
		var66.setValue((java.lang.Object) false);
		var63.setNextNode(var66);
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		java.lang.Object var75 = var72.getValue();
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = new roops.core.testingCoverage.base.LinkedListNode();
		var77.setValue((java.lang.Object) (short) 0);
		var76.setNextNode(var77);
		java.lang.Object var81 = var76.getValue();
		var72.setPreviousNode(var76);
		var66.setPreviousNode(var72);
		roops.core.testingCoverage.base.LinkedListNode var84 = new roops.core.testingCoverage.base.LinkedListNode();
		var84.setValue((java.lang.Object) (short) 0);
		java.lang.Object var87 = var84.getValue();
		roops.core.testingCoverage.base.LinkedListNode var88 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var89 = new roops.core.testingCoverage.base.LinkedListNode();
		var89.setValue((java.lang.Object) (short) 0);
		var88.setNextNode(var89);
		java.lang.Object var93 = var88.getValue();
		var84.setPreviousNode(var88);
		java.lang.Object var95 = var88.getValue();
		java.lang.Object var96 = var88.getValue();
		var72.setPreviousNode(var88);
		var54.setNextNode(var88);
		var38.setNextNode(var54);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var75 + "' != '" + (short) 0 + "'",
				var75.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var81);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var87 + "' != '" + (short) 0 + "'",
				var87.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var93);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var95);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var96);

		TestCoverageTool.report(var0);
	}

	public void test34() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test34");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test35() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test35");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var2 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test36() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test36");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test37() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test37");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test38() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test38");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test39() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test39");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		java.lang.Object var49 = var38.getValue();
		java.lang.Object var50 = var38.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		TestCoverageTool.report(var0);
	}

	public void test40() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test40");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var9 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test41() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test41");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var11 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test42() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test42");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test43() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test43");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test44() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test44");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (short) 0);
		java.lang.Object var15 = var12.getValue();
		java.lang.Object var16 = var12.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var12.setPreviousNode(var17);
		var0.setValue((java.lang.Object) var17);
		java.lang.Object var25 = var17.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var15 + "' != '" + (short) 0 + "'",
				var15.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		TestCoverageTool.report(var0);
	}

	public void test45() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test45");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var10 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test46() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test46");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var29 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var30 = var29.repOK();
		boolean var31 = var29.repOK();
		boolean var32 = var29.repOK();
		var21.setValue((java.lang.Object) var32);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (byte) 100);
		var34.setValue((java.lang.Object) false);
		var34.setValue((java.lang.Object) 0L);
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		var41.setValue((java.lang.Object) (short) 0);
		java.lang.Object var44 = var41.getValue();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var46 = new roops.core.testingCoverage.base.LinkedListNode();
		var46.setValue((java.lang.Object) (short) 0);
		var45.setNextNode(var46);
		java.lang.Object var50 = var45.getValue();
		var41.setPreviousNode(var45);
		java.lang.Object var52 = var45.getValue();
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		var53.setValue((java.lang.Object) (byte) 100);
		var53.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		var58.setValue((java.lang.Object) false);
		var53.setPreviousNode(var58);
		roops.core.testingCoverage.base.LinkedListNode var64 = var58
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var65 = var58
				.getPreviousNode();
		var45.setNextNode(var58);
		roops.core.testingCoverage.base.LinkedListNode var67 = var45
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		var68.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var71 = var68
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (byte) 100);
		var72.setValue((java.lang.Object) false);
		var72.setValue((java.lang.Object) 0L);
		var68.setPreviousNode(var72);
		roops.core.testingCoverage.base.LinkedListNode var80 = var72
				.getNextNode();
		var45.setNextNode(var72);
		var34.setNextNode(var72);
		roops.core.testingCoverage.base.LinkedListNode var83 = new roops.core.testingCoverage.base.LinkedListNode();
		var83.setValue((java.lang.Object) (short) 0);
		java.lang.Object var86 = var83.getValue();
		roops.core.testingCoverage.base.LinkedListNode var87 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var88 = new roops.core.testingCoverage.base.LinkedListNode();
		var88.setValue((java.lang.Object) (short) 0);
		var87.setNextNode(var88);
		java.lang.Object var92 = var87.getValue();
		var83.setPreviousNode(var87);
		java.lang.Object var94 = var87.getValue();
		roops.core.testingCoverage.base.LinkedListNode var95 = var87
				.getPreviousNode();
		java.lang.Object var96 = var87.getValue();
		roops.core.testingCoverage.base.LinkedListNode var97 = var87
				.getNextNode();
		var34.setValue((java.lang.Object) var87);
		var21.setNextNode(var87);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var30 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var31 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var32 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var44 + "' != '" + (short) 0 + "'",
				var44.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var80);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var86 + "' != '" + (short) 0 + "'",
				var86.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var92);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var94);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var95);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var96);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var97);

		TestCoverageTool.report(var0);
	}

	public void test47() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test47");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test48() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test48");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test49() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test49");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		var0.setValue((java.lang.Object) 0L);
		roops.core.testingCoverage.base.LinkedListNode var7 = var0
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.report(var0);
	}

	public void test50() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test50");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var12 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test51() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test51");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test52() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test52");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (byte) 100);
		var10.setValue((java.lang.Object) false);
		var7.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var16.setPreviousNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var30 = var27
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (byte) 100);
		var31.setValue((java.lang.Object) false);
		var31.setValue((java.lang.Object) 0L);
		var27.setPreviousNode(var31);
		roops.core.testingCoverage.base.LinkedListNode var39 = var27
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		java.lang.Object var43 = var40.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		var44.setNextNode(var45);
		java.lang.Object var49 = var44.getValue();
		var40.setPreviousNode(var44);
		java.lang.Object var51 = var44.getValue();
		java.lang.Object var52 = var44.getValue();
		var39.setNextNode(var44);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		var54.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (byte) 100);
		var59.setValue((java.lang.Object) false);
		var54.setPreviousNode(var59);
		var39.setValue((java.lang.Object) var54);
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (short) 0);
		java.lang.Object var69 = var66.getValue();
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		var71.setValue((java.lang.Object) (short) 0);
		var70.setNextNode(var71);
		java.lang.Object var75 = var70.getValue();
		var66.setPreviousNode(var70);
		java.lang.Object var77 = var70.getValue();
		roops.core.testingCoverage.base.LinkedListNode var78 = new roops.core.testingCoverage.base.LinkedListNode();
		var78.setValue((java.lang.Object) (byte) 100);
		var78.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var83 = new roops.core.testingCoverage.base.LinkedListNode();
		var83.setValue((java.lang.Object) (byte) 100);
		var83.setValue((java.lang.Object) false);
		var78.setPreviousNode(var83);
		roops.core.testingCoverage.base.LinkedListNode var89 = var83
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var90 = var83
				.getPreviousNode();
		var70.setNextNode(var83);
		roops.core.testingCoverage.base.LinkedListNode var92 = var70
				.getNextNode();
		var39.setPreviousNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var94 = var39
				.getNextNode();
		var21.setValue((java.lang.Object) var39);
		var7.setNextNode(var21);
		var0.setPreviousNode(var7);
		roops.core.testingCoverage.base.LinkedListNode var98 = var0
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var43 + "' != '" + (short) 0 + "'",
				var43.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var69 + "' != '" + (short) 0 + "'",
				var69.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var75);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var89);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var90);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var92);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var94);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var98);

		TestCoverageTool.report(var0);
	}

	public void test53() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test53");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var8 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		var9.setValue((java.lang.Object) 0L);
		var5.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var17 = var9
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var18.setNextNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		var21.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		java.lang.Object var51 = var43.getValue();
		var27.setPreviousNode(var43);
		var9.setNextNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var57 = var54
				.getNextNode();
		var43.setPreviousNode(var54);
		var0.setValue((java.lang.Object) var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var57);

		TestCoverageTool.report(var0);
	}

	public void test54() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test54");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var29 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var30 = var29.repOK();
		boolean var31 = var29.repOK();
		boolean var32 = var29.repOK();
		var21.setValue((java.lang.Object) var32);
		java.lang.Object var34 = var21.getValue();
		var21.setValue((java.lang.Object) false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var30 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var31 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var32 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var34 + "' != '" + true + "'", var34.equals(true));

		TestCoverageTool.report(var0);
	}

	public void test55() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test55");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		java.lang.Object var4 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (short) 0);
		var5.setNextNode(var6);
		java.lang.Object var10 = var5.getValue();
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var26 = var23
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		var27.setValue((java.lang.Object) 0L);
		var23.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var35 = var23
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var36 = new roops.core.testingCoverage.base.LinkedListNode();
		var36.setValue((java.lang.Object) (short) 0);
		java.lang.Object var39 = var36.getValue();
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		var41.setValue((java.lang.Object) (short) 0);
		var40.setNextNode(var41);
		java.lang.Object var45 = var40.getValue();
		var36.setPreviousNode(var40);
		java.lang.Object var47 = var40.getValue();
		java.lang.Object var48 = var40.getValue();
		var35.setNextNode(var40);
		roops.core.testingCoverage.base.LinkedListNode var50 = new roops.core.testingCoverage.base.LinkedListNode();
		var50.setValue((java.lang.Object) (byte) 100);
		var50.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (byte) 100);
		var55.setValue((java.lang.Object) false);
		var50.setPreviousNode(var55);
		var35.setValue((java.lang.Object) var50);
		roops.core.testingCoverage.base.LinkedListNode var62 = new roops.core.testingCoverage.base.LinkedListNode();
		var62.setValue((java.lang.Object) (short) 0);
		java.lang.Object var65 = var62.getValue();
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (short) 0);
		var66.setNextNode(var67);
		java.lang.Object var71 = var66.getValue();
		var62.setPreviousNode(var66);
		java.lang.Object var73 = var66.getValue();
		roops.core.testingCoverage.base.LinkedListNode var74 = new roops.core.testingCoverage.base.LinkedListNode();
		var74.setValue((java.lang.Object) (byte) 100);
		var74.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var79 = new roops.core.testingCoverage.base.LinkedListNode();
		var79.setValue((java.lang.Object) (byte) 100);
		var79.setValue((java.lang.Object) false);
		var74.setPreviousNode(var79);
		roops.core.testingCoverage.base.LinkedListNode var85 = var79
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var86 = var79
				.getPreviousNode();
		var66.setNextNode(var79);
		roops.core.testingCoverage.base.LinkedListNode var88 = var66
				.getNextNode();
		var35.setPreviousNode(var66);
		roops.core.testingCoverage.base.LinkedListNode var90 = var35
				.getNextNode();
		var17.setValue((java.lang.Object) var35);
		var5.setPreviousNode(var35);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var4 + "' != '" + (short) 0 + "'",
				var4.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var10);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var39 + "' != '" + (short) 0 + "'",
				var39.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var65 + "' != '" + (short) 0 + "'",
				var65.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var73);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var85);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var86);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var88);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var90);

		TestCoverageTool.report(var0);
	}

	public void test56() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test56");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var11 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test57() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test57");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test58() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test58");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var7 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test59() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test59");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var12 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test60() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test60");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.report(var0);
	}

	public void test61() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test61");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = var12
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.report(var0);
	}

	public void test62() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test62");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		var12.setNextNode(var13);
		var0.setValue((java.lang.Object) var12);
		roops.core.testingCoverage.base.LinkedListNode var18 = var0
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		TestCoverageTool.report(var0);
	}

	public void test63() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test63");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (byte) 100);
		var6.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (byte) 100);
		var11.setValue((java.lang.Object) false);
		var6.setPreviousNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var17 = var11
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = var11
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (byte) 100);
		var22.setValue((java.lang.Object) false);
		var19.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		var22.setPreviousNode(var28);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		java.lang.Object var43 = var40.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		var44.setNextNode(var45);
		java.lang.Object var49 = var44.getValue();
		var40.setPreviousNode(var44);
		java.lang.Object var51 = var44.getValue();
		java.lang.Object var52 = var44.getValue();
		var28.setPreviousNode(var44);
		var11.setNextNode(var28);
		var0.setNextNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var56.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		var67.setNextNode(var70);
		java.lang.Object var76 = var67.getValue();
		var61.setNextNode(var67);
		var0.setValue((java.lang.Object) var61);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var43 + "' != '" + (short) 0 + "'",
				var43.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var76 + "' != '" + (byte) 100 + "'",
				var76.equals((byte) 100));

		TestCoverageTool.report(var0);
	}

	public void test64() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test64");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test65() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test65");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test66() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test66");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var4 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test67() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test67");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var4 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test68() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test68");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var7 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (byte) 100);
		var8.setValue((java.lang.Object) false);
		var8.setValue((java.lang.Object) 0L);
		var4.setPreviousNode(var8);
		var0.setPreviousNode(var4);
		java.lang.Object var17 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		var18.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (byte) 100);
		var23.setValue((java.lang.Object) false);
		var18.setPreviousNode(var23);
		roops.core.testingCoverage.base.LinkedListNode var29 = var23
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var30 = var23
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (byte) 100);
		var34.setValue((java.lang.Object) false);
		var31.setNextNode(var34);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		java.lang.Object var43 = var40.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		var44.setNextNode(var45);
		java.lang.Object var49 = var44.getValue();
		var40.setPreviousNode(var44);
		var34.setPreviousNode(var40);
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		java.lang.Object var55 = var52.getValue();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (short) 0);
		var56.setNextNode(var57);
		java.lang.Object var61 = var56.getValue();
		var52.setPreviousNode(var56);
		java.lang.Object var63 = var56.getValue();
		java.lang.Object var64 = var56.getValue();
		var40.setPreviousNode(var56);
		var23.setNextNode(var40);
		var40.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var69 = var40
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		var75.setValue((java.lang.Object) (byte) 100);
		var75.setValue((java.lang.Object) false);
		var70.setPreviousNode(var75);
		roops.core.testingCoverage.base.LinkedListNode var81 = new roops.core.testingCoverage.base.LinkedListNode();
		var81.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var84 = new roops.core.testingCoverage.base.LinkedListNode();
		var84.setValue((java.lang.Object) (byte) 100);
		var84.setValue((java.lang.Object) false);
		var81.setNextNode(var84);
		java.lang.Object var90 = var81.getValue();
		var75.setNextNode(var81);
		var40.setPreviousNode(var75);
		var4.setNextNode(var40);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var17 + "' != '" + (short) 0 + "'",
				var17.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var43 + "' != '" + (short) 0 + "'",
				var43.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var55 + "' != '" + (short) 0 + "'",
				var55.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var69);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var90 + "' != '" + (byte) 100 + "'",
				var90.equals((byte) 100));

		TestCoverageTool.report(var0);
	}

	public void test69() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test69");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		java.lang.Object var9 = var3.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var9 + "' != '" + false + "'", var9.equals(false));

		TestCoverageTool.report(var0);
	}

	public void test70() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test70");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		TestCoverageTool.report(var0);
	}

	public void test71() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test71");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var3 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		TestCoverageTool.report(var0);
	}

	public void test72() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test72");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var17
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		TestCoverageTool.report(var0);
	}

	public void test73() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test73");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getPreviousNode();
		java.lang.Object var13 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var17 = var14
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		var18.setValue((java.lang.Object) false);
		var18.setValue((java.lang.Object) 0L);
		var14.setPreviousNode(var18);
		roops.core.testingCoverage.base.LinkedListNode var26 = var14
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		java.lang.Object var38 = var31.getValue();
		java.lang.Object var39 = var31.getValue();
		var26.setNextNode(var31);
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		var41.setValue((java.lang.Object) (byte) 100);
		var41.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var46 = new roops.core.testingCoverage.base.LinkedListNode();
		var46.setValue((java.lang.Object) (byte) 100);
		var46.setValue((java.lang.Object) false);
		var41.setPreviousNode(var46);
		var26.setValue((java.lang.Object) var41);
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		var53.setValue((java.lang.Object) (short) 0);
		java.lang.Object var56 = var53.getValue();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (short) 0);
		var57.setNextNode(var58);
		java.lang.Object var62 = var57.getValue();
		var53.setPreviousNode(var57);
		java.lang.Object var64 = var57.getValue();
		roops.core.testingCoverage.base.LinkedListNode var65 = new roops.core.testingCoverage.base.LinkedListNode();
		var65.setValue((java.lang.Object) (byte) 100);
		var65.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		var65.setPreviousNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var76 = var70
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = var70
				.getPreviousNode();
		var57.setNextNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var79 = var57
				.getNextNode();
		var26.setPreviousNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var81 = var26
				.getNextNode();
		var4.setNextNode(var81);
		roops.core.testingCoverage.base.LinkedListNode var83 = var81
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var84 = var81
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var38);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var56 + "' != '" + (short) 0 + "'",
				var56.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var79);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var81);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var83);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var84);

		TestCoverageTool.report(var0);
	}

	public void test74() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test74");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var10 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test75() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test75");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var9 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test76() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test76");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var8 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		var9.setValue((java.lang.Object) 0L);
		var5.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var17 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		java.lang.Object var21 = var18.getValue();
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (short) 0);
		var22.setNextNode(var23);
		java.lang.Object var27 = var22.getValue();
		var18.setPreviousNode(var22);
		java.lang.Object var29 = var22.getValue();
		java.lang.Object var30 = var22.getValue();
		var17.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (byte) 100);
		var37.setValue((java.lang.Object) false);
		var32.setPreviousNode(var37);
		var17.setValue((java.lang.Object) var32);
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		java.lang.Object var47 = var44.getValue();
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		var48.setNextNode(var49);
		java.lang.Object var53 = var48.getValue();
		var44.setPreviousNode(var48);
		java.lang.Object var55 = var48.getValue();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var56.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = var61
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var61
				.getPreviousNode();
		var48.setNextNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var70 = var48
				.getNextNode();
		var17.setPreviousNode(var48);
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var75 = var72
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		var76.setValue((java.lang.Object) (byte) 100);
		var76.setValue((java.lang.Object) false);
		var76.setValue((java.lang.Object) 0L);
		var72.setPreviousNode(var76);
		roops.core.testingCoverage.base.LinkedListNode var84 = var72
				.getPreviousNode();
		var17.setValue((java.lang.Object) var84);
		var1.setValue((java.lang.Object) var84);
		roops.core.testingCoverage.base.LinkedListNode var87 = var84
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var21 + "' != '" + (short) 0 + "'",
				var21.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var47 + "' != '" + (short) 0 + "'",
				var47.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var55);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var75);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var84);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var87);

		TestCoverageTool.report(var0);
	}

	public void test77() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test77");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test78() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test78");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.report(var0);
	}

	public void test79() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test79");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getNextNode();
		java.lang.Object var4 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var8 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		var9.setValue((java.lang.Object) 0L);
		var5.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var17 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		java.lang.Object var21 = var18.getValue();
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (short) 0);
		var22.setNextNode(var23);
		java.lang.Object var27 = var22.getValue();
		var18.setPreviousNode(var22);
		java.lang.Object var29 = var22.getValue();
		java.lang.Object var30 = var22.getValue();
		var17.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (byte) 100);
		var37.setValue((java.lang.Object) false);
		var32.setPreviousNode(var37);
		var17.setValue((java.lang.Object) var32);
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		java.lang.Object var47 = var44.getValue();
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		var48.setNextNode(var49);
		java.lang.Object var53 = var48.getValue();
		var44.setPreviousNode(var48);
		java.lang.Object var55 = var48.getValue();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var56.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = var61
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var61
				.getPreviousNode();
		var48.setNextNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var70 = var48
				.getNextNode();
		var17.setPreviousNode(var48);
		roops.core.testingCoverage.base.LinkedListNode var72 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var73 = var17
				.getPreviousNode();
		java.lang.Object var74 = var73.getValue();
		var0.setPreviousNode(var73);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var4 + "' != '" + (byte) 100 + "'",
				var4.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var21 + "' != '" + (short) 0 + "'",
				var21.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var47 + "' != '" + (short) 0 + "'",
				var47.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var55);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var72);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var73);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var74);

		TestCoverageTool.report(var0);
	}

	public void test80() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test80");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var2 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test81() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test81");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var29 = var3
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		TestCoverageTool.report(var0);
	}

	public void test82() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test82");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var7 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		TestCoverageTool.report(var0);
	}

	public void test83() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test83");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		var22.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var51 = var22
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (byte) 100);
		var52.setValue((java.lang.Object) false);
		var52.setValue((java.lang.Object) 0L);
		var51.setNextNode(var52);
		java.lang.Object var60 = var52.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var60 + "' != '" + 0L + "'", var60.equals(0L));

		TestCoverageTool.report(var0);
	}

	public void test84() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test84");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (short) 0);
		var9.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var14 = var9
				.getNextNode();
		var9.setValue((java.lang.Object) 'a');
		var5.setPreviousNode(var9);
		var0.setNextNode(var5);
		java.lang.Object var19 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var20 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		java.lang.Object var24 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		var25.setNextNode(var26);
		java.lang.Object var30 = var25.getValue();
		var21.setPreviousNode(var25);
		java.lang.Object var32 = var25.getValue();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (byte) 100);
		var33.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		var33.setPreviousNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var44 = var38
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = var38
				.getPreviousNode();
		var25.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var47 = var25
				.getNextNode();
		var0.setNextNode(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var19 + "' != '" + (short) 0 + "'",
				var19.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var20);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var24 + "' != '" + (short) 0 + "'",
				var24.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var47);

		TestCoverageTool.report(var0);
	}

	public void test85() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test85");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test86() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test86");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = var9
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var21);

		TestCoverageTool.report(var0);
	}

	public void test87() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test87");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var29 = new roops.core.testingCoverage.base.LinkedListNode();
		var29.setValue((java.lang.Object) (short) 0);
		java.lang.Object var32 = var29.getValue();
		java.lang.Object var33 = var29.getValue();
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (short) 0);
		var34.setNextNode(var35);
		java.lang.Object var39 = var34.getValue();
		var29.setPreviousNode(var34);
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		var41.setValue((java.lang.Object) (byte) 100);
		var41.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var46 = new roops.core.testingCoverage.base.LinkedListNode();
		var46.setValue((java.lang.Object) (byte) 100);
		var46.setValue((java.lang.Object) false);
		var41.setPreviousNode(var46);
		roops.core.testingCoverage.base.LinkedListNode var52 = var46
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var53 = var46
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (byte) 100);
		var57.setValue((java.lang.Object) false);
		var54.setNextNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (short) 0);
		java.lang.Object var66 = var63.getValue();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		var68.setValue((java.lang.Object) (short) 0);
		var67.setNextNode(var68);
		java.lang.Object var72 = var67.getValue();
		var63.setPreviousNode(var67);
		var57.setPreviousNode(var63);
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		var75.setValue((java.lang.Object) (short) 0);
		java.lang.Object var78 = var75.getValue();
		roops.core.testingCoverage.base.LinkedListNode var79 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var80 = new roops.core.testingCoverage.base.LinkedListNode();
		var80.setValue((java.lang.Object) (short) 0);
		var79.setNextNode(var80);
		java.lang.Object var84 = var79.getValue();
		var75.setPreviousNode(var79);
		java.lang.Object var86 = var79.getValue();
		java.lang.Object var87 = var79.getValue();
		var63.setPreviousNode(var79);
		var46.setNextNode(var63);
		var63.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var92 = var63
				.getPreviousNode();
		java.lang.Object var93 = var63.getValue();
		var34.setNextNode(var63);
		var21.setNextNode(var63);
		roops.core.testingCoverage.base.LinkedListNode var96 = var63
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var32 + "' != '" + (short) 0 + "'",
				var32.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var33 + "' != '" + (short) 0 + "'",
				var33.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var66 + "' != '" + (short) 0 + "'",
				var66.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var72);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var78 + "' != '" + (short) 0 + "'",
				var78.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var84);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var86);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var87);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var92);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var93 + "' != '" + 10 + "'", var93.equals(10));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var96);

		TestCoverageTool.report(var0);
	}

	public void test88() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test88");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		java.lang.Object var11 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var11 + "' != '" + false + "'", var11.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		TestCoverageTool.report(var0);
	}

	public void test89() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test89");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		java.lang.Object var27 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var28 = var4
				.getNextNode();
		java.lang.Object var29 = var4.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var28);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		TestCoverageTool.report(var0);
	}

	public void test90() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test90");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (short) 0);
		var9.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var14 = var9
				.getNextNode();
		var9.setValue((java.lang.Object) 'a');
		var5.setPreviousNode(var9);
		var0.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (short) 0);
		java.lang.Object var22 = var19.getValue();
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		var24.setValue((java.lang.Object) (short) 0);
		var23.setNextNode(var24);
		java.lang.Object var28 = var23.getValue();
		var19.setPreviousNode(var23);
		java.lang.Object var30 = var23.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (byte) 100);
		var31.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var36 = new roops.core.testingCoverage.base.LinkedListNode();
		var36.setValue((java.lang.Object) (byte) 100);
		var36.setValue((java.lang.Object) false);
		var31.setPreviousNode(var36);
		roops.core.testingCoverage.base.LinkedListNode var42 = var36
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var43 = var36
				.getPreviousNode();
		var23.setNextNode(var36);
		roops.core.testingCoverage.base.LinkedListNode var45 = var23
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var46 = var23
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (short) 0);
		java.lang.Object var50 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		java.lang.Object var56 = var51.getValue();
		var47.setPreviousNode(var51);
		java.lang.Object var58 = var51.getValue();
		roops.core.testingCoverage.base.LinkedListNode var59 = var51
				.getPreviousNode();
		java.lang.Object var60 = var51.getValue();
		var23.setPreviousNode(var51);
		java.lang.Object var62 = var23.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (short) 0);
		java.lang.Object var66 = var63.getValue();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		var68.setValue((java.lang.Object) (short) 0);
		var67.setNextNode(var68);
		java.lang.Object var72 = var67.getValue();
		var63.setPreviousNode(var67);
		java.lang.Object var74 = var67.getValue();
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		var75.setValue((java.lang.Object) (byte) 100);
		var75.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var80 = new roops.core.testingCoverage.base.LinkedListNode();
		var80.setValue((java.lang.Object) (byte) 100);
		var80.setValue((java.lang.Object) false);
		var75.setPreviousNode(var80);
		roops.core.testingCoverage.base.LinkedListNode var86 = var80
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var87 = var80
				.getPreviousNode();
		var67.setNextNode(var80);
		roops.core.testingCoverage.base.LinkedListNode var89 = var67
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var90 = var89
				.getPreviousNode();
		var23.setNextNode(var89);
		roops.core.testingCoverage.base.LinkedListNode var92 = var89
				.getPreviousNode();
		var5.setNextNode(var89);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var22 + "' != '" + (short) 0 + "'",
				var22.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var28);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var42);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var50 + "' != '" + (short) 0 + "'",
				var50.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var56);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var59);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var66 + "' != '" + (short) 0 + "'",
				var66.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var72);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var74);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var86);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var87);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var89);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var90);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var92);

		TestCoverageTool.report(var0);
	}

	public void test91() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test91");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test92() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test92");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var11 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		TestCoverageTool.report(var0);
	}

	public void test93() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test93");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		var0.setValue((java.lang.Object) 'a');
		java.lang.Object var8 = var0.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var8 + "' != '" + 'a' + "'", var8.equals('a'));

		TestCoverageTool.report(var0);
	}

	public void test94() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test94");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var1
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var5);

		TestCoverageTool.report(var0);
	}

	public void test95() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test95");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var7 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (byte) 100);
		var8.setValue((java.lang.Object) false);
		var8.setValue((java.lang.Object) 0L);
		var4.setPreviousNode(var8);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (byte) 100);
		var20.setValue((java.lang.Object) false);
		var17.setNextNode(var20);
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		java.lang.Object var29 = var26.getValue();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (short) 0);
		var30.setNextNode(var31);
		java.lang.Object var35 = var30.getValue();
		var26.setPreviousNode(var30);
		var20.setPreviousNode(var26);
		var4.setNextNode(var26);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		java.lang.Object var65 = var56.getValue();
		var26.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var67 = var26
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var29 + "' != '" + (short) 0 + "'",
				var29.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var65 + "' != '" + false + "'", var65.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		TestCoverageTool.report(var0);
	}

	public void test96() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test96");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test97() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test97");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var65 = var43
				.getNextNode();
		var12.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var67 = var43
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var43
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var68);

		TestCoverageTool.report(var0);
	}

	public void test98() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test98");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		TestCoverageTool.report(var0);
	}

	public void test99() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test99");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var2 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test100() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test100");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		var12.setNextNode(var13);
		var0.setValue((java.lang.Object) var12);
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var18.setNextNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		var21.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		var39.setValue((java.lang.Object) false);
		var39.setValue((java.lang.Object) 0L);
		var21.setPreviousNode(var39);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var47 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var48 = var47.repOK();
		boolean var49 = var47.repOK();
		boolean var50 = var47.repOK();
		var39.setValue((java.lang.Object) var50);
		java.lang.Object var52 = var39.getValue();
		var0.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var57 = var54
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		var58.setValue((java.lang.Object) false);
		var58.setValue((java.lang.Object) 0L);
		var54.setPreviousNode(var58);
		roops.core.testingCoverage.base.LinkedListNode var66 = var54
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (short) 0);
		java.lang.Object var70 = var67.getValue();
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		var71.setNextNode(var72);
		java.lang.Object var76 = var71.getValue();
		var67.setPreviousNode(var71);
		java.lang.Object var78 = var71.getValue();
		java.lang.Object var79 = var71.getValue();
		var66.setNextNode(var71);
		roops.core.testingCoverage.base.LinkedListNode var81 = new roops.core.testingCoverage.base.LinkedListNode();
		var81.setValue((java.lang.Object) (byte) 100);
		var81.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var86 = new roops.core.testingCoverage.base.LinkedListNode();
		var86.setValue((java.lang.Object) (byte) 100);
		var86.setValue((java.lang.Object) false);
		var81.setPreviousNode(var86);
		var66.setValue((java.lang.Object) var81);
		var39.setPreviousNode(var66);
		roops.core.testingCoverage.base.LinkedListNode var94 = var66
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var48 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var49 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var50 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + true + "'", var52.equals(true));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var57);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var66);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var70 + "' != '" + (short) 0 + "'",
				var70.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var78);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var79);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var94);

		TestCoverageTool.report(var0);
	}

	public void test101() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test101");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var65 = var43
				.getNextNode();
		var12.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var67 = var12
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var69 = new roops.core.testingCoverage.base.LinkedListNode();
		var69.setValue((java.lang.Object) (short) 0);
		var68.setNextNode(var69);
		roops.core.testingCoverage.base.LinkedListNode var73 = var68
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var74 = var73
				.getPreviousNode();
		var67.setPreviousNode(var73);
		java.lang.Object var76 = var67.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var73);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var74);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		TestCoverageTool.report(var0);
	}

	public void test102() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test102");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = var3
				.getPreviousNode();
		java.lang.Object var22 = var21.getValue();
		java.lang.Object var23 = var21.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var22 + "' != '" + (short) 0 + "'",
				var22.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var23 + "' != '" + (short) 0 + "'",
				var23.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test103() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test103");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = var0
				.getPreviousNode();
		java.lang.Object var7 = var0.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		TestCoverageTool.report(var0);
	}

	public void test104() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test104");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		java.lang.Object var39 = var32.getValue();
		roops.core.testingCoverage.base.LinkedListNode var40 = var32
				.getPreviousNode();
		java.lang.Object var41 = var32.getValue();
		var4.setPreviousNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var46 = var43
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (byte) 100);
		var47.setValue((java.lang.Object) false);
		var47.setValue((java.lang.Object) 0L);
		var43.setPreviousNode(var47);
		roops.core.testingCoverage.base.LinkedListNode var55 = var43
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (short) 0);
		java.lang.Object var59 = var56.getValue();
		roops.core.testingCoverage.base.LinkedListNode var60 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (short) 0);
		var60.setNextNode(var61);
		java.lang.Object var65 = var60.getValue();
		var56.setPreviousNode(var60);
		java.lang.Object var67 = var60.getValue();
		java.lang.Object var68 = var60.getValue();
		var55.setNextNode(var60);
		var32.setPreviousNode(var60);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var40);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var41);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var55);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var59 + "' != '" + (short) 0 + "'",
				var59.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		TestCoverageTool.report(var0);
	}

	public void test105() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test105");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var5 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test106() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test106");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var52 = var49
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		var53.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var53.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = new roops.core.testingCoverage.base.LinkedListNode();
		var62.setValue((java.lang.Object) (short) 0);
		java.lang.Object var65 = var62.getValue();
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (short) 0);
		var66.setNextNode(var67);
		java.lang.Object var71 = var66.getValue();
		var62.setPreviousNode(var66);
		var56.setPreviousNode(var62);
		roops.core.testingCoverage.base.LinkedListNode var74 = var56
				.getPreviousNode();
		var49.setNextNode(var56);
		var38.setPreviousNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var77 = var38
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var65 + "' != '" + (short) 0 + "'",
				var65.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var74);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var77);

		TestCoverageTool.report(var0);
	}

	public void test107() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test107");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (short) 0);
		var9.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var14 = var9
				.getNextNode();
		var9.setValue((java.lang.Object) 'a');
		var5.setPreviousNode(var9);
		var0.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (short) 0);
		var19.setNextNode(var20);
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		var25.setValue((java.lang.Object) (short) 0);
		var24.setNextNode(var25);
		roops.core.testingCoverage.base.LinkedListNode var29 = var24
				.getNextNode();
		var24.setValue((java.lang.Object) 'a');
		var20.setPreviousNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		java.lang.Object var36 = var33.getValue();
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (short) 0);
		var37.setNextNode(var38);
		java.lang.Object var42 = var37.getValue();
		var33.setPreviousNode(var37);
		java.lang.Object var44 = var37.getValue();
		roops.core.testingCoverage.base.LinkedListNode var45 = var37
				.getPreviousNode();
		java.lang.Object var46 = var37.getValue();
		var24.setPreviousNode(var37);
		var0.setNextNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (byte) 100);
		var49.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		var54.setValue((java.lang.Object) false);
		var49.setPreviousNode(var54);
		roops.core.testingCoverage.base.LinkedListNode var60 = var54
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var61 = var54
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var62 = new roops.core.testingCoverage.base.LinkedListNode();
		var62.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var65 = new roops.core.testingCoverage.base.LinkedListNode();
		var65.setValue((java.lang.Object) (byte) 100);
		var65.setValue((java.lang.Object) false);
		var62.setNextNode(var65);
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		var71.setValue((java.lang.Object) (short) 0);
		java.lang.Object var74 = var71.getValue();
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		var76.setValue((java.lang.Object) (short) 0);
		var75.setNextNode(var76);
		java.lang.Object var80 = var75.getValue();
		var71.setPreviousNode(var75);
		var65.setPreviousNode(var71);
		roops.core.testingCoverage.base.LinkedListNode var83 = new roops.core.testingCoverage.base.LinkedListNode();
		var83.setValue((java.lang.Object) (short) 0);
		java.lang.Object var86 = var83.getValue();
		roops.core.testingCoverage.base.LinkedListNode var87 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var88 = new roops.core.testingCoverage.base.LinkedListNode();
		var88.setValue((java.lang.Object) (short) 0);
		var87.setNextNode(var88);
		java.lang.Object var92 = var87.getValue();
		var83.setPreviousNode(var87);
		java.lang.Object var94 = var87.getValue();
		java.lang.Object var95 = var87.getValue();
		var71.setPreviousNode(var87);
		var54.setNextNode(var71);
		roops.core.testingCoverage.base.LinkedListNode var98 = var54
				.getPreviousNode();
		var0.setNextNode(var54);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var36 + "' != '" + (short) 0 + "'",
				var36.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var42);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var74 + "' != '" + (short) 0 + "'",
				var74.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var80);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var86 + "' != '" + (short) 0 + "'",
				var86.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var92);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var94);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var95);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var98);

		TestCoverageTool.report(var0);
	}

	public void test108() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test108");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		var12.setNextNode(var13);
		var0.setValue((java.lang.Object) var12);
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var18.setNextNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		var21.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		var39.setValue((java.lang.Object) false);
		var39.setValue((java.lang.Object) 0L);
		var21.setPreviousNode(var39);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var47 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var48 = var47.repOK();
		boolean var49 = var47.repOK();
		boolean var50 = var47.repOK();
		var39.setValue((java.lang.Object) var50);
		java.lang.Object var52 = var39.getValue();
		var0.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var57 = var54
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		var58.setValue((java.lang.Object) false);
		var58.setValue((java.lang.Object) 0L);
		var54.setPreviousNode(var58);
		roops.core.testingCoverage.base.LinkedListNode var66 = var54
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (short) 0);
		java.lang.Object var70 = var67.getValue();
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		var71.setNextNode(var72);
		java.lang.Object var76 = var71.getValue();
		var67.setPreviousNode(var71);
		java.lang.Object var78 = var71.getValue();
		java.lang.Object var79 = var71.getValue();
		var66.setNextNode(var71);
		roops.core.testingCoverage.base.LinkedListNode var81 = new roops.core.testingCoverage.base.LinkedListNode();
		var81.setValue((java.lang.Object) (byte) 100);
		var81.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var86 = new roops.core.testingCoverage.base.LinkedListNode();
		var86.setValue((java.lang.Object) (byte) 100);
		var86.setValue((java.lang.Object) false);
		var81.setPreviousNode(var86);
		var66.setValue((java.lang.Object) var81);
		var39.setPreviousNode(var66);
		roops.core.testingCoverage.base.LinkedListNode var94 = var66
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var48 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var49 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var50 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + true + "'", var52.equals(true));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var57);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var66);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var70 + "' != '" + (short) 0 + "'",
				var70.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var78);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var79);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var94);

		TestCoverageTool.report(var0);
	}

	public void test109() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test109");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var49 = var22
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = var49
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		TestCoverageTool.report(var0);
	}

	public void test110() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test110");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var12 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test111() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test111");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		TestCoverageTool.report(var0);
	}

	public void test112() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test112");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (short) 0);
		var5.setNextNode(var6);
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (short) 0);
		var10.setNextNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var15 = var10
				.getNextNode();
		var10.setValue((java.lang.Object) 'a');
		var6.setPreviousNode(var10);
		var1.setValue((java.lang.Object) var10);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var15);

		TestCoverageTool.report(var0);
	}

	public void test113() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test113");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		var48.setNextNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var53 = var48
				.getNextNode();
		var48.setValue((java.lang.Object) 'a');
		var44.setPreviousNode(var48);
		var39.setNextNode(var44);
		java.lang.Object var58 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var59 = var39
				.getPreviousNode();
		java.lang.Object var60 = var39.getValue();
		var12.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var62 = var39
				.getNextNode();
		java.lang.Object var63 = var39.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var58 + "' != '" + (short) 0 + "'",
				var58.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var59);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var60 + "' != '" + (short) 0 + "'",
				var60.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var63 + "' != '" + (short) 0 + "'",
				var63.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test114() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test114");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		java.lang.Object var49 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var50 = var38
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		roops.core.testingCoverage.base.LinkedListNode var56 = var51
				.getNextNode();
		var50.setNextNode(var51);
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var58.setNextNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = var61
				.getPreviousNode();
		var51.setPreviousNode(var61);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var56);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		TestCoverageTool.report(var0);
	}

	public void test115() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test115");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var29 = new roops.core.testingCoverage.base.LinkedListNode();
		var29.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var29.setNextNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (short) 0);
		java.lang.Object var41 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (short) 0);
		var42.setNextNode(var43);
		java.lang.Object var47 = var42.getValue();
		var38.setPreviousNode(var42);
		var32.setPreviousNode(var38);
		var21.setPreviousNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var51 = var32
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var41 + "' != '" + (short) 0 + "'",
				var41.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		TestCoverageTool.report(var0);
	}

	public void test116() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test116");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var7 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (byte) 100);
		var8.setValue((java.lang.Object) false);
		var8.setValue((java.lang.Object) 0L);
		var4.setPreviousNode(var8);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var17 = var0
				.getPreviousNode();
		java.lang.Object var18 = var17.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var18 + "' != '" + (short) 0 + "'",
				var18.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test117() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test117");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var16 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		TestCoverageTool.report(var0);
	}

	public void test118() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test118");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = var3
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var22 = var21
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		TestCoverageTool.report(var0);
	}

	public void test119() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test119");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var0.setPreviousNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var7 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var11 = var8
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		var12.setValue((java.lang.Object) 0L);
		var8.setPreviousNode(var12);
		roops.core.testingCoverage.base.LinkedListNode var20 = var8
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		java.lang.Object var24 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		var25.setNextNode(var26);
		java.lang.Object var30 = var25.getValue();
		var21.setPreviousNode(var25);
		java.lang.Object var32 = var25.getValue();
		java.lang.Object var33 = var25.getValue();
		var20.setNextNode(var25);
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (byte) 100);
		var35.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (byte) 100);
		var40.setValue((java.lang.Object) false);
		var35.setPreviousNode(var40);
		var20.setValue((java.lang.Object) var35);
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (short) 0);
		java.lang.Object var50 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (short) 0);
		var56.setNextNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var61 = var56
				.getNextNode();
		var56.setValue((java.lang.Object) 'a');
		var52.setPreviousNode(var56);
		var47.setNextNode(var52);
		java.lang.Object var66 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var67 = var47
				.getPreviousNode();
		java.lang.Object var68 = var47.getValue();
		var20.setNextNode(var47);
		roops.core.testingCoverage.base.LinkedListNode var70 = var47
				.getNextNode();
		var7.setNextNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		java.lang.Object var75 = var72.getValue();
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = new roops.core.testingCoverage.base.LinkedListNode();
		var77.setValue((java.lang.Object) (short) 0);
		var76.setNextNode(var77);
		java.lang.Object var81 = var76.getValue();
		var72.setPreviousNode(var76);
		var70.setValue((java.lang.Object) var76);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var20);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var24 + "' != '" + (short) 0 + "'",
				var24.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var50 + "' != '" + (short) 0 + "'",
				var50.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var66 + "' != '" + (short) 0 + "'",
				var66.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var68 + "' != '" + (short) 0 + "'",
				var68.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var75 + "' != '" + (short) 0 + "'",
				var75.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var81);

		TestCoverageTool.report(var0);
	}

	public void test120() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test120");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var10 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		TestCoverageTool.report(var0);
	}

	public void test121() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test121");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (byte) 100);
		var10.setValue((java.lang.Object) false);
		var7.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (short) 0);
		java.lang.Object var19 = var16.getValue();
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		var20.setNextNode(var21);
		java.lang.Object var25 = var20.getValue();
		var16.setPreviousNode(var20);
		var10.setPreviousNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		java.lang.Object var39 = var32.getValue();
		java.lang.Object var40 = var32.getValue();
		var16.setPreviousNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		var42.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (byte) 100);
		var45.setValue((java.lang.Object) false);
		var42.setNextNode(var45);
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (short) 0);
		java.lang.Object var54 = var51.getValue();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (short) 0);
		var55.setNextNode(var56);
		java.lang.Object var60 = var55.getValue();
		var51.setPreviousNode(var55);
		var45.setPreviousNode(var51);
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (short) 0);
		java.lang.Object var66 = var63.getValue();
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		var68.setValue((java.lang.Object) (short) 0);
		var67.setNextNode(var68);
		java.lang.Object var72 = var67.getValue();
		var63.setPreviousNode(var67);
		java.lang.Object var74 = var67.getValue();
		java.lang.Object var75 = var67.getValue();
		var51.setPreviousNode(var67);
		var32.setNextNode(var67);
		var0.setPreviousNode(var67);
		roops.core.testingCoverage.base.LinkedListNode var79 = new roops.core.testingCoverage.base.LinkedListNode();
		var79.setValue((java.lang.Object) (short) 0);
		java.lang.Object var82 = var79.getValue();
		roops.core.testingCoverage.base.LinkedListNode var83 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var84 = new roops.core.testingCoverage.base.LinkedListNode();
		var84.setValue((java.lang.Object) (short) 0);
		var83.setNextNode(var84);
		roops.core.testingCoverage.base.LinkedListNode var88 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var89 = new roops.core.testingCoverage.base.LinkedListNode();
		var89.setValue((java.lang.Object) (short) 0);
		var88.setNextNode(var89);
		roops.core.testingCoverage.base.LinkedListNode var93 = var88
				.getNextNode();
		var88.setValue((java.lang.Object) 'a');
		var84.setPreviousNode(var88);
		var79.setNextNode(var84);
		var67.setNextNode(var79);
		roops.core.testingCoverage.base.LinkedListNode var99 = var67
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var19 + "' != '" + (short) 0 + "'",
				var19.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var40);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var54 + "' != '" + (short) 0 + "'",
				var54.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var66 + "' != '" + (short) 0 + "'",
				var66.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var72);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var74);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var75);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var82 + "' != '" + (short) 0 + "'",
				var82.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var93);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var99);

		TestCoverageTool.report(var0);
	}

	public void test122() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test122");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var9 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test123() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test123");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = var4
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		TestCoverageTool.report(var0);
	}

	public void test124() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test124");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var29 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var30 = var29.repOK();
		boolean var31 = var29.repOK();
		boolean var32 = var29.repOK();
		var21.setValue((java.lang.Object) var32);
		java.lang.Object var34 = var21.getValue();
		java.lang.Object var35 = var21.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var30 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var31 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var32 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var34 + "' != '" + true + "'", var34.equals(true));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var35 + "' != '" + true + "'", var35.equals(true));

		TestCoverageTool.report(var0);
	}

	public void test125() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test125");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.report(var0);
	}

	public void test126() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test126");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var49 = var5
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var49);

		TestCoverageTool.report(var0);
	}

	public void test127() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test127");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.report(var0);
	}

	public void test128() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test128");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		var22.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var51 = var22
				.getPreviousNode();
		java.lang.Object var52 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		var53.setValue((java.lang.Object) (short) 0);
		java.lang.Object var56 = var53.getValue();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (short) 0);
		var57.setNextNode(var58);
		java.lang.Object var62 = var57.getValue();
		var53.setPreviousNode(var57);
		java.lang.Object var64 = var57.getValue();
		roops.core.testingCoverage.base.LinkedListNode var65 = new roops.core.testingCoverage.base.LinkedListNode();
		var65.setValue((java.lang.Object) (byte) 100);
		var65.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		var65.setPreviousNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var76 = var70
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = var70
				.getPreviousNode();
		var57.setNextNode(var70);
		var22.setNextNode(var57);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + 10 + "'", var52.equals(10));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var56 + "' != '" + (short) 0 + "'",
				var56.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		TestCoverageTool.report(var0);
	}

	public void test129() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test129");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test130() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test130");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		var12.setNextNode(var13);
		var0.setValue((java.lang.Object) var12);
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var18.setNextNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		var21.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		var39.setValue((java.lang.Object) false);
		var39.setValue((java.lang.Object) 0L);
		var21.setPreviousNode(var39);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var47 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var48 = var47.repOK();
		boolean var49 = var47.repOK();
		boolean var50 = var47.repOK();
		var39.setValue((java.lang.Object) var50);
		java.lang.Object var52 = var39.getValue();
		var0.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (short) 0);
		java.lang.Object var57 = var54.getValue();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (short) 0);
		var58.setNextNode(var59);
		java.lang.Object var63 = var58.getValue();
		var54.setPreviousNode(var58);
		java.lang.Object var65 = var58.getValue();
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (byte) 100);
		var66.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		var71.setValue((java.lang.Object) (byte) 100);
		var71.setValue((java.lang.Object) false);
		var66.setPreviousNode(var71);
		roops.core.testingCoverage.base.LinkedListNode var77 = var71
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var78 = var71
				.getPreviousNode();
		var58.setNextNode(var71);
		java.lang.Object var80 = var58.getValue();
		var0.setNextNode(var58);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var48 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var49 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var50 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + true + "'", var52.equals(true));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var57 + "' != '" + (short) 0 + "'",
				var57.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var78);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var80);

		TestCoverageTool.report(var0);
	}

	public void test131() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test131");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (byte) 100);
		var6.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (byte) 100);
		var11.setValue((java.lang.Object) false);
		var6.setPreviousNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var17 = var11
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = var11
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (byte) 100);
		var22.setValue((java.lang.Object) false);
		var19.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		var22.setPreviousNode(var28);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		java.lang.Object var43 = var40.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		var44.setNextNode(var45);
		java.lang.Object var49 = var44.getValue();
		var40.setPreviousNode(var44);
		java.lang.Object var51 = var44.getValue();
		java.lang.Object var52 = var44.getValue();
		var28.setPreviousNode(var44);
		var11.setNextNode(var28);
		var0.setNextNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var56 = var11
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var43 + "' != '" + (short) 0 + "'",
				var43.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var56);

		TestCoverageTool.report(var0);
	}

	public void test132() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test132");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		var14.setValue((java.lang.Object) false);
		var11.setNextNode(var14);
		java.lang.Object var20 = var11.getValue();
		var5.setNextNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var22 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var23 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var5
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var20 + "' != '" + (byte) 100 + "'",
				var20.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var24);

		TestCoverageTool.report(var0);
	}

	public void test133() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test133");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = new roops.core.testingCoverage.base.LinkedListNode();
		var1.setValue((java.lang.Object) (short) 0);
		var0.setNextNode(var1);
		roops.core.testingCoverage.base.LinkedListNode var5 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var6 = new roops.core.testingCoverage.base.LinkedListNode();
		var6.setValue((java.lang.Object) (byte) 100);
		var6.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (byte) 100);
		var11.setValue((java.lang.Object) false);
		var6.setPreviousNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var17 = var11
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = var11
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (byte) 100);
		var22.setValue((java.lang.Object) false);
		var19.setNextNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		var22.setPreviousNode(var28);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		java.lang.Object var43 = var40.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		var44.setNextNode(var45);
		java.lang.Object var49 = var44.getValue();
		var40.setPreviousNode(var44);
		java.lang.Object var51 = var44.getValue();
		java.lang.Object var52 = var44.getValue();
		var28.setPreviousNode(var44);
		var11.setNextNode(var28);
		var0.setNextNode(var11);
		var11.setValue((java.lang.Object) 100L);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var5);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var43 + "' != '" + (short) 0 + "'",
				var43.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		TestCoverageTool.report(var0);
	}

	public void test134() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test134");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getNextNode();
		java.lang.Object var4 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var8 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		var9.setValue((java.lang.Object) 0L);
		var5.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (short) 0);
		java.lang.Object var20 = var17.getValue();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		var21.setNextNode(var22);
		java.lang.Object var26 = var21.getValue();
		var17.setPreviousNode(var21);
		java.lang.Object var28 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var29 = var21
				.getPreviousNode();
		java.lang.Object var30 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = var21
				.getNextNode();
		var5.setNextNode(var31);
		var0.setValue((java.lang.Object) var31);
		java.lang.Object var34 = var0.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var4 + "' != '" + (byte) 100 + "'",
				var4.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var8);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var20 + "' != '" + (short) 0 + "'",
				var20.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var28);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var34);

		TestCoverageTool.report(var0);
	}

	public void test135() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test135");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		boolean var15 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var15 == true);

		TestCoverageTool.report(var0);
	}

	public void test136() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test136");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		var22.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var54 = var51
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var58 = var55
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (byte) 100);
		var59.setValue((java.lang.Object) false);
		var59.setValue((java.lang.Object) 0L);
		var55.setPreviousNode(var59);
		var51.setPreviousNode(var55);
		java.lang.Object var68 = var55.getValue();
		java.lang.Object var69 = var55.getValue();
		var22.setPreviousNode(var55);
		roops.core.testingCoverage.base.LinkedListNode var71 = var55
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var68 + "' != '" + (short) 0 + "'",
				var68.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var69 + "' != '" + (short) 0 + "'",
				var69.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		TestCoverageTool.report(var0);
	}

	public void test137() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test137");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var8 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		TestCoverageTool.report(var0);
	}

	public void test138() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test138");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		java.lang.Object var49 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var50 = var38
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		roops.core.testingCoverage.base.LinkedListNode var56 = var51
				.getNextNode();
		var50.setNextNode(var51);
		java.lang.Object var58 = var50.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var56);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var58 + "' != '" + (short) 0 + "'",
				var58.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test139() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test139");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var24 = var21
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		var25.setValue((java.lang.Object) (byte) 100);
		var25.setValue((java.lang.Object) false);
		var25.setValue((java.lang.Object) 0L);
		var21.setPreviousNode(var25);
		roops.core.testingCoverage.base.LinkedListNode var33 = var25
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (byte) 100);
		var37.setValue((java.lang.Object) false);
		var34.setNextNode(var37);
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (short) 0);
		java.lang.Object var46 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		var48.setValue((java.lang.Object) (short) 0);
		var47.setNextNode(var48);
		java.lang.Object var52 = var47.getValue();
		var43.setPreviousNode(var47);
		var37.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (short) 0);
		java.lang.Object var58 = var55.getValue();
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var60 = new roops.core.testingCoverage.base.LinkedListNode();
		var60.setValue((java.lang.Object) (short) 0);
		var59.setNextNode(var60);
		java.lang.Object var64 = var59.getValue();
		var55.setPreviousNode(var59);
		java.lang.Object var66 = var59.getValue();
		java.lang.Object var67 = var59.getValue();
		var43.setPreviousNode(var59);
		var25.setNextNode(var59);
		java.lang.Object var70 = var59.getValue();
		var3.setNextNode(var59);
		roops.core.testingCoverage.base.LinkedListNode var72 = var3
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var46 + "' != '" + (short) 0 + "'",
				var46.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var58 + "' != '" + (short) 0 + "'",
				var58.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var66);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var72);

		TestCoverageTool.report(var0);
	}

	public void test140() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test140");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var2 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var6 = var3
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (byte) 100);
		var7.setValue((java.lang.Object) false);
		var7.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var7);
		roops.core.testingCoverage.base.LinkedListNode var15 = var7
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		var19.setValue((java.lang.Object) false);
		var16.setNextNode(var19);
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		var25.setValue((java.lang.Object) (short) 0);
		java.lang.Object var28 = var25.getValue();
		roops.core.testingCoverage.base.LinkedListNode var29 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		var30.setValue((java.lang.Object) (short) 0);
		var29.setNextNode(var30);
		java.lang.Object var34 = var29.getValue();
		var25.setPreviousNode(var29);
		var19.setPreviousNode(var25);
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (short) 0);
		java.lang.Object var40 = var37.getValue();
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		var42.setValue((java.lang.Object) (short) 0);
		var41.setNextNode(var42);
		java.lang.Object var46 = var41.getValue();
		var37.setPreviousNode(var41);
		java.lang.Object var48 = var41.getValue();
		java.lang.Object var49 = var41.getValue();
		var25.setPreviousNode(var41);
		var7.setNextNode(var41);
		java.lang.Object var52 = var41.getValue();
		roops.core.testingCoverage.base.LinkedListNode var53 = var41
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (short) 0);
		var54.setNextNode(var55);
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (short) 0);
		java.lang.Object var62 = var59.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var64 = new roops.core.testingCoverage.base.LinkedListNode();
		var64.setValue((java.lang.Object) (short) 0);
		var63.setNextNode(var64);
		java.lang.Object var68 = var63.getValue();
		var59.setPreviousNode(var63);
		java.lang.Object var70 = var63.getValue();
		java.lang.Object var71 = var63.getValue();
		var55.setPreviousNode(var63);
		java.lang.Object var73 = var55.getValue();
		var41.setPreviousNode(var55);
		var0.setPreviousNode(var41);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var6);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var15);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var28 + "' != '" + (short) 0 + "'",
				var28.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var34);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var40 + "' != '" + (short) 0 + "'",
				var40.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var52);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var62 + "' != '" + (short) 0 + "'",
				var62.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var73 + "' != '" + (short) 0 + "'",
				var73.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test141() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test141");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		boolean var15 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var17 = var0.removeIndex(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var15 == true);

		TestCoverageTool.report(var0);
	}

	public void test142() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test142");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var0.setPreviousNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var7 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var11 = var8
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		var12.setValue((java.lang.Object) 0L);
		var8.setPreviousNode(var12);
		roops.core.testingCoverage.base.LinkedListNode var20 = var8
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		java.lang.Object var24 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		var25.setNextNode(var26);
		java.lang.Object var30 = var25.getValue();
		var21.setPreviousNode(var25);
		java.lang.Object var32 = var25.getValue();
		java.lang.Object var33 = var25.getValue();
		var20.setNextNode(var25);
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (byte) 100);
		var35.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (byte) 100);
		var40.setValue((java.lang.Object) false);
		var35.setPreviousNode(var40);
		var20.setValue((java.lang.Object) var35);
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (short) 0);
		java.lang.Object var50 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (short) 0);
		var56.setNextNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var61 = var56
				.getNextNode();
		var56.setValue((java.lang.Object) 'a');
		var52.setPreviousNode(var56);
		var47.setNextNode(var52);
		java.lang.Object var66 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var67 = var47
				.getPreviousNode();
		java.lang.Object var68 = var47.getValue();
		var20.setNextNode(var47);
		roops.core.testingCoverage.base.LinkedListNode var70 = var47
				.getNextNode();
		var7.setNextNode(var70);
		java.lang.Object var72 = var7.getValue();
		java.lang.Object var73 = var7.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var20);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var24 + "' != '" + (short) 0 + "'",
				var24.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var50 + "' != '" + (short) 0 + "'",
				var50.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var66 + "' != '" + (short) 0 + "'",
				var66.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var68 + "' != '" + (short) 0 + "'",
				var68.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var72 + "' != '" + (byte) 100 + "'",
				var72.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var73 + "' != '" + (byte) 100 + "'",
				var73.equals((byte) 100));

		TestCoverageTool.report(var0);
	}

	public void test143() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test143");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		var0.setValue((java.lang.Object) 0L);
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (short) 0);
		java.lang.Object var10 = var7.getValue();
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (short) 0);
		var11.setNextNode(var12);
		java.lang.Object var16 = var11.getValue();
		var7.setPreviousNode(var11);
		java.lang.Object var18 = var11.getValue();
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		var19.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		var24.setValue((java.lang.Object) (byte) 100);
		var24.setValue((java.lang.Object) false);
		var19.setPreviousNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var30 = var24
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = var24
				.getPreviousNode();
		var11.setNextNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var33 = var11
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var37 = var34
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		var38.setValue((java.lang.Object) 0L);
		var34.setPreviousNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var46 = var38
				.getNextNode();
		var11.setNextNode(var38);
		var0.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = new roops.core.testingCoverage.base.LinkedListNode();
		var50.setValue((java.lang.Object) (short) 0);
		var49.setNextNode(var50);
		roops.core.testingCoverage.base.LinkedListNode var54 = var49
				.getNextNode();
		var49.setValue((java.lang.Object) 'a');
		var38.setPreviousNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var58.setNextNode(var61);
		var49.setValue((java.lang.Object) var58);
		java.lang.Object var68 = var58.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var10 + "' != '" + (short) 0 + "'",
				var10.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var16);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var68 + "' != '" + (byte) 100 + "'",
				var68.equals((byte) 100));

		TestCoverageTool.report(var0);
	}

	public void test144() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test144");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var12 = var0.removeIndex((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.report(var0);
	}

	public void test145() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test145");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		java.lang.Object var24 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		var25.setNextNode(var26);
		java.lang.Object var30 = var25.getValue();
		var21.setPreviousNode(var25);
		java.lang.Object var32 = var25.getValue();
		java.lang.Object var33 = var25.getValue();
		var9.setPreviousNode(var25);
		java.lang.Object var35 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var36 = var9
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var24 + "' != '" + (short) 0 + "'",
				var24.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var35 + "' != '" + (short) 0 + "'",
				var35.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var36);

		TestCoverageTool.report(var0);
	}

	public void test146() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test146");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		TestCoverageTool.report(var0);
	}

	public void test147() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test147");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var14 = var0.removeIndex(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.report(var0);
	}

	public void test148() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test148");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.report(var0);
	}

	public void test149() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test149");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var14 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.report(var0);
	}

	public void test150() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test150");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (byte) 100);
		var7.setValue((java.lang.Object) false);
		var4.setNextNode(var7);
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		var7.setPreviousNode(var13);
		roops.core.testingCoverage.base.LinkedListNode var25 = var7
				.getPreviousNode();
		var0.setNextNode(var7);
		roops.core.testingCoverage.base.LinkedListNode var27 = var7
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		TestCoverageTool.report(var0);
	}

	public void test151() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test151");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		java.lang.Object var29 = var26.getValue();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (short) 0);
		var30.setNextNode(var31);
		java.lang.Object var35 = var30.getValue();
		var26.setPreviousNode(var30);
		java.lang.Object var37 = var30.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (byte) 100);
		var43.setValue((java.lang.Object) false);
		var38.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var49 = var43
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = var43
				.getPreviousNode();
		var30.setNextNode(var43);
		var4.setNextNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var53 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (short) 0);
		var54.setNextNode(var55);
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (short) 0);
		java.lang.Object var62 = var59.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var64 = new roops.core.testingCoverage.base.LinkedListNode();
		var64.setValue((java.lang.Object) (short) 0);
		var63.setNextNode(var64);
		java.lang.Object var68 = var63.getValue();
		var59.setPreviousNode(var63);
		java.lang.Object var70 = var63.getValue();
		java.lang.Object var71 = var63.getValue();
		var55.setPreviousNode(var63);
		var53.setNextNode(var55);
		roops.core.testingCoverage.base.LinkedListNode var74 = new roops.core.testingCoverage.base.LinkedListNode();
		var74.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var77 = var74
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var78 = new roops.core.testingCoverage.base.LinkedListNode();
		var78.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var81 = var78
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var82 = new roops.core.testingCoverage.base.LinkedListNode();
		var82.setValue((java.lang.Object) (byte) 100);
		var82.setValue((java.lang.Object) false);
		var82.setValue((java.lang.Object) 0L);
		var78.setPreviousNode(var82);
		var74.setPreviousNode(var78);
		java.lang.Object var91 = var78.getValue();
		java.lang.Object var92 = var78.getValue();
		var55.setValue((java.lang.Object) var78);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var29 + "' != '" + (short) 0 + "'",
				var29.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var62 + "' != '" + (short) 0 + "'",
				var62.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var81);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var91 + "' != '" + (short) 0 + "'",
				var91.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var92 + "' != '" + (short) 0 + "'",
				var92.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test152() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test152");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		java.lang.Object var13 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var14.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var21 = var14
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var25 = var22
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (byte) 100);
		var26.setValue((java.lang.Object) false);
		var26.setValue((java.lang.Object) 0L);
		var22.setPreviousNode(var26);
		roops.core.testingCoverage.base.LinkedListNode var34 = var22
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (short) 0);
		java.lang.Object var38 = var35.getValue();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		var39.setNextNode(var40);
		java.lang.Object var44 = var39.getValue();
		var35.setPreviousNode(var39);
		java.lang.Object var46 = var39.getValue();
		java.lang.Object var47 = var39.getValue();
		var34.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (byte) 100);
		var49.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (byte) 100);
		var54.setValue((java.lang.Object) false);
		var49.setPreviousNode(var54);
		var34.setValue((java.lang.Object) var49);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var64 = new roops.core.testingCoverage.base.LinkedListNode();
		var64.setValue((java.lang.Object) (byte) 100);
		var61.setPreviousNode(var64);
		var34.setPreviousNode(var64);
		var21.setNextNode(var34);
		var4.setNextNode(var21);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var34);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var38 + "' != '" + (short) 0 + "'",
				var38.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		TestCoverageTool.report(var0);
	}

	public void test153() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test153");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = var3
				.getPreviousNode();
		java.lang.Object var22 = var3.getValue();
		java.lang.Object var23 = var3.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var22 + "' != '" + false + "'", var22.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var23 + "' != '" + false + "'", var23.equals(false));

		TestCoverageTool.report(var0);
	}

	public void test154() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test154");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = var0
				.getPreviousNode();
		java.lang.Object var5 = var0.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var5 + "' != '" + (short) 0 + "'",
				var5.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test155() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test155");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		java.lang.Object var26 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var27 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (byte) 100);
		var31.setValue((java.lang.Object) false);
		var28.setNextNode(var31);
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (short) 0);
		java.lang.Object var40 = var37.getValue();
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		var42.setValue((java.lang.Object) (short) 0);
		var41.setNextNode(var42);
		java.lang.Object var46 = var41.getValue();
		var37.setPreviousNode(var41);
		var31.setPreviousNode(var37);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		java.lang.Object var52 = var49.getValue();
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (short) 0);
		var53.setNextNode(var54);
		java.lang.Object var58 = var53.getValue();
		var49.setPreviousNode(var53);
		java.lang.Object var60 = var53.getValue();
		java.lang.Object var61 = var53.getValue();
		var37.setPreviousNode(var53);
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (byte) 100);
		var66.setValue((java.lang.Object) false);
		var63.setNextNode(var66);
		roops.core.testingCoverage.base.LinkedListNode var72 = new roops.core.testingCoverage.base.LinkedListNode();
		var72.setValue((java.lang.Object) (short) 0);
		java.lang.Object var75 = var72.getValue();
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = new roops.core.testingCoverage.base.LinkedListNode();
		var77.setValue((java.lang.Object) (short) 0);
		var76.setNextNode(var77);
		java.lang.Object var81 = var76.getValue();
		var72.setPreviousNode(var76);
		var66.setPreviousNode(var72);
		roops.core.testingCoverage.base.LinkedListNode var84 = new roops.core.testingCoverage.base.LinkedListNode();
		var84.setValue((java.lang.Object) (short) 0);
		java.lang.Object var87 = var84.getValue();
		roops.core.testingCoverage.base.LinkedListNode var88 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var89 = new roops.core.testingCoverage.base.LinkedListNode();
		var89.setValue((java.lang.Object) (short) 0);
		var88.setNextNode(var89);
		java.lang.Object var93 = var88.getValue();
		var84.setPreviousNode(var88);
		java.lang.Object var95 = var88.getValue();
		java.lang.Object var96 = var88.getValue();
		var72.setPreviousNode(var88);
		var53.setNextNode(var88);
		var4.setNextNode(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var40 + "' != '" + (short) 0 + "'",
				var40.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + (short) 0 + "'",
				var52.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var75 + "' != '" + (short) 0 + "'",
				var75.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var81);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var87 + "' != '" + (short) 0 + "'",
				var87.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var93);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var95);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var96);

		TestCoverageTool.report(var0);
	}

	public void test156() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test156");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getPreviousNode();
		java.lang.Object var13 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var17 = var14
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		var18.setValue((java.lang.Object) false);
		var18.setValue((java.lang.Object) 0L);
		var14.setPreviousNode(var18);
		roops.core.testingCoverage.base.LinkedListNode var26 = var14
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		java.lang.Object var30 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		var31.setNextNode(var32);
		java.lang.Object var36 = var31.getValue();
		var27.setPreviousNode(var31);
		java.lang.Object var38 = var31.getValue();
		java.lang.Object var39 = var31.getValue();
		var26.setNextNode(var31);
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		var41.setValue((java.lang.Object) (byte) 100);
		var41.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var46 = new roops.core.testingCoverage.base.LinkedListNode();
		var46.setValue((java.lang.Object) (byte) 100);
		var46.setValue((java.lang.Object) false);
		var41.setPreviousNode(var46);
		var26.setValue((java.lang.Object) var41);
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		var53.setValue((java.lang.Object) (short) 0);
		java.lang.Object var56 = var53.getValue();
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (short) 0);
		var57.setNextNode(var58);
		java.lang.Object var62 = var57.getValue();
		var53.setPreviousNode(var57);
		java.lang.Object var64 = var57.getValue();
		roops.core.testingCoverage.base.LinkedListNode var65 = new roops.core.testingCoverage.base.LinkedListNode();
		var65.setValue((java.lang.Object) (byte) 100);
		var65.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		var65.setPreviousNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var76 = var70
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var77 = var70
				.getPreviousNode();
		var57.setNextNode(var70);
		roops.core.testingCoverage.base.LinkedListNode var79 = var57
				.getNextNode();
		var26.setPreviousNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var81 = var26
				.getNextNode();
		var4.setNextNode(var81);
		roops.core.testingCoverage.base.LinkedListNode var83 = var81
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var84 = var81
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var85 = var81
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var86 = new roops.core.testingCoverage.base.LinkedListNode();
		var86.setValue((java.lang.Object) (short) 0);
		java.lang.Object var89 = var86.getValue();
		roops.core.testingCoverage.base.LinkedListNode var90 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var91 = new roops.core.testingCoverage.base.LinkedListNode();
		var91.setValue((java.lang.Object) (short) 0);
		var90.setNextNode(var91);
		java.lang.Object var95 = var90.getValue();
		var86.setPreviousNode(var90);
		var81.setPreviousNode(var90);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var17);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var30 + "' != '" + (short) 0 + "'",
				var30.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var36);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var38);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var56 + "' != '" + (short) 0 + "'",
				var56.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var76);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var77);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var79);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var81);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var83);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var84);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var85);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var89 + "' != '" + (short) 0 + "'",
				var89.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var95);

		TestCoverageTool.report(var0);
	}

	public void test157() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test157");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		var14.setValue((java.lang.Object) false);
		var11.setNextNode(var14);
		java.lang.Object var20 = var11.getValue();
		var5.setNextNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var22 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (short) 0);
		java.lang.Object var26 = var23.getValue();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		var27.setNextNode(var28);
		java.lang.Object var32 = var27.getValue();
		var23.setPreviousNode(var27);
		java.lang.Object var34 = var27.getValue();
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (byte) 100);
		var35.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (byte) 100);
		var40.setValue((java.lang.Object) false);
		var35.setPreviousNode(var40);
		roops.core.testingCoverage.base.LinkedListNode var46 = var40
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var47 = var40
				.getPreviousNode();
		var27.setNextNode(var40);
		roops.core.testingCoverage.base.LinkedListNode var49 = var27
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = var27
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (short) 0);
		java.lang.Object var54 = var51.getValue();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (short) 0);
		var55.setNextNode(var56);
		java.lang.Object var60 = var55.getValue();
		var51.setPreviousNode(var55);
		java.lang.Object var62 = var55.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = var55
				.getPreviousNode();
		java.lang.Object var64 = var55.getValue();
		var27.setPreviousNode(var55);
		var5.setPreviousNode(var55);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var20 + "' != '" + (byte) 100 + "'",
				var20.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var26 + "' != '" + (short) 0 + "'",
				var26.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var34);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var54 + "' != '" + (short) 0 + "'",
				var54.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var64);

		TestCoverageTool.report(var0);
	}

	public void test158() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test158");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		java.lang.Object var27 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var28 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var29 = var4
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var28);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		TestCoverageTool.report(var0);
	}

	public void test159() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test159");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var65 = var43
				.getNextNode();
		var12.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var67 = var12
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var12
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var69 = var68
				.getNextNode();
		java.lang.Object var70 = var69.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var69);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var70 + "' != '" + false + "'", var70.equals(false));

		TestCoverageTool.report(var0);
	}

	public void test160() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test160");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		boolean var15 = var0.repOK();
		boolean var16 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var15 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == true);

		TestCoverageTool.report(var0);
	}

	public void test161() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test161");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		TestCoverageTool.report(var0);
	}

	public void test162() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test162");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		var48.setNextNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var53 = var48
				.getNextNode();
		var48.setValue((java.lang.Object) 'a');
		var44.setPreviousNode(var48);
		var39.setNextNode(var44);
		java.lang.Object var58 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var59 = var39
				.getPreviousNode();
		java.lang.Object var60 = var39.getValue();
		var12.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var62 = var39
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var39
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var58 + "' != '" + (short) 0 + "'",
				var58.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var59);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var60 + "' != '" + (short) 0 + "'",
				var60.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var63);

		TestCoverageTool.report(var0);
	}

	public void test163() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test163");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		var22.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var54 = var51
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var58 = var55
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (byte) 100);
		var59.setValue((java.lang.Object) false);
		var59.setValue((java.lang.Object) 0L);
		var55.setPreviousNode(var59);
		var51.setPreviousNode(var55);
		java.lang.Object var68 = var55.getValue();
		java.lang.Object var69 = var55.getValue();
		var22.setPreviousNode(var55);
		java.lang.Object var71 = var55.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var68 + "' != '" + (short) 0 + "'",
				var68.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var69 + "' != '" + (short) 0 + "'",
				var69.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var71 + "' != '" + (short) 0 + "'",
				var71.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test164() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test164");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = var5
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = var5
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var5.setNextNode(var22);
		var22.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var51 = var22
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (byte) 100);
		var52.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (byte) 100);
		var57.setValue((java.lang.Object) false);
		var52.setPreviousNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		var63.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (byte) 100);
		var66.setValue((java.lang.Object) false);
		var63.setNextNode(var66);
		java.lang.Object var72 = var63.getValue();
		var57.setNextNode(var63);
		var22.setPreviousNode(var57);
		roops.core.testingCoverage.base.LinkedListNode var75 = var57
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var72 + "' != '" + (byte) 100 + "'",
				var72.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var75);

		TestCoverageTool.report(var0);
	}

	public void test165() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test165");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		java.lang.Object var39 = var12.getValue();
		java.lang.Object var40 = var12.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var40);

		TestCoverageTool.report(var0);
	}

	public void test166() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test166");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		java.lang.Object var39 = var32.getValue();
		roops.core.testingCoverage.base.LinkedListNode var40 = var32
				.getPreviousNode();
		java.lang.Object var41 = var32.getValue();
		var4.setPreviousNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var43 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = var4
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var40);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var41);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var44);

		TestCoverageTool.report(var0);
	}

	public void test167() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test167");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		var4.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var15 = var9
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var16 = var9
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (byte) 100);
		var20.setValue((java.lang.Object) false);
		var17.setNextNode(var20);
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		java.lang.Object var29 = var26.getValue();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (short) 0);
		var30.setNextNode(var31);
		java.lang.Object var35 = var30.getValue();
		var26.setPreviousNode(var30);
		var20.setPreviousNode(var26);
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (short) 0);
		java.lang.Object var41 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (short) 0);
		var42.setNextNode(var43);
		java.lang.Object var47 = var42.getValue();
		var38.setPreviousNode(var42);
		java.lang.Object var49 = var42.getValue();
		java.lang.Object var50 = var42.getValue();
		var26.setPreviousNode(var42);
		var9.setNextNode(var26);
		var26.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var55 = var26
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var56.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = new roops.core.testingCoverage.base.LinkedListNode();
		var67.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (byte) 100);
		var70.setValue((java.lang.Object) false);
		var67.setNextNode(var70);
		java.lang.Object var76 = var67.getValue();
		var61.setNextNode(var67);
		var26.setPreviousNode(var61);
		var0.setNextNode(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var15);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var16);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var29 + "' != '" + (short) 0 + "'",
				var29.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var41 + "' != '" + (short) 0 + "'",
				var41.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var55);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var76 + "' != '" + (byte) 100 + "'",
				var76.equals((byte) 100));

		TestCoverageTool.report(var0);
	}

	public void test168() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test168");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var65 = var43
				.getNextNode();
		var12.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var67 = var12
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var12
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var69 = var68
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var70 = var69
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var69);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		TestCoverageTool.report(var0);
	}

	public void test169() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test169");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var9 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		TestCoverageTool.report(var0);
	}

	public void test170() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test170");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (short) 0);
		var9.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var14 = var9
				.getNextNode();
		var9.setValue((java.lang.Object) 'a');
		var5.setPreviousNode(var9);
		var0.setNextNode(var5);
		java.lang.Object var19 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var20 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var22 = var0
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var19 + "' != '" + (short) 0 + "'",
				var19.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var20);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var22);

		TestCoverageTool.report(var0);
	}

	public void test171() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test171");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = var4
				.getNextNode();
		java.lang.Object var28 = var4.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var28);

		TestCoverageTool.report(var0);
	}

	public void test172() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test172");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = var3
				.getPreviousNode();
		java.lang.Object var10 = var3.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var10 + "' != '" + false + "'", var10.equals(false));

		TestCoverageTool.report(var0);
	}

	public void test173() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test173");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getPreviousNode();
		java.lang.Object var27 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var28 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var29 = var4
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var28);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		TestCoverageTool.report(var0);
	}

	public void test174() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test174");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		boolean var15 = var0.repOK();
		boolean var16 = var0.repOK();
		boolean var17 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var19 = var0.removeIndex(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var15 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var17 == true);

		TestCoverageTool.report(var0);
	}

	public void test175() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test175");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		var0.setValue((java.lang.Object) 0L);
		roops.core.testingCoverage.base.LinkedListNode var7 = new roops.core.testingCoverage.base.LinkedListNode();
		var7.setValue((java.lang.Object) (short) 0);
		java.lang.Object var10 = var7.getValue();
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (short) 0);
		var11.setNextNode(var12);
		java.lang.Object var16 = var11.getValue();
		var7.setPreviousNode(var11);
		java.lang.Object var18 = var11.getValue();
		roops.core.testingCoverage.base.LinkedListNode var19 = new roops.core.testingCoverage.base.LinkedListNode();
		var19.setValue((java.lang.Object) (byte) 100);
		var19.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		var24.setValue((java.lang.Object) (byte) 100);
		var24.setValue((java.lang.Object) false);
		var19.setPreviousNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var30 = var24
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = var24
				.getPreviousNode();
		var11.setNextNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var33 = var11
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var37 = var34
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		var38.setValue((java.lang.Object) 0L);
		var34.setPreviousNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var46 = var38
				.getNextNode();
		var11.setNextNode(var38);
		var0.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = new roops.core.testingCoverage.base.LinkedListNode();
		var50.setValue((java.lang.Object) (short) 0);
		var49.setNextNode(var50);
		roops.core.testingCoverage.base.LinkedListNode var54 = var49
				.getNextNode();
		var49.setValue((java.lang.Object) 'a');
		var38.setPreviousNode(var49);
		roops.core.testingCoverage.base.LinkedListNode var58 = new roops.core.testingCoverage.base.LinkedListNode();
		var58.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var58.setNextNode(var61);
		var49.setValue((java.lang.Object) var58);
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		var68.setValue((java.lang.Object) (byte) 100);
		var68.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var73 = new roops.core.testingCoverage.base.LinkedListNode();
		var73.setValue((java.lang.Object) (byte) 100);
		var73.setValue((java.lang.Object) false);
		var68.setPreviousNode(var73);
		roops.core.testingCoverage.base.LinkedListNode var79 = new roops.core.testingCoverage.base.LinkedListNode();
		var79.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var82 = new roops.core.testingCoverage.base.LinkedListNode();
		var82.setValue((java.lang.Object) (byte) 100);
		var82.setValue((java.lang.Object) false);
		var79.setNextNode(var82);
		java.lang.Object var88 = var79.getValue();
		var73.setNextNode(var79);
		roops.core.testingCoverage.base.LinkedListNode var90 = var73
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var91 = var73
				.getPreviousNode();
		var58.setValue((java.lang.Object) var73);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var10 + "' != '" + (short) 0 + "'",
				var10.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var16);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var33);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var88 + "' != '" + (byte) 100 + "'",
				var88.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var90);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var91);

		TestCoverageTool.report(var0);
	}

	public void test176() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test176");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		java.lang.Object var39 = var27.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var39 + "' != '" + false + "'", var39.equals(false));

		TestCoverageTool.report(var0);
	}

	public void test177() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test177");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getPreviousNode();
		java.lang.Object var13 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var14 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var15 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (short) 0);
		var15.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (short) 0);
		java.lang.Object var23 = var20.getValue();
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		var25.setValue((java.lang.Object) (short) 0);
		var24.setNextNode(var25);
		java.lang.Object var29 = var24.getValue();
		var20.setPreviousNode(var24);
		java.lang.Object var31 = var24.getValue();
		java.lang.Object var32 = var24.getValue();
		var16.setPreviousNode(var24);
		var4.setPreviousNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var35 = var4
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var23 + "' != '" + (short) 0 + "'",
				var23.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var35);

		TestCoverageTool.report(var0);
	}

	public void test178() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test178");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			java.lang.Object var15 = var0.removeIndex(0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		TestCoverageTool.report(var0);
	}

	public void test179() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test179");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var28 = new roops.core.testingCoverage.base.LinkedListNode();
		var28.setValue((java.lang.Object) (short) 0);
		java.lang.Object var31 = var28.getValue();
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		var32.setNextNode(var33);
		java.lang.Object var37 = var32.getValue();
		var28.setPreviousNode(var32);
		java.lang.Object var39 = var32.getValue();
		roops.core.testingCoverage.base.LinkedListNode var40 = var32
				.getPreviousNode();
		java.lang.Object var41 = var32.getValue();
		var4.setPreviousNode(var32);
		java.lang.Object var43 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		java.lang.Object var47 = var44.getValue();
		roops.core.testingCoverage.base.LinkedListNode var48 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		var48.setNextNode(var49);
		java.lang.Object var53 = var48.getValue();
		var44.setPreviousNode(var48);
		java.lang.Object var55 = var48.getValue();
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (byte) 100);
		var61.setValue((java.lang.Object) false);
		var56.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var67 = var61
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = var61
				.getPreviousNode();
		var48.setNextNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var70 = var48
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var71 = var70
				.getPreviousNode();
		var4.setNextNode(var70);
		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var73 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var74 = var73.repOK();
		boolean var75 = var73.repOK();
		boolean var76 = var73.repOK();
		boolean var77 = var73.repOK();
		boolean var78 = var73.repOK();
		boolean var79 = var73.repOK();
		boolean var80 = var73.repOK();
		boolean var81 = var73.repOK();
		boolean var82 = var73.repOK();
		var70.setValue((java.lang.Object) var82);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var27);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var31 + "' != '" + (short) 0 + "'",
				var31.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var40);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var41);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var47 + "' != '" + (short) 0 + "'",
				var47.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var55);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var71);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var74 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var75 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var76 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var77 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var78 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var79 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var80 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var81 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var82 == true);

		TestCoverageTool.report(var0);
	}

	public void test180() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test180");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var10 = new roops.core.testingCoverage.base.LinkedListNode();
		var10.setValue((java.lang.Object) (short) 0);
		var9.setNextNode(var10);
		roops.core.testingCoverage.base.LinkedListNode var14 = var9
				.getNextNode();
		var9.setValue((java.lang.Object) 'a');
		var5.setPreviousNode(var9);
		var0.setNextNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var19 = var0
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var20 = var19
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = var19
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var22 = var19
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var23 = new roops.core.testingCoverage.base.LinkedListNode();
		var23.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var26 = var23
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		var27.setValue((java.lang.Object) 0L);
		var23.setPreviousNode(var27);
		roops.core.testingCoverage.base.LinkedListNode var35 = var27
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var36 = new roops.core.testingCoverage.base.LinkedListNode();
		var36.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		var39.setValue((java.lang.Object) false);
		var36.setNextNode(var39);
		roops.core.testingCoverage.base.LinkedListNode var45 = new roops.core.testingCoverage.base.LinkedListNode();
		var45.setValue((java.lang.Object) (short) 0);
		java.lang.Object var48 = var45.getValue();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = new roops.core.testingCoverage.base.LinkedListNode();
		var50.setValue((java.lang.Object) (short) 0);
		var49.setNextNode(var50);
		java.lang.Object var54 = var49.getValue();
		var45.setPreviousNode(var49);
		var39.setPreviousNode(var45);
		roops.core.testingCoverage.base.LinkedListNode var57 = new roops.core.testingCoverage.base.LinkedListNode();
		var57.setValue((java.lang.Object) (short) 0);
		java.lang.Object var60 = var57.getValue();
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var62 = new roops.core.testingCoverage.base.LinkedListNode();
		var62.setValue((java.lang.Object) (short) 0);
		var61.setNextNode(var62);
		java.lang.Object var66 = var61.getValue();
		var57.setPreviousNode(var61);
		java.lang.Object var68 = var61.getValue();
		java.lang.Object var69 = var61.getValue();
		var45.setPreviousNode(var61);
		var27.setNextNode(var61);
		java.lang.Object var72 = var61.getValue();
		roops.core.testingCoverage.base.LinkedListNode var73 = var61
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var74 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		var75.setValue((java.lang.Object) (short) 0);
		var74.setNextNode(var75);
		roops.core.testingCoverage.base.LinkedListNode var79 = var74
				.getNextNode();
		var73.setNextNode(var74);
		roops.core.testingCoverage.base.LinkedListNode var81 = new roops.core.testingCoverage.base.LinkedListNode();
		var81.setValue((java.lang.Object) (short) 0);
		java.lang.Object var84 = var81.getValue();
		java.lang.Object var85 = var81.getValue();
		roops.core.testingCoverage.base.LinkedListNode var86 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var87 = new roops.core.testingCoverage.base.LinkedListNode();
		var87.setValue((java.lang.Object) (short) 0);
		var86.setNextNode(var87);
		java.lang.Object var91 = var86.getValue();
		var81.setPreviousNode(var86);
		var74.setValue((java.lang.Object) var86);
		var22.setNextNode(var86);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var19);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var20);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var21);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var48 + "' != '" + (short) 0 + "'",
				var48.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var60 + "' != '" + (short) 0 + "'",
				var60.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var66);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var69);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var72);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var73);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var79);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var84 + "' != '" + (short) 0 + "'",
				var84.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var85 + "' != '" + (short) 0 + "'",
				var85.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var91);

		TestCoverageTool.report(var0);
	}

	public void test181() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test181");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (short) 0);
		java.lang.Object var7 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		var8.setNextNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		roops.core.testingCoverage.base.LinkedListNode var18 = var13
				.getNextNode();
		var13.setValue((java.lang.Object) 'a');
		var9.setPreviousNode(var13);
		var4.setNextNode(var9);
		var0.setPreviousNode(var4);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var7 + "' != '" + (short) 0 + "'",
				var7.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var18);

		TestCoverageTool.report(var0);
	}

	public void test182() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test182");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		var0.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (byte) 100);
		var5.setValue((java.lang.Object) false);
		var0.setPreviousNode(var5);
		roops.core.testingCoverage.base.LinkedListNode var11 = new roops.core.testingCoverage.base.LinkedListNode();
		var11.setValue((java.lang.Object) (short) 0);
		java.lang.Object var14 = var11.getValue();
		roops.core.testingCoverage.base.LinkedListNode var15 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (short) 0);
		var15.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		var20.setNextNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var25 = var20
				.getNextNode();
		var20.setValue((java.lang.Object) 'a');
		var16.setPreviousNode(var20);
		var11.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var30 = var11
				.getNextNode();
		var0.setPreviousNode(var11);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (short) 0);
		java.lang.Object var35 = var32.getValue();
		roops.core.testingCoverage.base.LinkedListNode var36 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		var37.setValue((java.lang.Object) (short) 0);
		var36.setNextNode(var37);
		roops.core.testingCoverage.base.LinkedListNode var41 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		var42.setValue((java.lang.Object) (short) 0);
		var41.setNextNode(var42);
		roops.core.testingCoverage.base.LinkedListNode var46 = var41
				.getNextNode();
		var41.setValue((java.lang.Object) 'a');
		var37.setPreviousNode(var41);
		var32.setNextNode(var37);
		java.lang.Object var51 = var32.getValue();
		var0.setValue((java.lang.Object) var32);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var14 + "' != '" + (short) 0 + "'",
				var14.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var35 + "' != '" + (short) 0 + "'",
				var35.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var51 + "' != '" + (short) 0 + "'",
				var51.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test183() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test183");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		boolean var4 = var0.repOK();
		boolean var5 = var0.repOK();
		boolean var6 = var0.repOK();
		boolean var7 = var0.repOK();
		boolean var8 = var0.repOK();
		boolean var9 = var0.repOK();
		boolean var10 = var0.repOK();
		boolean var11 = var0.repOK();
		boolean var12 = var0.repOK();
		boolean var13 = var0.repOK();
		boolean var14 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex.removeIndexTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var5 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var7 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var9 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var11 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var13 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == true);

		TestCoverageTool.report(var0);
	}

	public void test184() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test184");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var0.setPreviousNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var7 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		var8.setNextNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var13 = var8
				.getNextNode();
		var8.setValue((java.lang.Object) 'a');
		var7.setValue((java.lang.Object) var8);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (short) 0);
		var7.setValue((java.lang.Object) var17);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (short) 0);
		java.lang.Object var24 = var21.getValue();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		var25.setNextNode(var26);
		java.lang.Object var30 = var25.getValue();
		var21.setPreviousNode(var25);
		java.lang.Object var32 = var25.getValue();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (byte) 100);
		var33.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		var33.setPreviousNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var44 = var38
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var45 = var38
				.getPreviousNode();
		var25.setNextNode(var38);
		roops.core.testingCoverage.base.LinkedListNode var47 = var25
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var48 = var25
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var49 = new roops.core.testingCoverage.base.LinkedListNode();
		var49.setValue((java.lang.Object) (short) 0);
		java.lang.Object var52 = var49.getValue();
		roops.core.testingCoverage.base.LinkedListNode var53 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var54 = new roops.core.testingCoverage.base.LinkedListNode();
		var54.setValue((java.lang.Object) (short) 0);
		var53.setNextNode(var54);
		java.lang.Object var58 = var53.getValue();
		var49.setPreviousNode(var53);
		java.lang.Object var60 = var53.getValue();
		roops.core.testingCoverage.base.LinkedListNode var61 = var53
				.getPreviousNode();
		java.lang.Object var62 = var53.getValue();
		var25.setPreviousNode(var53);
		roops.core.testingCoverage.base.LinkedListNode var64 = var25
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var65 = var25
				.getNextNode();
		var17.setPreviousNode(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var24 + "' != '" + (short) 0 + "'",
				var24.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + (short) 0 + "'",
				var52.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var60);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var61);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var64);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		TestCoverageTool.report(var0);
	}

	public void test185() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test185");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var1 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var2 = var0
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var1);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var2);

		TestCoverageTool.report(var0);
	}

	public void test186() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test186");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (byte) 100);
		var9.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		var14.setValue((java.lang.Object) false);
		var9.setPreviousNode(var14);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var23 = var20
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		var24.setValue((java.lang.Object) (byte) 100);
		var24.setValue((java.lang.Object) false);
		var24.setValue((java.lang.Object) 0L);
		var20.setPreviousNode(var24);
		roops.core.testingCoverage.base.LinkedListNode var32 = var20
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var33 = new roops.core.testingCoverage.base.LinkedListNode();
		var33.setValue((java.lang.Object) (short) 0);
		java.lang.Object var36 = var33.getValue();
		roops.core.testingCoverage.base.LinkedListNode var37 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (short) 0);
		var37.setNextNode(var38);
		java.lang.Object var42 = var37.getValue();
		var33.setPreviousNode(var37);
		java.lang.Object var44 = var37.getValue();
		java.lang.Object var45 = var37.getValue();
		var32.setNextNode(var37);
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (byte) 100);
		var47.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (byte) 100);
		var52.setValue((java.lang.Object) false);
		var47.setPreviousNode(var52);
		var32.setValue((java.lang.Object) var47);
		roops.core.testingCoverage.base.LinkedListNode var59 = new roops.core.testingCoverage.base.LinkedListNode();
		var59.setValue((java.lang.Object) (short) 0);
		java.lang.Object var62 = var59.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var64 = new roops.core.testingCoverage.base.LinkedListNode();
		var64.setValue((java.lang.Object) (short) 0);
		var63.setNextNode(var64);
		java.lang.Object var68 = var63.getValue();
		var59.setPreviousNode(var63);
		java.lang.Object var70 = var63.getValue();
		roops.core.testingCoverage.base.LinkedListNode var71 = new roops.core.testingCoverage.base.LinkedListNode();
		var71.setValue((java.lang.Object) (byte) 100);
		var71.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var76 = new roops.core.testingCoverage.base.LinkedListNode();
		var76.setValue((java.lang.Object) (byte) 100);
		var76.setValue((java.lang.Object) false);
		var71.setPreviousNode(var76);
		roops.core.testingCoverage.base.LinkedListNode var82 = var76
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var83 = var76
				.getPreviousNode();
		var63.setNextNode(var76);
		roops.core.testingCoverage.base.LinkedListNode var85 = var63
				.getNextNode();
		var32.setPreviousNode(var63);
		roops.core.testingCoverage.base.LinkedListNode var87 = var32
				.getNextNode();
		var14.setValue((java.lang.Object) var32);
		var0.setNextNode(var14);
		roops.core.testingCoverage.base.LinkedListNode var90 = var14
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var36 + "' != '" + (short) 0 + "'",
				var36.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var42);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var62 + "' != '" + (short) 0 + "'",
				var62.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var68);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var82);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var83);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var85);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var87);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var90);

		TestCoverageTool.report(var0);
	}

	public void test187() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test187");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		java.lang.Object var29 = var26.getValue();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (short) 0);
		var30.setNextNode(var31);
		java.lang.Object var35 = var30.getValue();
		var26.setPreviousNode(var30);
		java.lang.Object var37 = var30.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (byte) 100);
		var38.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (byte) 100);
		var43.setValue((java.lang.Object) false);
		var38.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var49 = var43
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var50 = var43
				.getPreviousNode();
		var30.setNextNode(var43);
		var4.setNextNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var53 = var4
				.getNextNode();
		java.lang.Object var54 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var55 = var4
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var29 + "' != '" + (short) 0 + "'",
				var29.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var37);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var53);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var55);

		TestCoverageTool.report(var0);
	}

	public void test188() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test188");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var3 = new roops.core.testingCoverage.base.LinkedListNode();
		var3.setValue((java.lang.Object) (byte) 100);
		var3.setValue((java.lang.Object) false);
		var0.setNextNode(var3);
		roops.core.testingCoverage.base.LinkedListNode var9 = new roops.core.testingCoverage.base.LinkedListNode();
		var9.setValue((java.lang.Object) (short) 0);
		java.lang.Object var12 = var9.getValue();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (short) 0);
		var13.setNextNode(var14);
		java.lang.Object var18 = var13.getValue();
		var9.setPreviousNode(var13);
		var3.setPreviousNode(var9);
		roops.core.testingCoverage.base.LinkedListNode var21 = new roops.core.testingCoverage.base.LinkedListNode();
		var21.setValue((java.lang.Object) (byte) 100);
		var21.setValue((java.lang.Object) false);
		var21.setValue((java.lang.Object) 0L);
		var3.setPreviousNode(var21);
		roops.core.testingCoverage.base.LinkedListNode var29 = new roops.core.testingCoverage.base.LinkedListNode();
		var29.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var29.setNextNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		var38.setValue((java.lang.Object) (short) 0);
		java.lang.Object var41 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var42 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		var43.setValue((java.lang.Object) (short) 0);
		var42.setNextNode(var43);
		java.lang.Object var47 = var42.getValue();
		var38.setPreviousNode(var42);
		var32.setPreviousNode(var38);
		var21.setPreviousNode(var32);
		roops.core.testingCoverage.base.LinkedListNode var51 = var32
				.getPreviousNode();
		java.lang.Object var52 = var32.getValue();
		java.lang.Object var53 = var32.getValue();
		roops.core.testingCoverage.base.LinkedListNode var54 = var32
				.getPreviousNode();
		java.lang.Object var55 = var54.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var12 + "' != '" + (short) 0 + "'",
				var12.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var18);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var41 + "' != '" + (short) 0 + "'",
				var41.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var47);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var52 + "' != '" + false + "'", var52.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var53 + "' != '" + false + "'", var53.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var54);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var55 + "' != '" + (short) 0 + "'",
				var55.equals((short) 0));

		TestCoverageTool.report(var0);
	}

	public void test189() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test189");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getPreviousNode();
		java.lang.Object var13 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var14 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var15 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (short) 0);
		var15.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (short) 0);
		java.lang.Object var23 = var20.getValue();
		roops.core.testingCoverage.base.LinkedListNode var24 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var25 = new roops.core.testingCoverage.base.LinkedListNode();
		var25.setValue((java.lang.Object) (short) 0);
		var24.setNextNode(var25);
		java.lang.Object var29 = var24.getValue();
		var20.setPreviousNode(var24);
		java.lang.Object var31 = var24.getValue();
		java.lang.Object var32 = var24.getValue();
		var16.setPreviousNode(var24);
		var4.setPreviousNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var35 = var16
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var14);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var23 + "' != '" + (short) 0 + "'",
				var23.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var29);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var32);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		TestCoverageTool.report(var0);
	}

	public void test190() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test190");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var16 = new roops.core.testingCoverage.base.LinkedListNode();
		var16.setValue((java.lang.Object) (byte) 100);
		var16.setValue((java.lang.Object) false);
		var13.setNextNode(var16);
		roops.core.testingCoverage.base.LinkedListNode var22 = new roops.core.testingCoverage.base.LinkedListNode();
		var22.setValue((java.lang.Object) (short) 0);
		java.lang.Object var25 = var22.getValue();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		var26.setNextNode(var27);
		java.lang.Object var31 = var26.getValue();
		var22.setPreviousNode(var26);
		var16.setPreviousNode(var22);
		roops.core.testingCoverage.base.LinkedListNode var34 = new roops.core.testingCoverage.base.LinkedListNode();
		var34.setValue((java.lang.Object) (short) 0);
		java.lang.Object var37 = var34.getValue();
		roops.core.testingCoverage.base.LinkedListNode var38 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		var38.setNextNode(var39);
		java.lang.Object var43 = var38.getValue();
		var34.setPreviousNode(var38);
		java.lang.Object var45 = var38.getValue();
		java.lang.Object var46 = var38.getValue();
		var22.setPreviousNode(var38);
		var4.setNextNode(var38);
		java.lang.Object var49 = var38.getValue();
		roops.core.testingCoverage.base.LinkedListNode var50 = var38
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		roops.core.testingCoverage.base.LinkedListNode var56 = var51
				.getNextNode();
		var50.setNextNode(var51);
		var50.setValue((java.lang.Object) (short) (-1));
		java.lang.Object var60 = var50.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var25 + "' != '" + (short) 0 + "'",
				var25.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var31);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var37 + "' != '" + (short) 0 + "'",
				var37.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var43);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var45);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var46);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var49);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var56);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var60 + "' != '" + (short) (-1) + "'",
				var60.equals((short) (-1)));

		TestCoverageTool.report(var0);
	}

	public void test191() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test191");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var7 = var4
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var8 = new roops.core.testingCoverage.base.LinkedListNode();
		var8.setValue((java.lang.Object) (byte) 100);
		var8.setValue((java.lang.Object) false);
		var8.setValue((java.lang.Object) 0L);
		var4.setPreviousNode(var8);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var20 = new roops.core.testingCoverage.base.LinkedListNode();
		var20.setValue((java.lang.Object) (byte) 100);
		var20.setValue((java.lang.Object) false);
		var17.setNextNode(var20);
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (short) 0);
		java.lang.Object var29 = var26.getValue();
		roops.core.testingCoverage.base.LinkedListNode var30 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (short) 0);
		var30.setNextNode(var31);
		java.lang.Object var35 = var30.getValue();
		var26.setPreviousNode(var30);
		var20.setPreviousNode(var26);
		var4.setNextNode(var26);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (byte) 100);
		var39.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (byte) 100);
		var44.setValue((java.lang.Object) false);
		var39.setPreviousNode(var44);
		roops.core.testingCoverage.base.LinkedListNode var50 = var44
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var51 = var44
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var55 = new roops.core.testingCoverage.base.LinkedListNode();
		var55.setValue((java.lang.Object) (byte) 100);
		var55.setValue((java.lang.Object) false);
		var52.setNextNode(var55);
		roops.core.testingCoverage.base.LinkedListNode var61 = new roops.core.testingCoverage.base.LinkedListNode();
		var61.setValue((java.lang.Object) (short) 0);
		java.lang.Object var64 = var61.getValue();
		roops.core.testingCoverage.base.LinkedListNode var65 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var66 = new roops.core.testingCoverage.base.LinkedListNode();
		var66.setValue((java.lang.Object) (short) 0);
		var65.setNextNode(var66);
		java.lang.Object var70 = var65.getValue();
		var61.setPreviousNode(var65);
		var55.setPreviousNode(var61);
		roops.core.testingCoverage.base.LinkedListNode var73 = new roops.core.testingCoverage.base.LinkedListNode();
		var73.setValue((java.lang.Object) (short) 0);
		java.lang.Object var76 = var73.getValue();
		roops.core.testingCoverage.base.LinkedListNode var77 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var78 = new roops.core.testingCoverage.base.LinkedListNode();
		var78.setValue((java.lang.Object) (short) 0);
		var77.setNextNode(var78);
		java.lang.Object var82 = var77.getValue();
		var73.setPreviousNode(var77);
		java.lang.Object var84 = var77.getValue();
		java.lang.Object var85 = var77.getValue();
		var61.setPreviousNode(var77);
		var44.setNextNode(var61);
		var61.setValue((java.lang.Object) 10);
		roops.core.testingCoverage.base.LinkedListNode var90 = var61
				.getPreviousNode();
		var4.setPreviousNode(var90);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var7);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var29 + "' != '" + (short) 0 + "'",
				var29.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var35);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var51);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var64 + "' != '" + (short) 0 + "'",
				var64.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var70);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var76 + "' != '" + (short) 0 + "'",
				var76.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var82);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var84);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var85);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var90);

		TestCoverageTool.report(var0);
	}

	public void test192() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test192");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (short) 0);
		java.lang.Object var16 = var13.getValue();
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (short) 0);
		var17.setNextNode(var18);
		java.lang.Object var22 = var17.getValue();
		var13.setPreviousNode(var17);
		java.lang.Object var24 = var17.getValue();
		java.lang.Object var25 = var17.getValue();
		var12.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (byte) 100);
		var27.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var32 = new roops.core.testingCoverage.base.LinkedListNode();
		var32.setValue((java.lang.Object) (byte) 100);
		var32.setValue((java.lang.Object) false);
		var27.setPreviousNode(var32);
		var12.setValue((java.lang.Object) var27);
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		var39.setValue((java.lang.Object) (short) 0);
		java.lang.Object var42 = var39.getValue();
		roops.core.testingCoverage.base.LinkedListNode var43 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var44 = new roops.core.testingCoverage.base.LinkedListNode();
		var44.setValue((java.lang.Object) (short) 0);
		var43.setNextNode(var44);
		java.lang.Object var48 = var43.getValue();
		var39.setPreviousNode(var43);
		java.lang.Object var50 = var43.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		var51.setValue((java.lang.Object) (byte) 100);
		var51.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var56 = new roops.core.testingCoverage.base.LinkedListNode();
		var56.setValue((java.lang.Object) (byte) 100);
		var56.setValue((java.lang.Object) false);
		var51.setPreviousNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var62 = var56
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var63 = var56
				.getPreviousNode();
		var43.setNextNode(var56);
		roops.core.testingCoverage.base.LinkedListNode var65 = var43
				.getNextNode();
		var12.setPreviousNode(var43);
		roops.core.testingCoverage.base.LinkedListNode var67 = var12
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var68 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var69 = var68
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var70 = new roops.core.testingCoverage.base.LinkedListNode();
		var70.setValue((java.lang.Object) (short) 0);
		java.lang.Object var73 = var70.getValue();
		roops.core.testingCoverage.base.LinkedListNode var74 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var75 = new roops.core.testingCoverage.base.LinkedListNode();
		var75.setValue((java.lang.Object) (short) 0);
		var74.setNextNode(var75);
		roops.core.testingCoverage.base.LinkedListNode var79 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var80 = new roops.core.testingCoverage.base.LinkedListNode();
		var80.setValue((java.lang.Object) (short) 0);
		var79.setNextNode(var80);
		roops.core.testingCoverage.base.LinkedListNode var84 = var79
				.getNextNode();
		var79.setValue((java.lang.Object) 'a');
		var75.setPreviousNode(var79);
		var70.setNextNode(var75);
		roops.core.testingCoverage.base.LinkedListNode var89 = var70
				.getNextNode();
		var68.setValue((java.lang.Object) var70);
		var12.setValue((java.lang.Object) var68);
		java.lang.Object var92 = var68.getValue();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var16 + "' != '" + (short) 0 + "'",
				var16.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var22);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var42 + "' != '" + (short) 0 + "'",
				var42.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var48);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var50);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var62);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var63);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var65);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var67);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var69);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var73 + "' != '" + (short) 0 + "'",
				var73.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var84);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var89);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var92);

		TestCoverageTool.report(var0);
	}

	public void test193() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test193");
		}

		roops.core.testingCoverage.mcc.LinkedListRemoveIndex var0 = new roops.core.testingCoverage.mcc.LinkedListRemoveIndex();
		boolean var1 = var0.repOK();
		boolean var2 = var0.repOK();
		boolean var3 = var0.repOK();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.mcc.LinkedListRemoveIndex
					.removeIndexTest(var0, 10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var1 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var3 == true);

		TestCoverageTool.report(var0);
	}

	public void test194() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test194");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = new roops.core.testingCoverage.base.LinkedListNode();
		var12.setValue((java.lang.Object) (byte) 100);
		var12.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var12.setPreviousNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var23 = var17
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var24 = var17
				.getPreviousNode();
		var4.setNextNode(var17);
		roops.core.testingCoverage.base.LinkedListNode var26 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var27 = new roops.core.testingCoverage.base.LinkedListNode();
		var27.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var30 = var27
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var31 = new roops.core.testingCoverage.base.LinkedListNode();
		var31.setValue((java.lang.Object) (byte) 100);
		var31.setValue((java.lang.Object) false);
		var31.setValue((java.lang.Object) 0L);
		var27.setPreviousNode(var31);
		roops.core.testingCoverage.base.LinkedListNode var39 = var31
				.getNextNode();
		var4.setNextNode(var31);
		java.lang.Object var41 = var31.getValue();
		roops.core.testingCoverage.base.LinkedListNode var42 = var31
				.getPreviousNode();

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var23);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var26);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var30);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var39);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var41 + "' != '" + 0L + "'", var41.equals(0L));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var42);

		TestCoverageTool.report(var0);
	}

	public void test195() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test195");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		roops.core.testingCoverage.base.LinkedListNode var3 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		var4.setValue((java.lang.Object) (byte) 100);
		var4.setValue((java.lang.Object) false);
		var4.setValue((java.lang.Object) 0L);
		var0.setPreviousNode(var4);
		roops.core.testingCoverage.base.LinkedListNode var12 = var0
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = var12
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var14 = new roops.core.testingCoverage.base.LinkedListNode();
		var14.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var17 = new roops.core.testingCoverage.base.LinkedListNode();
		var17.setValue((java.lang.Object) (byte) 100);
		var17.setValue((java.lang.Object) false);
		var14.setNextNode(var17);
		java.lang.Object var23 = var14.getValue();
		var12.setNextNode(var14);
		roops.core.testingCoverage.base.LinkedListNode var25 = var12
				.getNextNode();

		// Regression assertion (captures the current behavior of the code)
		assertNull(var3);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var13);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var23 + "' != '" + (byte) 100 + "'",
				var23.equals((byte) 100));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var25);

		TestCoverageTool.report(var0);
	}

	public void test196() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test196");
		}

		roops.core.testingCoverage.base.LinkedListNode var0 = new roops.core.testingCoverage.base.LinkedListNode();
		var0.setValue((java.lang.Object) (short) 0);
		java.lang.Object var3 = var0.getValue();
		roops.core.testingCoverage.base.LinkedListNode var4 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var5 = new roops.core.testingCoverage.base.LinkedListNode();
		var5.setValue((java.lang.Object) (short) 0);
		var4.setNextNode(var5);
		java.lang.Object var9 = var4.getValue();
		var0.setPreviousNode(var4);
		java.lang.Object var11 = var4.getValue();
		roops.core.testingCoverage.base.LinkedListNode var12 = var4
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var13 = new roops.core.testingCoverage.base.LinkedListNode();
		var13.setValue((java.lang.Object) (byte) 100);
		var13.setValue((java.lang.Object) false);
		roops.core.testingCoverage.base.LinkedListNode var18 = new roops.core.testingCoverage.base.LinkedListNode();
		var18.setValue((java.lang.Object) (byte) 100);
		var18.setValue((java.lang.Object) false);
		var13.setPreviousNode(var18);
		roops.core.testingCoverage.base.LinkedListNode var24 = var18
				.getNextNode();
		roops.core.testingCoverage.base.LinkedListNode var25 = var18
				.getPreviousNode();
		roops.core.testingCoverage.base.LinkedListNode var26 = new roops.core.testingCoverage.base.LinkedListNode();
		var26.setValue((java.lang.Object) (byte) 100);
		roops.core.testingCoverage.base.LinkedListNode var29 = new roops.core.testingCoverage.base.LinkedListNode();
		var29.setValue((java.lang.Object) (byte) 100);
		var29.setValue((java.lang.Object) false);
		var26.setNextNode(var29);
		roops.core.testingCoverage.base.LinkedListNode var35 = new roops.core.testingCoverage.base.LinkedListNode();
		var35.setValue((java.lang.Object) (short) 0);
		java.lang.Object var38 = var35.getValue();
		roops.core.testingCoverage.base.LinkedListNode var39 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var40 = new roops.core.testingCoverage.base.LinkedListNode();
		var40.setValue((java.lang.Object) (short) 0);
		var39.setNextNode(var40);
		java.lang.Object var44 = var39.getValue();
		var35.setPreviousNode(var39);
		var29.setPreviousNode(var35);
		roops.core.testingCoverage.base.LinkedListNode var47 = new roops.core.testingCoverage.base.LinkedListNode();
		var47.setValue((java.lang.Object) (short) 0);
		java.lang.Object var50 = var47.getValue();
		roops.core.testingCoverage.base.LinkedListNode var51 = new roops.core.testingCoverage.base.LinkedListNode();
		roops.core.testingCoverage.base.LinkedListNode var52 = new roops.core.testingCoverage.base.LinkedListNode();
		var52.setValue((java.lang.Object) (short) 0);
		var51.setNextNode(var52);
		java.lang.Object var56 = var51.getValue();
		var47.setPreviousNode(var51);
		java.lang.Object var58 = var51.getValue();
		java.lang.Object var59 = var51.getValue();
		var35.setPreviousNode(var51);
		var18.setNextNode(var35);
		java.lang.Object var62 = var18.getValue();
		roops.core.testingCoverage.base.LinkedListNode var63 = var18
				.getNextNode();
		var12.setPreviousNode(var63);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var3 + "' != '" + (short) 0 + "'",
				var3.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var9);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var11);

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var12);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var24);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var25);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var38 + "' != '" + (short) 0 + "'",
				var38.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var44);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var50 + "' != '" + (short) 0 + "'",
				var50.equals((short) 0));

		// Regression assertion (captures the current behavior of the code)
		assertNull(var56);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var58);

		// Regression assertion (captures the current behavior of the code)
		assertNull(var59);

		// Regression assertion (captures the current behavior of the code)
		assertTrue("'" + var62 + "' != '" + false + "'", var62.equals(false));

		// Regression assertion (captures the current behavior of the code)
		assertNotNull(var63);

		TestCoverageTool.report(var0);
	}

}
