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
    boolean t_72;
    boolean t_73;
    boolean t_74;

    fajita_roopsGoal_initialization();
    boolean var_29_ret_val;

    t_73 = list  !=  null;

    if (t_73) {
      {
        {
          t_74 = list.repOK();
          if (t_74) {
            {
              t_72 = true;
            }
          } else {
            {
              t_72 = false;
            }
          }
        }
      }
    } else {
      {
        t_72 = false;
      }
    }
    if (t_72) {
      {
        {
          {
            {
              {
                boolean t_71;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_71 = list.contains(value_param);
                var_29_ret_val = t_71;
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
    boolean t_75;
    boolean t_76;
    boolean t_77;

    t_76 = list  !=  null;

    if (t_76) {
      {
        {
          t_77 = list.repOK();
          if (t_77) {
            {
              t_75 = true;
            }
          } else {
            {
              t_75 = false;
            }
          }
        }
      }
    } else {
      {
        t_75 = false;
      }
    }
    if (t_75) {
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
    boolean t_78;
    boolean t_79;
    boolean t_80;

    t_79 = list  !=  null;

    if (t_79) {
      {
        {
          t_80 = list.repOK();
          if (t_80) {
            {
              t_78 = true;
            }
          } else {
            {
              t_78 = false;
            }
          }
        }
      }
    } else {
      {
        t_78 = false;
      }
    }
    if (t_78) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_30_current;
    boolean var_31_result;

    var_30_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_31_result = false;
    {
      boolean t_81;
      boolean t_82;
      boolean t_83;
      boolean t_89;
      boolean var_32_fajita_cicle_2 = false;
      boolean var_33_ws_4;

      t_82 = var_31_result  ==  false;

      if (t_82) {
        {
          {
            t_83 = var_30_current  !=  null;
            if (t_83) {
              {
                t_81 = true;
              }
            } else {
              {
                t_81 = false;
              }
            }
          }
        }
      } else {
        {
          t_81 = false;
        }
      }
      var_33_ws_4 = t_81;
      while (var_33_ws_4) {
        boolean t_84;
        boolean t_85;
        boolean t_86;
        boolean t_87;
        boolean t_88;

        var_32_fajita_cicle_2 = true;
        roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
        boolean var_34_equalVal;

        t_84 = value_param  ==  var_30_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_84) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                    var_34_equalVal = true;
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
                    var_34_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_85 = var_34_equalVal  ==  true;

        if (t_85) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                    var_31_result = true;
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
        var_30_current = var_30_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
        t_87 = var_31_result  ==  false;

        if (t_87) {
          {
            {
              t_88 = var_30_current  !=  null;
              if (t_88) {
                {
                  t_86 = true;
                }
              } else {
                {
                  t_86 = false;
                }
              }
            }
          }
        } else {
          {
            t_86 = false;
          }
        }
        var_33_ws_4 = t_86;
      }
      t_89 = ! var_32_fajita_cicle_2;
      if (t_89) {
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

    return var_31_result;
  }


  public void remove(int index) {
    boolean t_91;
    boolean t_92;
    boolean t_93;
    boolean t_94;
    boolean t_100;
    boolean t_101;

    t_91 = index  <  0;

    if (t_91) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_90;

                t_90 = new java.lang.RuntimeException();
                throw t_90;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_35_current;

    var_35_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_36_previous;

    var_36_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_37_current_index;

    var_37_current_index = 0;
    boolean var_38_found = false;
    boolean var_39_ws_5;

    t_93 = var_38_found  ==  false;

    if (t_93) {
      {
        {
          t_94 = var_35_current  !=  null;
          if (t_94) {
            {
              t_92 = true;
            }
          } else {
            {
              t_92 = false;
            }
          }
        }
      }
    } else {
      {
        t_92 = false;
      }
    }
    var_39_ws_5 = t_92;
    while (var_39_ws_5) {
      boolean t_95;
      boolean t_96;
      boolean t_97;
      boolean t_98;

      t_95 = index  ==  var_37_current_index;

      if (t_95) {
        {
          {
            {
              {
                {
                  var_38_found = true;
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
                  var_37_current_index = var_37_current_index + 1;
                  var_36_previous = var_35_current;
                  var_35_current = var_35_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_97 = var_38_found  ==  false;

      if (t_97) {
        {
          {
            t_98 = var_35_current  !=  null;
            if (t_98) {
              {
                t_96 = true;
              }
            } else {
              {
                t_96 = false;
              }
            }
          }
        }
      } else {
        {
          t_96 = false;
        }
      }
      var_39_ws_5 = t_96;
    }
    t_100 = var_38_found  ==  false;

    if (t_100) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_99;

                t_99 = new java.lang.RuntimeException();
                throw t_99;
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
    t_101 = var_36_previous  ==  null;
    if (t_101) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_35_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_36_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_35_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_102;
    boolean t_103;

    t_102 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_40_freshNode = t_102;

    var_40_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_40_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_103 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_103) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_40_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_41_current;

                var_41_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                boolean var_42_ws_6;

                var_42_ws_6 = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_42_ws_6) {
                  var_41_current = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_42_ws_6 = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                }
                var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_40_freshNode;
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
