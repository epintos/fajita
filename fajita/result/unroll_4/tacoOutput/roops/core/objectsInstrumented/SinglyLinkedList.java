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
    boolean t_224;
    boolean t_225;
    boolean t_226;

    fajita_roopsGoal_initialization();
    boolean var_85_ret_val;

    t_225 = list  !=  null;

    if (t_225) {
      {
        {
          t_226 = list.repOK();
          if (t_226) {
            {
              t_224 = true;
            }
          } else {
            {
              t_224 = false;
            }
          }
        }
      }
    } else {
      {
        t_224 = false;
      }
    }
    if (t_224) {
      {
        {
          {
            {
              {
                boolean t_223;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_223 = list.contains(value_param);
                var_85_ret_val = t_223;
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
    boolean t_227;
    boolean t_228;
    boolean t_229;

    t_228 = list  !=  null;

    if (t_228) {
      {
        {
          t_229 = list.repOK();
          if (t_229) {
            {
              t_227 = true;
            }
          } else {
            {
              t_227 = false;
            }
          }
        }
      }
    } else {
      {
        t_227 = false;
      }
    }
    if (t_227) {
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
    boolean t_230;
    boolean t_231;
    boolean t_232;

    t_231 = list  !=  null;

    if (t_231) {
      {
        {
          t_232 = list.repOK();
          if (t_232) {
            {
              t_230 = true;
            }
          } else {
            {
              t_230 = false;
            }
          }
        }
      }
    } else {
      {
        t_230 = false;
      }
    }
    if (t_230) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_86_current;
    boolean var_87_result;

    var_86_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_87_result = false;
    {
      boolean t_235;
      boolean t_236;
      boolean t_237;
      boolean t_240;
      boolean t_241;
      boolean t_242;
      boolean var_88_terminatesInTime = true;

      t_236 = var_87_result  ==  false;

      if (t_236) {
        {
          {
            t_237 = var_86_current  !=  null;
            if (t_237) {
              {
                t_235 = true;
              }
            } else {
              {
                t_235 = false;
              }
            }
          }
        }
      } else {
        {
          t_235 = false;
        }
      }

      if (t_235) {
        {
          {
            {
              {
                {
                  boolean t_233;
                  boolean t_234;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_89_equalVal;

                  t_233 = value_param  ==  var_86_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_233) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_89_equalVal = true;
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
                              var_89_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_234 = var_89_equalVal  ==  true;

                  if (t_234) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                              var_87_result = true;
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
                  var_86_current = var_86_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_241 = var_87_result  ==  false;

      if (t_241) {
        {
          {
            t_242 = var_86_current  !=  null;
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
                  boolean t_238;
                  boolean t_239;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_90_equalVal;

                  t_238 = value_param  ==  var_86_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_238) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
                              var_90_equalVal = true;
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
                              var_90_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_239 = var_90_equalVal  ==  true;

                  if (t_239) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
                              var_87_result = true;
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
                  var_86_current = var_86_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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

    return var_87_result;
  }


  public void remove(int index) {
    boolean t_244;
    boolean t_254;
    boolean t_255;

    t_244 = index  <  0;

    if (t_244) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_243;

                t_243 = new java.lang.RuntimeException();
                throw t_243;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_91_current;

    var_91_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_92_previous;

    var_92_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_93_current_index;

    var_93_current_index = 0;
    boolean var_94_found = false;

    {
      boolean t_246;
      boolean t_247;
      boolean t_248;
      boolean t_250;
      boolean t_251;
      boolean t_252;
      boolean var_95_terminatesInTime = true;

      t_247 = var_94_found  ==  false;

      if (t_247) {
        {
          {
            t_248 = var_91_current  !=  null;
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

      if (t_246) {
        {
          {
            {
              {
                {
                  boolean t_245;

                  t_245 = index  ==  var_93_current_index;
                  if (t_245) {
                    {
                      {
                        {
                          {
                            {
                              var_94_found = true;
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
                              var_93_current_index = var_93_current_index + 1;
                              var_92_previous = var_91_current;
                              var_91_current = var_91_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_251 = var_94_found  ==  false;

      if (t_251) {
        {
          {
            t_252 = var_91_current  !=  null;
            if (t_252) {
              {
                t_250 = true;
              }
            } else {
              {
                t_250 = false;
              }
            }
          }
        }
      } else {
        {
          t_250 = false;
        }
      }
      if (t_250) {
        {
          {
            {
              {
                {
                  boolean t_249;

                  t_249 = index  ==  var_93_current_index;
                  if (t_249) {
                    {
                      {
                        {
                          {
                            {
                              var_94_found = true;
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
                              var_93_current_index = var_93_current_index + 1;
                              var_92_previous = var_91_current;
                              var_91_current = var_91_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    t_254 = var_94_found  ==  false;

    if (t_254) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_253;

                t_253 = new java.lang.RuntimeException();
                throw t_253;
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
    t_255 = var_92_previous  ==  null;
    if (t_255) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_91_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_92_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_91_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_256;
    boolean t_259;

    t_256 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_96_freshNode = t_256;

    var_96_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_96_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_259 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_259) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_96_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_97_current;

                var_97_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                {
                  boolean t_257;
                  boolean t_258;
                  boolean var_98_terminatesInTime = true;

                  t_257 = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_257) {
                    {
                      {
                        {
                          {
                            {
                              var_97_current = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_258 = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_258) {
                    {
                      {
                        {
                          {
                            {
                              var_97_current = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_96_freshNode;
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
