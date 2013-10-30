package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class LinkedListNode extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.LinkedListNode roops_core_objects_LinkedListNode_previous;
  public /*@ nullable @*/ roops.core.objects.LinkedListNode roops_core_objects_LinkedListNode_next;
  public /*@ nullable @*/ java.lang.Object roops_core_objects_LinkedListNode_object_value;

  public LinkedListNode() {
    this.roops_core_objects_LinkedListNode_previous = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_LinkedListNode_next = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_LinkedListNode_object_value = ((java.lang.Object)(null));
    {
    }
  }


  public /*@ pure @*/ java.lang.Object getValue() {
    return this.roops_core_objects_LinkedListNode_object_value;
  }


  public void setValue(java.lang.Object new_value) {
    this.roops_core_objects_LinkedListNode_object_value = new_value;
  }


  public roops.core.objects.LinkedListNode getPreviousNode() {
    return this.roops_core_objects_LinkedListNode_previous;
  }


  public void setPreviousNode(roops.core.objects.LinkedListNode previous) {
    this.roops_core_objects_LinkedListNode_previous = previous;
  }


  public roops.core.objects.LinkedListNode getNextNode() {
    return this.roops_core_objects_LinkedListNode_next;
  }


  public void setNextNode(roops.core.objects.LinkedListNode next) {
    this.roops_core_objects_LinkedListNode_next = next;
  }

}
