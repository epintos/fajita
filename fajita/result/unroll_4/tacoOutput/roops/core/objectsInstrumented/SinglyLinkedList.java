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
    boolean t_187;
    boolean t_188;
    boolean t_189;

    fajita_roopsGoal_initialization();
    boolean var_71_ret_val;

    t_188 = list  !=  null;

    if (t_188) {
      {
        {
          t_189 = list.repOK();
          if (t_189) {
            {
              t_187 = true;
            }
          } else {
            {
              t_187 = false;
            }
          }
        }
      }
    } else {
      {
        t_187 = false;
      }
    }
    if (t_187) {
      {
        {
          {
            {
              {
                boolean t_186;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_186 = list.contains(value_param);
                var_71_ret_val = t_186;
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
    boolean t_190;
    boolean t_191;
    boolean t_192;

    t_191 = list  !=  null;

    if (t_191) {
      {
        {
          t_192 = list.repOK();
          if (t_192) {
            {
              t_190 = true;
            }
          } else {
            {
              t_190 = false;
            }
          }
        }
      }
    } else {
      {
        t_190 = false;
      }
    }
    if (t_190) {
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
    boolean t_193;
    boolean t_194;
    boolean t_195;

    t_194 = list  !=  null;

    if (t_194) {
      {
        {
          t_195 = list.repOK();
          if (t_195) {
            {
              t_193 = true;
            }
          } else {
            {
              t_193 = false;
            }
          }
        }
      }
    } else {
      {
        t_193 = false;
      }
    }
    if (t_193) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_72_current;
    boolean var_73_result;

    var_72_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_73_result = false;
    {
      boolean t_198;
      boolean t_199;
      boolean t_200;
      boolean t_203;
      boolean t_204;
      boolean t_205;
      boolean var_74_terminatesInTime = true;

      t_199 = var_73_result  ==  false;

      if (t_199) {
        {
          {
            t_200 = var_72_current  !=  null;
            if (t_200) {
              {
                t_198 = true;
              }
            } else {
              {
                t_198 = false;
              }
            }
          }
        }
      } else {
        {
          t_198 = false;
        }
      }

      if (t_198) {
        {
          {
            {
              {
                {
                  boolean t_196;
                  boolean t_197;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_75_equalVal;

                  t_196 = value_param  ==  var_72_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_196) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_75_equalVal = true;
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
                              var_75_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_197 = var_75_equalVal  ==  true;

                  if (t_197) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                              var_73_result = true;
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
                  var_72_current = var_72_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_204 = var_73_result  ==  false;

      if (t_204) {
        {
          {
            t_205 = var_72_current  !=  null;
            if (t_205) {
              {
                t_203 = true;
              }
            } else {
              {
                t_203 = false;
              }
            }
          }
        }
      } else {
        {
          t_203 = false;
        }
      }
      if (t_203) {
        {
          {
            {
              {
                {
                  boolean t_201;
                  boolean t_202;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_76_equalVal;

                  t_201 = value_param  ==  var_72_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_201) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
                              var_76_equalVal = true;
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
                              var_76_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_202 = var_76_equalVal  ==  true;

                  if (t_202) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
                              var_73_result = true;
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
                  var_72_current = var_72_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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

    return var_73_result;
  }


  public void remove(int index) {
    boolean t_207;
    boolean t_217;
    boolean t_218;

    t_207 = index  <  0;

    if (t_207) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_206;

                t_206 = new java.lang.RuntimeException();
                throw t_206;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_77_current;

    var_77_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_78_previous;

    var_78_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_79_current_index;

    var_79_current_index = 0;
    boolean var_80_found = false;

    {
      boolean t_209;
      boolean t_210;
      boolean t_211;
      boolean t_213;
      boolean t_214;
      boolean t_215;
      boolean var_81_terminatesInTime = true;

      t_210 = var_80_found  ==  false;

      if (t_210) {
        {
          {
            t_211 = var_77_current  !=  null;
            if (t_211) {
              {
                t_209 = true;
              }
            } else {
              {
                t_209 = false;
              }
            }
          }
        }
      } else {
        {
          t_209 = false;
        }
      }

      if (t_209) {
        {
          {
            {
              {
                {
                  boolean t_208;

                  t_208 = index  ==  var_79_current_index;
                  if (t_208) {
                    {
                      {
                        {
                          {
                            {
                              var_80_found = true;
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
                              var_79_current_index = var_79_current_index + 1;
                              var_78_previous = var_77_current;
                              var_77_current = var_77_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_214 = var_80_found  ==  false;

      if (t_214) {
        {
          {
            t_215 = var_77_current  !=  null;
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
      if (t_213) {
        {
          {
            {
              {
                {
                  boolean t_212;

                  t_212 = index  ==  var_79_current_index;
                  if (t_212) {
                    {
                      {
                        {
                          {
                            {
                              var_80_found = true;
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
                              var_79_current_index = var_79_current_index + 1;
                              var_78_previous = var_77_current;
                              var_77_current = var_77_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    t_217 = var_80_found  ==  false;

    if (t_217) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_216;

                t_216 = new java.lang.RuntimeException();
                throw t_216;
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
    t_218 = var_78_previous  ==  null;
    if (t_218) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_77_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_78_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_77_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_219;
    boolean t_222;

    t_219 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_82_freshNode = t_219;

    var_82_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_82_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_222 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_222) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_82_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_83_current;

                var_83_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                {
                  boolean t_220;
                  boolean t_221;
                  boolean var_84_terminatesInTime = true;

                  t_220 = var_83_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_220) {
                    {
                      {
                        {
                          {
                            {
                              var_83_current = var_83_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_221 = var_83_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_221) {
                    {
                      {
                        {
                          {
                            {
                              var_83_current = var_83_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_83_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_82_freshNode;
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
