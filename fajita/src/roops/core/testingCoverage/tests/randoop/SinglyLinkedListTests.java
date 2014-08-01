package roops.core.testingCoverage.tests.randoop;

import junit.framework.TestCase;
import ar.uba.dc.rfm.tools.TestCoverageTool;

public class SinglyLinkedListTests extends TestCase {

	public static boolean debug = false;

	public void test1() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test1");
		}

		roops.core.testingCoverage.base.SinglyLinkedListNode var0 = new roops.core.testingCoverage.base.SinglyLinkedListNode();

		TestCoverageTool.pathReport(var0);
	}

	public void test2() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test2");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test3() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test3");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test4() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test4");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test5() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test5");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test6() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test6");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test7() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test7");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test8() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test8");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test9() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test9");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test10() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test10");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test11() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test11");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test12() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test12");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test13() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test13");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test14() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test14");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test15() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test15");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test16() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test16");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test17() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test17");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test18() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test18");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test19() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test19");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test20() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test20");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test21() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test21");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		boolean var4 = var0.contains((-1));
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test22() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test22");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test23() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test23");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(100);
		boolean var4 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test24() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test24");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test25() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test25");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test26() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test26");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test27() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test27");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test28() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test28");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				(-1));
		var0.insertBack(0);

		TestCoverageTool.pathReport(var0);
	}

	public void test29() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test29");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test30() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test30");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test31() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test31");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		var0.insertBack(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test32() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test32");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		var0.insertBack(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test33() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test33");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test34() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test34");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test35() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test35");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test36() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test36");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		var0.insertBack(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test37() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test37");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test38() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test38");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test39() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test39");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test40() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test40");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test41() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test41");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test42() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test42");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		var0.remove(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test43() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test43");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(100);
		boolean var4 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test44() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test44");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test45() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test45");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test46() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test46");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		boolean var10 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test47() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test47");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test48() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test48");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test49() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test49");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test50() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test50");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);

		TestCoverageTool.pathReport(var0);
	}

	public void test51() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test51");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test52() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test52");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		var0.insertBack(10);
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test53() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test53");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test54() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test54");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);
		var0.remove(1);

		TestCoverageTool.pathReport(var0);
	}

	public void test55() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test55");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		var0.insertBack(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test56() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test56");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		var0.insertBack(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test57() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test57");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test58() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test58");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		boolean var10 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test59() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test59");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test60() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test60");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test61() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test61");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		var0.insertBack(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test62() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test62");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test63() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test63");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.insertBack(10);
		boolean var12 = var0.contains(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test64() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test64");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test65() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test65");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test66() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test66");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));

		TestCoverageTool.pathReport(var0);
	}

	public void test67() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test67");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test68() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test68");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test69() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test69");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		var0.insertBack(0);
		var0.remove(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test70() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test70");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test71() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test71");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test72() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test72");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test73() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test73");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test74() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test74");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		var0.insertBack(10);
		var0.remove(0);
		var0.insertBack(0);
		var0.insertBack(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test75() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test75");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		boolean var10 = var0.contains(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test76() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test76");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test77() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test77");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test78() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test78");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		boolean var10 = var0.contains((-1));
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test79() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test79");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test80() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test80");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		boolean var14 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test81() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test81");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test82() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test82");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test83() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test83");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		boolean var4 = var0.contains((-1));
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test84() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test84");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains((-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test85() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test85");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test86() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test86");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		var0.insertBack(1);
		boolean var18 = var0.contains(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var18 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test87() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test87");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test88() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test88");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		boolean var10 = var0.contains(0);
		boolean var12 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		boolean var16 = var0.contains(1);
		boolean var18 = var0.contains(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var18 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test89() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test89");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test90() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test90");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.remove(1);

		TestCoverageTool.pathReport(var0);
	}

	public void test91() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test91");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		boolean var10 = var0.contains(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test92() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test92");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		var0.insertBack(10);
		var0.remove(0);
		boolean var18 = var0.contains(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var18 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test93() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test93");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack((-1));
		boolean var20 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var20 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test94() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test94");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test95() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test95");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test96() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test96");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains((-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		boolean var12 = var0.contains(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test97() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test97");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		boolean var8 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);
		boolean var14 = var0.contains(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test98() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test98");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test99() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test99");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test100() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test100");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test101() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test101");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		var0.insertBack(10);
		var0.insertBack(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test102() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test102");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);
		boolean var12 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test103() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test103");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		var0.insertBack(1);
		var0.remove(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test104() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test104");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		var0.insertBack(0);
		boolean var16 = var0.contains(1);
		var0.insertBack(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test105() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test105");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test106() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test106");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		boolean var8 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test107() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test107");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		boolean var8 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test108() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test108");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test109() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test109");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test110() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test110");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test111() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test111");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		var0.insertBack(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test112() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test112");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test113() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test113");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		var0.insertBack(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test114() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test114");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test115() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test115");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);
		var0.insertBack((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test116() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test116");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		boolean var16 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test117() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test117");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		var0.insertBack(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test118() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test118");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		boolean var8 = var0.contains(10);
		var0.insertBack(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test119() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test119");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(0);
		var0.insertBack(100);

		TestCoverageTool.pathReport(var0);
	}

	public void test120() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test120");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test121() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test121");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test122() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test122");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test123() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test123");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		var0.insertBack(10);
		var0.insertBack(100);

		TestCoverageTool.pathReport(var0);
	}

	public void test124() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test124");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test125() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test125");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		var0.insertBack(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test126() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test126");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		boolean var16 = var0.contains(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var16 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test127() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test127");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(100);
		boolean var14 = var0.contains(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test128() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test128");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		var0.insertBack(10);
		boolean var12 = var0.contains(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test129() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test129");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		TestCoverageTool.pathReport(var0);
	}

	public void test130() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test130");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test131() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test131");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test132() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test132");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);
		var0.insertBack(1);

		TestCoverageTool.pathReport(var0);
	}

	public void test133() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test133");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test134() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test134");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		var0.insertBack(0);
		var0.insertBack((-1));

		TestCoverageTool.pathReport(var0);
	}

	public void test135() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test135");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test136() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test136");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		boolean var8 = var0.contains(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test137() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test137");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 0);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test138() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test138");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		boolean var12 = var0.contains(0);
		boolean var14 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test139() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test139");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		var0.insertBack(100);
		boolean var10 = var0.contains(10);
		var0.insertBack((-1));
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test140() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test140");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains(1);
		boolean var8 = var0.contains((-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test141() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test141");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test142() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test142");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		TestCoverageTool.pathReport(var0);
	}

	public void test143() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test143");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		var0.insertBack((-1));
		var0.insertBack(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test144() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test144");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test145() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test145");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		var0.insertBack(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test146() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test146");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				(-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test147() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test147");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		var0.insertBack((-1));
		var0.insertBack(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test148() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test148");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test149() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test149");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		boolean var8 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test150() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test150");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);

		TestCoverageTool.pathReport(var0);
	}

	public void test151() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test151");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test152() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test152");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		boolean var14 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test153() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test153");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		var0.remove(0);
		boolean var12 = var0.contains(10);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == true);

		TestCoverageTool.pathReport(var0);
	}

	public void test154() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test154");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test155() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test155");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test156() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test156");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		var0.insertBack((-1));
		var0.insertBack((-1));
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test157() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test157");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		boolean var12 = var0.contains(0);
		var0.insertBack(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test158() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test158");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);

		TestCoverageTool.pathReport(var0);
	}

	public void test159() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test159");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		var0.remove(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					100);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test160() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test160");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		boolean var12 = var0.contains(0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(10);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test161() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test161");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		boolean var4 = var0.contains(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var4 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test162() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test162");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		var0.insertBack(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove(1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test163() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test163");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(100);
		var0.insertBack(10);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test164() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test164");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		var0.insertBack(100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test165() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test165");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		boolean var6 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 10);
		boolean var10 = var0.contains((-1));
		var0.insertBack(100);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove
					.removeTest(var0, 1);
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var6 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var10 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test166() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test166");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		boolean var12 = var0.contains((-1));
		boolean var14 = var0.contains((-1));

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var14 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test167() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test167");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0, 1);
		var0.insertBack(10);
		var0.remove(1);

		TestCoverageTool.pathReport(var0);
	}

	public void test168() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test168");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		boolean var12 = var0.contains((-1));
		var0.insertBack(0);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test169() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test169");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);
		boolean var8 = var0.contains(0);
		var0.insertBack(1);
		boolean var12 = var0.contains(100);
		var0.remove(0);
		var0.insertBack(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				(-1));
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			var0.remove((-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test170() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test170");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);
		var0.remove(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0, 0);

		TestCoverageTool.pathReport(var0);
	}

	public void test171() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test171");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		var0.insertBack(1);
		// The following exception was thrown during execution.
		// This behavior will recorded for regression testing.
		try {
			roops.core.testingCoverage.path.SinglyLinkedListRemove.removeTest(var0,
					(-1));
			fail("Expected exception of type java.lang.RuntimeException");
		} catch (java.lang.RuntimeException e) {
			// Expected exception.
		}

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test172() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test172");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				(-1));

		TestCoverageTool.pathReport(var0);
	}

	public void test173() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test173");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		var0.insertBack(0);
		boolean var8 = var0.contains(10);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.insertBackTest(var0, 1);
		var0.remove(1);
		var0.remove(1);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		TestCoverageTool.pathReport(var0);
	}

	public void test174() throws Throwable {

		if (debug) {
			System.out.println();
			System.out.print("RandoopTest0.test174");
		}

		roops.core.testingCoverage.path.SinglyLinkedListRemove var0 = new roops.core.testingCoverage.path.SinglyLinkedListRemove();
		boolean var2 = var0.contains(0);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.containsTest(var0,
				(-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				10);
		boolean var8 = var0.contains(1);
		roops.core.testingCoverage.path.SinglyLinkedListRemove.insertBackTest(var0,
				100);
		boolean var12 = var0.contains((-1));
		roops.core.testingCoverage.path.SinglyLinkedListRemove
				.containsTest(var0, 100);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var2 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var8 == false);

		// Regression assertion (captures the current behavior of the code)
		assertTrue(var12 == false);

		TestCoverageTool.pathReport(var0);
	}

}
