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
  public static boolean roops_goal_6;
  public static boolean roops_goal_7;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_2;
    boolean t_3;
    boolean t_4;

    fajita_roopsGoal_initialization();
    boolean var_1_ret_val;

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

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_1 = list.contains(value_param);
                var_1_ret_val = t_1;
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
                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_1 = true;
              }
            }
          }
        }
      }
    }
  }


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, int arg) {
    boolean t_5;
    boolean t_6;
    boolean t_7;

    t_6 = list  !=  null;

    if (t_6) {
      {
        {
          t_7 = list.repOK();
          if (t_7) {
            {
              t_5 = true;
            }
          } else {
            {
              t_5 = false;
            }
          }
        }
      }
    } else {
      {
        t_5 = false;
      }
    }
    if (t_5) {
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
    } else {
      {
        {
          {
            {
              {
              }
            }
          }
        }
      }
    }
  }


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
    boolean t_8;
    boolean t_9;
    boolean t_10;

    t_9 = list  !=  null;

    if (t_9) {
      {
        {
          t_10 = list.repOK();
          if (t_10) {
            {
              t_8 = true;
            }
          } else {
            {
              t_8 = false;
            }
          }
        }
      }
    } else {
      {
        t_8 = false;
      }
    }
    if (t_8) {
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
    } else {
      {
        {
          {
            {
              {
              }
            }
          }
        }
      }
    }
  }


  public boolean contains(int value_param) {
    roops.core.objectsInstrumented.SinglyLinkedListNode var_2_current;
    boolean var_3_result;

    var_2_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_3_result = false;
    {
      boolean t_11;
      boolean t_12;
      boolean t_13;
      boolean t_19;
      boolean var_4_fajita_cicle_2 = false;
      boolean var_5_ws_1;

      t_12 = var_3_result  ==  false;

      if (t_12) {
        {
          {
            t_13 = var_2_current  !=  null;
            if (t_13) {
              {
                t_11 = true;
              }
            } else {
              {
                t_11 = false;
              }
            }
          }
        }
      } else {
        {
          t_11 = false;
        }
      }
      var_5_ws_1 = t_11;
      while (var_5_ws_1) {
        boolean t_14;
        boolean t_15;
        boolean t_16;
        boolean t_17;
        boolean t_18;

        var_4_fajita_cicle_2 = true;
        roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
        boolean var_6_equalVal;

        t_14 = value_param  ==  var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_14) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                    var_6_equalVal = true;
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
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = true;
                    var_6_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_15 = var_6_equalVal  ==  true;

        if (t_15) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                    var_3_result = true;
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
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = true;
                  }
                }
              }
            }
          }
        }
        var_2_current = var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
        t_17 = var_3_result  ==  false;

        if (t_17) {
          {
            {
              t_18 = var_2_current  !=  null;
              if (t_18) {
                {
                  t_16 = true;
                }
              } else {
                {
                  t_16 = false;
                }
              }
            }
          }
        } else {
          {
            t_16 = false;
          }
        }
        var_5_ws_1 = t_16;
      }
      t_19 = ! var_4_fajita_cicle_2;
      if (t_19) {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = true;
                }
              }
            }
          }
        }
      }
    }

    return var_3_result;
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
    } else {
      {
        {
          {
            {
              {
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_7_current;

    var_7_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_8_previous;

    var_8_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_9_current_index;

    var_9_current_index = 0;
    boolean var_10_found = false;
    boolean var_11_ws_2;

    t_23 = var_10_found  ==  false;

    if (t_23) {
      {
        {
          t_24 = var_7_current  !=  null;
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
    var_11_ws_2 = t_22;
    while (var_11_ws_2) {
      boolean t_25;
      boolean t_26;
      boolean t_27;
      boolean t_28;

      t_25 = index  ==  var_9_current_index;

      if (t_25) {
        {
          {
            {
              {
                {
                  var_10_found = true;
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
                  var_9_current_index = var_9_current_index + 1;
                  var_8_previous = var_7_current;
                  var_7_current = var_7_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_27 = var_10_found  ==  false;

      if (t_27) {
        {
          {
            t_28 = var_7_current  !=  null;
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
      var_11_ws_2 = t_26;
    }
    t_30 = var_10_found  ==  false;

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
    } else {
      {
        {
          {
            {
              {
              }
            }
          }
        }
      }
    }
    t_31 = var_8_previous  ==  null;
    if (t_31) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_7_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_8_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_7_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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

    t_32 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_12_freshNode = t_32;

    var_12_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_12_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_33 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_33) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_12_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_13_current;

                var_13_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                boolean var_14_ws_3;

                var_14_ws_3 = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_14_ws_3) {
                  var_13_current = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_14_ws_3 = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                }
                var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_12_freshNode;
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
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = false;
  }

}
