package roops.core.objects;

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

  public /*@ nullable @*/ roops.core.objects.LinkedListNode roops_core_objects_LinkedList_header;
  public int roops_core_objects_LinkedList_size;
  public int roops_core_objects_LinkedList_modCount;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static roops.util.RoopsArray myRoopsArray;/** @Modifies_Everything
 @Ensures false;
*/

  public static void addLastTest(roops.core.objects.LinkedList list, java.lang.Object o) {
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
                  boolean var_1_ret_val = t_1;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void containsTest(roops.core.objects.LinkedList list, java.lang.Object arg) {
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
                  boolean var_2_ret_val = t_5;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void removeIndexTest(roops.core.objects.LinkedList list, int index) {
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
                  java.lang.Object var_3_ret_val = t_9;
                }
              }
            }
          }
        }
      }
    }
  }


  public void init() {
    roops.core.objects.LinkedListNode t_13;

    t_13 = this.createHeaderNode();
    this.roops_core_objects_LinkedList_header = t_13;
  }


  public int indexOf(java.lang.Object new_value) {
    int var_4_i = 0;

    {
      roops.core.objects.LinkedListNode var_5_node = this.roops_core_objects_LinkedList_header.roops_core_objects_LinkedListNode_next;
      boolean var_6_ws_1;

      var_6_ws_1 = var_5_node  !=  this.roops_core_objects_LinkedList_header;
      while (var_6_ws_1) {
        boolean t_14;
        int t_15;

        {
          roops.core.objects.LinkedList.roops_goal_0 = true;
        }
        t_14 = this.isEqualValue(var_5_node.roops_core_objects_LinkedListNode_object_value, new_value);

        if (t_14) {
          {
            {
              {
                {
                  {
                    {
                      {
                        roops.core.objects.LinkedList.roops_goal_1 = true;
                      }

                      return var_4_i;
                    }
                  }
                }
              }
            }
          }
        }
        t_15 = var_4_i;
        var_4_i = var_4_i + (byte)1;
        var_5_node = var_5_node.roops_core_objects_LinkedListNode_next;
        var_6_ws_1 = var_5_node  !=  this.roops_core_objects_LinkedList_header;
      }
    }
    {
      roops.core.objects.LinkedList.roops_goal_2 = true;
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
    roops.core.objects.LinkedListNode t_18;

    t_18 = this.getNode(index, false);
    roops.core.objects.LinkedListNode var_7_node = t_18;
    java.lang.Object var_8_oldValue = var_7_node.roops_core_objects_LinkedListNode_object_value;

    this.removeNode(var_7_node);
    {
    }

    return var_8_oldValue;
  }


  public boolean addLast(java.lang.Object o) {
    this.addNodeBefore(this.roops_core_objects_LinkedList_header, o);

    return true;
  }


  public boolean isEqualValue(java.lang.Object value1, java.lang.Object value2) {
    boolean t_21;
    boolean var_9_ret_val;

    t_21 = value1  ==  value2;
    if (t_21) {
      {
        {
          {
            {
              {
                {
                  var_9_ret_val = true;
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
                                var_9_ret_val = false;
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
                                var_9_ret_val = t_19;
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

    return var_9_ret_val;
  }


  public roops.core.objects.LinkedListNode createHeaderNode() {
    roops.core.objects.LinkedListNode t_22;

    t_22 = new roops.core.objects.LinkedListNode();
    roops.core.objects.LinkedListNode var_10_linkedListNode = t_22;

    var_10_linkedListNode.roops_core_objects_LinkedListNode_next = var_10_linkedListNode;
    var_10_linkedListNode.roops_core_objects_LinkedListNode_previous = var_10_linkedListNode;

    return var_10_linkedListNode;
  }


  public roops.core.objects.LinkedListNode createNode(java.lang.Object new_object_value) {
    roops.core.objects.LinkedListNode t_23;

    {
      roops.core.objects.LinkedList.roops_goal_0 = true;
    }
    t_23 = new roops.core.objects.LinkedListNode();
    roops.core.objects.LinkedListNode var_11_node = t_23;

    var_11_node.roops_core_objects_LinkedListNode_previous = var_11_node;
    var_11_node.roops_core_objects_LinkedListNode_next = var_11_node;
    var_11_node.roops_core_objects_LinkedListNode_object_value = new_object_value;

    return var_11_node;
  }


  public void addNodeBefore(roops.core.objects.LinkedListNode node, java.lang.Object new_object_value) {
    roops.core.objects.LinkedListNode t_24;

    t_24 = this.createNode(new_object_value);
    roops.core.objects.LinkedListNode var_12_newNode = t_24;

    {
      roops.core.objects.LinkedList.roops_goal_1 = true;
    }
    this.addNode(var_12_newNode, node);
  }


  public void addNode(roops.core.objects.LinkedListNode nodeToInsert, roops.core.objects.LinkedListNode insertBeforeNode) {
    int t_25;
    int t_26;

    nodeToInsert.roops_core_objects_LinkedListNode_next = insertBeforeNode;
    nodeToInsert.roops_core_objects_LinkedListNode_previous = insertBeforeNode.roops_core_objects_LinkedListNode_previous;
    insertBeforeNode.roops_core_objects_LinkedListNode_previous.roops_core_objects_LinkedListNode_next = nodeToInsert;
    insertBeforeNode.roops_core_objects_LinkedListNode_previous = nodeToInsert;
    t_25 = this.roops_core_objects_LinkedList_size;
    this.roops_core_objects_LinkedList_size = this.roops_core_objects_LinkedList_size + (byte)1;
    t_26 = this.roops_core_objects_LinkedList_modCount;
    this.roops_core_objects_LinkedList_modCount = this.roops_core_objects_LinkedList_modCount + (byte)1;
    {
      roops.core.objects.LinkedList.roops_goal_2 = true;
    }
  }


  public void removeNode(roops.core.objects.LinkedListNode node) {
    int t_27;
    int t_28;

    node.roops_core_objects_LinkedListNode_previous.roops_core_objects_LinkedListNode_next = node.roops_core_objects_LinkedListNode_next;
    node.roops_core_objects_LinkedListNode_next.roops_core_objects_LinkedListNode_previous = node.roops_core_objects_LinkedListNode_previous;
    t_27 = this.roops_core_objects_LinkedList_size;
    this.roops_core_objects_LinkedList_size = this.roops_core_objects_LinkedList_size + (byte)-1;
    t_28 = this.roops_core_objects_LinkedList_modCount;
    this.roops_core_objects_LinkedList_modCount = this.roops_core_objects_LinkedList_modCount + (byte)1;
    {
    }
  }


  public roops.core.objects.LinkedListNode getNode(int index, boolean endMarkerAllowed) {
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
                    roops.core.objects.LinkedList.roops_goal_0 = true;
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
    t_34 = index  ==  this.roops_core_objects_LinkedList_size;

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
                    roops.core.objects.LinkedList.roops_goal_1 = true;
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
    t_36 = index  >  this.roops_core_objects_LinkedList_size;

    if (t_36) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_35;

                  {
                    roops.core.objects.LinkedList.roops_goal_2 = true;
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
    roops.core.objects.LinkedListNode var_13_node;

    t_37 = this.roops_core_objects_LinkedList_size  >>  (byte)1;
    int var_14_size_div_2 = t_37;

    t_40 = index  <  var_14_size_div_2;

    if (t_40) {
      {
        {
          {
            {
              {
                {
                  {
                  }
                  var_13_node = this.roops_core_objects_LinkedList_header.roops_core_objects_LinkedListNode_next;
                  {
                    int var_15_currentIndex = 0;
                    boolean var_16_ws_2;

                    var_16_ws_2 = var_15_currentIndex  <  index;
                    while (var_16_ws_2) {
                      int t_38;

                      {
                      }
                      var_13_node = var_13_node.roops_core_objects_LinkedListNode_next;
                      t_38 = var_15_currentIndex;
                      var_15_currentIndex = var_15_currentIndex + (byte)1;
                      var_16_ws_2 = var_15_currentIndex  <  index;
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
                  var_13_node = this.roops_core_objects_LinkedList_header;
                  {
                    int var_17_currentIndex = this.roops_core_objects_LinkedList_size;
                    boolean var_18_ws_3;

                    var_18_ws_3 = var_17_currentIndex  >  index;
                    while (var_18_ws_3) {
                      int t_39;

                      {
                      }
                      var_13_node = var_13_node.roops_core_objects_LinkedListNode_previous;
                      t_39 = var_17_currentIndex;
                      var_17_currentIndex = var_17_currentIndex + (byte)-1;
                      var_18_ws_3 = var_17_currentIndex  >  index;
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

    return var_13_node;
  }


  public LinkedList() {
    this.roops_core_objects_LinkedList_header = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_LinkedList_size = (byte)0;
    this.roops_core_objects_LinkedList_modCount = (byte)0;
    {
      this.init();
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objects.LinkedList.roops_goal_0 = false;
    roops.core.objects.LinkedList.roops_goal_1 = false;
    roops.core.objects.LinkedList.roops_goal_2 = false;
    roops.core.objects.LinkedList.myRoopsArray = ((roops.util.RoopsArray)(null));
  }

}
