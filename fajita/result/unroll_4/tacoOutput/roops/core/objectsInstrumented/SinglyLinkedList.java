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
    boolean t_204;
    boolean t_205;
    boolean t_206;

    fajita_roopsGoal_initialization();
    boolean var_85_ret_val;

    t_205 = list  !=  null;

    if (t_205) {
      {
        {
          t_206 = list.repOK();
          if (t_206) {
            {
              t_204 = true;
            }
          } else {
            {
              t_204 = false;
            }
          }
        }
      }
    } else {
      {
        t_204 = false;
      }
    }
    if (t_204) {
      {
        {
          {
            {
              {
                boolean t_203;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_203 = list.contains(value_param);
                var_85_ret_val = t_203;
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
    boolean t_207;
    boolean t_208;
    boolean t_209;

    t_208 = list  !=  null;

    if (t_208) {
      {
        {
          t_209 = list.repOK();
          if (t_209) {
            {
              t_207 = true;
            }
          } else {
            {
              t_207 = false;
            }
          }
        }
      }
    } else {
      {
        t_207 = false;
      }
    }
    if (t_207) {
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
    boolean t_210;
    boolean t_211;
    boolean t_212;

    t_211 = list  !=  null;

    if (t_211) {
      {
        {
          t_212 = list.repOK();
          if (t_212) {
            {
              t_210 = true;
            }
          } else {
            {
              t_210 = false;
            }
          }
        }
      }
    } else {
      {
        t_210 = false;
      }
    }
    if (t_210) {
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
      boolean t_213;
      boolean t_214;
      boolean t_215;
      boolean t_221;
      boolean var_88_fajita_cicle_2 = false;
      boolean var_89_ws_16;

      t_214 = var_87_result  ==  false;

      if (t_214) {
        {
          {
            t_215 = var_86_current  !=  null;
            if (t_215) {
              {
                t_213 = true;
              }
            } else {
              {
                t_213 = false;
              }
            }
          }
        }
      } else {
        {
          t_213 = false;
        }
      }
      var_89_ws_16 = t_213;
      while (var_89_ws_16) {
        boolean t_216;
        boolean t_217;
        boolean t_218;
        boolean t_219;
        boolean t_220;

        var_88_fajita_cicle_2 = true;
        roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
        boolean var_90_equalVal;

        t_216 = value_param  ==  var_86_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

        if (t_216) {
          {
            {
              {
                {
                  {
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
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
                    roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_5 = true;
                    var_90_equalVal = false;
                  }
                }
              }
            }
          }
        }
        t_217 = var_90_equalVal  ==  true;

        if (t_217) {
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
        t_219 = var_87_result  ==  false;

        if (t_219) {
          {
            {
              t_220 = var_86_current  !=  null;
              if (t_220) {
                {
                  t_218 = true;
                }
              } else {
                {
                  t_218 = false;
                }
              }
            }
          }
        } else {
          {
            t_218 = false;
          }
        }
        var_89_ws_16 = t_218;
      }
      t_221 = ! var_88_fajita_cicle_2;
      if (t_221) {
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

    return var_87_result;
  }


  public void remove(int index) {
    boolean t_223;
    boolean t_224;
    boolean t_225;
    boolean t_226;
    boolean t_232;
    boolean t_233;

    t_223 = index  <  0;

    if (t_223) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_222;

                t_222 = new java.lang.RuntimeException();
                throw t_222;
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
    boolean var_95_ws_17;

    t_225 = var_94_found  ==  false;

    if (t_225) {
      {
        {
          t_226 = var_91_current  !=  null;
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
    var_95_ws_17 = t_224;
    while (var_95_ws_17) {
      boolean t_227;
      boolean t_228;
      boolean t_229;
      boolean t_230;

      t_227 = index  ==  var_93_current_index;

      if (t_227) {
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
      t_229 = var_94_found  ==  false;

      if (t_229) {
        {
          {
            t_230 = var_91_current  !=  null;
            if (t_230) {
              {
                t_228 = true;
              }
            } else {
              {
                t_228 = false;
              }
            }
          }
        }
      } else {
        {
          t_228 = false;
        }
      }
      var_95_ws_17 = t_228;
    }
    t_232 = var_94_found  ==  false;

    if (t_232) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_231;

                t_231 = new java.lang.RuntimeException();
                throw t_231;
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
    t_233 = var_92_previous  ==  null;
    if (t_233) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode t_234;
    boolean t_235;

    t_234 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_96_freshNode = t_234;

    var_96_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_96_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_235 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_235) {
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
                boolean var_98_ws_18;

                var_98_ws_18 = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                while (var_98_ws_18) {
                  var_97_current = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
                  var_98_ws_18 = var_97_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
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
  }

}
