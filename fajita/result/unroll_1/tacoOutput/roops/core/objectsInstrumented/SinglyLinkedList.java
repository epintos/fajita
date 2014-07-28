package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;
  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static boolean roops_goal_3;
  public static boolean roops_goal_4;
  public static boolean roops_goal_5;

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_2;
    boolean t_3;
    boolean t_4;

    t_3 = list  !=  null;

    if (t_3) {
      {
        {
          t_4 = list.repOK();
          if (t_4) {
            {
              t_2 = true;
            }
          } else {
            {
              t_2 = false;
            }
          }
        }
      }
    } else {
      {
        t_2 = false;
      }
    }
    if (t_2) {
      {
        {
          {
            {
              {
                boolean t_1;

                t_1 = list.contains(value_param);
              }
            }
          }
        }
      }
    }
  }
/** @Modifies_Everything
 @Ensures false;
*/

  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, int arg) {
    boolean t_5;
    boolean t_6;
    boolean t_7;
    boolean t_8;

    fajita_roopsGoal_initialization();
    t_5 = list  !=  null;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = (t_5)  ==  false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_1 = list  !=  null;
    t_7 = list  !=  null;

    if (t_7) {
      {
        {
          t_8 = list.repOK();
          if (t_8) {
            {
              t_6 = true;
            }
          } else {
            {
              t_6 = false;
            }
          }
        }
      }
    } else {
      {
        t_6 = false;
      }
    }
    if (t_6) {
      {
        {
          {
            {
              {
                list.insertBack(arg);
              }
            }
          }
        }
      }
    }
  }


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
    boolean t_9;
    boolean t_10;
    boolean t_11;

    t_10 = list  !=  null;

    if (t_10) {
      {
        {
          t_11 = list.repOK();
          if (t_11) {
            {
              t_9 = true;
            }
          } else {
            {
              t_9 = false;
            }
          }
        }
      }
    } else {
      {
        t_9 = false;
      }
    }
    if (t_9) {
      {
        {
          {
            {
              {
                list.remove(index);
              }
            }
          }
        }
      }
    }
  }


  public boolean contains(int value_param) {
    boolean t_12;
    boolean t_13;
    boolean t_14;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_1_current;
    boolean var_2_result;

    var_1_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_2_result = false;
    boolean var_3_ws_1;

    t_13 = var_2_result  ==  false;

    if (t_13) {
      {
        {
          t_14 = var_1_current  !=  null;
          if (t_14) {
            {
              t_12 = true;
            }
          } else {
            {
              t_12 = false;
            }
          }
        }
      }
    } else {
      {
        t_12 = false;
      }
    }
    var_3_ws_1 = t_12;
    while (var_3_ws_1) {
      boolean t_15;
      boolean t_16;
      boolean t_17;
      boolean t_18;
      boolean t_19;
      boolean var_4_equalVal;

      t_15 = value_param  ==  var_1_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

      if (t_15) {
        {
          {
            {
              {
                {
                  var_4_equalVal = true;
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
                  var_4_equalVal = false;
                }
              }
            }
          }
        }
      }
      t_16 = var_4_equalVal  ==  true;

      if (t_16) {
        {
          {
            {
              {
                {
                  var_2_result = true;
                }
              }
            }
          }
        }
      }
      var_1_current = var_1_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      t_18 = var_2_result  ==  false;

      if (t_18) {
        {
          {
            t_19 = var_1_current  !=  null;
            if (t_19) {
              {
                t_17 = true;
              }
            } else {
              {
                t_17 = false;
              }
            }
          }
        }
      } else {
        {
          t_17 = false;
        }
      }
      var_3_ws_1 = t_17;
    }

    return var_2_result;
  }


  public void remove(int index) {
    boolean t_21;
    boolean t_22;
    boolean t_23;
    boolean t_24;
    boolean t_30;
    boolean t_31;

    t_21 = index  <  0;

    if (t_21) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_20;

                t_20 = new java.lang.RuntimeException();
                throw t_20;
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_5_current;

    var_5_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_6_previous;

    var_6_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_7_current_index;

    var_7_current_index = 0;
    boolean var_8_found = false;
    boolean var_9_ws_2;

    t_23 = var_8_found  ==  false;

    if (t_23) {
      {
        {
          t_24 = var_5_current  !=  null;
          if (t_24) {
            {
              t_22 = true;
            }
          } else {
            {
              t_22 = false;
            }
          }
        }
      }
    } else {
      {
        t_22 = false;
      }
    }
    var_9_ws_2 = t_22;
    while (var_9_ws_2) {
      boolean t_25;
      boolean t_26;
      boolean t_27;
      boolean t_28;

      t_25 = index  ==  var_7_current_index;

      if (t_25) {
        {
          {
            {
              {
                {
                  var_8_found = true;
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
                  var_7_current_index = var_7_current_index + 1;
                  var_6_previous = var_5_current;
                  var_5_current = var_5_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_27 = var_8_found  ==  false;

      if (t_27) {
        {
          {
            t_28 = var_5_current  !=  null;
            if (t_28) {
              {
                t_26 = true;
              }
            } else {
              {
                t_26 = false;
              }
            }
          }
        }
      } else {
        {
          t_26 = false;
        }
      }
      var_9_ws_2 = t_26;
    }
    t_30 = var_8_found  ==  false;

    if (t_30) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_29;

                t_29 = new java.lang.RuntimeException();
                throw t_29;
              }
            }
          }
        }
      }
    }
    t_31 = var_6_previous  ==  null;
    if (t_31) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_5_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_6_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_5_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_32;
    boolean t_33;
    boolean t_35;

    t_32 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_10_freshNode = t_32;

    var_10_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_10_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_33 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = (t_33)  ==  false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    t_35 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_35) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_10_freshNode;
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
                boolean t_34;
                roops.core.objectsInstrumented.SinglyLinkedListNode var_11_current;

                var_11_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                t_34 = var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = (t_34)  ==  false;
                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                boolean var_12_ws_3;

                var_12_ws_3 = var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_12_ws_3) {
                  var_11_current = var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_12_ws_3 = var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                }
                var_11_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_10_freshNode;
              }
            }
          }
        }
      }
    }
  }


  public SinglyLinkedList() {
    this.roops_core_objectsInstrumented_SinglyLinkedList_header = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_1 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = false;
  }

}
