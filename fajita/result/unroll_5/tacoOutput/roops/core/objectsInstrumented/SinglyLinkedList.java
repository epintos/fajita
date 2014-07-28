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
    boolean t_237;
    boolean t_238;
    boolean t_239;

    fajita_roopsGoal_initialization();
    boolean var_99_ret_val;

    t_238 = list  !=  null;

    if (t_238) {
      {
        {
          t_239 = list.repOK();
          if (t_239) {
            {
              t_237 = true;
            }
          } else {
            {
              t_237 = false;
            }
          }
        }
      }
    } else {
      {
        t_237 = false;
      }
    }
    if (t_237) {
      {
        {
          {
            {
              {
                boolean t_236;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_236 = list.contains(value_param);
                var_99_ret_val = t_236;
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
    boolean t_240;
    boolean t_241;
    boolean t_242;

    t_241 = list  !=  null;

    if (t_241) {
      {
        {
          t_242 = list.repOK();
          if (t_242) {
            {
              t_240 = true;
            }
          } else {
            {
              t_240 = false;
            }
          }
        }
      }
    } else {
      {
        t_240 = false;
      }
    }
    if (t_240) {
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
    boolean t_243;
    boolean t_244;
    boolean t_245;

    t_244 = list  !=  null;

    if (t_244) {
      {
        {
          t_245 = list.repOK();
          if (t_245) {
            {
              t_243 = true;
            }
          } else {
            {
              t_243 = false;
            }
          }
        }
      }
    } else {
      {
        t_243 = false;
      }
    }
    if (t_243) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_100_current;
    boolean var_101_result;

    var_100_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_101_result = false;
    {
      boolean t_246;
      boolean t_247;
      boolean t_248;
      boolean t_254;
      boolean var_102_fajita_cicle_2 = false;
      boolean var_103_ws_19;

      t_247 = var_101_result  ==  false;

      if (t_247) {
        {
          {
            t_248 = var_100_current  !=  null;
            if (t_248) {
              {
                t_246 = true;
              }
            } else {
              {
                t_246 = false;
              }
            }
          }
        }
      } else {
        {
          t_246 = false;
        }
      }
      var_103_ws_19 = t_246;
      while (var_103_ws_19) {
        boolean t_249;
        boolean t_250;
        boolean t_251;
        boolean t_252;
        boolean t_253;

        var_102_fajita_cicle_2 = true;
        roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
        boolean var_104_equalVal;

        t_249 = value_param  ==  var_100_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_249) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                    var_104_equalVal = true;
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
                    var_104_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_250 = var_104_equalVal  ==  true;

        if (t_250) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                    var_101_result = true;
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
        var_100_current = var_100_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
        t_252 = var_101_result  ==  false;

        if (t_252) {
          {
            {
              t_253 = var_100_current  !=  null;
              if (t_253) {
                {
                  t_251 = true;
                }
              } else {
                {
                  t_251 = false;
                }
              }
            }
          }
        } else {
          {
            t_251 = false;
          }
        }
        var_103_ws_19 = t_251;
      }
      t_254 = ! var_102_fajita_cicle_2;
      if (t_254) {
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

    return var_101_result;
  }


  public void remove(int index) {
    boolean t_256;
    boolean t_257;
    boolean t_258;
    boolean t_259;
    boolean t_265;
    boolean t_266;

    t_256 = index  <  0;

    if (t_256) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_255;

                t_255 = new java.lang.RuntimeException();
                throw t_255;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_105_current;

    var_105_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_106_previous;

    var_106_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_107_current_index;

    var_107_current_index = 0;
    boolean var_108_found = false;
    boolean var_109_ws_20;

    t_258 = var_108_found  ==  false;

    if (t_258) {
      {
        {
          t_259 = var_105_current  !=  null;
          if (t_259) {
            {
              t_257 = true;
            }
          } else {
            {
              t_257 = false;
            }
          }
        }
      }
    } else {
      {
        t_257 = false;
      }
    }
    var_109_ws_20 = t_257;
    while (var_109_ws_20) {
      boolean t_260;
      boolean t_261;
      boolean t_262;
      boolean t_263;

      t_260 = index  ==  var_107_current_index;

      if (t_260) {
        {
          {
            {
              {
                {
                  var_108_found = true;
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
                  var_107_current_index = var_107_current_index + 1;
                  var_106_previous = var_105_current;
                  var_105_current = var_105_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_262 = var_108_found  ==  false;

      if (t_262) {
        {
          {
            t_263 = var_105_current  !=  null;
            if (t_263) {
              {
                t_261 = true;
              }
            } else {
              {
                t_261 = false;
              }
            }
          }
        }
      } else {
        {
          t_261 = false;
        }
      }
      var_109_ws_20 = t_261;
    }
    t_265 = var_108_found  ==  false;

    if (t_265) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_264;

                t_264 = new java.lang.RuntimeException();
                throw t_264;
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
    t_266 = var_106_previous  ==  null;
    if (t_266) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_105_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_106_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_105_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_267;
    boolean t_268;

    t_267 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_110_freshNode = t_267;

    var_110_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_110_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_268 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_268) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_110_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_111_current;

                var_111_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                boolean var_112_ws_21;

                var_112_ws_21 = var_111_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_112_ws_21) {
                  var_111_current = var_111_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_112_ws_21 = var_111_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                }
                var_111_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_110_freshNode;
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
