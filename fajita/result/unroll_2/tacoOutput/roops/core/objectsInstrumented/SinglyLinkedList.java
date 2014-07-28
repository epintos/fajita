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
  public static boolean roops_goal_7;
  public static boolean roops_goal_8;
  public static boolean roops_goal_9;
  public static boolean roops_goal_10;
  public static boolean roops_goal_11;
  public static boolean roops_goal_12;
  public static boolean roops_goal_13;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, int value_param) {
    boolean t_76;
    boolean t_77;
    boolean t_78;

    fajita_roopsGoal_initialization();
    boolean var_29_ret_val;

    t_77 = list  !=  null;

    if (t_77) {
      {
        {
          t_78 = list.repOK();
          if (t_78) {
            {
              t_76 = true;
            }
          } else {
            {
              t_76 = false;
            }
          }
        }
      }
    } else {
      {
        t_76 = false;
      }
    }
    if (t_76) {
      {
        {
          {
            {
              {
                boolean t_75;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_75 = list.contains(value_param);
                var_29_ret_val = t_75;
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
    boolean t_79;
    boolean t_80;
    boolean t_81;

    t_80 = list  !=  null;

    if (t_80) {
      {
        {
          t_81 = list.repOK();
          if (t_81) {
            {
              t_79 = true;
            }
          } else {
            {
              t_79 = false;
            }
          }
        }
      }
    } else {
      {
        t_79 = false;
      }
    }
    if (t_79) {
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
    boolean t_82;
    boolean t_83;
    boolean t_84;

    t_83 = list  !=  null;

    if (t_83) {
      {
        {
          t_84 = list.repOK();
          if (t_84) {
            {
              t_82 = true;
            }
          } else {
            {
              t_82 = false;
            }
          }
        }
      }
    } else {
      {
        t_82 = false;
      }
    }
    if (t_82) {
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
      boolean t_87;
      boolean t_88;
      boolean t_89;
      boolean t_92;
      boolean t_93;
      boolean t_94;
      boolean var_32_terminatesInTime = true;

      t_88 = var_31_result  ==  false;

      if (t_88) {
        {
          {
            t_89 = var_30_current  !=  null;
            if (t_89) {
              {
                t_87 = true;
              }
            } else {
              {
                t_87 = false;
              }
            }
          }
        }
      } else {
        {
          t_87 = false;
        }
      }

      if (t_87) {
        {
          {
            {
              {
                {
                  boolean t_85;
                  boolean t_86;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_33_equalVal;

                  t_85 = value_param  ==  var_30_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_85) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_33_equalVal = true;
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
                              var_33_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_86 = var_33_equalVal  ==  true;

                  if (t_86) {
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
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = true;
                }
              }
            }
          }
        }
      }
      t_93 = var_31_result  ==  false;

      if (t_93) {
        {
          {
            t_94 = var_30_current  !=  null;
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
      if (t_92) {
        {
          {
            {
              {
                {
                  boolean t_90;
                  boolean t_91;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_34_equalVal;

                  t_90 = value_param  ==  var_30_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_90) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = true;
                              var_34_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_91 = var_34_equalVal  ==  true;

                  if (t_91) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_30_current = var_30_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = true;
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
    boolean t_96;
    boolean t_106;
    boolean t_107;

    t_96 = index  <  0;

    if (t_96) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_95;

                t_95 = new java.lang.RuntimeException();
                throw t_95;
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

    {
      boolean t_98;
      boolean t_99;
      boolean t_100;
      boolean t_102;
      boolean t_103;
      boolean t_104;
      boolean var_39_terminatesInTime = true;

      t_99 = var_38_found  ==  false;

      if (t_99) {
        {
          {
            t_100 = var_35_current  !=  null;
            if (t_100) {
              {
                t_98 = true;
              }
            } else {
              {
                t_98 = false;
              }
            }
          }
        }
      } else {
        {
          t_98 = false;
        }
      }

      if (t_98) {
        {
          {
            {
              {
                {
                  boolean t_97;

                  t_97 = index  ==  var_37_current_index;
                  if (t_97) {
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
      t_103 = var_38_found  ==  false;

      if (t_103) {
        {
          {
            t_104 = var_35_current  !=  null;
            if (t_104) {
              {
                t_102 = true;
              }
            } else {
              {
                t_102 = false;
              }
            }
          }
        }
      } else {
        {
          t_102 = false;
        }
      }
      if (t_102) {
        {
          {
            {
              {
                {
                  boolean t_101;

                  t_101 = index  ==  var_37_current_index;
                  if (t_101) {
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
    t_106 = var_38_found  ==  false;

    if (t_106) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_105;

                t_105 = new java.lang.RuntimeException();
                throw t_105;
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
    t_107 = var_36_previous  ==  null;
    if (t_107) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode t_108;
    boolean t_111;

    t_108 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_40_freshNode = t_108;

    var_40_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_40_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_111 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_111) {
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
                {
                  boolean t_109;
                  boolean t_110;
                  boolean var_42_terminatesInTime = true;

                  t_109 = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_109) {
                    {
                      {
                        {
                          {
                            {
                              var_41_current = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_110 = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_110) {
                    {
                      {
                        {
                          {
                            {
                              var_41_current = var_41_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = false;
  }

}
