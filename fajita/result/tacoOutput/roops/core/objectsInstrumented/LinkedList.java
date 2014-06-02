package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant 
		( this.header!=null ) &&
		( this.header.next!=null ) &&
		( this.header.previous!=null ) &&
		( this.size==#(this.header.*next @- null)-1 ) &&
		( this.size>=0 ) &&
		(all n: LinkedListNode | ( n in this.header.*next @- null ) => (
				  n!=null &&
				  n.previous!=null &&
				  n.previous.next==n &&
				  n.next!=null &&
				  n.next.previous==n )) ; 
*/
public class LinkedList extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.LinkedListNode roops_core_objectsInstrumented_LinkedList_header;
  public int roops_core_objectsInstrumented_LinkedList_size;
  public int roops_core_objectsInstrumented_LinkedList_modCount;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;/** @Modifies_Everything
 @Ensures false;
*/

  public static void addLastTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object o) {
    boolean t_2;
    boolean t_3;
    boolean t_4;

    fajita_roopsGoal_initialization();
    t_3 = list  !=  null;
    t_4 = list.repOK();

    if (t_3) {
      {
        {
          if (t_4) {
            {
              {
                t_2 = true;
              }
            }
          } else {
            {
              {
                t_2 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_2 = false;
        }
      }
    }
    if (t_2) {
      {
        {
          {
            {
              {
                {
                  boolean t_1;

                  t_1 = list.addLast(o);
                }
              }
            }
          }
        }
      }
    }
  }


  public static void containsTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object arg) {
    boolean t_6;
    boolean t_7;
    boolean t_8;

    t_7 = list  !=  null;
    t_8 = list.repOK();

    if (t_7) {
      {
        {
          if (t_8) {
            {
              {
                t_6 = true;
              }
            }
          } else {
            {
              {
                t_6 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_6 = false;
        }
      }
    }
    if (t_6) {
      {
        {
          {
            {
              {
                {
                  boolean t_5;

                  t_5 = list.contains(arg);
                  boolean var_1_ret_val = t_5;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void removeIndexTest(roops.core.objectsInstrumented.LinkedList list, int index) {
    boolean t_10;
    boolean t_11;
    boolean t_12;

    t_11 = list  !=  null;
    t_12 = list.repOK();

    if (t_11) {
      {
        {
          if (t_12) {
            {
              {
                t_10 = true;
              }
            }
          } else {
            {
              {
                t_10 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_10 = false;
        }
      }
    }
    if (t_10) {
      {
        {
          {
            {
              {
                {
                  java.lang.Object t_9;

                  t_9 = list.removeIndex(index);
                  java.lang.Object var_2_ret_val = t_9;
                }
              }
            }
          }
        }
      }
    }
  }


  public void init() {
    roops.core.objectsInstrumented.LinkedListNode t_13;

    t_13 = this.createHeaderNode();
    this.roops_core_objectsInstrumented_LinkedList_header = t_13;
  }


  public int indexOf(java.lang.Object new_value) {
    int var_3_i = 0;

    {
      roops.core.objectsInstrumented.LinkedListNode var_4_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
      boolean var_5_ws_1;

      var_5_ws_1 = var_4_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      while (var_5_ws_1) {
        boolean t_14;
        int t_15;

        {
          roops.core.objectsInstrumented.LinkedList.roops_goal_0 = true;
        }
        t_14 = this.isEqualValue(var_4_node.roops_core_objectsInstrumented_LinkedListNode_object_value, new_value);

        if (t_14) {
          {
            {
              {
                {
                  {
                    {
                      {
                        roops.core.objectsInstrumented.LinkedList.roops_goal_1 = true;
                      }

                      return var_3_i;
                    }
                  }
                }
              }
            }
          }
        }
        t_15 = var_3_i;
        var_3_i = var_3_i + (byte)1;
        var_4_node = var_4_node.roops_core_objectsInstrumented_LinkedListNode_next;
        var_5_ws_1 = var_4_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      }
    }
    {
      roops.core.objectsInstrumented.LinkedList.roops_goal_2 = true;
    }

    return -1;
  }


  public boolean contains(java.lang.Object arg) {
    int t_16;
    boolean t_17;

    t_16 = this.indexOf(arg);
    t_17 = t_16  !=  -1;

    return t_17;
  }


  public java.lang.Object removeIndex(int index) {
    roops.core.objectsInstrumented.LinkedListNode t_18;

    t_18 = this.getNode(index, false);
    roops.core.objectsInstrumented.LinkedListNode var_6_node = t_18;
    java.lang.Object var_7_oldValue = var_6_node.roops_core_objectsInstrumented_LinkedListNode_object_value;

    this.removeNode(var_6_node);
    {
    }

    return var_7_oldValue;
  }


  public boolean addLast(java.lang.Object o) {
    this.addNodeBefore(this.roops_core_objectsInstrumented_LinkedList_header, o);

    return true;
  }


  public boolean isEqualValue(java.lang.Object value1, java.lang.Object value2) {
    boolean t_21;
    boolean var_8_ret_val;

    t_21 = value1  ==  value2;
    if (t_21) {
      {
        {
          {
            {
              {
                {
                  var_8_ret_val = true;
                }
              }
            }
          }
        }
      }
    } else {
      {
        {
          {
            {
              {
                {
                  boolean t_20;

                  t_20 = value1  ==  null;
                  if (t_20) {
                    {
                      {
                        {
                          {
                            {
                              {
                                var_8_ret_val = false;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    {
                      {
                        {
                          {
                            {
                              {
                                boolean t_19;

                                t_19 = value1.equals(value2);
                                var_8_ret_val = t_19;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    return var_8_ret_val;
  }


  public roops.core.objectsInstrumented.LinkedListNode createHeaderNode() {
    roops.core.objectsInstrumented.LinkedListNode t_22;

    t_22 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_9_linkedListNode = t_22;

    var_9_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_next = var_9_linkedListNode;
    var_9_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_previous = var_9_linkedListNode;

    return var_9_linkedListNode;
  }


  public roops.core.objectsInstrumented.LinkedListNode createNode(java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_23;

    {
      roops.core.objectsInstrumented.LinkedList.roops_goal_0 = true;
    }
    t_23 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_10_node = t_23;

    var_10_node.roops_core_objectsInstrumented_LinkedListNode_previous = var_10_node;
    var_10_node.roops_core_objectsInstrumented_LinkedListNode_next = var_10_node;
    var_10_node.roops_core_objectsInstrumented_LinkedListNode_object_value = new_object_value;

    return var_10_node;
  }


  public void addNodeBefore(roops.core.objectsInstrumented.LinkedListNode node, java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_24;

    t_24 = this.createNode(new_object_value);
    roops.core.objectsInstrumented.LinkedListNode var_11_newNode = t_24;

    {
      roops.core.objectsInstrumented.LinkedList.roops_goal_1 = true;
    }
    this.addNode(var_11_newNode, node);
  }


  public void addNode(roops.core.objectsInstrumented.LinkedListNode nodeToInsert, roops.core.objectsInstrumented.LinkedListNode insertBeforeNode) {
    int t_25;
    int t_26;

    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_next = insertBeforeNode;
    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_previous = insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = nodeToInsert;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous = nodeToInsert;
    t_25 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)1;
    t_26 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
      roops.core.objectsInstrumented.LinkedList.roops_goal_2 = true;
    }
  }


  public void removeNode(roops.core.objectsInstrumented.LinkedListNode node) {
    int t_27;
    int t_28;

    node.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = node.roops_core_objectsInstrumented_LinkedListNode_next;
    node.roops_core_objectsInstrumented_LinkedListNode_next.roops_core_objectsInstrumented_LinkedListNode_previous = node.roops_core_objectsInstrumented_LinkedListNode_previous;
    t_27 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)-1;
    t_28 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
    }
  }


  public roops.core.objectsInstrumented.LinkedListNode getNode(int index, boolean endMarkerAllowed) {
    boolean t_30;
    boolean t_32;
    boolean t_33;
    boolean t_34;
    boolean t_36;
    int t_37;
    boolean t_40;

    t_30 = index  <  0;

    if (t_30) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_29;

                  {
                    roops.core.objectsInstrumented.LinkedList.roops_goal_0 = true;
                  }
                  t_29 = new java.lang.RuntimeException();
                  throw t_29;
                }
              }
            }
          }
        }
      }
    }
    t_33 = ! endMarkerAllowed;
    t_34 = index  ==  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_33) {
      {
        {
          if (t_34) {
            {
              {
                t_32 = true;
              }
            }
          } else {
            {
              {
                t_32 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_32 = false;
        }
      }
    }

    if (t_32) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_31;

                  {
                    roops.core.objectsInstrumented.LinkedList.roops_goal_1 = true;
                  }
                  t_31 = new java.lang.RuntimeException();
                  throw t_31;
                }
              }
            }
          }
        }
      }
    }
    t_36 = index  >  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_36) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_35;

                  {
                    roops.core.objectsInstrumented.LinkedList.roops_goal_2 = true;
                  }
                  t_35 = new java.lang.RuntimeException();
                  throw t_35;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.LinkedListNode var_12_node;

    t_37 = this.roops_core_objectsInstrumented_LinkedList_size  >>  (byte)1;
    int var_13_size_div_2 = t_37;

    t_40 = index  <  var_13_size_div_2;

    if (t_40) {
      {
        {
          {
            {
              {
                {
                  {
                  }
                  var_12_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
                  {
                    int var_14_currentIndex = 0;
                    boolean var_15_ws_2;

                    var_15_ws_2 = var_14_currentIndex  <  index;
                    while (var_15_ws_2) {
                      int t_38;

                      {
                      }
                      var_12_node = var_12_node.roops_core_objectsInstrumented_LinkedListNode_next;
                      t_38 = var_14_currentIndex;
                      var_14_currentIndex = var_14_currentIndex + (byte)1;
                      var_15_ws_2 = var_14_currentIndex  <  index;
                    }
                  }
                }
              }
            }
          }
        }
      }
    } else {
      {
        {
          {
            {
              {
                {
                  {
                  }
                  var_12_node = this.roops_core_objectsInstrumented_LinkedList_header;
                  {
                    int var_16_currentIndex = this.roops_core_objectsInstrumented_LinkedList_size;
                    boolean var_17_ws_3;

                    var_17_ws_3 = var_16_currentIndex  >  index;
                    while (var_17_ws_3) {
                      int t_39;

                      {
                      }
                      var_12_node = var_12_node.roops_core_objectsInstrumented_LinkedListNode_previous;
                      t_39 = var_16_currentIndex;
                      var_16_currentIndex = var_16_currentIndex + (byte)-1;
                      var_17_ws_3 = var_16_currentIndex  >  index;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    {
    }

    return var_12_node;
  }


  public LinkedList() {
    this.roops_core_objectsInstrumented_LinkedList_header = ((roops.core.objectsInstrumented.LinkedListNode)(null));
    this.roops_core_objectsInstrumented_LinkedList_size = (byte)0;
    this.roops_core_objectsInstrumented_LinkedList_modCount = (byte)0;
    {
      this.init();
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.LinkedList.roops_goal_0 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_1 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_2 = false;
  }

}
