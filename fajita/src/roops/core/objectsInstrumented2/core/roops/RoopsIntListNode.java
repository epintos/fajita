package roops.core.objectsInstrumented2.core.roops;

public class RoopsIntListNode {
  
  /*@ nullable @*/ RoopsIntListNode next;  

  /*@ nullable @*/ int int_value;

  public RoopsIntListNode(int new_int_value) {
    this.int_value = new_int_value;
    this.next = null;
  }

}

/* end roops.core.objects */
