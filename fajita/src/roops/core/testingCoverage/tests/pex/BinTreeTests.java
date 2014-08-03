package roops.core.testingCoverage.tests.pex;

import org.junit.Test;

import roops.core.testingCoverage.uses.BinTreeContains;
import ar.uba.dc.rfm.tools.TestCoverageTool;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class BinTreeTests {

	@Test
	public void test_0() {
		BinTreeContains s = null;
		BinTreeContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_1() {
		BinTreeContains s = new BinTreeContains();
		s.root = null;
		BinTreeContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_2() {
		BinTreeContains s = new BinTreeContains();
		s.root = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.key = 0;
		s.root.left = null;
		s.root.right = null;
		s.root.parent = null;
		BinTreeContains.containsTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_3() {
		BinTreeContains s = null;
		BinTreeContains.addTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_4() {
		BinTreeContains s = new BinTreeContains();
		s.root = null;
		BinTreeContains.addTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_5() {
		BinTreeContains s = new BinTreeContains();
		s.root = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.key = 0;
		s.root.left = null;
		s.root.right = null;
		s.root.parent = null;
		BinTreeContains.addTest(s, 0);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_6() {
		BinTreeContains s = null;
		BinTreeContains.removeTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_7() {
		BinTreeContains s = new BinTreeContains();
		s.root = null;
		BinTreeContains.removeTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_8() {
		BinTreeContains s = new BinTreeContains();
		s.root = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.key = 0;
		s.root.left = null;
		s.root.right = null;
		s.root.parent = null;
		BinTreeContains.removeTest(s, null);
		TestCoverageTool.report(s);
	}

	@Test
	public void test_9() {
		BinTreeContains s = new BinTreeContains();
		s.root = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.key = 0;
		s.root.left = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.left.key = 0;
		s.root.left.parent = s.root;
		s.root.left.right = null;
		s.root.left.left = null;
		s.root.right = null;
		s.root.parent = null;
		BinTreeContains.removeTest(s, null);
		TestCoverageTool.report(s);
	}
	
	@Test
	public void test_10() {
		BinTreeContains s = new BinTreeContains();
		s.root = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.key = 0;
		s.root.left = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.left.key = 0;
		s.root.left.parent = s.root;
		s.root.left.right = null;
		s.root.left.left = null;
		s.root.right = new roops.core.testingCoverage.base.BinTreeNode();
		s.root.right.key = 1;
		s.root.right.parent = s.root;
		s.root.right.right = null;
		s.root.right.left = null;
		s.root.parent = null;
		BinTreeContains.removeTest(s, null);
		TestCoverageTool.report(s);
	}


}
