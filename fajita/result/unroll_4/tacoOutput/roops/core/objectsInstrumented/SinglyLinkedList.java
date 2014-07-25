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
    boolean t_218;
    boolean t_219;
    boolean t_220;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = true;
    boolean var_79_ret_val;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = true;
    t_219 = list  !=  null;
    t_220 = list.repOK();

    if (t_219) {
      {
        {
          if (t_220) {
            {
              {
                t_218 = true;
              }
            }
          } else {
            {
              {
                t_218 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_218 = false;
        }
      }
    }
    if (t_218) {
      {
        {
          {
            {
              {
                {
                  boolean t_217;

                  t_217 = list.contains(value_param);
                  var_79_ret_val = t_217;
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
    boolean t_221;
    boolean t_222;
    boolean t_223;

    t_222 = list  !=  null;
    t_223 = list.repOK();

    if (t_222) {
      {
        {
          if (t_223) {
            {
              {
                t_221 = true;
              }
            }
          } else {
            {
              {
                t_221 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_221 = false;
        }
      }
    }
    if (t_221) {
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
    boolean t_224;
    boolean t_225;
    boolean t_226;

    t_225 = list  !=  null;
    t_226 = list.repOK();

    if (t_225) {
      {
        {
          if (t_226) {
            {
              {
                t_224 = true;
              }
            }
          } else {
            {
              {
                t_224 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_224 = false;
        }
      }
    }
    if (t_224) {
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
    boolean t_227;
    boolean t_228;
    boolean t_229;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = true;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_80_current;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = true;
    boolean var_81_result;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = true;
    var_80_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = true;
    var_81_result = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
    boolean var_82_ws_19;

    t_228 = var_81_result  ==  false;
    t_229 = var_80_current  !=  null;

    if (t_228) {
      {
        {
          if (t_229) {
            {
              {
                t_227 = true;
              }
            }
          } else {
            {
              {
                t_227 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_227 = false;
        }
      }
    }
    var_82_ws_19 = t_227;
    while (var_82_ws_19) {
      boolean t_232;
      boolean t_233;
      boolean t_234;
      boolean t_235;
      boolean t_236;
      boolean t_237;
      boolean t_238;
      boolean var_83_equalVal;

      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      t_233 = value_param  ==  null;
      t_234 = var_80_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value  ==  null;

      if (t_233) {
        {
          {
            if (t_234) {
              {
                {
                  t_232 = true;
                }
              }
            } else {
              {
                {
                  t_232 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_232 = false;
          }
        }
      }

      if (t_232) {
        {
          {
            {
              {
                {
                  {
                    var_83_equalVal = true;
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
                    boolean t_231;

                    t_231 = value_param  !=  null;
                    if (t_231) {
                      {
                        {
                          {
                            {
                              {
                                {
                                  boolean t_230;

                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
                                  t_230 = value_param  ==  var_80_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;
                                  if (t_230) {
                                    {
                                      {
                                        {
                                          {
                                            {
                                              {
                                                var_83_equalVal = true;
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
                                                var_83_equalVal = false;
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
                                  var_83_equalVal = false;
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
      t_235 = var_83_equalVal  ==  true;

      if (t_235) {
        {
          {
            {
              {
                {
                  {
                    var_81_result = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
                  }
                }
              }
            }
          }
        }
      }
      var_80_current = var_80_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
      t_237 = var_81_result  ==  false;
      t_238 = var_80_current  !=  null;

      if (t_237) {
        {
          {
            if (t_238) {
              {
                {
                  t_236 = true;
                }
              }
            } else {
              {
                {
                  t_236 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_236 = false;
          }
        }
      }
      var_82_ws_19 = t_236;
    }
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14;

    return var_81_result;
  }


  public void remove(int index) {
    boolean t_240;
    boolean t_241;
    boolean t_242;
    boolean t_243;
    boolean t_249;
    boolean t_250;

    t_240 = index  <  0;

    if (t_240) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_239;

                  t_239 = new java.lang.RuntimeException();
                  throw t_239;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_84_current;

    var_84_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_85_previous;

    var_85_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_86_current_index;

    var_86_current_index = 0;
    boolean var_87_found = false;
    boolean var_88_ws_20;

    t_242 = var_87_found  ==  false;
    t_243 = var_84_current  !=  null;

    if (t_242) {
      {
        {
          if (t_243) {
            {
              {
                t_241 = true;
              }
            }
          } else {
            {
              {
                t_241 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_241 = false;
        }
      }
    }
    var_88_ws_20 = t_241;
    while (var_88_ws_20) {
      boolean t_244;
      boolean t_245;
      boolean t_246;
      boolean t_247;

      t_244 = index  ==  var_86_current_index;

      if (t_244) {
        {
          {
            {
              {
                {
                  {
                    var_87_found = true;
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
                    var_86_current_index = var_86_current_index + 1;
                    var_85_previous = var_84_current;
                    var_84_current = var_84_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  }
                }
              }
            }
          }
        }
      }
      t_246 = var_87_found  ==  false;
      t_247 = var_84_current  !=  null;

      if (t_246) {
        {
          {
            if (t_247) {
              {
                {
                  t_245 = true;
                }
              }
            } else {
              {
                {
                  t_245 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_245 = false;
          }
        }
      }
      var_88_ws_20 = t_245;
    }
    t_249 = var_87_found  ==  false;

    if (t_249) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_248;

                  t_248 = new java.lang.RuntimeException();
                  throw t_248;
                }
              }
            }
          }
        }
      }
    }
    t_250 = var_85_previous  ==  null;
    if (t_250) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_84_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  var_85_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_84_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(java.lang.Object arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_251;
    boolean t_252;

    t_251 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_89_freshNode = t_251;

    var_89_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_89_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_252 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_252) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_89_freshNode;
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
                  roops.core.objectsInstrumented.SinglyLinkedListNode var_90_current;

                  var_90_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                  boolean var_91_ws_21;

                  var_91_ws_21 = var_90_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  while (var_91_ws_21) {
                    var_90_current = var_90_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                    var_91_ws_21 = var_90_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  }
                  var_90_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_89_freshNode;
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
