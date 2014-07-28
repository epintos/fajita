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
      boolean t_13;
      boolean t_14;
      boolean t_15;
      boolean t_18;
      boolean t_19;
      boolean t_20;
      boolean var_4_terminatesInTime = true;

      t_14 = var_3_result  ==  false;

      if (t_14) {
        {
          {
            t_15 = var_2_current  !=  null;
            if (t_15) {
              {
                t_13 = true;
              }
            } else {
              {
                t_13 = false;
              }
            }
          }
        }
      } else {
        {
          t_13 = false;
        }
      }

      if (t_13) {
        {
          {
            {
              {
                {
                  boolean t_11;
                  boolean t_12;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_5_equalVal;

                  t_11 = value_param  ==  var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_11) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_5_equalVal = true;
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
                              var_5_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_12 = var_5_equalVal  ==  true;

                  if (t_12) {
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
      t_19 = var_3_result  ==  false;

      if (t_19) {
        {
          {
            t_20 = var_2_current  !=  null;
            if (t_20) {
              {
                t_18 = true;
              }
            } else {
              {
                t_18 = false;
              }
            }
          }
        }
      } else {
        {
          t_18 = false;
        }
      }
      if (t_18) {
        {
          {
            {
              {
                {
                  boolean t_16;
                  boolean t_17;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_6_equalVal;

                  t_16 = value_param  ==  var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_16) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = true;
                              var_6_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_17 = var_6_equalVal  ==  true;

                  if (t_17) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
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
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = true;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_2_current = var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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

    return var_3_result;
  }


  public void remove(int index) {
    boolean t_22;
    boolean t_32;
    boolean t_33;

    t_22 = index  <  0;

    if (t_22) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_21;

                t_21 = new java.lang.RuntimeException();
                throw t_21;
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

    {
      boolean t_24;
      boolean t_25;
      boolean t_26;
      boolean t_28;
      boolean t_29;
      boolean t_30;
      boolean var_11_terminatesInTime = true;

      t_25 = var_10_found  ==  false;

      if (t_25) {
        {
          {
            t_26 = var_7_current  !=  null;
            if (t_26) {
              {
                t_24 = true;
              }
            } else {
              {
                t_24 = false;
              }
            }
          }
        }
      } else {
        {
          t_24 = false;
        }
      }

      if (t_24) {
        {
          {
            {
              {
                {
                  boolean t_23;

                  t_23 = index  ==  var_9_current_index;
                  if (t_23) {
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
      t_29 = var_10_found  ==  false;

      if (t_29) {
        {
          {
            t_30 = var_7_current  !=  null;
            if (t_30) {
              {
                t_28 = true;
              }
            } else {
              {
                t_28 = false;
              }
            }
          }
        }
      } else {
        {
          t_28 = false;
        }
      }
      if (t_28) {
        {
          {
            {
              {
                {
                  boolean t_27;

                  t_27 = index  ==  var_9_current_index;
                  if (t_27) {
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
    t_32 = var_10_found  ==  false;

    if (t_32) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_31;

                t_31 = new java.lang.RuntimeException();
                throw t_31;
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
    t_33 = var_8_previous  ==  null;
    if (t_33) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode t_34;
    boolean t_37;

    t_34 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_12_freshNode = t_34;

    var_12_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_12_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_37 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_37) {
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
                {
                  boolean t_35;
                  boolean t_36;
                  boolean var_14_terminatesInTime = true;

                  t_35 = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_35) {
                    {
                      {
                        {
                          {
                            {
                              var_13_current = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_36 = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_36) {
                    {
                      {
                        {
                          {
                            {
                              var_13_current = var_13_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_11 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = false;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_13 = false;
  }

}
