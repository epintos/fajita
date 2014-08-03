package roops.core.testingCoverage.tests.pex;

import org.junit.Test;

import roops.core.testingCoverage.uses.LinkedListContains;
import ar.uba.dc.rfm.tools.TestCoverageTool;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class LinkedListTests {

	@Test
	public void test_0() {
		LinkedListContains s = null;
		LinkedListContains.containsTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_1() {
		LinkedListContains s = new LinkedListContains();
		s.header = null;
		s.size = 0;
		s.modCount = 0;
		LinkedListContains.containsTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_2() {
		LinkedListContains s = new LinkedListContains();
		s.header = new roops.core.testingCoverage.base.LinkedListNode();
		s.size = 0;
		s.modCount = 0;
		s.header.object_value = null;
		s.header.next = null;
		s.header.previous = null;
		LinkedListContains.containsTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_3() {
		LinkedListContains s = new LinkedListContains();
		s.header = new roops.core.testingCoverage.base.LinkedListNode();
		s.size = 0;
		s.modCount = 0;
		s.header.object_value = 1;
		s.header.next = null;
		s.header.previous = null;
		LinkedListContains.containsTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_4() {
		LinkedListContains s = null;
		LinkedListContains.addLastTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_5() {
		LinkedListContains s = new LinkedListContains();
		s.header = null;
		s.size = 0;
		s.modCount = 0;
		LinkedListContains.addLastTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_6() {
		LinkedListContains s = new LinkedListContains();
		s.header = new roops.core.testingCoverage.base.LinkedListNode();
		s.size = 0;
		s.modCount = 0;
		s.header.object_value = null;
		s.header.next = null;
		s.header.previous = null;
		LinkedListContains.addLastTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_7() {
		LinkedListContains s = new LinkedListContains();
		s.header = new roops.core.testingCoverage.base.LinkedListNode();
		s.size = 0;
		s.modCount = 0;
		s.header.object_value = null;
		s.header.next = null;
		s.header.previous = null;
		LinkedListContains.addLastTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_8() {
		LinkedListContains s = null;
		LinkedListContains.removeIndexTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_9() {
		LinkedListContains s = new LinkedListContains();
		s.header = null;
		s.size = 0;
		s.modCount = 0;
		LinkedListContains.removeIndexTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_10() {
		LinkedListContains s = new LinkedListContains();
		s.header = null;
		LinkedListContains.removeIndexTest(s, 0);
		TestCoverageTool.report(s);
	}
	
	@Test
	public void test_11() {
		LinkedListContains s = new LinkedListContains();
		s.header = new roops.core.testingCoverage.base.LinkedListNode();
		s.size = 0;
		s.modCount = 0;
		s.header.object_value = null;
		s.header.next = null;
		s.header.previous = null;
		LinkedListContains.removeIndexTest(s, 0);
		TestCoverageTool.report(s);
	}

}
