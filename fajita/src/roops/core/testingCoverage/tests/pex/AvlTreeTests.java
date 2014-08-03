package roops.core.testingCoverage.tests.pex;

import org.junit.Test;

import roops.core.testingCoverage.uses.AvlTreeSearchNode;
import ar.uba.dc.rfm.tools.TestCoverageTool;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class AvlTreeTests {

	@Test
	public void test_0() {
		AvlTreeSearchNode s = null;
		AvlTreeSearchNode.searchNodeTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_1() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = null;
		AvlTreeSearchNode.searchNodeTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_2() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = new roops.core.testingCoverage.base.AvlNode();
		s.root.element = 0;
		s.root.height = 0;
		s.root.left = null;
		s.root.right = null;
		AvlTreeSearchNode.searchNodeTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_3() {
		AvlTreeSearchNode s = null;
		AvlTreeSearchNode.searchMaxTest(s);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_4() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = null;
		AvlTreeSearchNode.searchMaxTest(s);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_5() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = new roops.core.testingCoverage.base.AvlNode();
		s.root.element = 0;
		s.root.height = 0;
		s.root.left = null;
		s.root.right = null;
		AvlTreeSearchNode.searchMaxTest(s);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_6() {
		AvlTreeSearchNode s = null;
		AvlTreeSearchNode.searchMinTest(s);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_7() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = null;
		AvlTreeSearchNode.searchMinTest(s);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_8() {
		AvlTreeSearchNode s = new AvlTreeSearchNode();
		s.root = new roops.core.testingCoverage.base.AvlNode();
		s.root.element = 0;
		s.root.height = 0;
		s.root.left = null;
		s.root.right = null;
		AvlTreeSearchNode.searchMinTest(s);
		TestCoverageTool.report(s);
	}

}
