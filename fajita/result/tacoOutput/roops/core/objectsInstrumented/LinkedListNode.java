package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class LinkedListNode extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.LinkedListNode roops_core_objectsInstrumented_LinkedListNode_previous;
  public /*@ nullable @*/ roops.core.objectsInstrumented.LinkedListNode roops_core_objectsInstrumented_LinkedListNode_next;
  public /*@ nullable @*/ java.lang.Object roops_core_objectsInstrumented_LinkedListNode_object_value;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;
  public static boolean variable_definition_5;
  public static boolean variable_definition_6;
  public static boolean variable_definition_7;
  public static boolean variable_definition_8;
  public static boolean variable_definition_9;

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
  }


  public roops.core.objectsInstrumented.LinkedListNode getPreviousNode() {
    return this.roops_core_objectsInstrumented_LinkedListNode_previous;
  }


  public void setPreviousNode(roops.core.objectsInstrumented.LinkedListNode previous) {
    this.roops_core_objectsInstrumented_LinkedListNode_previous = previous;
  }


  public roops.core.objectsInstrumented.LinkedListNode getNextNode() {
    return this.roops_core_objectsInstrumented_LinkedListNode_next;
  }


  public void setNextNode(roops.core.objectsInstrumented.LinkedListNode next) {
    this.roops_core_objectsInstrumented_LinkedListNode_next = next;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_0 = false;
    roops.core.objectsInstrumented.LinkedListNode.roops_goal_1 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_0 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_1 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_2 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_3 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_4 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_5 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_6 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_7 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_8 = false;
    roops.core.objectsInstrumented.LinkedListNode.variable_definition_9 = false;
  }

}
