package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;
  public static boolean roops_goal_5;
  public static boolean roops_goal_7;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_35;
    boolean t_36;
    boolean t_37;

    fajita_roopsGoal_initialization();
    boolean var_15_ret_val;

    t_36 = list  !=  null;

    if (t_36) {
      {
        {
          t_37 = list.repOK();
          if (t_37) {
            {
              t_35 = true;
            }
          } else {
            {
              t_35 = false;
            }
          }
        }
      }
    } else {
      {
        t_35 = false;
      }
    }
    if (t_35) {
      {
        {
          {
            {
              {
                boolean t_34;

                t_34 = list.contains(value_param);
                var_15_ret_val = t_34;
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


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, int arg) {
    boolean t_38;
    boolean t_39;
    boolean t_40;

    t_39 = list  !=  null;

    if (t_39) {
      {
        {
          t_40 = list.repOK();
          if (t_40) {
            {
              t_38 = true;
            }
          } else {
            {
              t_38 = false;
            }
          }
        }
      }
    } else {
      {
        t_38 = false;
      }
    }
    if (t_38) {
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
    boolean t_41;
    boolean t_42;
    boolean t_43;

    t_42 = list  !=  null;

    if (t_42) {
      {
        {
          t_43 = list.repOK();
          if (t_43) {
            {
              t_41 = true;
            }
          } else {
            {
              t_41 = false;
            }
          }
        }
      }
    } else {
      {
        t_41 = false;
      }
    }
    if (t_41) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_16_current;
    boolean var_17_result;

    var_16_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_17_result = false;
    {
      boolean t_44;
      boolean t_45;
      boolean t_46;
      boolean var_18_ws_4;

      t_45 = var_17_result  ==  false;

      if (t_45) {
        {
          {
            t_46 = var_16_current  !=  null;
            if (t_46) {
              {
                t_44 = true;
              }
            } else {
              {
                t_44 = false;
              }
            }
          }
        }
      } else {
        {
          t_44 = false;
        }
      }
      var_18_ws_4 = t_44;
      while (var_18_ws_4) {
        boolean t_47;
        boolean t_48;
        boolean t_49;
        boolean t_50;
        boolean t_51;
        boolean var_19_equalVal;

        t_47 = value_param  ==  var_16_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_47) {
          {
            {
              {
                {
                  {
                    var_19_equalVal = true;
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
                    var_19_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_48 = var_19_equalVal  ==  true;

        if (t_48) {
          {
            {
              {
                {
                  {
                    var_17_result = true;
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
        var_16_current = var_16_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
        t_50 = var_17_result  ==  false;

        if (t_50) {
          {
            {
              t_51 = var_16_current  !=  null;
              if (t_51) {
                {
                  t_49 = true;
                }
              } else {
                {
                  t_49 = false;
                }
              }
            }
          }
        } else {
          {
            t_49 = false;
          }
        }
        var_18_ws_4 = t_49;
      }
    }

    return var_17_result;
  }


  public void remove(int index) {
    boolean t_53;
    boolean t_54;
    boolean t_55;
    boolean t_56;
    boolean t_62;
    boolean t_63;

    t_53 = index  <  0;

    if (t_53) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_52;

                t_52 = new java.lang.RuntimeException();
                throw t_52;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_20_current;

    var_20_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_21_previous;

    var_21_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_22_current_index;

    var_22_current_index = 0;
    boolean var_23_found = false;
    boolean var_24_ws_5;

    t_55 = var_23_found  ==  false;

    if (t_55) {
      {
        {
          t_56 = var_20_current  !=  null;
          if (t_56) {
            {
              t_54 = true;
            }
          } else {
            {
              t_54 = false;
            }
          }
        }
      }
    } else {
      {
        t_54 = false;
      }
    }
    var_24_ws_5 = t_54;
    while (var_24_ws_5) {
      boolean t_57;
      boolean t_58;
      boolean t_59;
      boolean t_60;

      t_57 = index  ==  var_22_current_index;

      if (t_57) {
        {
          {
            {
              {
                {
                  var_23_found = true;
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
                  var_22_current_index = var_22_current_index + 1;
                  var_21_previous = var_20_current;
                  var_20_current = var_20_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_59 = var_23_found  ==  false;

      if (t_59) {
        {
          {
            t_60 = var_20_current  !=  null;
            if (t_60) {
              {
                t_58 = true;
              }
            } else {
              {
                t_58 = false;
              }
            }
          }
        }
      } else {
        {
          t_58 = false;
        }
      }
      var_24_ws_5 = t_58;
    }
    t_62 = var_23_found  ==  false;

    if (t_62) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_61;

                t_61 = new java.lang.RuntimeException();
                throw t_61;
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
    t_63 = var_21_previous  ==  null;
    if (t_63) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_20_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_21_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_20_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_64;
    boolean t_65;

    t_64 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_25_freshNode = t_64;

    var_25_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_25_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_65 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_65) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_25_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_26_current;

                var_26_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                boolean var_27_ws_6;

                var_27_ws_6 = var_26_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_27_ws_6) {
                  var_26_current = var_26_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_27_ws_6 = var_26_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                }
                var_26_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_25_freshNode;
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
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = false;
  }

}
