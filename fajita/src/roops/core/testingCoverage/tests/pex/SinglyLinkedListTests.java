package roops.core.testingCoverage.tests.pex;

import org.junit.Test;

import roops.core.testingCoverage.uses.SinglyLinkedListContains;
import ar.uba.dc.rfm.tools.TestCoverageTool;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class SinglyLinkedListTests {

	@Test
	public void test_0() {
		SinglyLinkedListContains s = null;
		SinglyLinkedListContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_1() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = null;
		SinglyLinkedListContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_2() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		SinglyLinkedListContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_3() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		SinglyLinkedListContains.containsTest(s, 1);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_4() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.next = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.next.value = 0;
		s.header.next.next = null;
		SinglyLinkedListContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_5() {
		SinglyLinkedListContains s = null;
		SinglyLinkedListContains.insertBackTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_6() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = null;
		SinglyLinkedListContains.insertBackTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_7() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		SinglyLinkedListContains.insertBackTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_8() {
		SinglyLinkedListContains s = null;
		SinglyLinkedListContains.removeTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_9() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = null;
		SinglyLinkedListContains.removeTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_10() {
		SinglyLinkedListContains s = new SinglyLinkedListContains();
		s.header = null;
		SinglyLinkedListContains.removeTest(s, Integer.MIN_VALUE);
		TestCoverageTool.report(s);
	}

}
