/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 31 21:02:10 ART 2014
 */

package roops.core.testingCoverage.tests.evoSuite;

import org.junit.Test;

import roops.core.testingCoverage.base.AvlNode;
import roops.core.testingCoverage.path.AvlTreeSearchMin;
import ar.uba.dc.rfm.tools.TestCoverageTool;

public class AvlTreeEvoSuiteTests {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I142 Branch 23 IFNULL L194 - false
   */

  @Test
  public void test00()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlNode avlNode1 = new AvlNode();
      avlTree0.root.left = avlNode1;
      AvlTreeSearchMin.searchMinTest(avlTree0);
  TestCoverageTool.pathReport(avlTree0);}


  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I63 Branch 17 IFNONNULL L169 - true
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I106 Branch 20 IF_ICMPLE L181 - false
   */

  @Test
  public void test02()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlTree0.root = avlNode0;
      avlTree0.root.left = avlTree0.root;
      avlTree0.root.height = 381;
      AvlTreeSearchMin.searchMaxTest(avlTree0);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I80 Branch 18 IFNONNULL L175 - true
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I103 Branch 19 IF_ICMPLT L181 - true
   * 3 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMaxTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I6 Branch 4 IFEQ L37 - true
   */


  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMin(Lroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I7 Branch 12 IFNONNULL L122 - true
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMin(Lroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I31 Branch 13 IFNONNULL L129 - false
   */

  @Test
  public void test04()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchMinTest(avlTree0);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMax(Lroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I7 Branch 10 IFNONNULL L96 - true
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMax(Lroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I31 Branch 11 IFNONNULL L103 - false
   */

  @Test
  public void test05()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchMaxTest(avlTree0);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I35 Branch 8 IF_ICMPLE L69 - false
   */

  @Test
  public void test06()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchNodeTest(avlTree0, 1);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I17 Branch 7 IF_ICMPGE L63 - false
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I61 Branch 9 IFNONNULL L58 - false
   */

  @Test
  public void test07()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchNodeTest(avlTree0, (-1128));
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 8
  /*
   * 15 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchNode(I)Lroops/core/testingCoverage/base/AvlNode;: root-Branch
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I17 Branch 7 IF_ICMPGE L63 - true
   * 3 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I35 Branch 8 IF_ICMPLE L69 - true
   * 4 roops.core.testingCoverage.core.AvlTreeSearchMin.search(ILroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I61 Branch 9 IFNONNULL L58 - true
   * 5 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;II)Z: I5 Branch 28 IF_ICMPLT L220 - false
   * 6 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;II)Z: I9 Branch 29 IF_ICMPLE L220 - true
   * 7 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;II)Z: I18 Branch 30 IFNULL L223 - true
   * 8 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;II)Z: I37 Branch 32 IFNULL L227 - true
   * 9 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrderedMax(Lroops/core/testingCoverage/base/AvlNode;)I: I16 Branch 35 IFNONNULL L244 - false
   * 10 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I133 Branch 22 IF_ICMPEQ L190 - true
   * 11 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I142 Branch 23 IFNULL L194 - true
   * 12 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I153 Branch 24 IFNULL L197 - true
   * 13 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;)Z: I3 Branch 27 IFNONNULL L209 - true
   * 14 roops.core.testingCoverage.core.AvlTreeSearchMin.searchNodeTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;I)V: I6 Branch 2 IFEQ L29 - false
   * 15 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrderedMin(Lroops/core/testingCoverage/base/AvlNode;)I: I16 Branch 34 IFNONNULL L236 - false
   */

  @Test
  public void test08()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlNode0.height = 1;
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchNodeTest(avlTree0, 0);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMinTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I3 Branch 5 IFNULL L45 - true
   */

  @Test
  public void test09()  throws Throwable  {
      AvlTreeSearchMin.searchMinTest((AvlTreeSearchMin) null);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMaxTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I3 Branch 3 IFNULL L37 - true
   */

  @Test
  public void test10()  throws Throwable  {
      AvlTreeSearchMin.searchMaxTest((AvlTreeSearchMin) null);
  }

  //Test case number: 11
  /*
   * 12 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I22 Branch 14 IFNULL L153 - false
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I43 Branch 15 IFNE L161 - true
   * 3 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I54 Branch 16 IFNE L164 - true
   * 4 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I63 Branch 17 IFNONNULL L169 - false
   * 5 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I80 Branch 18 IFNONNULL L175 - false
   * 6 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I103 Branch 19 IF_ICMPLT L181 - false
   * 7 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I106 Branch 20 IF_ICMPLE L181 - true
   * 8 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I115 Branch 21 IF_ICMPLE L185 - true
   * 9 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I133 Branch 22 IF_ICMPEQ L190 - false
   * 10 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I164 Branch 25 IFGT L157 - true
   * 11 roops.core.testingCoverage.core.AvlTreeSearchMin.searchNodeTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;I)V: I3 Branch 1 IFNULL L29 - false
   * 12 roops.core.testingCoverage.core.AvlTreeSearchMin.searchNodeTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;I)V: I6 Branch 2 IFEQ L29 - true
   */

  @Test
  public void test11()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlNode avlNode0 = new AvlNode();
      avlTree0.root = avlNode0;
      AvlTreeSearchMin.searchNodeTest(avlTree0, 381);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchNodeTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;I)V: I3 Branch 1 IFNULL L29 - true
   */

  @Test
  public void test12()  throws Throwable  {
      AvlTreeSearchMin.searchNodeTest((AvlTreeSearchMin) null, 292);
  }

  //Test case number: 13
  	/*
	 * 4 covered goals: 1
	 * roops.core.testingCoverage.core.AvlTreeSearchMin.searchMax
	 * ()Lroops/core/testingCoverage/base/AvlNode;: root-Branch 2
	 * roops.core.testingCoverage
	 * .core.AvlTreeSearchMin.searchMax(Lroops/core/testingCoverage
	 * /base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I7 Branch 10
	 * IFNONNULL L96 - false 3
	 * roops.core.testingCoverage.core.AvlTreeSearchMin.
	 * searchMaxTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I3
	 * Branch 3 IFNULL L37 - false 4
	 * roops.core.testingCoverage.core.AvlTreeSearchMin
	 * .searchMaxTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I6
	 * Branch 4 IFEQ L37 - false
	 */

  @Test
  public void test13()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlTreeSearchMin.searchMaxTest(avlTree0);
  TestCoverageTool.pathReport(avlTree0);}

  //Test case number: 14
  /*
   * 9 covered goals:
   * 1 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMin()Lroops/core/testingCoverage/base/AvlNode;: root-Branch
   * 2 roops.core.testingCoverage.core.AvlTreeSearchMin.<init>()V: root-Branch
   * 3 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMin(Lroops/core/testingCoverage/base/AvlNode;)Lroops/core/testingCoverage/base/AvlNode;: I7 Branch 12 IFNONNULL L122 - false
   * 4 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I22 Branch 14 IFNULL L153 - true
   * 5 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I164 Branch 25 IFGT L157 - false
   * 6 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK()Z: I171 Branch 26 IFNE L202 - true
   * 7 roops.core.testingCoverage.core.AvlTreeSearchMin.repOK_isOrdered(Lroops/core/testingCoverage/base/AvlNode;)Z: I3 Branch 27 IFNONNULL L209 - false
   * 8 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMinTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I3 Branch 5 IFNULL L45 - false
   * 9 roops.core.testingCoverage.core.AvlTreeSearchMin.searchMinTest(Lroops/core/testingCoverage/core/AvlTreeSearchMin;)V: I6 Branch 6 IFEQ L45 - false
   */

  @Test
  public void test14()  throws Throwable  {
      AvlTreeSearchMin avlTree0 = new AvlTreeSearchMin();
      AvlTreeSearchMin.searchMinTest(avlTree0);
  }
}
