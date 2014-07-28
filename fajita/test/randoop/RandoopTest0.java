package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    roops.core.objectsInstrumented2.path.LinkedListAddLast.fajita_roopsGoal_initialization();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    roops.core.objectsInstrumented2.path.LinkedListAddLast var0 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = var0.createHeaderNode();
    var1.setValue((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    roops.core.objectsInstrumented2.path.LinkedListAddLast var0 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = var0.createHeaderNode();
    roops.core.objectsInstrumented2.path.LinkedListAddLast var2 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = var2.createHeaderNode();
    var3.setValue((java.lang.Object)0L);
    roops.core.objectsInstrumented2.path.LinkedListAddLast var6 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = var6.createHeaderNode();
    var7.setValue((java.lang.Object)0L);
    var0.addNodeBefore(var3, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.path.LinkedListAddLast var11 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var11.createHeaderNode();
    var0.addNodeBefore(var12, (java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    roops.core.objectsInstrumented2.path.LinkedListAddLast var0 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = var0.createHeaderNode();
    roops.core.objectsInstrumented2.path.LinkedListAddLast var2 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = var2.createHeaderNode();
    var3.setValue((java.lang.Object)0L);
    roops.core.objectsInstrumented2.path.LinkedListAddLast var6 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = var6.createHeaderNode();
    var7.setValue((java.lang.Object)0L);
    var0.addNodeBefore(var3, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.path.LinkedListAddLast var11 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var12 = var11.createHeaderNode();
    boolean var14 = var0.isEqualValue((java.lang.Object)var11, (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    roops.core.objectsInstrumented2.path.LinkedListAddLast var0 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var1 = var0.createHeaderNode();
    roops.core.objectsInstrumented2.path.LinkedListAddLast var2 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var3 = var2.createHeaderNode();
    var3.setValue((java.lang.Object)0L);
    roops.core.objectsInstrumented2.path.LinkedListAddLast var6 = new roops.core.objectsInstrumented2.path.LinkedListAddLast();
    roops.core.objectsInstrumented2.base.LinkedListNode var7 = var6.createHeaderNode();
    var7.setValue((java.lang.Object)0L);
    var0.addNodeBefore(var3, (java.lang.Object)var7);
    roops.core.objectsInstrumented2.base.LinkedListNode var11 = var7.getNextNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
