package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;
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
  public static roops.utilInstrumented.RoopsArray myRoopsArray;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;
  public static boolean variable_definition_5;
  public static boolean variable_definition_6;
  public static boolean variable_definition_7;
  public static boolean variable_definition_8;
  public static boolean variable_definition_9;
  public static boolean variable_definition_10;
  public static boolean variable_definition_11;
  public static boolean variable_definition_12;
  public static boolean variable_definition_13;
  public static boolean variable_definition_14;
  public static boolean variable_definition_15;/** @Modifies_Everything
 @Ensures false;
*/

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object value_param) {
    boolean t_74;
    boolean t_75;
    boolean t_76;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = true;
    boolean var_27_ret_val;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = true;
    t_75 = list  !=  null;
    t_76 = list.repOK();

    if (t_75) {
      {
        {
          if (t_76) {
            {
              {
                t_74 = true;
              }
            }
          } else {
            {
              {
                t_74 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_74 = false;
        }
      }
    }
    if (t_74) {
      {
        {
          {
            {
              {
                {
                  boolean t_73;

                  t_73 = list.contains(value_param);
                  var_27_ret_val = t_73;
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1;
                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_3 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0;
                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_3 = true;
                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = false;
                }
              }
            }
          }
        }
      }
    }
  }


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object arg) {
    boolean t_77;
    boolean t_78;
    boolean t_79;

    t_78 = list  !=  null;
    t_79 = list.repOK();

    if (t_78) {
      {
        {
          if (t_79) {
            {
              {
                t_77 = true;
              }
            }
          } else {
            {
              {
                t_77 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_77 = false;
        }
      }
    }
    if (t_77) {
      {
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
  }


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
    boolean t_80;
    boolean t_81;
    boolean t_82;

    t_81 = list  !=  null;
    t_82 = list.repOK();

    if (t_81) {
      {
        {
          if (t_82) {
            {
              {
                t_80 = true;
              }
            }
          } else {
            {
              {
                t_80 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_80 = false;
        }
      }
    }
    if (t_80) {
      {
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
  }


  public boolean contains(java.lang.Object value_param) {
    boolean t_83;
    boolean t_84;
    boolean t_85;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = true;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_28_current;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = true;
    boolean var_29_result;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = true;
    var_28_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = true;
    var_29_result = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
    boolean var_30_ws_7;

    t_84 = var_29_result  ==  false;
    t_85 = var_28_current  !=  null;

    if (t_84) {
      {
        {
          if (t_85) {
            {
              {
                t_83 = true;
              }
            }
          } else {
            {
              {
                t_83 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_83 = false;
        }
      }
    }
    var_30_ws_7 = t_83;
    while (var_30_ws_7) {
      boolean t_88;
      boolean t_89;
      boolean t_90;
      boolean t_91;
      boolean t_92;
      boolean t_93;
      boolean t_94;
      boolean var_31_equalVal;

      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      t_89 = value_param  ==  null;
      t_90 = var_28_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value  ==  null;

      if (t_89) {
        {
          {
            if (t_90) {
              {
                {
                  t_88 = true;
                }
              }
            } else {
              {
                {
                  t_88 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_88 = false;
          }
        }
      }

      if (t_88) {
        {
          {
            {
              {
                {
                  {
                    var_31_equalVal = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
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
                    boolean t_87;

                    t_87 = value_param  !=  null;
                    if (t_87) {
                      {
                        {
                          {
                            {
                              {
                                {
                                  boolean t_86;

                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
                                  t_86 = value_param  ==  var_28_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;
                                  if (t_86) {
                                    {
                                      {
                                        {
                                          {
                                            {
                                              {
                                                var_31_equalVal = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
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
                                                var_31_equalVal = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = true;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
                                                roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
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
                    } else {
                      {
                        {
                          {
                            {
                              {
                                {
                                  var_31_equalVal = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13 = true;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
                                  roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = false;
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
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_14 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13;
      t_91 = var_31_equalVal  ==  true;

      if (t_91) {
        {
          {
            {
              {
                {
                  {
                    var_29_result = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
                  }
                }
              }
            }
          }
        }
      }
      var_28_current = var_28_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
      t_93 = var_29_result  ==  false;
      t_94 = var_28_current  !=  null;

      if (t_93) {
        {
          {
            if (t_94) {
              {
                {
                  t_92 = true;
                }
              }
            } else {
              {
                {
                  t_92 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_92 = false;
          }
        }
      }
      var_30_ws_7 = t_92;
    }
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14;

    return var_29_result;
  }


  public void remove(int index) {
    boolean t_96;
    boolean t_97;
    boolean t_98;
    boolean t_99;
    boolean t_105;
    boolean t_106;

    t_96 = index  <  0;

    if (t_96) {
      {
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
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_32_current;

    var_32_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_33_previous;

    var_33_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_34_current_index;

    var_34_current_index = 0;
    boolean var_35_found = false;
    boolean var_36_ws_8;

    t_98 = var_35_found  ==  false;
    t_99 = var_32_current  !=  null;

    if (t_98) {
      {
        {
          if (t_99) {
            {
              {
                t_97 = true;
              }
            }
          } else {
            {
              {
                t_97 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_97 = false;
        }
      }
    }
    var_36_ws_8 = t_97;
    while (var_36_ws_8) {
      boolean t_100;
      boolean t_101;
      boolean t_102;
      boolean t_103;

      t_100 = index  ==  var_34_current_index;

      if (t_100) {
        {
          {
            {
              {
                {
                  {
                    var_35_found = true;
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
                    var_34_current_index = var_34_current_index + 1;
                    var_33_previous = var_32_current;
                    var_32_current = var_32_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  }
                }
              }
            }
          }
        }
      }
      t_102 = var_35_found  ==  false;
      t_103 = var_32_current  !=  null;

      if (t_102) {
        {
          {
            if (t_103) {
              {
                {
                  t_101 = true;
                }
              }
            } else {
              {
                {
                  t_101 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_101 = false;
          }
        }
      }
      var_36_ws_8 = t_101;
    }
    t_105 = var_35_found  ==  false;

    if (t_105) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_104;

                  t_104 = new java.lang.RuntimeException();
                  throw t_104;
                }
              }
            }
          }
        }
      }
    }
    t_106 = var_33_previous  ==  null;
    if (t_106) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_32_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  var_33_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_32_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(java.lang.Object arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_107;
    boolean t_108;

    t_107 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_37_freshNode = t_107;

    var_37_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_37_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_108 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_108) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_37_freshNode;
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
                  roops.core.objectsInstrumented.SinglyLinkedListNode var_38_current;

                  var_38_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                  boolean var_39_ws_9;

                  var_39_ws_9 = var_38_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  while (var_39_ws_9) {
                    var_38_current = var_38_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                    var_39_ws_9 = var_38_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  }
                  var_38_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_37_freshNode;
                }
              }
            }
          }
        }
      }
    }
  }


  public SinglyLinkedList() {
    {
    }
  }


  public boolean repOK() {
    return true;
  }


  public static void fajita_roopsGoal_initialization() {
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
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_14 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_3 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_10 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_11 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_12 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_13 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.myRoopsArray = ((roops.utilInstrumented.RoopsArray)(null));
  }

}
