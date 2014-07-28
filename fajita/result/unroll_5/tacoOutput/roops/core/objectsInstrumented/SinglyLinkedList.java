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
    boolean t_298;
    boolean t_299;
    boolean t_300;

    fajita_roopsGoal_initialization();
    boolean var_113_ret_val;

    t_299 = list  !=  null;

    if (t_299) {
      {
        {
          t_300 = list.repOK();
          if (t_300) {
            {
              t_298 = true;
            }
          } else {
            {
              t_298 = false;
            }
          }
        }
      }
    } else {
      {
        t_298 = false;
      }
    }
    if (t_298) {
      {
        {
          {
            {
              {
                boolean t_297;

                roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_0 = true;
                t_297 = list.contains(value_param);
                var_113_ret_val = t_297;
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
    boolean t_301;
    boolean t_302;
    boolean t_303;

    t_302 = list  !=  null;

    if (t_302) {
      {
        {
          t_303 = list.repOK();
          if (t_303) {
            {
              t_301 = true;
            }
          } else {
            {
              t_301 = false;
            }
          }
        }
      }
    } else {
      {
        t_301 = false;
      }
    }
    if (t_301) {
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
    boolean t_304;
    boolean t_305;
    boolean t_306;

    t_305 = list  !=  null;

    if (t_305) {
      {
        {
          t_306 = list.repOK();
          if (t_306) {
            {
              t_304 = true;
            }
          } else {
            {
              t_304 = false;
            }
          }
        }
      }
    } else {
      {
        t_304 = false;
      }
    }
    if (t_304) {
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_114_current;
    boolean var_115_result;

    var_114_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    var_115_result = false;
    {
      boolean t_309;
      boolean t_310;
      boolean t_311;
      boolean t_314;
      boolean t_315;
      boolean t_316;
      boolean var_116_terminatesInTime = true;

      t_310 = var_115_result  ==  false;

      if (t_310) {
        {
          {
            t_311 = var_114_current  !=  null;
            if (t_311) {
              {
                t_309 = true;
              }
            } else {
              {
                t_309 = false;
              }
            }
          }
        }
      } else {
        {
          t_309 = false;
        }
      }

      if (t_309) {
        {
          {
            {
              {
                {
                  boolean t_307;
                  boolean t_308;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_2 = true;
                  boolean var_117_equalVal;

                  t_307 = value_param  ==  var_114_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_307) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_4 = true;
                              var_117_equalVal = true;
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
                              var_117_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_308 = var_117_equalVal  ==  true;

                  if (t_308) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_6 = true;
                              var_115_result = true;
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
                  var_114_current = var_114_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_315 = var_115_result  ==  false;

      if (t_315) {
        {
          {
            t_316 = var_114_current  !=  null;
            if (t_316) {
              {
                t_314 = true;
              }
            } else {
              {
                t_314 = false;
              }
            }
          }
        }
      } else {
        {
          t_314 = false;
        }
      }
      if (t_314) {
        {
          {
            {
              {
                {
                  boolean t_312;
                  boolean t_313;

                  roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_8 = true;
                  boolean var_118_equalVal;

                  t_312 = value_param  ==  var_114_current.roops_core_objectsInstrumented_SinglyLinkedListNode_value;

                  if (t_312) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_10 = true;
                              var_118_equalVal = true;
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
                              var_118_equalVal = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_313 = var_118_equalVal  ==  true;

                  if (t_313) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objectsInstrumented.SinglyLinkedList.roops_goal_12 = true;
                              var_115_result = true;
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
                  var_114_current = var_114_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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

    return var_115_result;
  }


  public void remove(int index) {
    boolean t_318;
    boolean t_328;
    boolean t_329;

    t_318 = index  <  0;

    if (t_318) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_317;

                t_317 = new java.lang.RuntimeException();
                throw t_317;
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
    roops.core.objectsInstrumented.SinglyLinkedListNode var_119_current;

    var_119_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
    roops.core.objectsInstrumented.SinglyLinkedListNode var_120_previous;

    var_120_previous = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    int var_121_current_index;

    var_121_current_index = 0;
    boolean var_122_found = false;

    {
      boolean t_320;
      boolean t_321;
      boolean t_322;
      boolean t_324;
      boolean t_325;
      boolean t_326;
      boolean var_123_terminatesInTime = true;

      t_321 = var_122_found  ==  false;

      if (t_321) {
        {
          {
            t_322 = var_119_current  !=  null;
            if (t_322) {
              {
                t_320 = true;
              }
            } else {
              {
                t_320 = false;
              }
            }
          }
        }
      } else {
        {
          t_320 = false;
        }
      }

      if (t_320) {
        {
          {
            {
              {
                {
                  boolean t_319;

                  t_319 = index  ==  var_121_current_index;
                  if (t_319) {
                    {
                      {
                        {
                          {
                            {
                              var_122_found = true;
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
                              var_121_current_index = var_121_current_index + 1;
                              var_120_previous = var_119_current;
                              var_119_current = var_119_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
      t_325 = var_122_found  ==  false;

      if (t_325) {
        {
          {
            t_326 = var_119_current  !=  null;
            if (t_326) {
              {
                t_324 = true;
              }
            } else {
              {
                t_324 = false;
              }
            }
          }
        }
      } else {
        {
          t_324 = false;
        }
      }
      if (t_324) {
        {
          {
            {
              {
                {
                  boolean t_323;

                  t_323 = index  ==  var_121_current_index;
                  if (t_323) {
                    {
                      {
                        {
                          {
                            {
                              var_122_found = true;
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
                              var_121_current_index = var_121_current_index + 1;
                              var_120_previous = var_119_current;
                              var_119_current = var_119_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
    t_328 = var_122_found  ==  false;

    if (t_328) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_327;

                t_327 = new java.lang.RuntimeException();
                throw t_327;
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
    t_329 = var_120_previous  ==  null;
    if (t_329) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_119_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_120_previous.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_119_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }


  public void insertBack(int arg) {
    roops.core.objectsInstrumented.SinglyLinkedListNode t_330;
    boolean t_333;

    t_330 = new roops.core.objectsInstrumented.SinglyLinkedListNode();
    roops.core.objectsInstrumented.SinglyLinkedListNode var_124_freshNode = t_330;

    var_124_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_value = arg;
    var_124_freshNode.roops_core_objectsInstrumented_SinglyLinkedListNode_next = ((roops.core.objectsInstrumented.SinglyLinkedListNode)(null));
    t_333 = this.roops_core_objectsInstrumented_SinglyLinkedList_header  ==  null;
    if (t_333) {
      {
        {
          {
            {
              {
                this.roops_core_objectsInstrumented_SinglyLinkedList_header = var_124_freshNode;
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
                roops.core.objectsInstrumented.SinglyLinkedListNode var_125_current;

                var_125_current = this.roops_core_objectsInstrumented_SinglyLinkedList_header;
                {
                  boolean t_331;
                  boolean t_332;
                  boolean var_126_terminatesInTime = true;

                  t_331 = var_125_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;

                  if (t_331) {
                    {
                      {
                        {
                          {
                            {
                              var_125_current = var_125_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                  t_332 = var_125_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next  !=  null;
                  if (t_332) {
                    {
                      {
                        {
                          {
                            {
                              var_125_current = var_125_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next;
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
                var_125_current.roops_core_objectsInstrumented_SinglyLinkedListNode_next = var_124_freshNode;
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
