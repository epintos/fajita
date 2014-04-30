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
  public static boolean roops_goal_39;/** @Modifies_Everything
 @Ensures false;
*/

  public static void addLastTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object o) {
    boolean t_4;
    boolean t_5;
    boolean t_6;

    fajita_roopsGoal_initialization();
    int var_1_m = 1;

    roops.core.objectsInstrumented.LinkedList.roops_goal_0 = true;
    var_1_m += 2;
    roops.core.objectsInstrumented.LinkedList.roops_goal_1 = true;
    t_5 = list  !=  null;
    t_6 = list.repOK();

    if (t_5) {
      {
        {
          if (t_6) {
            {
              {
                t_4 = true;
              }
            }
          } else {
            {
              {
                t_4 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_4 = false;
        }
      }
    }
    if (t_4) {
      {
        {
          {
            {
              {
                {
                  int t_1;
                  boolean t_3;
                  int var_2_i = 2;

                  roops.core.objectsInstrumented.LinkedList.roops_goal_2 = true;
                  boolean var_3_ws_1;

                  t_1 = var_2_i;
                  var_2_i = var_2_i + (byte)-1;
                  var_3_ws_1 = t_1  >  0;
                  while (var_3_ws_1) {
                    int t_2;
                    int var_4_pipe = var_2_i;

                    roops.core.objectsInstrumented.LinkedList.roops_goal_4 = true;
                    var_4_pipe = var_4_pipe + var_2_i;
                    roops.core.objectsInstrumented.LinkedList.roops_goal_5 = true;
                    t_2 = var_2_i;
                    var_2_i = var_2_i + (byte)-1;
                    var_3_ws_1 = t_2  >  0;
                  }
                  t_3 = list.addLast(o);
                  boolean var_5_ret_val = t_3;

                  roops.core.objectsInstrumented.LinkedList.roops_goal_3 = true;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void containsTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object arg) {
    boolean t_8;
    boolean t_9;
    boolean t_10;

    t_9 = list  !=  null;
    t_10 = list.repOK();

    if (t_9) {
      {
        {
          if (t_10) {
            {
              {
                t_8 = true;
              }
            }
          } else {
            {
              {
                t_8 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_8 = false;
        }
      }
    }
    if (t_8) {
      {
        {
          {
            {
              {
                {
                  boolean t_7;

                  t_7 = list.contains(arg);
                  boolean var_6_ret_val = t_7;

                  roops.core.objectsInstrumented.LinkedList.roops_goal_6 = true;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void removeIndexTest(roops.core.objectsInstrumented.LinkedList list, int index) {
    boolean t_12;
    boolean t_13;
    boolean t_14;

    t_13 = list  !=  null;
    t_14 = list.repOK();

    if (t_13) {
      {
        {
          if (t_14) {
            {
              {
                t_12 = true;
              }
            }
          } else {
            {
              {
                t_12 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_12 = false;
        }
      }
    }
    if (t_12) {
      {
        {
          {
            {
              {
                {
                  java.lang.Object t_11;

                  t_11 = list.removeIndex(index);
                  java.lang.Object var_7_ret_val = t_11;

                  roops.core.objectsInstrumented.LinkedList.roops_goal_7 = true;
                }
              }
            }
          }
        }
      }
    }
  }


  public void init() {
    roops.core.objectsInstrumented.LinkedListNode t_15;

    t_15 = this.createHeaderNode();
    this.roops_core_objectsInstrumented_LinkedList_header = t_15;
    roops.core.objectsInstrumented.LinkedList.roops_goal_8 = true;
  }


  public int indexOf(java.lang.Object new_value) {
    int var_8_i = 0;

    roops.core.objectsInstrumented.LinkedList.roops_goal_9 = true;
    {
      roops.core.objectsInstrumented.LinkedListNode var_9_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
      boolean var_10_ws_2;

      var_10_ws_2 = var_9_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      while (var_10_ws_2) {
        boolean t_16;
        int t_17;

        {
        }
        t_16 = this.isEqualValue(var_9_node.roops_core_objectsInstrumented_LinkedListNode_object_value, new_value);

        if (t_16) {
          {
            {
              {
                {
                  {
                    {
                      {
                      }

                      return var_8_i;
                    }
                  }
                }
              }
            }
          }
        }
        t_17 = var_8_i;
        var_8_i = var_8_i + (byte)1;
        var_9_node = var_9_node.roops_core_objectsInstrumented_LinkedListNode_next;
        var_10_ws_2 = var_9_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      }
    }
    {
    }

    return -1;
  }


  public boolean contains(java.lang.Object arg) {
    int t_18;
    boolean t_19;

    t_18 = this.indexOf(arg);
    t_19 = t_18  !=  -1;

    return t_19;
  }


  public java.lang.Object removeIndex(int index) {
    roops.core.objectsInstrumented.LinkedListNode t_20;

    t_20 = this.getNode(index, false);
    roops.core.objectsInstrumented.LinkedListNode var_11_node = t_20;

    roops.core.objectsInstrumented.LinkedList.roops_goal_10 = true;
    java.lang.Object var_12_oldValue = var_11_node.roops_core_objectsInstrumented_LinkedListNode_object_value;

    roops.core.objectsInstrumented.LinkedList.roops_goal_11 = true;
    this.removeNode(var_11_node);
    {
    }

    return var_12_oldValue;
  }


  public boolean addLast(java.lang.Object o) {
    this.addNodeBefore(this.roops_core_objectsInstrumented_LinkedList_header, o);

    return true;
  }


  public boolean isEqualValue(java.lang.Object value1, java.lang.Object value2) {
    boolean t_23;
    boolean var_13_ret_val;

    roops.core.objectsInstrumented.LinkedList.roops_goal_12 = true;
    t_23 = value1  ==  value2;
    if (t_23) {
      {
        {
          {
            {
              {
                {
                  var_13_ret_val = true;
                  roops.core.objectsInstrumented.LinkedList.roops_goal_13 = true;
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
                  boolean t_22;

                  t_22 = value1  ==  null;
                  if (t_22) {
                    {
                      {
                        {
                          {
                            {
                              {
                                var_13_ret_val = false;
                                roops.core.objectsInstrumented.LinkedList.roops_goal_14 = true;
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
                                boolean t_21;

                                t_21 = value1.equals(value2);
                                var_13_ret_val = t_21;
                                roops.core.objectsInstrumented.LinkedList.roops_goal_15 = true;
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

    return var_13_ret_val;
  }


  public roops.core.objectsInstrumented.LinkedListNode createHeaderNode() {
    roops.core.objectsInstrumented.LinkedListNode t_24;

    t_24 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_14_linkedListNode = t_24;

    roops.core.objectsInstrumented.LinkedList.roops_goal_16 = true;
    var_14_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_next = var_14_linkedListNode;
    roops.core.objectsInstrumented.LinkedList.roops_goal_17 = true;
    var_14_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_previous = var_14_linkedListNode;
    roops.core.objectsInstrumented.LinkedList.roops_goal_18 = true;

    return var_14_linkedListNode;
  }


  public roops.core.objectsInstrumented.LinkedListNode createNode(java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_25;

    {
    }
    t_25 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_15_node = t_25;

    roops.core.objectsInstrumented.LinkedList.roops_goal_19 = true;
    var_15_node.roops_core_objectsInstrumented_LinkedListNode_previous = var_15_node;
    roops.core.objectsInstrumented.LinkedList.roops_goal_20 = true;
    var_15_node.roops_core_objectsInstrumented_LinkedListNode_next = var_15_node;
    roops.core.objectsInstrumented.LinkedList.roops_goal_21 = true;
    var_15_node.roops_core_objectsInstrumented_LinkedListNode_object_value = new_object_value;
    roops.core.objectsInstrumented.LinkedList.roops_goal_22 = true;

    return var_15_node;
  }


  public void addNodeBefore(roops.core.objectsInstrumented.LinkedListNode node, java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_26;

    t_26 = this.createNode(new_object_value);
    roops.core.objectsInstrumented.LinkedListNode var_16_newNode = t_26;

    roops.core.objectsInstrumented.LinkedList.roops_goal_23 = true;
    {
    }
    this.addNode(var_16_newNode, node);
  }


  public void addNode(roops.core.objectsInstrumented.LinkedListNode nodeToInsert, roops.core.objectsInstrumented.LinkedListNode insertBeforeNode) {
    int t_27;
    int t_28;

    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_next = insertBeforeNode;
    roops.core.objectsInstrumented.LinkedList.roops_goal_24 = true;
    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_previous = insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous;
    roops.core.objectsInstrumented.LinkedList.roops_goal_25 = true;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = nodeToInsert;
    roops.core.objectsInstrumented.LinkedList.roops_goal_26 = true;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous = nodeToInsert;
    roops.core.objectsInstrumented.LinkedList.roops_goal_27 = true;
    t_27 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)1;
    t_28 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
    }
  }


  public void removeNode(roops.core.objectsInstrumented.LinkedListNode node) {
    int t_29;
    int t_30;

    node.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = node.roops_core_objectsInstrumented_LinkedListNode_next;
    roops.core.objectsInstrumented.LinkedList.roops_goal_28 = true;
    node.roops_core_objectsInstrumented_LinkedListNode_next.roops_core_objectsInstrumented_LinkedListNode_previous = node.roops_core_objectsInstrumented_LinkedListNode_previous;
    roops.core.objectsInstrumented.LinkedList.roops_goal_29 = true;
    t_29 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)-1;
    t_30 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
    }
  }


  public roops.core.objectsInstrumented.LinkedListNode getNode(int index, boolean endMarkerAllowed) {
    boolean t_32;
    boolean t_34;
    boolean t_35;
    boolean t_36;
    boolean t_38;
    int t_39;
    boolean t_42;

    t_32 = index  <  0;

    if (t_32) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_31;

                  {
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
    t_35 = ! endMarkerAllowed;
    t_36 = index  ==  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_35) {
      {
        {
          if (t_36) {
            {
              {
                t_34 = true;
              }
            }
          } else {
            {
              {
                t_34 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_34 = false;
        }
      }
    }

    if (t_34) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_33;

                  {
                  }
                  t_33 = new java.lang.RuntimeException();
                  throw t_33;
                }
              }
            }
          }
        }
      }
    }
    t_38 = index  >  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_38) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_37;

                  {
                  }
                  t_37 = new java.lang.RuntimeException();
                  throw t_37;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.LinkedListNode var_17_node;

    roops.core.objectsInstrumented.LinkedList.roops_goal_30 = true;
    t_39 = this.roops_core_objectsInstrumented_LinkedList_size  >>  (byte)1;
    int var_18_size_div_2 = t_39;

    roops.core.objectsInstrumented.LinkedList.roops_goal_31 = true;
    t_42 = index  <  var_18_size_div_2;

    if (t_42) {
      {
        {
          {
            {
              {
                {
                  {
                  }
                  var_17_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
                  roops.core.objectsInstrumented.LinkedList.roops_goal_32 = true;
                  {
                    int var_19_currentIndex = 0;
                    boolean var_20_ws_3;

                    var_20_ws_3 = var_19_currentIndex  <  index;
                    while (var_20_ws_3) {
                      int t_40;

                      {
                      }
                      var_17_node = var_17_node.roops_core_objectsInstrumented_LinkedListNode_next;
                      roops.core.objectsInstrumented.LinkedList.roops_goal_34 = true;
                      t_40 = var_19_currentIndex;
                      var_19_currentIndex = var_19_currentIndex + (byte)1;
                      var_20_ws_3 = var_19_currentIndex  <  index;
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
                  var_17_node = this.roops_core_objectsInstrumented_LinkedList_header;
                  roops.core.objectsInstrumented.LinkedList.roops_goal_33 = true;
                  {
                    int var_21_currentIndex = this.roops_core_objectsInstrumented_LinkedList_size;
                    boolean var_22_ws_4;

                    var_22_ws_4 = var_21_currentIndex  >  index;
                    while (var_22_ws_4) {
                      int t_41;

                      {
                      }
                      var_17_node = var_17_node.roops_core_objectsInstrumented_LinkedListNode_previous;
                      roops.core.objectsInstrumented.LinkedList.roops_goal_35 = true;
                      t_41 = var_21_currentIndex;
                      var_21_currentIndex = var_21_currentIndex + (byte)-1;
                      var_22_ws_4 = var_21_currentIndex  >  index;
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

    return var_17_node;
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
    roops.core.objectsInstrumented.LinkedList.roops_goal_3 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_4 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_5 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_6 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_7 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_8 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_9 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_10 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_11 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_12 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_13 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_14 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_15 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_16 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_17 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_18 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_19 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_20 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_21 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_22 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_23 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_24 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_25 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_26 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_27 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_28 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_29 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_30 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_31 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_32 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_33 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_34 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_35 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_36 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_37 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_38 = false;
    roops.core.objectsInstrumented.LinkedList.roops_goal_39 = false;
  }

}
