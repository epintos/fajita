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
    boolean t_254;
    boolean t_255;
    boolean t_256;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_0 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_1 = true;
    boolean var_92_ret_val;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_2 = true;
    t_255 = list  !=  null;
    t_256 = list.repOK();

    if (t_255) {
      {
        {
          if (t_256) {
            {
              {
                t_254 = true;
              }
            }
          } else {
            {
              {
                t_254 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_254 = false;
        }
      }
    }
    if (t_254) {
      {
        {
          {
            {
              {
                {
                  boolean t_253;

                  t_253 = list.contains(value_param);
                  var_92_ret_val = t_253;
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
    boolean t_257;
    boolean t_258;
    boolean t_259;

    t_258 = list  !=  null;
    t_259 = list.repOK();

    if (t_258) {
      {
        {
          if (t_259) {
            {
              {
                t_257 = true;
              }
            }
          } else {
            {
              {
                t_257 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_257 = false;
        }
      }
    }
    if (t_257) {
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
    boolean t_260;
    boolean t_261;
    boolean t_262;

    t_261 = list  !=  null;
    t_262 = list.repOK();

    if (t_261) {
      {
        {
          if (t_262) {
            {
              {
                t_260 = true;
              }
            }
          } else {
            {
              {
                t_260 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_260 = false;
        }
      }
    }
    if (t_260) {
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
    boolean t_263;
    boolean t_264;
    boolean t_265;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4 = true;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_93_current;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_5 = true;
    boolean var_94_result;

    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_6 = true;
    var_93_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = true;
    var_94_result = false;
    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = true;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
    boolean var_95_ws_22;

    t_264 = var_94_result  ==  false;
    t_265 = var_93_current  !=  null;

    if (t_264) {
      {
        {
          if (t_265) {
            {
              {
                t_263 = true;
              }
            }
          } else {
            {
              {
                t_263 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_263 = false;
        }
      }
    }
    var_95_ws_22 = t_263;
    while (var_95_ws_22) {
      boolean t_268;
      boolean t_269;
      boolean t_270;
      boolean t_271;
      boolean t_272;
      boolean t_273;
      boolean t_274;
      boolean var_96_equalVal;

      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_9 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_7 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      t_269 = value_param  ==  null;
      t_270 = var_93_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value  ==  null;

      if (t_269) {
        {
          {
            if (t_270) {
              {
                {
                  t_268 = true;
                }
              }
            } else {
              {
                {
                  t_268 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_268 = false;
          }
        }
      }

      if (t_268) {
        {
          {
            {
              {
                {
                  {
                    var_96_equalVal = true;
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
                    boolean t_267;

                    t_267 = value_param  !=  null;
                    if (t_267) {
                      {
                        {
                          {
                            {
                              {
                                {
                                  boolean t_266;

                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_4;
                                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_9 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
                                  t_266 = value_param  ==  var_93_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;
                                  if (t_266) {
                                    {
                                      {
                                        {
                                          {
                                            {
                                              {
                                                var_96_equalVal = true;
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
                                                var_96_equalVal = false;
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
                                  var_96_equalVal = false;
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
      t_271 = var_96_equalVal  ==  true;

      if (t_271) {
        {
          {
            {
              {
                {
                  {
                    var_94_result = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14 = true;
                    roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8 = false;
                  }
                }
              }
            }
          }
        }
      }
      var_93_current = var_93_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
      roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_15 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_15 = true;
      roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_7 = false;
      t_273 = var_94_result  ==  false;
      t_274 = var_93_current  !=  null;

      if (t_273) {
        {
          {
            if (t_274) {
              {
                {
                  t_272 = true;
                }
              }
            } else {
              {
                {
                  t_272 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_272 = false;
          }
        }
      }
      var_95_ws_22 = t_272;
    }
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_16 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_8;
    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_17 = roops.core.objectsInstrumented.SinglyLinkedList.variable_definition_14;

    return var_94_result;
  }


  public void remove(int index) {
    boolean t_276;
    boolean t_277;
    boolean t_278;
    boolean t_279;
    boolean t_285;
    boolean t_286;

    t_276 = index  <  0;

    if (t_276) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_275;

                  t_275 = new java.lang.RuntimeException();
                  throw t_275;
                }
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.SinglyLinkedListNode var_97_current;

    var_97_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_98_previous;

    var_98_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_99_current_index;

    var_99_current_index = 0;
    boolean var_100_found = false;
    boolean var_101_ws_23;

    t_278 = var_100_found  ==  false;
    t_279 = var_97_current  !=  null;

    if (t_278) {
      {
        {
          if (t_279) {
            {
              {
                t_277 = true;
              }
            }
          } else {
            {
              {
                t_277 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_277 = false;
        }
      }
    }
    var_101_ws_23 = t_277;
    while (var_101_ws_23) {
      boolean t_280;
      boolean t_281;
      boolean t_282;
      boolean t_283;

      t_280 = index  ==  var_99_current_index;

      if (t_280) {
        {
          {
            {
              {
                {
                  {
                    var_100_found = true;
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
                    var_99_current_index = var_99_current_index + 1;
                    var_98_previous = var_97_current;
                    var_97_current = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  }
                }
              }
            }
          }
        }
      }
      t_282 = var_100_found  ==  false;
      t_283 = var_97_current  !=  null;

      if (t_282) {
        {
          {
            if (t_283) {
              {
                {
                  t_281 = true;
                }
              }
            } else {
              {
                {
                  t_281 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_281 = false;
          }
        }
      }
      var_101_ws_23 = t_281;
    }
    t_285 = var_100_found  ==  false;

    if (t_285) {
      {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_284;

                  t_284 = new java.lang.RuntimeException();
                  throw t_284;
                }
              }
            }
          }
        }
      }
    }
    t_286 = var_98_previous  ==  null;
    if (t_286) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  var_98_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(java.lang.Object arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_287;
    boolean t_288;

    t_287 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_102_freshNode = t_287;

    var_102_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_102_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_288 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_288) {
      {
        {
          {
            {
              {
                {
                  this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_102_freshNode;
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
                  roops.core.objectsInstrumented.SinglyLinkedListNode var_103_current;

                  var_103_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                  boolean var_104_ws_24;

                  var_104_ws_24 = var_103_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  while (var_104_ws_24) {
                    var_103_current = var_103_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                    var_104_ws_24 = var_103_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  }
                  var_103_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_102_freshNode;
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
