package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    roops.core.objectsInstrumented2.base.SinglyLinkedListNode var0 = new roops.core.objectsInstrumented2.base.SinglyLinkedListNode();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = var0.repOK();
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.containsTest(var0, 100);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.containsTest(var0, 1);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.insertBackTest(var0, (-1));
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.insertBackTest(var0, 1);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    var0.insertBack(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.insertBackTest(var0, 1);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    var0.insertBack(1);
    var0.insertBack(10);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    var0.insertBack(1);
    var0.remove(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    var0.insertBack(1);
    boolean var6 = var0.contains(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.removeTest(var0, (-1));
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    var0.insertBack(1);
    var0.remove(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((-1));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    var0.insertBack(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      roops.core.objectsInstrumented2.core.SinglyLinkedList.containsTest(var0, 0);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    roops.core.objectsInstrumented2.core.SinglyLinkedList var0 = new roops.core.objectsInstrumented2.core.SinglyLinkedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

}
