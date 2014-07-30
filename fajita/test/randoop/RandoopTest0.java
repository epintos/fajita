package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.removeIndex((-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    var0.setValue((java.lang.Object)(-1));
    java.lang.Object var5 = var0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1)+ "'", var5.equals((-1)));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.removeIndex(100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.removeIndex(10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.removeIndex(1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.removeIndex(0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = var19.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    var10.setValue((java.lang.Object)var20);
    var10.setValue((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var10.setPreviousNode(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = var19.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.removeIndex((-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    var36.setNextNode(var40);
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = var45.getNextNode();
    var40.setNextNode(var45);
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var50.setPreviousNode(var51);
    java.lang.Object var53 = var51.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var54.setPreviousNode(var55);
    java.lang.Object var57 = var55.getValue();
    var51.setNextNode(var55);
    var45.setValue((java.lang.Object)var55);
    var1.setNextNode(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var15.removeIndex(1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    java.lang.Object var18 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = var10.getPreviousNode();
    var1.setValue((java.lang.Object)var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = var10.getNextNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var22.setPreviousNode(var23);
    java.lang.Object var25 = var23.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    var23.setNextNode(var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    java.lang.Object var34 = var32.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = var32.getNextNode();
    var27.setNextNode(var32);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    java.lang.Object var40 = var38.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    var38.setNextNode(var42);
    var32.setValue((java.lang.Object)var42);
    var10.setPreviousNode(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var8.setPreviousNode(var9);
    java.lang.Object var11 = var9.getValue();
    var5.setNextNode(var9);
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    var14.setNextNode(var18);
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var22.setPreviousNode(var23);
    java.lang.Object var25 = var23.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = var23.getNextNode();
    var18.setNextNode(var23);
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    var29.setNextNode(var33);
    var23.setValue((java.lang.Object)var33);
    var5.setValue((java.lang.Object)var23);
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    var40.setNextNode(var44);
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    var49.setNextNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var58 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var57.setPreviousNode(var58);
    java.lang.Object var60 = var58.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = var58.getNextNode();
    var53.setNextNode(var58);
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var67.setPreviousNode(var68);
    java.lang.Object var70 = var68.getValue();
    var64.setNextNode(var68);
    var58.setValue((java.lang.Object)var68);
    var40.setValue((java.lang.Object)var58);
    var23.setPreviousNode(var40);
    java.lang.Object var75 = var40.getValue();
    var1.setNextNode(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    var5.setValue((java.lang.Object)(-1L));
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var21.setPreviousNode(var22);
    java.lang.Object var24 = var22.getValue();
    var18.setNextNode(var22);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = var36.getNextNode();
    var31.setNextNode(var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var45.setPreviousNode(var46);
    java.lang.Object var48 = var46.getValue();
    var42.setNextNode(var46);
    var36.setValue((java.lang.Object)var46);
    var18.setValue((java.lang.Object)var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var56.setPreviousNode(var57);
    java.lang.Object var59 = var57.getValue();
    var53.setNextNode(var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var65.setPreviousNode(var66);
    java.lang.Object var68 = var66.getValue();
    var62.setNextNode(var66);
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var70.setPreviousNode(var71);
    java.lang.Object var73 = var71.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = var71.getNextNode();
    var66.setNextNode(var71);
    roops.core.objectsInstrumented2.base.LinkedListNode var76 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var76.setPreviousNode(var77);
    java.lang.Object var79 = var77.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var80 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var81 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var80.setPreviousNode(var81);
    java.lang.Object var83 = var81.getValue();
    var77.setNextNode(var81);
    var71.setValue((java.lang.Object)var81);
    var53.setValue((java.lang.Object)var71);
    var36.setPreviousNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var88 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var89 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var88.setPreviousNode(var89);
    java.lang.Object var91 = var89.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var92 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var93 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var92.setPreviousNode(var93);
    java.lang.Object var95 = var93.getValue();
    var89.setNextNode(var93);
    var53.setNextNode(var89);
    var5.setValue((java.lang.Object)var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var99 = var53.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    boolean var24 = var0.contains((java.lang.Object)false);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    boolean var41 = var0.addLast((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var5.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var7 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var8.setPreviousNode(var9);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var7, (java.lang.Object)var8);
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var8.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var12.getPreviousNode();
    var5.setPreviousNode(var12);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    java.lang.Object var33 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = var25.getPreviousNode();
    var16.setValue((java.lang.Object)var25);
    var5.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var34);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    boolean var24 = var0.contains((java.lang.Object)false);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)100L);
    roops.core.objectsInstrumented2.core.LinkedList var27 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var29 = var27.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    java.lang.Object var26 = var24.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    java.lang.Object var30 = var28.getValue();
    var24.setNextNode(var28);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = var42.getNextNode();
    var37.setNextNode(var42);
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var47.setPreviousNode(var48);
    java.lang.Object var50 = var48.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var51.setPreviousNode(var52);
    java.lang.Object var54 = var52.getValue();
    var48.setNextNode(var52);
    var42.setValue((java.lang.Object)var52);
    var24.setValue((java.lang.Object)var42);
    boolean var58 = var15.addLast((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    var1.setValue((java.lang.Object)1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    java.lang.Object var34 = var27.getValue();
    java.lang.Object var35 = var27.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    boolean var24 = var0.contains((java.lang.Object)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var0.removeIndex(10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.core.LinkedList var5 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var7 = var5.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var5, (java.lang.Object)0L);
    boolean var11 = var5.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var5, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    var14.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var5, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var20 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var22 = var20.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var20, (java.lang.Object)0L);
    boolean var26 = var20.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var5, (java.lang.Object)var20);
    boolean var29 = var5.contains((java.lang.Object)false);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var5, (java.lang.Object)100L);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var34 = var0.removeIndex(100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = var42.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var44 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var45.setPreviousNode(var46);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var44, (java.lang.Object)var45);
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = var45.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = var49.getPreviousNode();
    var42.setPreviousNode(var49);
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var56.setPreviousNode(var57);
    java.lang.Object var59 = var57.getValue();
    var53.setNextNode(var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var65.setPreviousNode(var66);
    java.lang.Object var68 = var66.getValue();
    var62.setNextNode(var66);
    java.lang.Object var70 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = var62.getPreviousNode();
    var53.setValue((java.lang.Object)var62);
    var42.setValue((java.lang.Object)var62);
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = var42.getNextNode();
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var33.setPreviousNode(var34);
    java.lang.Object var36 = var34.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = var34.getNextNode();
    var29.setNextNode(var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    var40.setNextNode(var44);
    var34.setValue((java.lang.Object)var44);
    var16.setValue((java.lang.Object)var34);
    boolean var50 = var0.addLast((java.lang.Object)var16);
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var51.setPreviousNode(var52);
    java.lang.Object var54 = var52.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var55.setPreviousNode(var56);
    java.lang.Object var58 = var56.getValue();
    var52.setNextNode(var56);
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var60.setPreviousNode(var61);
    java.lang.Object var63 = var61.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = var61.getNextNode();
    var56.setNextNode(var61);
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var66.setPreviousNode(var67);
    java.lang.Object var69 = var67.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var70.setPreviousNode(var71);
    java.lang.Object var73 = var71.getValue();
    var67.setNextNode(var71);
    var61.setValue((java.lang.Object)var71);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var71);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var37);
    boolean var43 = var0.contains((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    roops.core.objectsInstrumented2.core.LinkedList var23 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var23, (java.lang.Object)var24);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var23, (java.lang.Object)1.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var34.setPreviousNode(var35);
    java.lang.Object var37 = var35.getValue();
    var31.setNextNode(var35);
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    var40.setNextNode(var44);
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = var49.getNextNode();
    var44.setNextNode(var49);
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var54.setPreviousNode(var55);
    java.lang.Object var57 = var55.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var58 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var58.setPreviousNode(var59);
    java.lang.Object var61 = var59.getValue();
    var55.setNextNode(var59);
    var49.setValue((java.lang.Object)var59);
    var31.setValue((java.lang.Object)var49);
    java.lang.Object var65 = var49.getValue();
    boolean var66 = var23.addLast(var65);
    boolean var67 = var0.contains(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var3.setPreviousNode(var4);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var3);
    java.lang.Object var8 = var0.removeIndex(0);
    roops.core.objectsInstrumented2.core.LinkedList var9 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var10.setPreviousNode(var11);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var9, (java.lang.Object)var10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var9, (java.lang.Object)1.0f);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var9);
    roops.core.objectsInstrumented2.core.LinkedList var17 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var19 = var17.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var17, (java.lang.Object)0L);
    boolean var23 = var17.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var17, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    var26.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var17, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var32 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var34 = var32.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var32, (java.lang.Object)0L);
    boolean var38 = var32.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var17, (java.lang.Object)var32);
    boolean var41 = var17.contains((java.lang.Object)false);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var17, (java.lang.Object)100L);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = var5.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var5.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var7 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var8.setPreviousNode(var9);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var7, (java.lang.Object)var8);
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var8.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var12.getPreviousNode();
    var5.setPreviousNode(var12);
    boolean var15 = var0.addLast((java.lang.Object)var5);
    java.lang.Object var17 = var0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)0L);
    boolean var40 = var34.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    var43.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var49 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var51 = var49.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var49, (java.lang.Object)0L);
    boolean var55 = var49.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var49);
    java.lang.Object var57 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, var57);
    roops.core.objectsInstrumented2.core.LinkedList var59 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var60 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var60, (java.lang.Object)var61);
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = var61.getPreviousNode();
    boolean var66 = var59.addLast((java.lang.Object)var61);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var61);
    roops.core.objectsInstrumented2.core.LinkedList var68 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var70 = var68.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var71.setPreviousNode(var72);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var68, (java.lang.Object)var71);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var68);
    boolean var76 = var0.contains((java.lang.Object)var68);
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var77.setPreviousNode(var78);
    java.lang.Object var80 = var78.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var81 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var82 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var81.setPreviousNode(var82);
    java.lang.Object var84 = var82.getValue();
    var78.setNextNode(var82);
    roops.core.objectsInstrumented2.base.LinkedListNode var86 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var87 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var86.setPreviousNode(var87);
    java.lang.Object var89 = var87.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var90 = var87.getNextNode();
    var82.setNextNode(var87);
    boolean var92 = var0.contains((java.lang.Object)var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)0L);
    boolean var40 = var34.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    var43.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var49 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var51 = var49.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var49, (java.lang.Object)0L);
    boolean var55 = var49.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var49);
    java.lang.Object var57 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    var60.setNextNode(var64);
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var69 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var68.setPreviousNode(var69);
    java.lang.Object var71 = var69.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var72.setPreviousNode(var73);
    java.lang.Object var75 = var73.getValue();
    var69.setNextNode(var73);
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var77.setPreviousNode(var78);
    java.lang.Object var80 = var78.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var81 = var78.getNextNode();
    var73.setNextNode(var78);
    roops.core.objectsInstrumented2.base.LinkedListNode var83 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var84 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var83.setPreviousNode(var84);
    java.lang.Object var86 = var84.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var87 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var88 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var87.setPreviousNode(var88);
    java.lang.Object var90 = var88.getValue();
    var84.setNextNode(var88);
    var78.setValue((java.lang.Object)var88);
    var60.setValue((java.lang.Object)var78);
    boolean var94 = var34.addLast((java.lang.Object)var78);
    var27.setValue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var42.setPreviousNode(var43);
    java.lang.Object var45 = var43.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var46.setPreviousNode(var47);
    java.lang.Object var49 = var47.getValue();
    var43.setNextNode(var47);
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var51.setPreviousNode(var52);
    java.lang.Object var54 = var52.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var55.setPreviousNode(var56);
    java.lang.Object var58 = var56.getValue();
    var52.setNextNode(var56);
    java.lang.Object var60 = var52.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = var52.getPreviousNode();
    var43.setValue((java.lang.Object)var52);
    boolean var63 = var0.addLast((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    boolean var10 = var0.contains((java.lang.Object)'a');
    roops.core.objectsInstrumented2.core.LinkedList var11 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var13 = var11.contains((java.lang.Object)10);
    boolean var14 = var0.addLast((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var11.removeIndex(0);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    var10.setValue((java.lang.Object)var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = var20.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var1 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var2.setPreviousNode(var3);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var1, (java.lang.Object)var2);
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var2.getPreviousNode();
    boolean var7 = var0.addLast((java.lang.Object)var2);
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var10 = var8.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var8, (java.lang.Object)0L);
    boolean var14 = var8.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var17 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var19 = var17.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var17, (java.lang.Object)var20);
    boolean var24 = var8.contains((java.lang.Object)var20);
    java.lang.Object var25 = var20.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    var36.setNextNode(var40);
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = var45.getNextNode();
    var40.setNextNode(var45);
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var50.setPreviousNode(var51);
    java.lang.Object var53 = var51.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var54.setPreviousNode(var55);
    java.lang.Object var57 = var55.getValue();
    var51.setNextNode(var55);
    var45.setValue((java.lang.Object)var55);
    var27.setValue((java.lang.Object)var45);
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var65.setPreviousNode(var66);
    java.lang.Object var68 = var66.getValue();
    var62.setNextNode(var66);
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var70.setPreviousNode(var71);
    java.lang.Object var73 = var71.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var75 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var74.setPreviousNode(var75);
    java.lang.Object var77 = var75.getValue();
    var71.setNextNode(var75);
    roops.core.objectsInstrumented2.base.LinkedListNode var79 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var80 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var79.setPreviousNode(var80);
    java.lang.Object var82 = var80.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var83 = var80.getNextNode();
    var75.setNextNode(var80);
    roops.core.objectsInstrumented2.base.LinkedListNode var85 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var86 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var85.setPreviousNode(var86);
    java.lang.Object var88 = var86.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var89 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var90 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var89.setPreviousNode(var90);
    java.lang.Object var92 = var90.getValue();
    var86.setNextNode(var90);
    var80.setValue((java.lang.Object)var90);
    var62.setValue((java.lang.Object)var80);
    var45.setPreviousNode(var62);
    var20.setValue((java.lang.Object)var45);
    boolean var98 = var0.addLast((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    var5.setValue((java.lang.Object)(-1L));
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var21.setPreviousNode(var22);
    java.lang.Object var24 = var22.getValue();
    var18.setNextNode(var22);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = var36.getNextNode();
    var31.setNextNode(var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var45.setPreviousNode(var46);
    java.lang.Object var48 = var46.getValue();
    var42.setNextNode(var46);
    var36.setValue((java.lang.Object)var46);
    var18.setValue((java.lang.Object)var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var56.setPreviousNode(var57);
    java.lang.Object var59 = var57.getValue();
    var53.setNextNode(var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var65.setPreviousNode(var66);
    java.lang.Object var68 = var66.getValue();
    var62.setNextNode(var66);
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var70.setPreviousNode(var71);
    java.lang.Object var73 = var71.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = var71.getNextNode();
    var66.setNextNode(var71);
    roops.core.objectsInstrumented2.base.LinkedListNode var76 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var76.setPreviousNode(var77);
    java.lang.Object var79 = var77.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var80 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var81 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var80.setPreviousNode(var81);
    java.lang.Object var83 = var81.getValue();
    var77.setNextNode(var81);
    var71.setValue((java.lang.Object)var81);
    var53.setValue((java.lang.Object)var71);
    var36.setPreviousNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var88 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var89 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var88.setPreviousNode(var89);
    java.lang.Object var91 = var89.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var92 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var93 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var92.setPreviousNode(var93);
    java.lang.Object var95 = var93.getValue();
    var89.setNextNode(var93);
    var53.setNextNode(var89);
    var5.setValue((java.lang.Object)var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var99 = var5.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = var1.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var5.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = var5.getNextNode();
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)var9);
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var9.getPreviousNode();
    var5.setPreviousNode(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    var36.setNextNode(var40);
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    var45.setNextNode(var49);
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    java.lang.Object var56 = var54.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = var54.getNextNode();
    var49.setNextNode(var54);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    var60.setNextNode(var64);
    var54.setValue((java.lang.Object)var64);
    var36.setValue((java.lang.Object)var54);
    var19.setPreviousNode(var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = var36.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    java.lang.Object var18 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = var10.getPreviousNode();
    var1.setValue((java.lang.Object)var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = var10.getNextNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var22.setPreviousNode(var23);
    java.lang.Object var25 = var23.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    var23.setNextNode(var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    java.lang.Object var34 = var32.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = var32.getNextNode();
    var27.setNextNode(var32);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    java.lang.Object var40 = var38.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    var38.setNextNode(var42);
    var32.setValue((java.lang.Object)var42);
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var42.setNextNode(var47);
    var21.setPreviousNode(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    roops.core.objectsInstrumented2.core.LinkedList var3 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var5 = var3.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var3, (java.lang.Object)0L);
    boolean var9 = var3.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var3, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var12 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var14 = var12.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var12, (java.lang.Object)var15);
    boolean var19 = var3.contains((java.lang.Object)var15);
    java.lang.Object var20 = var15.getValue();
    var0.setPreviousNode(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    var10.setValue((java.lang.Object)var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setNextNode(var25);
    java.lang.Object var27 = var20.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    var36.setNextNode(var40);
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    var45.setNextNode(var49);
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    java.lang.Object var56 = var54.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = var54.getNextNode();
    var49.setNextNode(var54);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    var60.setNextNode(var64);
    var54.setValue((java.lang.Object)var64);
    var36.setValue((java.lang.Object)var54);
    var19.setPreviousNode(var36);
    java.lang.Object var71 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = var36.getNextNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var73.setPreviousNode(var74);
    var73.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = var73.getNextNode();
    var72.setPreviousNode(var73);
    java.lang.Object var80 = var72.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var19.getNextNode();
    var14.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    var19.setValue((java.lang.Object)var29);
    var1.setValue((java.lang.Object)var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    var36.setNextNode(var40);
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    var45.setNextNode(var49);
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    java.lang.Object var56 = var54.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = var54.getNextNode();
    var49.setNextNode(var54);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    var60.setNextNode(var64);
    var54.setValue((java.lang.Object)var64);
    var36.setValue((java.lang.Object)var54);
    var19.setPreviousNode(var36);
    java.lang.Object var71 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = var36.getNextNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var73.setPreviousNode(var74);
    var73.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = var73.getNextNode();
    var72.setPreviousNode(var73);
    roops.core.objectsInstrumented2.base.LinkedListNode var80 = var72.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)1.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var7.setPreviousNode(var8);
    java.lang.Object var10 = var8.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var11.setPreviousNode(var12);
    java.lang.Object var14 = var12.getValue();
    var8.setNextNode(var12);
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    java.lang.Object var19 = var17.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    var17.setNextNode(var21);
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var25.setPreviousNode(var26);
    java.lang.Object var28 = var26.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = var26.getNextNode();
    var21.setNextNode(var26);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    java.lang.Object var34 = var32.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    var32.setNextNode(var36);
    var26.setValue((java.lang.Object)var36);
    var8.setValue((java.lang.Object)var26);
    java.lang.Object var42 = var26.getValue();
    boolean var43 = var0.addLast(var42);
    roops.core.objectsInstrumented2.core.LinkedList var44 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var45 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var46.setPreviousNode(var47);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var45, (java.lang.Object)var46);
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = var46.getPreviousNode();
    boolean var51 = var44.addLast((java.lang.Object)var46);
    roops.core.objectsInstrumented2.core.LinkedList var52 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var52, (java.lang.Object)var53);
    var46.setValue((java.lang.Object)var53);
    roops.core.objectsInstrumented2.core.LinkedList var58 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var59 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var60.setPreviousNode(var61);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var59, (java.lang.Object)var60);
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = var60.getPreviousNode();
    boolean var65 = var58.addLast((java.lang.Object)var60);
    roops.core.objectsInstrumented2.core.LinkedList var66 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var67.setPreviousNode(var68);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var66, (java.lang.Object)var67);
    var60.setValue((java.lang.Object)var67);
    var46.setNextNode(var67);
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = var67.getPreviousNode();
    boolean var74 = var0.contains((java.lang.Object)var67);
    roops.core.objectsInstrumented2.core.LinkedList var75 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var77 = var75.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var79 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var78.setPreviousNode(var79);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var75, (java.lang.Object)var78);
    java.lang.Object var83 = var75.removeIndex(0);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    var1.setValue((java.lang.Object)"");

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var15, (java.lang.Object)100L);
    java.lang.Object var26 = var15.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 100L+ "'", var26.equals(100L));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var34.setPreviousNode(var35);
    java.lang.Object var37 = var35.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var38.setPreviousNode(var39);
    java.lang.Object var41 = var39.getValue();
    var35.setNextNode(var39);
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = var44.getNextNode();
    var39.setNextNode(var44);
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var49.setPreviousNode(var50);
    java.lang.Object var52 = var50.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    java.lang.Object var56 = var54.getValue();
    var50.setNextNode(var54);
    var44.setValue((java.lang.Object)var54);
    var27.setValue((java.lang.Object)var44);
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = var44.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = var61.getPreviousNode();
    var44.setValue((java.lang.Object)var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = var1.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var6 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var7.setPreviousNode(var8);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var6, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = var7.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var11.getPreviousNode();
    var5.setNextNode(var11);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    java.lang.Object var21 = var19.getValue();
    var15.setNextNode(var19);
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    java.lang.Object var26 = var24.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    java.lang.Object var30 = var28.getValue();
    var24.setNextNode(var28);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = var33.getNextNode();
    var28.setNextNode(var33);
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var38.setPreviousNode(var39);
    java.lang.Object var41 = var39.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var42.setPreviousNode(var43);
    java.lang.Object var45 = var43.getValue();
    var39.setNextNode(var43);
    var33.setValue((java.lang.Object)var43);
    var15.setValue((java.lang.Object)var33);
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var49.setPreviousNode(var50);
    java.lang.Object var52 = var50.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    java.lang.Object var56 = var54.getValue();
    var50.setNextNode(var54);
    roops.core.objectsInstrumented2.base.LinkedListNode var58 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var58.setPreviousNode(var59);
    java.lang.Object var61 = var59.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var62.setPreviousNode(var63);
    java.lang.Object var65 = var63.getValue();
    var59.setNextNode(var63);
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var67.setPreviousNode(var68);
    java.lang.Object var70 = var68.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = var68.getNextNode();
    var63.setNextNode(var68);
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var73.setPreviousNode(var74);
    java.lang.Object var76 = var74.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var77.setPreviousNode(var78);
    java.lang.Object var80 = var78.getValue();
    var74.setNextNode(var78);
    var68.setValue((java.lang.Object)var78);
    var50.setValue((java.lang.Object)var68);
    var33.setPreviousNode(var50);
    roops.core.objectsInstrumented2.base.LinkedListNode var85 = var33.getPreviousNode();
    var11.setNextNode(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var33.setPreviousNode(var34);
    java.lang.Object var36 = var34.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = var34.getNextNode();
    var29.setNextNode(var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    var40.setNextNode(var44);
    var34.setValue((java.lang.Object)var44);
    var16.setValue((java.lang.Object)var34);
    boolean var50 = var0.addLast((java.lang.Object)var16);
    roops.core.objectsInstrumented2.core.LinkedList var51 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var53 = var51.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var51, (java.lang.Object)0L);
    boolean var57 = var51.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var51, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var60 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var62 = var60.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var60, (java.lang.Object)var63);
    boolean var67 = var51.contains((java.lang.Object)var63);
    var16.setPreviousNode(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = var1.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    java.lang.Object var35 = var0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10.0f+ "'", var35.equals(10.0f));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var5.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var7 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var8.setPreviousNode(var9);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var7, (java.lang.Object)var8);
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var8.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var12.getPreviousNode();
    var5.setPreviousNode(var12);
    boolean var15 = var0.addLast((java.lang.Object)var5);
    roops.core.objectsInstrumented2.core.LinkedList var16 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var17 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var17, (java.lang.Object)var18);
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var18.getPreviousNode();
    boolean var23 = var16.addLast((java.lang.Object)var18);
    roops.core.objectsInstrumented2.core.LinkedList var24 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var25.setPreviousNode(var26);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var24, (java.lang.Object)var25);
    var18.setValue((java.lang.Object)var25);
    var5.setPreviousNode(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var1 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var2.setPreviousNode(var3);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var1, (java.lang.Object)var2);
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var2.getPreviousNode();
    boolean var7 = var0.addLast((java.lang.Object)var2);
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)var9);
    var2.setValue((java.lang.Object)var9);
    roops.core.objectsInstrumented2.core.LinkedList var14 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var15, (java.lang.Object)var16);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = var16.getPreviousNode();
    boolean var21 = var14.addLast((java.lang.Object)var16);
    roops.core.objectsInstrumented2.core.LinkedList var22 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var22, (java.lang.Object)var23);
    var16.setValue((java.lang.Object)var23);
    var2.setNextNode(var23);
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var29.setPreviousNode(var30);
    var29.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = var29.getNextNode();
    var2.setNextNode(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var1 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var2.setPreviousNode(var3);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var1, (java.lang.Object)var2);
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var2.getPreviousNode();
    boolean var7 = var0.addLast((java.lang.Object)var2);
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)var9);
    var2.setValue((java.lang.Object)var9);
    java.lang.Object var14 = var2.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    var15.setValue((java.lang.Object)(-1));
    var2.setValue((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList var42 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var42, (java.lang.Object)var43);
    roops.core.objectsInstrumented2.base.LinkedListNode var47 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var47.setPreviousNode(var48);
    java.lang.Object var50 = var48.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var51.setPreviousNode(var52);
    java.lang.Object var54 = var52.getValue();
    var48.setNextNode(var52);
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var56.setPreviousNode(var57);
    java.lang.Object var59 = var57.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = var57.getNextNode();
    var52.setNextNode(var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var62.setPreviousNode(var63);
    java.lang.Object var65 = var63.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var66.setPreviousNode(var67);
    java.lang.Object var69 = var67.getValue();
    var63.setNextNode(var67);
    var57.setValue((java.lang.Object)var67);
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = var57.getNextNode();
    boolean var73 = var42.contains((java.lang.Object)var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var75 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var74.setPreviousNode(var75);
    java.lang.Object var77 = var75.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var79 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var78.setPreviousNode(var79);
    java.lang.Object var81 = var79.getValue();
    var75.setNextNode(var79);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var42, (java.lang.Object)var79);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    java.lang.Object var32 = var15.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.removeIndex(100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)100.0d);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)'4');

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    var5.setValue((java.lang.Object)(-1L));
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var21.setPreviousNode(var22);
    java.lang.Object var24 = var22.getValue();
    var18.setNextNode(var22);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = var36.getNextNode();
    var31.setNextNode(var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var46 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var45.setPreviousNode(var46);
    java.lang.Object var48 = var46.getValue();
    var42.setNextNode(var46);
    var36.setValue((java.lang.Object)var46);
    var18.setValue((java.lang.Object)var36);
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var56 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var56.setPreviousNode(var57);
    java.lang.Object var59 = var57.getValue();
    var53.setNextNode(var57);
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var65.setPreviousNode(var66);
    java.lang.Object var68 = var66.getValue();
    var62.setNextNode(var66);
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var70.setPreviousNode(var71);
    java.lang.Object var73 = var71.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = var71.getNextNode();
    var66.setNextNode(var71);
    roops.core.objectsInstrumented2.base.LinkedListNode var76 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var76.setPreviousNode(var77);
    java.lang.Object var79 = var77.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var80 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var81 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var80.setPreviousNode(var81);
    java.lang.Object var83 = var81.getValue();
    var77.setNextNode(var81);
    var71.setValue((java.lang.Object)var81);
    var53.setValue((java.lang.Object)var71);
    var36.setPreviousNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var88 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var89 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var88.setPreviousNode(var89);
    java.lang.Object var91 = var89.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var92 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var93 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var92.setPreviousNode(var93);
    java.lang.Object var95 = var93.getValue();
    var89.setNextNode(var93);
    var53.setNextNode(var89);
    var5.setValue((java.lang.Object)var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var99 = var5.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    boolean var10 = var0.contains((java.lang.Object)'a');
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(byte)0);
    roops.core.objectsInstrumented2.core.LinkedList var13 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var15 = var13.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var13, (java.lang.Object)0L);
    boolean var19 = var13.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var13, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var22.setPreviousNode(var23);
    var22.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var13, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var28 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var30 = var28.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var28, (java.lang.Object)0L);
    boolean var34 = var28.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var13, (java.lang.Object)var28);
    boolean var37 = var13.contains((java.lang.Object)false);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)1.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var7.setPreviousNode(var8);
    java.lang.Object var10 = var8.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var11.setPreviousNode(var12);
    java.lang.Object var14 = var12.getValue();
    var8.setNextNode(var12);
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    java.lang.Object var19 = var17.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    var17.setNextNode(var21);
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var25.setPreviousNode(var26);
    java.lang.Object var28 = var26.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = var26.getNextNode();
    var21.setNextNode(var26);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    java.lang.Object var34 = var32.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    java.lang.Object var38 = var36.getValue();
    var32.setNextNode(var36);
    var26.setValue((java.lang.Object)var36);
    var8.setValue((java.lang.Object)var26);
    java.lang.Object var42 = var26.getValue();
    boolean var43 = var0.addLast(var42);
    boolean var45 = var0.contains((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var0.removeIndex(100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    var10.setValue((java.lang.Object)var20);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var27 = var25.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var25, (java.lang.Object)var28);
    roops.core.objectsInstrumented2.core.LinkedList var32 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var34 = var32.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var35.setPreviousNode(var36);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var32, (java.lang.Object)var35);
    boolean var39 = var25.contains((java.lang.Object)var35);
    var20.setNextNode(var35);
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = var20.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    boolean var10 = var0.contains((java.lang.Object)'a');
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(byte)0);
    roops.core.objectsInstrumented2.core.LinkedList var13 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var15 = var13.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList var16 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var18 = var16.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var16, (java.lang.Object)0L);
    boolean var22 = var16.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var16, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var33 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var34.setPreviousNode(var35);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var33, (java.lang.Object)var34);
    var27.setValue((java.lang.Object)var34);
    roops.core.objectsInstrumented2.core.LinkedList var39 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var40 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var40, (java.lang.Object)var41);
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = var41.getPreviousNode();
    boolean var46 = var39.addLast((java.lang.Object)var41);
    roops.core.objectsInstrumented2.core.LinkedList var47 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var47, (java.lang.Object)var48);
    var41.setValue((java.lang.Object)var48);
    var27.setNextNode(var48);
    boolean var54 = var16.contains((java.lang.Object)var48);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var13, (java.lang.Object)var48);
    boolean var56 = var0.addLast((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var37);
    java.lang.Object var42 = var37.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    boolean var35 = var0.addLast((java.lang.Object)10L);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var5.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var7 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var8.setPreviousNode(var9);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var7, (java.lang.Object)var8);
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var8.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var12.getPreviousNode();
    var5.setPreviousNode(var12);
    boolean var15 = var0.addLast((java.lang.Object)var5);
    roops.core.objectsInstrumented2.core.LinkedList var16 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var17 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var18.setPreviousNode(var19);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var17, (java.lang.Object)var18);
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = var18.getPreviousNode();
    boolean var23 = var16.addLast((java.lang.Object)var18);
    roops.core.objectsInstrumented2.core.LinkedList var24 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var25.setPreviousNode(var26);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var24, (java.lang.Object)var25);
    var18.setValue((java.lang.Object)var25);
    var5.setValue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    java.lang.Object var15 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    java.lang.Object var19 = var17.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    var17.setNextNode(var21);
    java.lang.Object var25 = var17.getValue();
    var10.setNextNode(var17);
    java.lang.Object var27 = var17.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var1 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var2.setPreviousNode(var3);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var1, (java.lang.Object)var2);
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var2.getPreviousNode();
    boolean var7 = var0.addLast((java.lang.Object)var2);
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)var9);
    var2.setValue((java.lang.Object)var9);
    roops.core.objectsInstrumented2.core.LinkedList var14 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var15, (java.lang.Object)var16);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = var16.getPreviousNode();
    boolean var21 = var14.addLast((java.lang.Object)var16);
    roops.core.objectsInstrumented2.core.LinkedList var22 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var22, (java.lang.Object)var23);
    var16.setValue((java.lang.Object)var23);
    var2.setNextNode(var23);
    java.lang.Object var29 = var23.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var15);
    roops.core.objectsInstrumented2.core.LinkedList var19 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var21 = var19.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var19, (java.lang.Object)0L);
    boolean var25 = var19.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var19, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var28 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var30 = var28.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var28, (java.lang.Object)var31);
    boolean var35 = var19.contains((java.lang.Object)var31);
    java.lang.Object var36 = var31.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = var31.getNextNode();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var5.setPreviousNode(var6);
    java.lang.Object var8 = var6.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    var6.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var14.setPreviousNode(var15);
    java.lang.Object var17 = var15.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = var15.getNextNode();
    var10.setNextNode(var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var20.setPreviousNode(var21);
    java.lang.Object var23 = var21.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    var21.setNextNode(var25);
    var15.setValue((java.lang.Object)var25);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var15.getNextNode();
    boolean var31 = var0.contains((java.lang.Object)var15);
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var32.setPreviousNode(var33);
    java.lang.Object var35 = var33.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var36.setPreviousNode(var37);
    java.lang.Object var39 = var37.getValue();
    var33.setNextNode(var37);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList var42 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var44 = var42.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var42, (java.lang.Object)0L);
    boolean var48 = var42.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var42, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var51.setPreviousNode(var52);
    var51.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var42, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var57 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var59 = var57.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var57, (java.lang.Object)0L);
    boolean var63 = var57.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var42, (java.lang.Object)var57);
    boolean var65 = var0.contains((java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = var1.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var6 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var7.setPreviousNode(var8);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var6, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = var7.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var11.getPreviousNode();
    var5.setNextNode(var11);
    roops.core.objectsInstrumented2.core.LinkedList var14 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var16 = var14.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var14, (java.lang.Object)0L);
    boolean var20 = var14.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var14, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    var23.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var14, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var29 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var31 = var29.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var29, (java.lang.Object)0L);
    boolean var35 = var29.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var14, (java.lang.Object)var29);
    java.lang.Object var37 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var14, var37);
    roops.core.objectsInstrumented2.core.LinkedList var39 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var40 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var40, (java.lang.Object)var41);
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = var41.getPreviousNode();
    boolean var46 = var39.addLast((java.lang.Object)var41);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var14, (java.lang.Object)var41);
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    var49.setNextNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var58 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var57.setPreviousNode(var58);
    java.lang.Object var60 = var58.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = var58.getNextNode();
    var53.setNextNode(var58);
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var67.setPreviousNode(var68);
    java.lang.Object var70 = var68.getValue();
    var64.setNextNode(var68);
    var58.setValue((java.lang.Object)var68);
    var41.setValue((java.lang.Object)var58);
    var11.setValue((java.lang.Object)var41);
    roops.core.objectsInstrumented2.base.LinkedListNode var75 = var11.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var37);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var43 = var34.removeIndex((-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    boolean var10 = var0.contains((java.lang.Object)'a');
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(byte)0);
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    var14.setNextNode(var18);
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var22.setPreviousNode(var23);
    java.lang.Object var25 = var23.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    var23.setNextNode(var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var32 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var31.setPreviousNode(var32);
    java.lang.Object var34 = var32.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = var32.getNextNode();
    var27.setNextNode(var32);
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var37.setPreviousNode(var38);
    java.lang.Object var40 = var38.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    java.lang.Object var44 = var42.getValue();
    var38.setNextNode(var42);
    var32.setValue((java.lang.Object)var42);
    var14.setValue((java.lang.Object)var32);
    roops.core.objectsInstrumented2.base.LinkedListNode var48 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var49 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var48.setPreviousNode(var49);
    java.lang.Object var51 = var49.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var52 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var52.setPreviousNode(var53);
    java.lang.Object var55 = var53.getValue();
    var49.setNextNode(var53);
    roops.core.objectsInstrumented2.base.LinkedListNode var57 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var58 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var57.setPreviousNode(var58);
    java.lang.Object var60 = var58.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    java.lang.Object var64 = var62.getValue();
    var58.setNextNode(var62);
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var67 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var66.setPreviousNode(var67);
    java.lang.Object var69 = var67.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var70 = var67.getNextNode();
    var62.setNextNode(var67);
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var73 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var72.setPreviousNode(var73);
    java.lang.Object var75 = var73.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var76 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var77 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var76.setPreviousNode(var77);
    java.lang.Object var79 = var77.getValue();
    var73.setNextNode(var77);
    var67.setValue((java.lang.Object)var77);
    var49.setValue((java.lang.Object)var67);
    var32.setPreviousNode(var49);
    java.lang.Object var84 = var49.getValue();
    java.lang.Object var85 = var49.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var86 = var49.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)100.0d);
    java.lang.Object var8 = var0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var1.setPreviousNode(var2);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var1);
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = var1.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var6 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var8 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var7.setPreviousNode(var8);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var6, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = var7.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var11.getPreviousNode();
    var5.setNextNode(var11);
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = var11.getPreviousNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.removeIndex((-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var1 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var2 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var2.setPreviousNode(var3);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var1, (java.lang.Object)var2);
    roops.core.objectsInstrumented2.base.LinkedListNode var6 = var2.getPreviousNode();
    boolean var7 = var0.addLast((java.lang.Object)var2);
    roops.core.objectsInstrumented2.core.LinkedList var8 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var8, (java.lang.Object)var9);
    var2.setValue((java.lang.Object)var9);
    roops.core.objectsInstrumented2.core.LinkedList var14 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var16.setPreviousNode(var17);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var15, (java.lang.Object)var16);
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = var16.getPreviousNode();
    boolean var21 = var14.addLast((java.lang.Object)var16);
    roops.core.objectsInstrumented2.core.LinkedList var22 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var23 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var23.setPreviousNode(var24);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var22, (java.lang.Object)var23);
    var16.setValue((java.lang.Object)var23);
    var2.setNextNode(var23);
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = var23.getPreviousNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = var23.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    roops.core.objectsInstrumented2.core.LinkedList var0 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var2 = var0.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)0L);
    boolean var6 = var0.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    var9.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var15 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var17 = var15.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var15, (java.lang.Object)0L);
    boolean var21 = var15.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var0, (java.lang.Object)var15);
    java.lang.Object var23 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, var23);
    roops.core.objectsInstrumented2.core.LinkedList var25 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var26 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var27.setPreviousNode(var28);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var26, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = var27.getPreviousNode();
    boolean var32 = var25.addLast((java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var0, (java.lang.Object)var27);
    roops.core.objectsInstrumented2.core.LinkedList var34 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var36 = var34.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)0L);
    boolean var40 = var34.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    var43.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList var49 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var51 = var49.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var49, (java.lang.Object)0L);
    boolean var55 = var49.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var49);
    java.lang.Object var57 = new java.lang.Object();
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, var57);
    roops.core.objectsInstrumented2.core.LinkedList var59 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.core.LinkedList var60 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var61 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var62 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var61.setPreviousNode(var62);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var60, (java.lang.Object)var61);
    roops.core.objectsInstrumented2.base.LinkedListNode var65 = var61.getPreviousNode();
    boolean var66 = var59.addLast((java.lang.Object)var61);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var34, (java.lang.Object)var61);
    roops.core.objectsInstrumented2.core.LinkedList var68 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var70 = var68.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var71 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var71.setPreviousNode(var72);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var68, (java.lang.Object)var71);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var34, (java.lang.Object)var68);
    boolean var76 = var0.contains((java.lang.Object)var68);
    roops.core.objectsInstrumented2.core.LinkedList var77 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var79 = var77.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var77, (java.lang.Object)0L);
    boolean var83 = var77.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var77, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var86 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var88 = var86.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var89 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var90 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var89.setPreviousNode(var90);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var86, (java.lang.Object)var89);
    boolean var93 = var77.contains((java.lang.Object)var89);
    boolean var94 = var0.addLast((java.lang.Object)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var14 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var13.setPreviousNode(var14);
    java.lang.Object var16 = var14.getValue();
    var10.setNextNode(var14);
    java.lang.Object var18 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = var10.getPreviousNode();
    var1.setValue((java.lang.Object)var10);
    roops.core.objectsInstrumented2.core.LinkedList var21 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var23 = var21.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var21, (java.lang.Object)0L);
    boolean var27 = var21.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var21, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    var30.setValue((java.lang.Object)(-1));
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var21, (java.lang.Object)(-1));
    var10.setValue((java.lang.Object)var21);
    java.lang.Object var37 = var10.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    var5.setValue((java.lang.Object)(-1L));
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var21.setPreviousNode(var22);
    java.lang.Object var24 = var22.getValue();
    var18.setNextNode(var22);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    java.lang.Object var35 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = var27.getPreviousNode();
    var18.setValue((java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = var27.getNextNode();
    var5.setNextNode(var38);
    roops.core.objectsInstrumented2.core.LinkedList var40 = new roops.core.objectsInstrumented2.core.LinkedList();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var42 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var41.setPreviousNode(var42);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var40, (java.lang.Object)var41);
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = var41.getPreviousNode();
    var38.setNextNode(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    var10.setValue((java.lang.Object)var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var25.setPreviousNode(var26);
    java.lang.Object var28 = var26.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var29.setPreviousNode(var30);
    java.lang.Object var32 = var30.getValue();
    var26.setNextNode(var30);
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var35 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var34.setPreviousNode(var35);
    java.lang.Object var37 = var35.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = var35.getNextNode();
    var30.setNextNode(var35);
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var41 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var40.setPreviousNode(var41);
    java.lang.Object var43 = var41.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var45 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var44.setPreviousNode(var45);
    java.lang.Object var47 = var45.getValue();
    var41.setNextNode(var45);
    var35.setValue((java.lang.Object)var45);
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var50.setPreviousNode(var51);
    java.lang.Object var53 = var51.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var54.setPreviousNode(var55);
    java.lang.Object var57 = var55.getValue();
    var51.setNextNode(var55);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = var60.getNextNode();
    var55.setNextNode(var60);
    var35.setNextNode(var55);
    roops.core.objectsInstrumented2.base.LinkedListNode var66 = var35.getPreviousNode();
    var10.setPreviousNode(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    var5.setValue((java.lang.Object)(-1L));
    roops.core.objectsInstrumented2.base.LinkedListNode var17 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var18 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var17.setPreviousNode(var18);
    java.lang.Object var20 = var18.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var21 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var22 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var21.setPreviousNode(var22);
    java.lang.Object var24 = var22.getValue();
    var18.setNextNode(var22);
    roops.core.objectsInstrumented2.base.LinkedListNode var26 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var27 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var26.setPreviousNode(var27);
    java.lang.Object var29 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var30 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var31 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var30.setPreviousNode(var31);
    java.lang.Object var33 = var31.getValue();
    var27.setNextNode(var31);
    java.lang.Object var35 = var27.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var36 = var27.getPreviousNode();
    var18.setValue((java.lang.Object)var27);
    roops.core.objectsInstrumented2.base.LinkedListNode var38 = var27.getNextNode();
    var5.setNextNode(var38);
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = var38.getPreviousNode();
    roops.core.objectsInstrumented2.core.LinkedList var41 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var43 = var41.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.core.LinkedList.containsTest(var41, (java.lang.Object)0L);
    boolean var47 = var41.contains((java.lang.Object)(byte)10);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var41, (java.lang.Object)10.0f);
    roops.core.objectsInstrumented2.core.LinkedList var50 = new roops.core.objectsInstrumented2.core.LinkedList();
    boolean var52 = var50.contains((java.lang.Object)10);
    roops.core.objectsInstrumented2.base.LinkedListNode var53 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var53.setPreviousNode(var54);
    roops.core.objectsInstrumented2.core.LinkedList.addLastTest(var50, (java.lang.Object)var53);
    boolean var57 = var41.contains((java.lang.Object)var53);
    java.lang.Object var58 = var53.getValue();
    var38.setNextNode(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    roops.core.objectsInstrumented2.base.LinkedListNode var0 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var0.setPreviousNode(var1);
    java.lang.Object var3 = var1.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var4 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var5 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var4.setPreviousNode(var5);
    java.lang.Object var7 = var5.getValue();
    var1.setNextNode(var5);
    roops.core.objectsInstrumented2.base.LinkedListNode var9 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var10 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var9.setPreviousNode(var10);
    java.lang.Object var12 = var10.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var13 = var10.getNextNode();
    var5.setNextNode(var10);
    roops.core.objectsInstrumented2.base.LinkedListNode var15 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var16 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var15.setPreviousNode(var16);
    java.lang.Object var18 = var16.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var19 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var20 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var19.setPreviousNode(var20);
    java.lang.Object var22 = var20.getValue();
    var16.setNextNode(var20);
    roops.core.objectsInstrumented2.base.LinkedListNode var24 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var25 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var24.setPreviousNode(var25);
    java.lang.Object var27 = var25.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var28 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var29 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var28.setPreviousNode(var29);
    java.lang.Object var31 = var29.getValue();
    var25.setNextNode(var29);
    roops.core.objectsInstrumented2.base.LinkedListNode var33 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var34 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var33.setPreviousNode(var34);
    java.lang.Object var36 = var34.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var37 = var34.getNextNode();
    var29.setNextNode(var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var39 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var40 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var39.setPreviousNode(var40);
    java.lang.Object var42 = var40.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var43 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var44 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var43.setPreviousNode(var44);
    java.lang.Object var46 = var44.getValue();
    var40.setNextNode(var44);
    var34.setValue((java.lang.Object)var44);
    var16.setValue((java.lang.Object)var34);
    roops.core.objectsInstrumented2.base.LinkedListNode var50 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var51 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var50.setPreviousNode(var51);
    java.lang.Object var53 = var51.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var54 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var55 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var54.setPreviousNode(var55);
    java.lang.Object var57 = var55.getValue();
    var51.setNextNode(var55);
    roops.core.objectsInstrumented2.base.LinkedListNode var59 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var60 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var59.setPreviousNode(var60);
    java.lang.Object var62 = var60.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var63 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var64 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var63.setPreviousNode(var64);
    java.lang.Object var66 = var64.getValue();
    var60.setNextNode(var64);
    roops.core.objectsInstrumented2.base.LinkedListNode var68 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var69 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var68.setPreviousNode(var69);
    java.lang.Object var71 = var69.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var72 = var69.getNextNode();
    var64.setNextNode(var69);
    roops.core.objectsInstrumented2.base.LinkedListNode var74 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var75 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var74.setPreviousNode(var75);
    java.lang.Object var77 = var75.getValue();
    roops.core.objectsInstrumented2.base.LinkedListNode var78 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    roops.core.objectsInstrumented2.base.LinkedListNode var79 = new roops.core.objectsInstrumented2.base.LinkedListNode();
    var78.setPreviousNode(var79);
    java.lang.Object var81 = var79.getValue();
    var75.setNextNode(var79);
    var69.setValue((java.lang.Object)var79);
    var51.setValue((java.lang.Object)var69);
    var34.setPreviousNode(var51);
    java.lang.Object var86 = var51.getValue();
    var5.setValue((java.lang.Object)var51);
    java.lang.Object var88 = var51.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

}
