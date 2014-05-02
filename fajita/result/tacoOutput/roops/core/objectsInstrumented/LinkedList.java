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
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;/** @Modifies_Everything
 @Ensures false;
*/

  public static void addLastTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object o) {
    boolean t_1;

    fajita_roopsGoal_initialization();
    int var_1_a = 1;

    roops.core.objectsInstrumented.LinkedList.variable_definition_0 = true;
    int var_2_m = 0;

    roops.core.objectsInstrumented.LinkedList.variable_definition_1 = true;
    t_1 = o  !=  null;

    if (t_1) {
      {
        {
          {
            {
              {
                {
                  var_1_a = 7;
                  roops.core.objectsInstrumented.LinkedList.variable_definition_2 = true;
                  roops.core.objectsInstrumented.LinkedList.variable_definition_0 = false;
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
                  var_1_a = 4;
                  roops.core.objectsInstrumented.LinkedList.variable_definition_3 = true;
                  roops.core.objectsInstrumented.LinkedList.variable_definition_0 = false;
                  roops.core.objectsInstrumented.LinkedList.variable_definition_2 = false;
                }
              }
            }
          }
        }
      }
    }
    var_2_m += var_1_a;
    roops.core.objectsInstrumented.LinkedList.roops_goal_0 = roops.core.objectsInstrumented.LinkedList.variable_definition_0;
    roops.core.objectsInstrumented.LinkedList.roops_goal_1 = roops.core.objectsInstrumented.LinkedList.variable_definition_2;
    roops.core.objectsInstrumented.LinkedList.roops_goal_2 = roops.core.objectsInstrumented.LinkedList.variable_definition_3;
    roops.core.objectsInstrumented.LinkedList.variable_definition_4 = true;
  }


  public static void containsTest(roops.core.objectsInstrumented.LinkedList list, java.lang.Object arg) {
    boolean t_3;
    boolean t_4;
    boolean t_5;

    t_4 = list  !=  null;
    t_5 = list.repOK();

    if (t_4) {
      {
        {
          if (t_5) {
            {
              {
                t_3 = true;
              }
            }
          } else {
            {
              {
                t_3 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_3 = false;
        }
      }
    }
    if (t_3) {
      {
        {
          {
            {
              {
                {
                  boolean t_2;

                  t_2 = list.contains(arg);
                  boolean var_3_ret_val = t_2;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void removeIndexTest(roops.core.objectsInstrumented.LinkedList list, int index) {
    boolean t_7;
    boolean t_8;
    boolean t_9;

    t_8 = list  !=  null;
    t_9 = list.repOK();

    if (t_8) {
      {
        {
          if (t_9) {
            {
              {
                t_7 = true;
              }
            }
          } else {
            {
              {
                t_7 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_7 = false;
        }
      }
    }
    if (t_7) {
      {
        {
          {
            {
              {
                {
                  java.lang.Object t_6;

                  t_6 = list.removeIndex(index);
                  java.lang.Object var_4_ret_val = t_6;
                }
              }
            }
          }
        }
      }
    }
  }


  public void init() {
    roops.core.objectsInstrumented.LinkedListNode t_10;

    t_10 = this.createHeaderNode();
    this.roops_core_objectsInstrumented_LinkedList_header = t_10;
  }


  public int indexOf(java.lang.Object new_value) {
    int var_5_i = 0;

    {
      roops.core.objectsInstrumented.LinkedListNode var_6_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
      boolean var_7_ws_1;

      var_7_ws_1 = var_6_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      while (var_7_ws_1) {
        boolean t_11;
        int t_12;

        {
        }
        t_11 = this.isEqualValue(var_6_node.roops_core_objectsInstrumented_LinkedListNode_object_value, new_value);

        if (t_11) {
          {
            {
              {
                {
                  {
                    {
                      {
                      }

                      return var_5_i;
                    }
                  }
                }
              }
            }
          }
        }
        t_12 = var_5_i;
        var_5_i = var_5_i + (byte)1;
        var_6_node = var_6_node.roops_core_objectsInstrumented_LinkedListNode_next;
        var_7_ws_1 = var_6_node  !=  this.roops_core_objectsInstrumented_LinkedList_header;
      }
    }
    {
    }

    return -1;
  }


  public boolean contains(java.lang.Object arg) {
    int t_13;
    boolean t_14;

    t_13 = this.indexOf(arg);
    t_14 = t_13  !=  -1;

    return t_14;
  }


  public java.lang.Object removeIndex(int index) {
    roops.core.objectsInstrumented.LinkedListNode t_15;

    t_15 = this.getNode(index, false);
    roops.core.objectsInstrumented.LinkedListNode var_8_node = t_15;
    java.lang.Object var_9_oldValue = var_8_node.roops_core_objectsInstrumented_LinkedListNode_object_value;

    this.removeNode(var_8_node);
    {
    }

    return var_9_oldValue;
  }


  public boolean addLast(java.lang.Object o) {
    this.addNodeBefore(this.roops_core_objectsInstrumented_LinkedList_header, o);

    return true;
  }


  public boolean isEqualValue(java.lang.Object value1, java.lang.Object value2) {
    boolean t_18;
    boolean var_10_ret_val;

    t_18 = value1  ==  value2;
    if (t_18) {
      {
        {
          {
            {
              {
                {
                  var_10_ret_val = true;
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
                  boolean t_17;

                  t_17 = value1  ==  null;
                  if (t_17) {
                    {
                      {
                        {
                          {
                            {
                              {
                                var_10_ret_val = false;
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
                                boolean t_16;

                                t_16 = value1.equals(value2);
                                var_10_ret_val = t_16;
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

    return var_10_ret_val;
  }


  public roops.core.objectsInstrumented.LinkedListNode createHeaderNode() {
    roops.core.objectsInstrumented.LinkedListNode t_19;

    t_19 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_11_linkedListNode = t_19;

    var_11_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_next = var_11_linkedListNode;
    var_11_linkedListNode.roops_core_objectsInstrumented_LinkedListNode_previous = var_11_linkedListNode;

    return var_11_linkedListNode;
  }


  public roops.core.objectsInstrumented.LinkedListNode createNode(java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_20;

    {
    }
    t_20 = new roops.core.objectsInstrumented.LinkedListNode();
    roops.core.objectsInstrumented.LinkedListNode var_12_node = t_20;

    var_12_node.roops_core_objectsInstrumented_LinkedListNode_previous = var_12_node;
    var_12_node.roops_core_objectsInstrumented_LinkedListNode_next = var_12_node;
    var_12_node.roops_core_objectsInstrumented_LinkedListNode_object_value = new_object_value;

    return var_12_node;
  }


  public void addNodeBefore(roops.core.objectsInstrumented.LinkedListNode node, java.lang.Object new_object_value) {
    roops.core.objectsInstrumented.LinkedListNode t_21;

    t_21 = this.createNode(new_object_value);
    roops.core.objectsInstrumented.LinkedListNode var_13_newNode = t_21;

    {
    }
    this.addNode(var_13_newNode, node);
  }


  public void addNode(roops.core.objectsInstrumented.LinkedListNode nodeToInsert, roops.core.objectsInstrumented.LinkedListNode insertBeforeNode) {
    int t_22;
    int t_23;

    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_next = insertBeforeNode;
    nodeToInsert.roops_core_objectsInstrumented_LinkedListNode_previous = insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = nodeToInsert;
    insertBeforeNode.roops_core_objectsInstrumented_LinkedListNode_previous = nodeToInsert;
    t_22 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)1;
    t_23 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
    }
  }


  public void removeNode(roops.core.objectsInstrumented.LinkedListNode node) {
    int t_24;
    int t_25;

    node.roops_core_objectsInstrumented_LinkedListNode_previous.roops_core_objectsInstrumented_LinkedListNode_next = node.roops_core_objectsInstrumented_LinkedListNode_next;
    node.roops_core_objectsInstrumented_LinkedListNode_next.roops_core_objectsInstrumented_LinkedListNode_previous = node.roops_core_objectsInstrumented_LinkedListNode_previous;
    t_24 = this.roops_core_objectsInstrumented_LinkedList_size;
    this.roops_core_objectsInstrumented_LinkedList_size = this.roops_core_objectsInstrumented_LinkedList_size + (byte)-1;
    t_25 = this.roops_core_objectsInstrumented_LinkedList_modCount;
    this.roops_core_objectsInstrumented_LinkedList_modCount = this.roops_core_objectsInstrumented_LinkedList_modCount + (byte)1;
    {
    }
  }


  public roops.core.objectsInstrumented.LinkedListNode getNode(int index, boolean endMarkerAllowed) {
    boolean t_27;
    boolean t_29;
    boolean t_30;
    boolean t_31;
    boolean t_33;
    int t_34;
    boolean t_37;

    t_27 = index  <  0;

    if (t_27) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_26;

                  {
                  }
                  t_26 = new java.lang.RuntimeException();
                  throw t_26;
                }
              }
            }
          }
        }
      }
    }
    t_30 = ! endMarkerAllowed;
    t_31 = index  ==  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_30) {
      {
        {
          if (t_31) {
            {
              {
                t_29 = true;
              }
            }
          } else {
            {
              {
                t_29 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_29 = false;
        }
      }
    }

    if (t_29) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_28;

                  {
                  }
                  t_28 = new java.lang.RuntimeException();
                  throw t_28;
                }
              }
            }
          }
        }
      }
    }
    t_33 = index  >  this.roops_core_objectsInstrumented_LinkedList_size;

    if (t_33) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_32;

                  {
                  }
                  t_32 = new java.lang.RuntimeException();
                  throw t_32;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.LinkedListNode var_14_node;

    t_34 = this.roops_core_objectsInstrumented_LinkedList_size  >>  (byte)1;
    int var_15_size_div_2 = t_34;

    t_37 = index  <  var_15_size_div_2;

    if (t_37) {
      {
        {
          {
            {
              {
                {
                  {
                  }
                  var_14_node = this.roops_core_objectsInstrumented_LinkedList_header.roops_core_objectsInstrumented_LinkedListNode_next;
                  {
                    int var_16_currentIndex = 0;
                    boolean var_17_ws_2;

                    var_17_ws_2 = var_16_currentIndex  <  index;
                    while (var_17_ws_2) {
                      int t_35;

                      {
                      }
                      var_14_node = var_14_node.roops_core_objectsInstrumented_LinkedListNode_next;
                      t_35 = var_16_currentIndex;
                      var_16_currentIndex = var_16_currentIndex + (byte)1;
                      var_17_ws_2 = var_16_currentIndex  <  index;
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
                  var_14_node = this.roops_core_objectsInstrumented_LinkedList_header;
                  {
                    int var_18_currentIndex = this.roops_core_objectsInstrumented_LinkedList_size;
                    boolean var_19_ws_3;

                    var_19_ws_3 = var_18_currentIndex  >  index;
                    while (var_19_ws_3) {
                      int t_36;

                      {
                      }
                      var_14_node = var_14_node.roops_core_objectsInstrumented_LinkedListNode_previous;
                      t_36 = var_18_currentIndex;
                      var_18_currentIndex = var_18_currentIndex + (byte)-1;
                      var_19_ws_3 = var_18_currentIndex  >  index;
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

    return var_14_node;
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
    roops.core.objectsInstrumented.LinkedList.variable_definition_0 = false;
    roops.core.objectsInstrumented.LinkedList.variable_definition_1 = false;
    roops.core.objectsInstrumented.LinkedList.variable_definition_2 = false;
    roops.core.objectsInstrumented.LinkedList.variable_definition_3 = false;
    roops.core.objectsInstrumented.LinkedList.variable_definition_4 = false;
  }

}
