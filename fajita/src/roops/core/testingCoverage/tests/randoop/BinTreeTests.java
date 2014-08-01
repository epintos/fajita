package roops.core.testingCoverage.tests.randoop;

import junit.framework.TestCase;
import ar.uba.dc.rfm.tools.TestCoverageTool;

public class BinTreeTests extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    boolean var25 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  TestCoverageTool.pathReport(var0);}

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    var0.add(10);
    boolean var27 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  TestCoverageTool.pathReport(var0);}

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove var30 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var31 = var30.repOK();
    roops.core.testingCoverage.base.BinTreeNode var32 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var33 = var30.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var26.remove(var32);
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var36 = var35.repOK();
    roops.core.testingCoverage.base.BinTreeNode var37 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var38 = var35.remove(var37);
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var40 = var39.repOK();
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var42 = var39.remove(var41);
    roops.core.testingCoverage.base.BinTreeNode var43 = var35.remove(var41);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var26, var41);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var24, var41);
    boolean var46 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var47 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var47, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var47, 1);
    var47.add(10);
    var47.add(0);
    boolean var56 = var47.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var57 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var57, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var57, 1);
    var57.add(10);
    var57.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var66 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var67 = var66.repOK();
    roops.core.testingCoverage.base.BinTreeNode var68 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var69 = var66.remove(var68);
    roops.core.testingCoverage.base.BinTreeNode var70 = var57.remove(var68);
    roops.core.testingCoverage.base.BinTreeNode var71 = var47.remove(var70);
    roops.core.testingCoverage.base.BinTreeNode var72 = var24.remove(var71);
    roops.core.testingCoverage.path.BinTreeRemove var73 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var73, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var73, 1);
    var73.add(10);
    var73.add(0);
    boolean var82 = var73.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var83 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var83, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var83, 1);
    var83.add(10);
    var83.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var92 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var93 = var92.repOK();
    roops.core.testingCoverage.base.BinTreeNode var94 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var95 = var92.remove(var94);
    roops.core.testingCoverage.base.BinTreeNode var96 = var83.remove(var94);
    roops.core.testingCoverage.base.BinTreeNode var97 = var73.remove(var96);
    roops.core.testingCoverage.base.BinTreeNode var98 = var24.remove(var97);
    roops.core.testingCoverage.base.BinTreeNode var99 = var0.remove(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  TestCoverageTool.pathReport(var0);}

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  TestCoverageTool.pathReport(var0);}

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);

  TestCoverageTool.pathReport(var0);}

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    boolean var18 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    var19.add(10);
    var19.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var19.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var33 = var9.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var0.remove(var33);
    var0.add((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  TestCoverageTool.pathReport(var0);}

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var1 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var2 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var3 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var4 = var3.repOK();
    roops.core.testingCoverage.base.BinTreeNode var5 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var6 = var3.remove(var5);
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.base.BinTreeNode var11 = var3.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var3, var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var1, var18);
    boolean var23 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    var24.add(0);
    boolean var33 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var44 = var43.repOK();
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var43.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var34.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var48 = var24.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var49 = var1.remove(var48);
    roops.core.testingCoverage.base.BinTreeNode var50 = var0.remove(var49);
    roops.core.testingCoverage.path.BinTreeRemove var51 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var52 = var51.repOK();
    roops.core.testingCoverage.base.BinTreeNode var53 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var54 = var51.remove(var53);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var51, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var51, 0);
    var51.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var61 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var62 = var61.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var63 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var64 = var63.repOK();
    roops.core.testingCoverage.base.BinTreeNode var65 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var66 = var63.remove(var65);
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var68 = var67.repOK();
    roops.core.testingCoverage.base.BinTreeNode var69 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var70 = var67.remove(var69);
    roops.core.testingCoverage.base.BinTreeNode var71 = var63.remove(var69);
    roops.core.testingCoverage.path.BinTreeRemove var72 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var73 = var72.repOK();
    roops.core.testingCoverage.base.BinTreeNode var74 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var75 = var72.remove(var74);
    roops.core.testingCoverage.path.BinTreeRemove var76 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var77 = var76.repOK();
    roops.core.testingCoverage.base.BinTreeNode var78 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var79 = var76.remove(var78);
    roops.core.testingCoverage.base.BinTreeNode var80 = var72.remove(var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var63, var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var61, var78);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var61, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var85 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var85, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var85, 1);
    var85.add(10);
    var85.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var94 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var95 = var85.remove(var94);
    roops.core.testingCoverage.base.BinTreeNode var96 = var61.remove(var94);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var51, var96);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  TestCoverageTool.pathReport(var0);}

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var11);
    boolean var14 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  TestCoverageTool.pathReport(var0);}

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    boolean var35 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  TestCoverageTool.pathReport(var0);}

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var15);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  TestCoverageTool.pathReport(var0);}

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var19 = var18.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.base.BinTreeNode var35 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var36 = var33.remove(var35);
    roops.core.testingCoverage.base.BinTreeNode var37 = var29.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var20, var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var18, var35);
    roops.core.testingCoverage.base.BinTreeNode var40 = var9.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var40);
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, (-1));
    var42.add(10);
    var42.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, 0);
    roops.core.testingCoverage.path.BinTreeRemove var51 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var51, (-1));
    var51.add(10);
    var51.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var51, 1);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, 1);
    var60.add(10);
    var60.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var69 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var70 = var69.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var71 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var72 = var71.repOK();
    roops.core.testingCoverage.base.BinTreeNode var73 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var74 = var71.remove(var73);
    roops.core.testingCoverage.path.BinTreeRemove var75 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var76 = var75.repOK();
    roops.core.testingCoverage.base.BinTreeNode var77 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var78 = var75.remove(var77);
    roops.core.testingCoverage.base.BinTreeNode var79 = var71.remove(var77);
    roops.core.testingCoverage.path.BinTreeRemove var80 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var81 = var80.repOK();
    roops.core.testingCoverage.base.BinTreeNode var82 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var83 = var80.remove(var82);
    roops.core.testingCoverage.path.BinTreeRemove var84 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var85 = var84.repOK();
    roops.core.testingCoverage.base.BinTreeNode var86 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var87 = var84.remove(var86);
    roops.core.testingCoverage.base.BinTreeNode var88 = var80.remove(var86);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var71, var86);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var69, var86);
    roops.core.testingCoverage.base.BinTreeNode var91 = var60.remove(var86);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var51, var91);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var42, var91);
    roops.core.testingCoverage.base.BinTreeNode var94 = var0.remove(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  TestCoverageTool.pathReport(var0);}

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var11 = var10.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var12, var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var10, var27);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var43 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var44 = var34.remove(var43);
    roops.core.testingCoverage.base.BinTreeNode var45 = var10.remove(var43);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var45);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  TestCoverageTool.pathReport(var0);}

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    var0.add(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  TestCoverageTool.pathReport(var0);}

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var11 = var10.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var12, var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var10, var27);
    boolean var32 = var10.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, 1);
    var33.add(10);
    var33.add(0);
    boolean var42 = var33.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var43, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var43, 1);
    var43.add(10);
    var43.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var52 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var53 = var52.repOK();
    roops.core.testingCoverage.base.BinTreeNode var54 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var55 = var52.remove(var54);
    roops.core.testingCoverage.base.BinTreeNode var56 = var43.remove(var54);
    roops.core.testingCoverage.base.BinTreeNode var57 = var33.remove(var56);
    roops.core.testingCoverage.base.BinTreeNode var58 = var10.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var9.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  TestCoverageTool.pathReport(var0);}

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    boolean var18 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    var19.add(10);
    var19.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var19.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var33 = var9.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var35, (-1));
    boolean var38 = var35.repOK();
    boolean var40 = var35.contains((-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var35, 1);
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var43, (-1));
    var43.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var49 = var48.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var50 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var51 = var50.repOK();
    roops.core.testingCoverage.base.BinTreeNode var52 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var53 = var50.remove(var52);
    roops.core.testingCoverage.path.BinTreeRemove var54 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var55 = var54.repOK();
    roops.core.testingCoverage.base.BinTreeNode var56 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var57 = var54.remove(var56);
    roops.core.testingCoverage.base.BinTreeNode var58 = var50.remove(var56);
    roops.core.testingCoverage.path.BinTreeRemove var59 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var60 = var59.repOK();
    roops.core.testingCoverage.base.BinTreeNode var61 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var62 = var59.remove(var61);
    roops.core.testingCoverage.path.BinTreeRemove var63 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var64 = var63.repOK();
    roops.core.testingCoverage.base.BinTreeNode var65 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var66 = var63.remove(var65);
    roops.core.testingCoverage.base.BinTreeNode var67 = var59.remove(var65);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var50, var65);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var48, var65);
    boolean var70 = var48.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var71 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var71, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var71, 1);
    var71.add(10);
    var71.add(0);
    boolean var80 = var71.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var81 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var81, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var81, 1);
    var81.add(10);
    var81.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var90 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var91 = var90.repOK();
    roops.core.testingCoverage.base.BinTreeNode var92 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var93 = var90.remove(var92);
    roops.core.testingCoverage.base.BinTreeNode var94 = var81.remove(var92);
    roops.core.testingCoverage.base.BinTreeNode var95 = var71.remove(var94);
    roops.core.testingCoverage.base.BinTreeNode var96 = var48.remove(var95);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var43, var95);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var95);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  TestCoverageTool.pathReport(var0);}

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var1 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var2 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var3 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var4 = var3.repOK();
    roops.core.testingCoverage.base.BinTreeNode var5 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var6 = var3.remove(var5);
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.base.BinTreeNode var11 = var3.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var3, var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var1, var18);
    boolean var23 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    var24.add(0);
    boolean var33 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var44 = var43.repOK();
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var43.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var34.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var48 = var24.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var49 = var1.remove(var48);
    roops.core.testingCoverage.base.BinTreeNode var50 = var0.remove(var49);
    boolean var51 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);

  TestCoverageTool.pathReport(var0);}

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    boolean var6 = var0.repOK();
    var0.add((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  TestCoverageTool.pathReport(var0);}

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    boolean var7 = var0.contains(10);
    boolean var8 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  TestCoverageTool.pathReport(var0);}

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    boolean var6 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  TestCoverageTool.pathReport(var0);}

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var5 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var6 = var5.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.base.BinTreeNode var15 = var7.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.base.BinTreeNode var24 = var16.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var7, var22);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var5, var22);
    boolean var27 = var5.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, 1);
    var28.add(10);
    var28.add(0);
    boolean var37 = var28.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var47 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var48 = var47.repOK();
    roops.core.testingCoverage.base.BinTreeNode var49 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var50 = var47.remove(var49);
    roops.core.testingCoverage.base.BinTreeNode var51 = var38.remove(var49);
    roops.core.testingCoverage.base.BinTreeNode var52 = var28.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var5.remove(var52);
    roops.core.testingCoverage.path.BinTreeRemove var54 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var54, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var54, 1);
    var54.add(10);
    var54.add(0);
    boolean var63 = var54.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var64 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var64, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var64, 1);
    var64.add(10);
    var64.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var73 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var74 = var73.repOK();
    roops.core.testingCoverage.base.BinTreeNode var75 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var76 = var73.remove(var75);
    roops.core.testingCoverage.base.BinTreeNode var77 = var64.remove(var75);
    roops.core.testingCoverage.base.BinTreeNode var78 = var54.remove(var77);
    roops.core.testingCoverage.base.BinTreeNode var79 = var5.remove(var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var79);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  TestCoverageTool.pathReport(var0);}

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, 1);
    var8.add(10);
    var8.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var8.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var6.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var0.remove(var18);
    var0.add(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  TestCoverageTool.pathReport(var0);}

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 100);
    boolean var11 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  TestCoverageTool.pathReport(var0);}

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  TestCoverageTool.pathReport(var0);}

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var1 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var2 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var3 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var4 = var3.repOK();
    roops.core.testingCoverage.base.BinTreeNode var5 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var6 = var3.remove(var5);
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.base.BinTreeNode var11 = var3.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var3, var18);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var1, var18);
    boolean var23 = var1.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    var24.add(0);
    boolean var33 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var44 = var43.repOK();
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var43.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var34.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var48 = var24.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var49 = var1.remove(var48);
    roops.core.testingCoverage.base.BinTreeNode var50 = var0.remove(var49);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  TestCoverageTool.pathReport(var0);}

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var6);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    boolean var12 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  TestCoverageTool.pathReport(var0);}

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    var0.add(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  TestCoverageTool.pathReport(var0);}

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var9 = var8.repOK();
    roops.core.testingCoverage.base.BinTreeNode var10 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var11 = var8.remove(var10);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var8, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var8, 0);
    var8.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var19 = var18.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.base.BinTreeNode var35 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var36 = var33.remove(var35);
    roops.core.testingCoverage.base.BinTreeNode var37 = var29.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var20, var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var18, var35);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, 1);
    var42.add(10);
    var42.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var51 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var52 = var42.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var18.remove(var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var53);
    roops.core.testingCoverage.base.BinTreeNode var55 = var0.remove(var53);
    roops.core.testingCoverage.path.BinTreeRemove var56 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var57 = var56.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var58 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var59 = var58.repOK();
    roops.core.testingCoverage.base.BinTreeNode var60 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var61 = var58.remove(var60);
    roops.core.testingCoverage.path.BinTreeRemove var62 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var63 = var62.repOK();
    roops.core.testingCoverage.base.BinTreeNode var64 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var65 = var62.remove(var64);
    roops.core.testingCoverage.base.BinTreeNode var66 = var58.remove(var64);
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var68 = var67.repOK();
    roops.core.testingCoverage.base.BinTreeNode var69 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var70 = var67.remove(var69);
    roops.core.testingCoverage.path.BinTreeRemove var71 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var72 = var71.repOK();
    roops.core.testingCoverage.base.BinTreeNode var73 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var74 = var71.remove(var73);
    roops.core.testingCoverage.base.BinTreeNode var75 = var67.remove(var73);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var58, var73);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var56, var73);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var56, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var80 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var80, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var80, 1);
    var80.add(10);
    var80.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var89 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var90 = var80.remove(var89);
    roops.core.testingCoverage.base.BinTreeNode var91 = var56.remove(var89);
    roops.core.testingCoverage.base.BinTreeNode var92 = var0.remove(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  TestCoverageTool.pathReport(var0);}

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.base.BinTreeNode var8 = var0.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.base.BinTreeNode var17 = var9.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var15);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  TestCoverageTool.pathReport(var0);}

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  TestCoverageTool.pathReport(var0);}

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var9 = var8.repOK();
    roops.core.testingCoverage.base.BinTreeNode var10 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var11 = var8.remove(var10);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var8, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var8, 0);
    var8.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var19 = var18.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.base.BinTreeNode var35 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var36 = var33.remove(var35);
    roops.core.testingCoverage.base.BinTreeNode var37 = var29.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var20, var35);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var18, var35);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, 1);
    var42.add(10);
    var42.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var51 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var52 = var42.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var18.remove(var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var53);
    roops.core.testingCoverage.base.BinTreeNode var55 = var0.remove(var53);
    boolean var57 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  TestCoverageTool.pathReport(var0);}

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    var0.add(10);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  TestCoverageTool.pathReport(var0);}

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    var0.add(10);
    boolean var36 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  TestCoverageTool.pathReport(var0);}

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    boolean var7 = var0.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  TestCoverageTool.pathReport(var0);}

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var1 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var2 = var1.repOK();
    roops.core.testingCoverage.base.BinTreeNode var3 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var4 = var1.remove(var3);
    roops.core.testingCoverage.path.BinTreeRemove var5 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var6 = var5.repOK();
    roops.core.testingCoverage.base.BinTreeNode var7 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var8 = var5.remove(var7);
    roops.core.testingCoverage.base.BinTreeNode var9 = var1.remove(var7);
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var11 = var10.repOK();
    roops.core.testingCoverage.base.BinTreeNode var12 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var13 = var10.remove(var12);
    roops.core.testingCoverage.path.BinTreeRemove var14 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var15 = var14.repOK();
    roops.core.testingCoverage.base.BinTreeNode var16 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var17 = var14.remove(var16);
    roops.core.testingCoverage.base.BinTreeNode var18 = var10.remove(var16);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var1, var16);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var16);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var29);
    boolean var32 = var0.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  TestCoverageTool.pathReport(var0);}

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    var0.add(0);
    boolean var8 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.base.BinTreeNode var21 = var13.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var22.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var28);
    boolean var33 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add(0);
    boolean var43 = var34.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, 1);
    var44.add(10);
    var44.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var44.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var58 = var34.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var11.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, 1);
    var60.add(10);
    var60.add(0);
    boolean var69 = var60.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var70 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, 1);
    var70.add(10);
    var70.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var79 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var80 = var79.repOK();
    roops.core.testingCoverage.base.BinTreeNode var81 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var82 = var79.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var83 = var70.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var84 = var60.remove(var83);
    roops.core.testingCoverage.base.BinTreeNode var85 = var11.remove(var84);
    roops.core.testingCoverage.base.BinTreeNode var86 = var0.remove(var85);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  TestCoverageTool.pathReport(var0);}

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    boolean var10 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  TestCoverageTool.pathReport(var0);}

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    boolean var9 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  TestCoverageTool.pathReport(var0);}

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.base.BinTreeNode var15 = var7.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.path.BinTreeRemove var23 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var24 = var23.repOK();
    roops.core.testingCoverage.base.BinTreeNode var25 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var26 = var23.remove(var25);
    roops.core.testingCoverage.base.BinTreeNode var27 = var19.remove(var25);
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var33 = var32.repOK();
    roops.core.testingCoverage.base.BinTreeNode var34 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var35 = var32.remove(var34);
    roops.core.testingCoverage.base.BinTreeNode var36 = var28.remove(var34);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var19, var34);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var17, var34);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var34);
    boolean var40 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  TestCoverageTool.pathReport(var0);}

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    boolean var22 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var23 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var23, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var23, 1);
    var23.add(10);
    var23.add(0);
    boolean var32 = var23.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, 1);
    var33.add(10);
    var33.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var43 = var42.repOK();
    roops.core.testingCoverage.base.BinTreeNode var44 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var45 = var42.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var46 = var33.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var47 = var23.remove(var46);
    roops.core.testingCoverage.base.BinTreeNode var48 = var0.remove(var47);
    boolean var49 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  TestCoverageTool.pathReport(var0);}

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var10 = var0.contains(1);
    var0.add(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  TestCoverageTool.pathReport(var0);}

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var4 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  TestCoverageTool.pathReport(var0);}

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, 1);
    var2.add(10);
    var2.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var2.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var12);
    var0.add((-1));
    boolean var17 = var0.contains(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  TestCoverageTool.pathReport(var0);}

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, 1);
    var8.add(10);
    var8.add(0);
    boolean var17 = var8.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, 1);
    var18.add(10);
    var18.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.base.BinTreeNode var31 = var18.remove(var29);
    roops.core.testingCoverage.base.BinTreeNode var32 = var8.remove(var31);
    var8.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var36 = var35.repOK();
    roops.core.testingCoverage.base.BinTreeNode var37 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var38 = var35.remove(var37);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var35, 1);
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var41);
    roops.core.testingCoverage.base.BinTreeNode var43 = var8.remove(var41);
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var45 = var44.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var46 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, 1);
    var46.add(10);
    var46.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var46.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var44.remove(var56);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var56);
    roops.core.testingCoverage.base.BinTreeNode var59 = var0.remove(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  TestCoverageTool.pathReport(var0);}

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var9, 1);
    var9.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.base.BinTreeNode var24 = var16.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var33 = var32.repOK();
    roops.core.testingCoverage.base.BinTreeNode var34 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var35 = var32.remove(var34);
    roops.core.testingCoverage.base.BinTreeNode var36 = var28.remove(var34);
    roops.core.testingCoverage.path.BinTreeRemove var37 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var38 = var37.repOK();
    roops.core.testingCoverage.base.BinTreeNode var39 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var40 = var37.remove(var39);
    roops.core.testingCoverage.path.BinTreeRemove var41 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var42 = var41.repOK();
    roops.core.testingCoverage.base.BinTreeNode var43 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var44 = var41.remove(var43);
    roops.core.testingCoverage.base.BinTreeNode var45 = var37.remove(var43);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var28, var43);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var26, var43);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var43);
    roops.core.testingCoverage.base.BinTreeNode var49 = var0.remove(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  TestCoverageTool.pathReport(var0);}

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    boolean var18 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    var19.add(10);
    var19.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var19.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var33 = var9.remove(var32);
    var9.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.base.BinTreeNode var38 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var39 = var36.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, 1);
    roops.core.testingCoverage.base.BinTreeNode var42 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var36, var42);
    roops.core.testingCoverage.base.BinTreeNode var44 = var9.remove(var42);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  TestCoverageTool.pathReport(var0);}

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    boolean var10 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  TestCoverageTool.pathReport(var0);}

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var32, (-1));
    var32.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var37 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var38 = var37.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var40 = var39.repOK();
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var42 = var39.remove(var41);
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var44 = var43.repOK();
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var43.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var39.remove(var45);
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var49 = var48.repOK();
    roops.core.testingCoverage.base.BinTreeNode var50 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var51 = var48.remove(var50);
    roops.core.testingCoverage.path.BinTreeRemove var52 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var53 = var52.repOK();
    roops.core.testingCoverage.base.BinTreeNode var54 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var55 = var52.remove(var54);
    roops.core.testingCoverage.base.BinTreeNode var56 = var48.remove(var54);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var39, var54);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var37, var54);
    boolean var59 = var37.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, 1);
    var60.add(10);
    var60.add(0);
    boolean var69 = var60.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var70 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, 1);
    var70.add(10);
    var70.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var79 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var80 = var79.repOK();
    roops.core.testingCoverage.base.BinTreeNode var81 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var82 = var79.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var83 = var70.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var84 = var60.remove(var83);
    roops.core.testingCoverage.base.BinTreeNode var85 = var37.remove(var84);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var32, var84);
    roops.core.testingCoverage.base.BinTreeNode var87 = var0.remove(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  TestCoverageTool.pathReport(var0);}

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.base.BinTreeNode var8 = var0.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.base.BinTreeNode var17 = var9.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var15);
    boolean var19 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var20, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var20, 1);
    var20.add(10);
    var20.add(0);
    boolean var29 = var20.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var30 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var30, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var30, 1);
    var30.add(10);
    var30.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var40 = var39.repOK();
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var42 = var39.remove(var41);
    roops.core.testingCoverage.base.BinTreeNode var43 = var30.remove(var41);
    roops.core.testingCoverage.base.BinTreeNode var44 = var20.remove(var43);
    var20.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var47 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var48 = var47.repOK();
    roops.core.testingCoverage.base.BinTreeNode var49 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var50 = var47.remove(var49);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var47, 1);
    roops.core.testingCoverage.base.BinTreeNode var53 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var47, var53);
    roops.core.testingCoverage.base.BinTreeNode var55 = var20.remove(var53);
    roops.core.testingCoverage.path.BinTreeRemove var56 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var56, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var56, 1);
    var56.add(10);
    var56.add(0);
    boolean var65 = var56.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var66 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var66, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var66, 1);
    var66.add(10);
    var66.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var75 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var76 = var75.repOK();
    roops.core.testingCoverage.base.BinTreeNode var77 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var78 = var75.remove(var77);
    roops.core.testingCoverage.base.BinTreeNode var79 = var66.remove(var77);
    roops.core.testingCoverage.base.BinTreeNode var80 = var56.remove(var79);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var20, var79);
    roops.core.testingCoverage.base.BinTreeNode var82 = var0.remove(var79);
    boolean var83 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);

  TestCoverageTool.pathReport(var0);}

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    var0.add(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  TestCoverageTool.pathReport(var0);}

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.base.BinTreeNode var17 = var9.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var19 = var18.repOK();
    roops.core.testingCoverage.base.BinTreeNode var20 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var21 = var18.remove(var20);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.base.BinTreeNode var26 = var18.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var24);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var7, var24);
    var7.add(0);
    var7.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var35, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var35, 1);
    var35.add(10);
    var35.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var44 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var45 = var35.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var46 = var33.remove(var45);
    roops.core.testingCoverage.path.BinTreeRemove var47 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var48 = var47.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var49 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var50 = var49.repOK();
    roops.core.testingCoverage.base.BinTreeNode var51 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var52 = var49.remove(var51);
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var49.remove(var55);
    roops.core.testingCoverage.path.BinTreeRemove var58 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var59 = var58.repOK();
    roops.core.testingCoverage.base.BinTreeNode var60 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var61 = var58.remove(var60);
    roops.core.testingCoverage.path.BinTreeRemove var62 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var63 = var62.repOK();
    roops.core.testingCoverage.base.BinTreeNode var64 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var65 = var62.remove(var64);
    roops.core.testingCoverage.base.BinTreeNode var66 = var58.remove(var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var49, var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var47, var64);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var47, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var71 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var71, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var71, 1);
    var71.add(10);
    var71.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var80 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var81 = var71.remove(var80);
    roops.core.testingCoverage.base.BinTreeNode var82 = var47.remove(var80);
    roops.core.testingCoverage.base.BinTreeNode var83 = var33.remove(var82);
    roops.core.testingCoverage.base.BinTreeNode var84 = var7.remove(var83);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  TestCoverageTool.pathReport(var0);}

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    var9.add(10);
    var9.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, 1);
    var18.add(10);
    var18.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.base.BinTreeNode var35 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var36 = var33.remove(var35);
    roops.core.testingCoverage.base.BinTreeNode var37 = var29.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var39 = var38.repOK();
    roops.core.testingCoverage.base.BinTreeNode var40 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var41 = var38.remove(var40);
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var43 = var42.repOK();
    roops.core.testingCoverage.base.BinTreeNode var44 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var45 = var42.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var46 = var38.remove(var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var29, var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var44);
    roops.core.testingCoverage.base.BinTreeNode var49 = var18.remove(var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var49);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var49);
    boolean var53 = var0.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  TestCoverageTool.pathReport(var0);}

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var27);
    boolean var29 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  TestCoverageTool.pathReport(var0);}

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, 1);
    var2.add(10);
    var2.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var2.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var12);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  TestCoverageTool.pathReport(var0);}

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove var14 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.base.BinTreeNode var25 = var17.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove var30 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var31 = var30.repOK();
    roops.core.testingCoverage.base.BinTreeNode var32 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var33 = var30.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var26.remove(var32);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var17, var32);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var15, var32);
    boolean var37 = var15.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add(0);
    boolean var47 = var38.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, 1);
    var48.add(10);
    var48.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var57 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var58 = var57.repOK();
    roops.core.testingCoverage.base.BinTreeNode var59 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var60 = var57.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var48.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var62 = var38.remove(var61);
    roops.core.testingCoverage.base.BinTreeNode var63 = var15.remove(var62);
    roops.core.testingCoverage.base.BinTreeNode var64 = var14.remove(var63);
    roops.core.testingCoverage.base.BinTreeNode var65 = var0.remove(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  TestCoverageTool.pathReport(var0);}

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    boolean var32 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  TestCoverageTool.pathReport(var0);}

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    var24.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var34 = var24.remove(var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  TestCoverageTool.pathReport(var0);}

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, (-1));
    var8.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var15.remove(var21);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var24.remove(var30);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var15, var30);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var30);
    boolean var35 = var13.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, 1);
    var36.add(10);
    var36.add(0);
    boolean var45 = var36.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var46 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, 1);
    var46.add(10);
    var46.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var55 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var56 = var55.repOK();
    roops.core.testingCoverage.base.BinTreeNode var57 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var58 = var55.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var46.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var60 = var36.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var13.remove(var60);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var60);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var60);
    var0.add(100);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  TestCoverageTool.pathReport(var0);}

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var0.remove(var9);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  TestCoverageTool.pathReport(var0);}

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var0.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  TestCoverageTool.pathReport(var0);}

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var11 = var10.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var12, var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var10, var27);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var43 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var44 = var34.remove(var43);
    roops.core.testingCoverage.base.BinTreeNode var45 = var10.remove(var43);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var45);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    boolean var50 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  TestCoverageTool.pathReport(var0);}

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.base.BinTreeNode var8 = var0.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    boolean var30 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var31 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var31, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var31, 1);
    var31.add(10);
    var31.add(0);
    boolean var40 = var31.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var41 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var41, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var41, 1);
    var41.add(10);
    var41.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var50 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var51 = var50.repOK();
    roops.core.testingCoverage.base.BinTreeNode var52 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var53 = var50.remove(var52);
    roops.core.testingCoverage.base.BinTreeNode var54 = var41.remove(var52);
    roops.core.testingCoverage.base.BinTreeNode var55 = var31.remove(var54);
    var31.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var58 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var59 = var58.repOK();
    roops.core.testingCoverage.base.BinTreeNode var60 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var61 = var58.remove(var60);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var58, 1);
    roops.core.testingCoverage.base.BinTreeNode var64 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var58, var64);
    roops.core.testingCoverage.base.BinTreeNode var66 = var31.remove(var64);
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var67, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var67, 1);
    var67.add(10);
    var67.add(0);
    boolean var76 = var67.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var77 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var77, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var77, 1);
    var77.add(10);
    var77.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var86 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var87 = var86.repOK();
    roops.core.testingCoverage.base.BinTreeNode var88 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var89 = var86.remove(var88);
    roops.core.testingCoverage.base.BinTreeNode var90 = var77.remove(var88);
    roops.core.testingCoverage.base.BinTreeNode var91 = var67.remove(var90);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var31, var90);
    roops.core.testingCoverage.base.BinTreeNode var93 = var11.remove(var90);
    roops.core.testingCoverage.base.BinTreeNode var94 = var0.remove(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  TestCoverageTool.pathReport(var0);}

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(100);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  TestCoverageTool.pathReport(var0);}

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var12, var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var27);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var33 = var32.repOK();
    roops.core.testingCoverage.base.BinTreeNode var34 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var35 = var32.remove(var34);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.base.BinTreeNode var38 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var39 = var36.remove(var38);
    roops.core.testingCoverage.base.BinTreeNode var40 = var32.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var40);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var40);
    var0.add(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  TestCoverageTool.pathReport(var0);}

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(0);
    boolean var8 = var0.contains(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  TestCoverageTool.pathReport(var0);}

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    boolean var11 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  TestCoverageTool.pathReport(var0);}

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    boolean var27 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  TestCoverageTool.pathReport(var0);}

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    boolean var10 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  TestCoverageTool.pathReport(var0);}

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, 1);
    var36.add(10);
    var36.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var36.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var0.remove(var45);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  TestCoverageTool.pathReport(var0);}

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  TestCoverageTool.pathReport(var0);}

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    var0.add(1);

  TestCoverageTool.pathReport(var0);}

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.base.BinTreeNode var8 = var0.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var9.remove(var11);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.base.BinTreeNode var17 = var9.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var15);
    boolean var19 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  TestCoverageTool.pathReport(var0);}

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    boolean var9 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  TestCoverageTool.pathReport(var0);}

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var27 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  TestCoverageTool.pathReport(var0);}

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    boolean var32 = var24.contains(0);
    var24.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.base.BinTreeNode var38 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var39 = var36.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove var40 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var41 = var40.repOK();
    roops.core.testingCoverage.base.BinTreeNode var42 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var43 = var40.remove(var42);
    roops.core.testingCoverage.base.BinTreeNode var44 = var36.remove(var42);
    roops.core.testingCoverage.path.BinTreeRemove var45 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var46 = var45.repOK();
    roops.core.testingCoverage.base.BinTreeNode var47 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var48 = var45.remove(var47);
    roops.core.testingCoverage.path.BinTreeRemove var49 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var50 = var49.repOK();
    roops.core.testingCoverage.base.BinTreeNode var51 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var52 = var49.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var45.remove(var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var36, var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var51);
    roops.core.testingCoverage.path.BinTreeRemove var56 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var57 = var56.repOK();
    roops.core.testingCoverage.base.BinTreeNode var58 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var59 = var56.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var61 = var60.repOK();
    roops.core.testingCoverage.base.BinTreeNode var62 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var63 = var60.remove(var62);
    roops.core.testingCoverage.base.BinTreeNode var64 = var56.remove(var62);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var24, var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var64);
    roops.core.testingCoverage.path.BinTreeRemove var68 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var68, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var68, 1);
    var68.add(10);
    var68.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var77 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var78 = var77.repOK();
    roops.core.testingCoverage.base.BinTreeNode var79 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var80 = var77.remove(var79);
    roops.core.testingCoverage.base.BinTreeNode var81 = var68.remove(var79);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  TestCoverageTool.pathReport(var0);}

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    var0.add(0);
    boolean var8 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  TestCoverageTool.pathReport(var0);}

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var47 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var48 = var38.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var49 = var36.remove(var48);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var48);
    var0.add(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  TestCoverageTool.pathReport(var0);}

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    boolean var26 = var0.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  TestCoverageTool.pathReport(var0);}

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    boolean var39 = var0.contains(100);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var43 = var42.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var45 = var44.repOK();
    roops.core.testingCoverage.base.BinTreeNode var46 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var47 = var44.remove(var46);
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var49 = var48.repOK();
    roops.core.testingCoverage.base.BinTreeNode var50 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var51 = var48.remove(var50);
    roops.core.testingCoverage.base.BinTreeNode var52 = var44.remove(var50);
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.path.BinTreeRemove var57 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var58 = var57.repOK();
    roops.core.testingCoverage.base.BinTreeNode var59 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var60 = var57.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var53.remove(var59);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var44, var59);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var42, var59);
    roops.core.testingCoverage.base.BinTreeNode var64 = var0.remove(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  TestCoverageTool.pathReport(var0);}

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var32, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var32, 1);
    var32.add(10);
    var32.add(0);
    boolean var41 = var32.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var42, 1);
    var42.add(10);
    var42.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var51 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var52 = var51.repOK();
    roops.core.testingCoverage.base.BinTreeNode var53 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var54 = var51.remove(var53);
    roops.core.testingCoverage.base.BinTreeNode var55 = var42.remove(var53);
    roops.core.testingCoverage.base.BinTreeNode var56 = var32.remove(var55);
    var32.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var59 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var60 = var59.repOK();
    roops.core.testingCoverage.base.BinTreeNode var61 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var62 = var59.remove(var61);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var59, 1);
    roops.core.testingCoverage.base.BinTreeNode var65 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var59, var65);
    roops.core.testingCoverage.base.BinTreeNode var67 = var32.remove(var65);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var32, 10);
    roops.core.testingCoverage.path.BinTreeRemove var70 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var71 = var70.repOK();
    roops.core.testingCoverage.base.BinTreeNode var72 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var73 = var70.remove(var72);
    roops.core.testingCoverage.path.BinTreeRemove var74 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var75 = var74.repOK();
    roops.core.testingCoverage.base.BinTreeNode var76 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var77 = var74.remove(var76);
    roops.core.testingCoverage.base.BinTreeNode var78 = var70.remove(var76);
    roops.core.testingCoverage.base.BinTreeNode var79 = var32.remove(var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  TestCoverageTool.pathReport(var0);}

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    boolean var18 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    var19.add(10);
    var19.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var19.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var33 = var9.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  TestCoverageTool.pathReport(var0);}

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    var10.add(10);
    var10.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 0);
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    var19.add(10);
    var19.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, 1);
    var28.add(10);
    var28.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var37 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var38 = var37.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var40 = var39.repOK();
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var42 = var39.remove(var41);
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var44 = var43.repOK();
    roops.core.testingCoverage.base.BinTreeNode var45 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var46 = var43.remove(var45);
    roops.core.testingCoverage.base.BinTreeNode var47 = var39.remove(var45);
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var49 = var48.repOK();
    roops.core.testingCoverage.base.BinTreeNode var50 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var51 = var48.remove(var50);
    roops.core.testingCoverage.path.BinTreeRemove var52 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var53 = var52.repOK();
    roops.core.testingCoverage.base.BinTreeNode var54 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var55 = var52.remove(var54);
    roops.core.testingCoverage.base.BinTreeNode var56 = var48.remove(var54);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var39, var54);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var37, var54);
    roops.core.testingCoverage.base.BinTreeNode var59 = var28.remove(var54);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var19, var59);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var10, var59);
    roops.core.testingCoverage.path.BinTreeRemove var62 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var63 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var64 = var63.repOK();
    roops.core.testingCoverage.base.BinTreeNode var65 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var66 = var63.remove(var65);
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var68 = var67.repOK();
    roops.core.testingCoverage.base.BinTreeNode var69 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var70 = var67.remove(var69);
    roops.core.testingCoverage.base.BinTreeNode var71 = var63.remove(var69);
    roops.core.testingCoverage.path.BinTreeRemove var72 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var73 = var72.repOK();
    roops.core.testingCoverage.base.BinTreeNode var74 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var75 = var72.remove(var74);
    roops.core.testingCoverage.path.BinTreeRemove var76 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var77 = var76.repOK();
    roops.core.testingCoverage.base.BinTreeNode var78 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var79 = var76.remove(var78);
    roops.core.testingCoverage.base.BinTreeNode var80 = var72.remove(var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var63, var78);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var62, var78);
    roops.core.testingCoverage.path.BinTreeRemove var83 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var84 = var83.repOK();
    roops.core.testingCoverage.base.BinTreeNode var85 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var86 = var83.remove(var85);
    roops.core.testingCoverage.path.BinTreeRemove var87 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var88 = var87.repOK();
    roops.core.testingCoverage.base.BinTreeNode var89 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var90 = var87.remove(var89);
    roops.core.testingCoverage.base.BinTreeNode var91 = var83.remove(var89);
    roops.core.testingCoverage.base.BinTreeNode var92 = var62.remove(var91);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var10, var91);
    roops.core.testingCoverage.base.BinTreeNode var94 = var0.remove(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  TestCoverageTool.pathReport(var0);}

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    var0.add((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  TestCoverageTool.pathReport(var0);}

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    var0.add(10);
    boolean var11 = var0.contains(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  TestCoverageTool.pathReport(var0);}

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    boolean var9 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  TestCoverageTool.pathReport(var0);}

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var6);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    boolean var11 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  TestCoverageTool.pathReport(var0);}

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var9 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  TestCoverageTool.pathReport(var0);}

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, 1);
    var8.add(10);
    var8.add(0);
    boolean var17 = var8.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, 1);
    var18.add(10);
    var18.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.base.BinTreeNode var31 = var18.remove(var29);
    roops.core.testingCoverage.base.BinTreeNode var32 = var8.remove(var31);
    roops.core.testingCoverage.base.BinTreeNode var33 = var0.remove(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  TestCoverageTool.pathReport(var0);}

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var8, (-1));
    var8.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var15.remove(var21);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var24.remove(var30);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var15, var30);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var30);
    boolean var35 = var13.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, 1);
    var36.add(10);
    var36.add(0);
    boolean var45 = var36.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var46 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, 1);
    var46.add(10);
    var46.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var55 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var56 = var55.repOK();
    roops.core.testingCoverage.base.BinTreeNode var57 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var58 = var55.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var46.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var60 = var36.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var13.remove(var60);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var60);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var60);
    var0.add(100);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  TestCoverageTool.pathReport(var0);}

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var5 = var4.repOK();
    roops.core.testingCoverage.base.BinTreeNode var6 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var7 = var4.remove(var6);
    roops.core.testingCoverage.base.BinTreeNode var8 = var0.remove(var6);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.base.BinTreeNode var21 = var13.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var22.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var28);
    var11.add(0);
    var11.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var37 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var38 = var37.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, 1);
    var39.add(10);
    var39.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var48 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var49 = var39.remove(var48);
    roops.core.testingCoverage.base.BinTreeNode var50 = var37.remove(var49);
    roops.core.testingCoverage.path.BinTreeRemove var51 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var52 = var51.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.path.BinTreeRemove var57 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var58 = var57.repOK();
    roops.core.testingCoverage.base.BinTreeNode var59 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var60 = var57.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var53.remove(var59);
    roops.core.testingCoverage.path.BinTreeRemove var62 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var63 = var62.repOK();
    roops.core.testingCoverage.base.BinTreeNode var64 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var65 = var62.remove(var64);
    roops.core.testingCoverage.path.BinTreeRemove var66 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var67 = var66.repOK();
    roops.core.testingCoverage.base.BinTreeNode var68 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var69 = var66.remove(var68);
    roops.core.testingCoverage.base.BinTreeNode var70 = var62.remove(var68);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var53, var68);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var51, var68);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var51, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var75 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var75, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var75, 1);
    var75.add(10);
    var75.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var84 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var85 = var75.remove(var84);
    roops.core.testingCoverage.base.BinTreeNode var86 = var51.remove(var84);
    roops.core.testingCoverage.base.BinTreeNode var87 = var37.remove(var86);
    roops.core.testingCoverage.base.BinTreeNode var88 = var11.remove(var87);
    roops.core.testingCoverage.base.BinTreeNode var89 = var0.remove(var88);
    boolean var91 = var0.contains(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  TestCoverageTool.pathReport(var0);}

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove var30 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var31 = var30.repOK();
    roops.core.testingCoverage.base.BinTreeNode var32 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var33 = var30.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var26.remove(var32);
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var36 = var35.repOK();
    roops.core.testingCoverage.base.BinTreeNode var37 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var38 = var35.remove(var37);
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var40 = var39.repOK();
    roops.core.testingCoverage.base.BinTreeNode var41 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var42 = var39.remove(var41);
    roops.core.testingCoverage.base.BinTreeNode var43 = var35.remove(var41);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var26, var41);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var24, var41);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var41);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  TestCoverageTool.pathReport(var0);}

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    boolean var22 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var23 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var23, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var23, 1);
    var23.add(10);
    var23.add(0);
    boolean var32 = var23.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, 1);
    var33.add(10);
    var33.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var43 = var42.repOK();
    roops.core.testingCoverage.base.BinTreeNode var44 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var45 = var42.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var46 = var33.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var47 = var23.remove(var46);
    roops.core.testingCoverage.base.BinTreeNode var48 = var0.remove(var47);
    var0.add(0);
    boolean var52 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  TestCoverageTool.pathReport(var0);}

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);

  TestCoverageTool.pathReport(var0);}

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    var9.add(10);
    var9.add(0);
    boolean var18 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var19, 1);
    var19.add(10);
    var19.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var29 = var28.repOK();
    roops.core.testingCoverage.base.BinTreeNode var30 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var31 = var28.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var32 = var19.remove(var30);
    roops.core.testingCoverage.base.BinTreeNode var33 = var9.remove(var32);
    roops.core.testingCoverage.base.BinTreeNode var34 = var0.remove(var33);
    boolean var35 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  TestCoverageTool.pathReport(var0);}

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    var0.add(0);
    boolean var8 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.base.BinTreeNode var21 = var13.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var22.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var28);
    boolean var33 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add(0);
    boolean var43 = var34.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, 1);
    var44.add(10);
    var44.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var44.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var58 = var34.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var11.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, 1);
    var60.add(10);
    var60.add(0);
    boolean var69 = var60.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var70 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, 1);
    var70.add(10);
    var70.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var79 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var80 = var79.repOK();
    roops.core.testingCoverage.base.BinTreeNode var81 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var82 = var79.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var83 = var70.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var84 = var60.remove(var83);
    roops.core.testingCoverage.base.BinTreeNode var85 = var11.remove(var84);
    roops.core.testingCoverage.base.BinTreeNode var86 = var0.remove(var85);
    boolean var88 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  TestCoverageTool.pathReport(var0);}

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    var0.add(0);
    boolean var8 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.base.BinTreeNode var21 = var13.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var22.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var28);
    boolean var33 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add(0);
    boolean var43 = var34.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, 1);
    var44.add(10);
    var44.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var44.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var58 = var34.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var11.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var60, 1);
    var60.add(10);
    var60.add(0);
    boolean var69 = var60.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var70 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var70, 1);
    var70.add(10);
    var70.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var79 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var80 = var79.repOK();
    roops.core.testingCoverage.base.BinTreeNode var81 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var82 = var79.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var83 = var70.remove(var81);
    roops.core.testingCoverage.base.BinTreeNode var84 = var60.remove(var83);
    roops.core.testingCoverage.base.BinTreeNode var85 = var11.remove(var84);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  TestCoverageTool.pathReport(var0);}

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  TestCoverageTool.pathReport(var0);}

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  TestCoverageTool.pathReport(var0);}

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var36, 1);
    var36.add(10);
    var36.add(0);
    boolean var45 = var36.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var46 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var46, 1);
    var46.add(10);
    var46.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var55 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var56 = var55.repOK();
    roops.core.testingCoverage.base.BinTreeNode var57 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var58 = var55.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var46.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var60 = var36.remove(var59);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var59);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 100);
    boolean var65 = var0.contains(0);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  TestCoverageTool.pathReport(var0);}

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var10 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var11, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var11, 1);
    var11.add(10);
    var11.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var20 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var21 = var11.remove(var20);
    roops.core.testingCoverage.base.BinTreeNode var22 = var0.remove(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  TestCoverageTool.pathReport(var0);}

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(100);
    var0.add(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  TestCoverageTool.pathReport(var0);}

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 100);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  TestCoverageTool.pathReport(var0);}

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    boolean var11 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  TestCoverageTool.pathReport(var0);}

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var5 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var6 = var5.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var7 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var8 = var7.repOK();
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var7.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.base.BinTreeNode var15 = var7.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.base.BinTreeNode var24 = var16.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var7, var22);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var5, var22);
    boolean var27 = var5.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var28 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var28, 1);
    var28.add(10);
    var28.add(0);
    boolean var37 = var28.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var47 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var48 = var47.repOK();
    roops.core.testingCoverage.base.BinTreeNode var49 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var50 = var47.remove(var49);
    roops.core.testingCoverage.base.BinTreeNode var51 = var38.remove(var49);
    roops.core.testingCoverage.base.BinTreeNode var52 = var28.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var5.remove(var52);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var52);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  TestCoverageTool.pathReport(var0);}

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  TestCoverageTool.pathReport(var0);}

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(0);
    var0.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.base.BinTreeNode var20 = var12.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.base.BinTreeNode var29 = var21.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var12, var27);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var27);
    roops.core.testingCoverage.path.BinTreeRemove var32 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var33 = var32.repOK();
    roops.core.testingCoverage.base.BinTreeNode var34 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var35 = var32.remove(var34);
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.base.BinTreeNode var38 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var39 = var36.remove(var38);
    roops.core.testingCoverage.base.BinTreeNode var40 = var32.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var40);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var40);
    roops.core.testingCoverage.path.BinTreeRemove var43 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var43, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var43, 1);
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, 1);
    var48.add(10);
    var48.add(0);
    boolean var57 = var48.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var58 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var58, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var58, 1);
    var58.add(10);
    var58.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var68 = var67.repOK();
    roops.core.testingCoverage.base.BinTreeNode var69 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var70 = var67.remove(var69);
    roops.core.testingCoverage.base.BinTreeNode var71 = var58.remove(var69);
    roops.core.testingCoverage.base.BinTreeNode var72 = var48.remove(var71);
    roops.core.testingCoverage.base.BinTreeNode var73 = var43.remove(var71);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  TestCoverageTool.pathReport(var0);}

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    var24.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var34 = var24.remove(var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var39 = var0.contains(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  TestCoverageTool.pathReport(var0);}

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, 1);
    var2.add(10);
    var2.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var2.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var12);
    roops.core.testingCoverage.path.BinTreeRemove var14 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var15 = var14.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.base.BinTreeNode var18 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var19 = var16.remove(var18);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.base.BinTreeNode var24 = var16.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var26 = var25.repOK();
    roops.core.testingCoverage.base.BinTreeNode var27 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var28 = var25.remove(var27);
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.base.BinTreeNode var33 = var25.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var16, var31);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var14, var31);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var14, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var47 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var48 = var38.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var49 = var14.remove(var47);
    roops.core.testingCoverage.base.BinTreeNode var50 = var0.remove(var49);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  TestCoverageTool.pathReport(var0);}

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var2, 1);
    var2.add(10);
    var2.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var11 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var12 = var2.remove(var11);
    roops.core.testingCoverage.base.BinTreeNode var13 = var0.remove(var12);
    boolean var14 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  TestCoverageTool.pathReport(var0);}

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var9 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var10 = var0.remove(var9);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var13 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var14 = var13.repOK();
    roops.core.testingCoverage.base.BinTreeNode var15 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var16 = var13.remove(var15);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.base.BinTreeNode var21 = var13.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var26 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var27 = var26.repOK();
    roops.core.testingCoverage.base.BinTreeNode var28 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var29 = var26.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var22.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var13, var28);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var28);
    boolean var33 = var11.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var34, 1);
    var34.add(10);
    var34.add(0);
    boolean var43 = var34.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var44 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var44, 1);
    var44.add(10);
    var44.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var53 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var54 = var53.repOK();
    roops.core.testingCoverage.base.BinTreeNode var55 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var56 = var53.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var57 = var44.remove(var55);
    roops.core.testingCoverage.base.BinTreeNode var58 = var34.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var11.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var59);
    roops.core.testingCoverage.path.BinTreeRemove var61 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var62 = var61.repOK();
    roops.core.testingCoverage.base.BinTreeNode var63 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var64 = var61.remove(var63);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var61, 1);
    roops.core.testingCoverage.path.BinTreeRemove var67 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var68 = var67.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var69 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var69, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var69, 1);
    var69.add(10);
    var69.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var78 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var79 = var69.remove(var78);
    roops.core.testingCoverage.base.BinTreeNode var80 = var67.remove(var79);
    roops.core.testingCoverage.base.BinTreeNode var81 = var61.remove(var79);
    roops.core.testingCoverage.base.BinTreeNode var82 = var0.remove(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  TestCoverageTool.pathReport(var0);}

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    boolean var5 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  TestCoverageTool.pathReport(var0);}

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    boolean var27 = var0.contains(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  TestCoverageTool.pathReport(var0);}

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove var5 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var5, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var5, 1);
    var5.add(10);
    var5.add(0);
    boolean var14 = var5.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var15, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var15, 1);
    var15.add(10);
    var15.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var15.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var29 = var5.remove(var28);
    roops.core.testingCoverage.base.BinTreeNode var30 = var0.remove(var28);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var33, 1);
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var38, 1);
    var38.add(10);
    var38.add(0);
    boolean var47 = var38.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var48, 1);
    var48.add(10);
    var48.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var57 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var58 = var57.repOK();
    roops.core.testingCoverage.base.BinTreeNode var59 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var60 = var57.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var61 = var48.remove(var59);
    roops.core.testingCoverage.base.BinTreeNode var62 = var38.remove(var61);
    roops.core.testingCoverage.base.BinTreeNode var63 = var33.remove(var61);
    roops.core.testingCoverage.base.BinTreeNode var64 = var0.remove(var63);
    var0.add(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  TestCoverageTool.pathReport(var0);}

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var4 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var4, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var4, 1);
    var4.add(10);
    var4.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var4.remove(var13);
    roops.core.testingCoverage.base.BinTreeNode var15 = var2.remove(var14);
    roops.core.testingCoverage.base.BinTreeNode var16 = var0.remove(var15);
    boolean var17 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  TestCoverageTool.pathReport(var0);}

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var4 = var0.contains(1);
    var0.add(0);
    boolean var8 = var0.contains(1);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    var9.add(0);
    var9.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var36 = var35.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var37 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var37, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var37, 1);
    var37.add(10);
    var37.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var46 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var47 = var37.remove(var46);
    roops.core.testingCoverage.base.BinTreeNode var48 = var35.remove(var47);
    roops.core.testingCoverage.path.BinTreeRemove var49 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var50 = var49.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var51 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var52 = var51.repOK();
    roops.core.testingCoverage.base.BinTreeNode var53 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var54 = var51.remove(var53);
    roops.core.testingCoverage.path.BinTreeRemove var55 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var56 = var55.repOK();
    roops.core.testingCoverage.base.BinTreeNode var57 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var58 = var55.remove(var57);
    roops.core.testingCoverage.base.BinTreeNode var59 = var51.remove(var57);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var61 = var60.repOK();
    roops.core.testingCoverage.base.BinTreeNode var62 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var63 = var60.remove(var62);
    roops.core.testingCoverage.path.BinTreeRemove var64 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var65 = var64.repOK();
    roops.core.testingCoverage.base.BinTreeNode var66 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var67 = var64.remove(var66);
    roops.core.testingCoverage.base.BinTreeNode var68 = var60.remove(var66);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var51, var66);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var49, var66);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var49, (-1));
    roops.core.testingCoverage.path.BinTreeRemove var73 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var73, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var73, 1);
    var73.add(10);
    var73.add((-1));
    roops.core.testingCoverage.base.BinTreeNode var82 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var83 = var73.remove(var82);
    roops.core.testingCoverage.base.BinTreeNode var84 = var49.remove(var82);
    roops.core.testingCoverage.base.BinTreeNode var85 = var35.remove(var84);
    roops.core.testingCoverage.base.BinTreeNode var86 = var9.remove(var85);
    roops.core.testingCoverage.base.BinTreeNode var87 = var0.remove(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  TestCoverageTool.pathReport(var0);}

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    var0.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    var9.add(10);
    var9.add(1);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, 1);
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var18, 1);
    var18.add(10);
    var18.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var30 = var29.repOK();
    roops.core.testingCoverage.base.BinTreeNode var31 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var32 = var29.remove(var31);
    roops.core.testingCoverage.path.BinTreeRemove var33 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var34 = var33.repOK();
    roops.core.testingCoverage.base.BinTreeNode var35 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var36 = var33.remove(var35);
    roops.core.testingCoverage.base.BinTreeNode var37 = var29.remove(var35);
    roops.core.testingCoverage.path.BinTreeRemove var38 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var39 = var38.repOK();
    roops.core.testingCoverage.base.BinTreeNode var40 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var41 = var38.remove(var40);
    roops.core.testingCoverage.path.BinTreeRemove var42 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var43 = var42.repOK();
    roops.core.testingCoverage.base.BinTreeNode var44 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var45 = var42.remove(var44);
    roops.core.testingCoverage.base.BinTreeNode var46 = var38.remove(var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var29, var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var44);
    roops.core.testingCoverage.base.BinTreeNode var49 = var18.remove(var44);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var49);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var49);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    boolean var55 = var0.contains(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  TestCoverageTool.pathReport(var0);}

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    boolean var3 = var0.repOK();
    boolean var5 = var0.contains((-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 0);
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var15, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var15, 1);
    var15.add(10);
    var15.add(0);
    boolean var24 = var15.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var25 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var25, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var25, 1);
    var25.add(10);
    var25.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var34 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var35 = var34.repOK();
    roops.core.testingCoverage.base.BinTreeNode var36 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var37 = var34.remove(var36);
    roops.core.testingCoverage.base.BinTreeNode var38 = var25.remove(var36);
    roops.core.testingCoverage.base.BinTreeNode var39 = var15.remove(var38);
    roops.core.testingCoverage.base.BinTreeNode var40 = var10.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var40);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, (-1));
    boolean var45 = var0.contains(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  TestCoverageTool.pathReport(var0);}

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    boolean var8 = var0.contains(10);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var9, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var9, 1);
    var9.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var16 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var17 = var16.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var18 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var19 = var18.repOK();
    roops.core.testingCoverage.base.BinTreeNode var20 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var21 = var18.remove(var20);
    roops.core.testingCoverage.path.BinTreeRemove var22 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var23 = var22.repOK();
    roops.core.testingCoverage.base.BinTreeNode var24 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var25 = var22.remove(var24);
    roops.core.testingCoverage.base.BinTreeNode var26 = var18.remove(var24);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove var31 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var32 = var31.repOK();
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var34 = var31.remove(var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var27.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var18, var33);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var16, var33);
    boolean var38 = var16.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, 1);
    var39.add(10);
    var39.add(0);
    boolean var48 = var39.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var49 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var49, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var49, 1);
    var49.add(10);
    var49.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var58 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var59 = var58.repOK();
    roops.core.testingCoverage.base.BinTreeNode var60 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var61 = var58.remove(var60);
    roops.core.testingCoverage.base.BinTreeNode var62 = var49.remove(var60);
    roops.core.testingCoverage.base.BinTreeNode var63 = var39.remove(var62);
    roops.core.testingCoverage.base.BinTreeNode var64 = var16.remove(var63);
    roops.core.testingCoverage.path.BinTreeRemove var65 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var65, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var65, 1);
    var65.add(10);
    var65.add(0);
    boolean var74 = var65.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var75 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var75, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var75, 1);
    var75.add(10);
    var75.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var84 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var85 = var84.repOK();
    roops.core.testingCoverage.base.BinTreeNode var86 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var87 = var84.remove(var86);
    roops.core.testingCoverage.base.BinTreeNode var88 = var75.remove(var86);
    roops.core.testingCoverage.base.BinTreeNode var89 = var65.remove(var88);
    roops.core.testingCoverage.base.BinTreeNode var90 = var16.remove(var89);
    roops.core.testingCoverage.base.BinTreeNode var91 = var9.remove(var89);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  TestCoverageTool.pathReport(var0);}

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var24, 1);
    var24.add(10);
    boolean var32 = var24.contains(0);
    var24.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var35 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove var36 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var37 = var36.repOK();
    roops.core.testingCoverage.base.BinTreeNode var38 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var39 = var36.remove(var38);
    roops.core.testingCoverage.path.BinTreeRemove var40 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var41 = var40.repOK();
    roops.core.testingCoverage.base.BinTreeNode var42 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var43 = var40.remove(var42);
    roops.core.testingCoverage.base.BinTreeNode var44 = var36.remove(var42);
    roops.core.testingCoverage.path.BinTreeRemove var45 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var46 = var45.repOK();
    roops.core.testingCoverage.base.BinTreeNode var47 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var48 = var45.remove(var47);
    roops.core.testingCoverage.path.BinTreeRemove var49 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var50 = var49.repOK();
    roops.core.testingCoverage.base.BinTreeNode var51 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var52 = var49.remove(var51);
    roops.core.testingCoverage.base.BinTreeNode var53 = var45.remove(var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var36, var51);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var51);
    roops.core.testingCoverage.path.BinTreeRemove var56 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var57 = var56.repOK();
    roops.core.testingCoverage.base.BinTreeNode var58 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var59 = var56.remove(var58);
    roops.core.testingCoverage.path.BinTreeRemove var60 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var61 = var60.repOK();
    roops.core.testingCoverage.base.BinTreeNode var62 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var63 = var60.remove(var62);
    roops.core.testingCoverage.base.BinTreeNode var64 = var56.remove(var62);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var35, var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var24, var64);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var64);
    boolean var69 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  TestCoverageTool.pathReport(var0);}

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var2 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var3 = var2.repOK();
    roops.core.testingCoverage.base.BinTreeNode var4 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var5 = var2.remove(var4);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.base.BinTreeNode var8 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var9 = var6.remove(var8);
    roops.core.testingCoverage.base.BinTreeNode var10 = var2.remove(var8);
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var2, var17);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var17);
    boolean var22 = var0.repOK();
    boolean var23 = var0.repOK();
    boolean var25 = var0.contains(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  TestCoverageTool.pathReport(var0);}

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    boolean var37 = var0.contains((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  TestCoverageTool.pathReport(var0);}

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    roops.core.testingCoverage.path.BinTreeRemove var9 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var10 = var9.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var11 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var12 = var11.repOK();
    roops.core.testingCoverage.base.BinTreeNode var13 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var14 = var11.remove(var13);
    roops.core.testingCoverage.path.BinTreeRemove var15 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var16 = var15.repOK();
    roops.core.testingCoverage.base.BinTreeNode var17 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var18 = var15.remove(var17);
    roops.core.testingCoverage.base.BinTreeNode var19 = var11.remove(var17);
    roops.core.testingCoverage.path.BinTreeRemove var20 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var21 = var20.repOK();
    roops.core.testingCoverage.base.BinTreeNode var22 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var23 = var20.remove(var22);
    roops.core.testingCoverage.path.BinTreeRemove var24 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var25 = var24.repOK();
    roops.core.testingCoverage.base.BinTreeNode var26 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var27 = var24.remove(var26);
    roops.core.testingCoverage.base.BinTreeNode var28 = var20.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var11, var26);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var9, var26);
    roops.core.testingCoverage.base.BinTreeNode var31 = var0.remove(var26);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    boolean var34 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  TestCoverageTool.pathReport(var0);}

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 1);
    var0.add(10);
    boolean var8 = var0.contains(100);
    boolean var9 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  TestCoverageTool.pathReport(var0);}

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var1 = var0.repOK();
    roops.core.testingCoverage.base.BinTreeNode var2 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var3 = var0.remove(var2);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 100);
    roops.core.testingCoverage.path.BinTreeRemove var6 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var7 = var6.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var8 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var9 = var8.repOK();
    roops.core.testingCoverage.base.BinTreeNode var10 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var11 = var8.remove(var10);
    roops.core.testingCoverage.path.BinTreeRemove var12 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var13 = var12.repOK();
    roops.core.testingCoverage.base.BinTreeNode var14 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var15 = var12.remove(var14);
    roops.core.testingCoverage.base.BinTreeNode var16 = var8.remove(var14);
    roops.core.testingCoverage.path.BinTreeRemove var17 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var18 = var17.repOK();
    roops.core.testingCoverage.base.BinTreeNode var19 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var20 = var17.remove(var19);
    roops.core.testingCoverage.path.BinTreeRemove var21 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var22 = var21.repOK();
    roops.core.testingCoverage.base.BinTreeNode var23 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var24 = var21.remove(var23);
    roops.core.testingCoverage.base.BinTreeNode var25 = var17.remove(var23);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var8, var23);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var6, var23);
    boolean var28 = var6.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var29 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var29, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var29, 1);
    var29.add(10);
    var29.add(0);
    boolean var38 = var29.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var39 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var39, 1);
    var39.add(10);
    var39.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var48 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var49 = var48.repOK();
    roops.core.testingCoverage.base.BinTreeNode var50 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var51 = var48.remove(var50);
    roops.core.testingCoverage.base.BinTreeNode var52 = var39.remove(var50);
    roops.core.testingCoverage.base.BinTreeNode var53 = var29.remove(var52);
    roops.core.testingCoverage.base.BinTreeNode var54 = var6.remove(var53);
    roops.core.testingCoverage.path.BinTreeRemove var55 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var55, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var55, 1);
    var55.add(10);
    var55.add(0);
    boolean var64 = var55.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var65 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var65, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var65, 1);
    var65.add(10);
    var65.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var74 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var75 = var74.repOK();
    roops.core.testingCoverage.base.BinTreeNode var76 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var77 = var74.remove(var76);
    roops.core.testingCoverage.base.BinTreeNode var78 = var65.remove(var76);
    roops.core.testingCoverage.base.BinTreeNode var79 = var55.remove(var78);
    roops.core.testingCoverage.base.BinTreeNode var80 = var6.remove(var79);
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var0, var80);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  TestCoverageTool.pathReport(var0);}

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    roops.core.testingCoverage.path.BinTreeRemove var0 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var0, 1);
    var0.add(10);
    var0.add(0);
    boolean var9 = var0.repOK();
    roops.core.testingCoverage.path.BinTreeRemove var10 = new roops.core.testingCoverage.path.BinTreeRemove();
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, (-1));
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var10, 1);
    var10.add(10);
    var10.add((-1));
    roops.core.testingCoverage.path.BinTreeRemove var19 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var20 = var19.repOK();
    roops.core.testingCoverage.base.BinTreeNode var21 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var22 = var19.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var23 = var10.remove(var21);
    roops.core.testingCoverage.base.BinTreeNode var24 = var0.remove(var23);
    var0.add(10);
    roops.core.testingCoverage.path.BinTreeRemove var27 = new roops.core.testingCoverage.path.BinTreeRemove();
    boolean var28 = var27.repOK();
    roops.core.testingCoverage.base.BinTreeNode var29 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.base.BinTreeNode var30 = var27.remove(var29);
    roops.core.testingCoverage.path.BinTreeRemove.addTest(var27, 1);
    roops.core.testingCoverage.base.BinTreeNode var33 = new roops.core.testingCoverage.base.BinTreeNode();
    roops.core.testingCoverage.path.BinTreeRemove.removeTest(var27, var33);
    roops.core.testingCoverage.base.BinTreeNode var35 = var0.remove(var33);
    roops.core.testingCoverage.path.BinTreeRemove.containsTest(var0, 10);
    boolean var38 = var0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

    TestCoverageTool.pathReport(var0); }

}
