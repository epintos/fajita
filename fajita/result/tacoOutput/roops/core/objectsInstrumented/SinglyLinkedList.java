package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  public roops.core.objectsInstrumented.SinglyLinkedListNode roops_core_objectsInstrumented_SinglyLinkedList_header;

  public static void containsTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object value_param) {
    boolean t_2;
    boolean t_3;
    boolean t_4;
    boolean var_1_ret_val;

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

                  t_1 = list.contains(value_param);
                  var_1_ret_val = t_1;
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
                }
              }
            }
          }
        }
      }
    }
  }


  public static void insertBackTest(roops.core.objectsInstrumented.SinglyLinkedList list, java.lang.Object arg) {
    boolean t_5;
    boolean t_6;
    boolean t_7;

    t_6 = list  !=  null;
    t_7 = list.repOK();

    if (t_6) {
      {
        {
          if (t_7) {
            {
              {
                t_5 = true;
              }
            }
          } else {
            {
              {
                t_5 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_5 = false;
        }
      }
    }
    if (t_5) {
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
    } else {
      {
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
  }


  public static void removeTest(roops.core.objectsInstrumented.SinglyLinkedList list, int index) {
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
                  list.remove(index);
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
                }
              }
            }
          }
        }
      }
    }
  }


  public boolean contains(java.lang.Object value_param) {
    boolean t_11;
    boolean t_12;
    boolean t_13;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_2_current;
    boolean var_3_result;

    var_2_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_3_result = false;
    boolean var_4_ws_1;

    t_12 = var_3_result  ==  false;
    t_13 = var_2_current  !=  null;

    if (t_12) {
      {
        {
          if (t_13) {
            {
              {
                t_11 = true;
              }
            }
          } else {
            {
              {
                t_11 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_11 = false;
        }
      }
    }
    var_4_ws_1 = t_11;
    while (var_4_ws_1) {
      boolean t_16;
      boolean t_17;
      boolean t_18;
      boolean t_19;
      boolean t_20;
      boolean t_21;
      boolean t_22;
      boolean var_5_equalVal;

      t_17 = value_param  ==  null;
      t_18 = var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value  ==  null;

      if (t_17) {
        {
          {
            if (t_18) {
              {
                {
                  t_16 = true;
                }
              }
            } else {
              {
                {
                  t_16 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_16 = false;
          }
        }
      }

      if (t_16) {
        {
          {
            {
              {
                {
                  {
                    var_5_equalVal = true;
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
                    boolean t_15;

                    t_15 = value_param  !=  null;
                    if (t_15) {
                      {
                        {
                          {
                            {
                              {
                                {
                                  boolean t_14;

                                  t_14 = value_param  ==  var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;
                                  if (t_14) {
                                    {
                                      {
                                        {
                                          {
                                            {
                                              {
                                                var_5_equalVal = true;
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
                                                var_5_equalVal = false;
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
                                  var_5_equalVal = false;
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
      t_19 = var_5_equalVal  ==  true;

      if (t_19) {
        {
          {
            {
              {
                {
                  {
                    var_3_result = true;
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
                  }
                }
              }
            }
          }
        }
      }
      var_2_current = var_2_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      t_21 = var_3_result  ==  false;
      t_22 = var_2_current  !=  null;

      if (t_21) {
        {
          {
            if (t_22) {
              {
                {
                  t_20 = true;
                }
              }
            } else {
              {
                {
                  t_20 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_20 = false;
          }
        }
      }
      var_4_ws_1 = t_20;
    }

    return var_3_result;
  }


  public void remove(int index) {
    boolean t_24;
    boolean t_25;
    boolean t_26;
    boolean t_27;
    boolean t_33;
    boolean t_34;

    t_24 = index  <  0;

    if (t_24) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_23;

                  t_23 = new java.lang.RuntimeException();
                  throw t_23;
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
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_6_current;

    var_6_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_7_previous;

    var_7_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_8_current_index;

    var_8_current_index = 0;
    boolean var_9_found = false;
    boolean var_10_ws_2;

    t_26 = var_9_found  ==  false;
    t_27 = var_6_current  !=  null;

    if (t_26) {
      {
        {
          if (t_27) {
            {
              {
                t_25 = true;
              }
            }
          } else {
            {
              {
                t_25 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_25 = false;
        }
      }
    }
    var_10_ws_2 = t_25;
    while (var_10_ws_2) {
      boolean t_28;
      boolean t_29;
      boolean t_30;
      boolean t_31;

      t_28 = index  ==  var_8_current_index;

      if (t_28) {
        {
          {
            {
              {
                {
                  {
                    var_9_found = true;
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
                    var_8_current_index = var_8_current_index + 1;
                    var_7_previous = var_6_current;
                    var_6_current = var_6_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  }
                }
              }
            }
          }
        }
      }
      t_30 = var_9_found  ==  false;
      t_31 = var_6_current  !=  null;

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
      var_10_ws_2 = t_29;
    }
    t_33 = var_9_found  ==  false;

    if (t_33) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_32;

                  t_32 = new java.lang.RuntimeException();
                  throw t_32;
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
                }
              }
            }
          }
        }
      }
    }
    t_34 = var_7_previous  ==  null;
    if (t_34) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_6_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  var_7_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_6_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(java.lang.Object arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_35;
    boolean t_36;

    t_35 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_11_freshNode = t_35;

    var_11_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_11_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_36 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_36) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_11_freshNode;
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
                  roops.core.objectsInstrumented.SinglyLinkedListNode var_12_current;

                  var_12_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                  boolean var_13_ws_3;

                  var_13_ws_3 = var_12_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  while (var_13_ws_3) {
                    var_12_current = var_12_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                    var_13_ws_3 = var_12_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  }
                  var_12_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_11_freshNode;
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

}
