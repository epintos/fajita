package roops.core.objectsInstrumented2.core.roops;

public class RoopsListNode {
  
  /*@ nullable @*/ RoopsListNode next;  

  /*@ nullable @*/ Object object_value;

  public RoopsListNode(Object new_object_value) {
    this.object_value = new_object_value;
    this.next = null;
  }

}

/* end roops.core.objects */
