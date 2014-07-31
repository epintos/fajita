package roops.core.testingCoverage.tests.pex;

import org.junit.Test;

import ar.uba.dc.rfm.tools.TestCoverageTool;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class SinglyLinkedListTests {

	@Test
	public void testcontainsTest_1() {
		roops.core.testingCoverage.uses.SinglyLinkedListContains s = new roops.core.testingCoverage.uses.SinglyLinkedListContains();
		s.header = null;
		roops.core.testingCoverage.uses.SinglyLinkedListContains
				.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void testcontainsTest_2() {
		roops.core.testingCoverage.uses.SinglyLinkedListContains s = new roops.core.testingCoverage.uses.SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		roops.core.testingCoverage.uses.SinglyLinkedListContains
				.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void testcontainsTest_3() {
		roops.core.testingCoverage.uses.SinglyLinkedListContains s = new roops.core.testingCoverage.uses.SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		roops.core.testingCoverage.uses.SinglyLinkedListContains
				.containsTest(s, 1);
		TestCoverageTool.report(s);
	}

	@Test
	public void testcontainsTest_4() {
		roops.core.testingCoverage.uses.SinglyLinkedListContains s = new roops.core.testingCoverage.uses.SinglyLinkedListContains();
		s.header = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		s.header.next = new roops.core.testingCoverage.base.SinglyLinkedListNode();
		;
		s.header.next.value = 0;
		s.header.next.next = null;
		roops.core.testingCoverage.uses.SinglyLinkedListContains
				.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

}
