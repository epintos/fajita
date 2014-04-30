package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class LinkedListNode extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.LinkedListNode roops_core_objectsInstrumented_LinkedListNode_previous;
  public /*@ nullable @*/ roops.core.objectsInstrumented.LinkedListNode roops_core_objectsInstrumented_LinkedListNode_next;
  public /*@ nullable @*/ java.lang.Object roops_core_objectsInstrumented_LinkedListNode_object_value;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static boolean roops_goal_3;
  public static boolean roops_goal_4;
  public static boolean roops_goal_5;
  public static boolean roops_goal_6;
  public static boolean roops_goal_7;
  public static boolean roops_goal_8;
  public static boolean roops_goal_9;
  public static boolean roops_goal_10;
  public static boolean roops_goal_11;
  public static boolean roops_goal_12;
  public static boolean roops_goal_13;
  public static boolean roops_goal_14;
  public static boolean roops_goal_15;
  public static boolean roops_goal_16;
  public static boolean roops_goal_17;
  public static boolean roops_goal_18;
  public static boolean roops_goal_19;
  public static boolean roops_goal_20;
  public static boolean roops_goal_21;
  public static boolean roops_goal_22;
  public static boolean roops_goal_23;
  public static boolean roops_goal_24;
  public static boolean roops_goal_25;
  public static boolean roops_goal_26;
  public static boolean roops_goal_27;
  public static boolean roops_goal_28;
  public static boolean roops_goal_29;
  public static boolean roops_goal_30;
  public static boolean roops_goal_31;
  public static boolean roops_goal_32;
  public static boolean roops_goal_33;
  public static boolean roops_goal_34;
  public static boolean roops_goal_35;
  public static boolean roops_goal_36;
  public static boolean roops_goal_37;
  public static boolean roops_goal_38;
  public static boolean roops_goal_39;
  public static boolean roops_goal_40;
  public static boolean roops_goal_41;
  public static boolean roops_goal_42;

  public LinkedListNode() {
    this.roops_core_objectsInstrumented_LinkedListNode_previous = ((roops.core.objectsInstrumented.LinkedListNode)(null));
    this.roops_core_objectsInstrumented_LinkedListNode_next = ((roops.core.objectsInstrumented.LinkedListNode)(null));
    this.roops_core_objectsInstrumented_LinkedListNode_object_value = ((java.lang.Object)(null));
    {
    }
  }


  public /*@ pure @*/ java.lang.Object getValue() {
    return this.roops_core_objectsInstrumented_LinkedListNode_object_value;
  }


  public void setValue(java.lang.Object new_value) {
    this.roops_core_objectsInstrumented_LinkedListNode_object_value = new_value;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_40 = true;
  }


  public roops.core.objectsInstrumented.LinkedListNode getPreviousNode() {
    return this.roops_core_objectsInstrumented_LinkedListNode_previous;
  }


  public void setPreviousNode(roops.core.objectsInstrumented.LinkedListNode previous) {
    this.roops_core_objectsInstrumented_LinkedListNode_previous = previous;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_41 = true;
  }


  public roops.core.objectsInstrumented.LinkedListNode getNextNode() {
    return this.roops_core_objectsInstrumented_LinkedListNode_next;
  }


  public void setNextNode(roops.core.objectsInstrumented.LinkedListNode next) {
    this.roops_core_objectsInstrumented_LinkedListNode_next = next;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_42 = true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_0 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_1 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_2 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_3 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_4 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_5 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_6 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_7 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_8 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_9 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_10 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_11 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_12 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_13 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_14 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_15 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_16 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_17 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_18 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_19 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_20 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_21 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_22 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_23 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_24 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_25 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_26 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_27 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_28 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_29 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_30 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_31 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_32 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_33 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_34 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_35 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_36 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_37 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_38 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_39 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_40 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_41 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_42 = false;
  }

}
