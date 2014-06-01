package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class OurTests extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static boolean roops_goal_3;
  public static boolean roops_goal_4;
  public static boolean roops_goal_5;
  public static boolean roops_goal_6;
  public static boolean roops_goal_7;
  public static boolean roops_goal_8;
  public static boolean roops_goal_9;/** @Modifies_Everything
 @Ensures false;
*/

  public void test1(int o) {
    int t_1;
    boolean t_2;
    boolean t_3;
    boolean t_4;
    boolean t_5;
    boolean t_6;
    boolean t_7;
    boolean t_8;
    boolean t_9;
    boolean t_10;
    boolean t_11;
    boolean t_12;
    boolean t_13;
    boolean t_20;
    boolean t_21;
    boolean t_22;
    boolean t_23;
    boolean t_24;
    boolean t_25;

    fajita_roopsGoal_initialization();
    int var_1_a = 8;
    int var_2_m = 0;

    t_1 = o % 2;
    t_2 = t_1  ==  0;
    boolean var_3_b = t_2;

    t_5 = o  >  9;

    if (t_5) {
      {
        {
          if (var_3_b) {
            {
              {
                t_4 = true;
              }
            }
          } else {
            {
              {
                t_4 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_4 = false;
        }
      }
    }
    t_7 = o  <  -1;
    t_8 = ! var_3_b;

    if (t_7) {
      {
        {
          if (t_8) {
            {
              {
                t_6 = true;
              }
            }
          } else {
            {
              {
                t_6 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_6 = false;
        }
      }
    }

    if ((t_4)) {
      {
        {
          t_3 = true;
        }
      }
    } else {
      {
        {
          if ((t_6)) {
            {
              {
                t_3 = true;
              }
            }
          } else {
            {
              {
                t_3 = false;
              }
            }
          }
        }
      }
    }
    roops.core.objectsInstrumented.OurTests.roops_goal_3 = t_3;
    t_10 = o  >  9;

    if (t_10) {
      {
        {
          if (var_3_b) {
            {
              {
                t_9 = true;
              }
            }
          } else {
            {
              {
                t_9 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_9 = false;
        }
      }
    }
    roops.core.objectsInstrumented.OurTests.roops_goal_4 = t_9;
    roops.core.objectsInstrumented.OurTests.roops_goal_5 = o  >  9;
    roops.core.objectsInstrumented.OurTests.roops_goal_6 = var_3_b;
    t_12 = o  <  -1;
    t_13 = ! var_3_b;

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
    roops.core.objectsInstrumented.OurTests.roops_goal_7 = t_11;
    roops.core.objectsInstrumented.OurTests.roops_goal_8 = o  <  -1;
    roops.core.objectsInstrumented.OurTests.roops_goal_9 = ! var_3_b;
    t_22 = o  >  9;

    if (t_22) {
      {
        {
          if (var_3_b) {
            {
              {
                t_21 = true;
              }
            }
          } else {
            {
              {
                t_21 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_21 = false;
        }
      }
    }
    t_24 = o  <  -1;
    t_25 = ! var_3_b;

    if (t_24) {
      {
        {
          if (t_25) {
            {
              {
                t_23 = true;
              }
            }
          } else {
            {
              {
                t_23 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_23 = false;
        }
      }
    }

    if ((t_21)) {
      {
        {
          t_20 = true;
        }
      }
    } else {
      {
        {
          if ((t_23)) {
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
    }
    if (t_20) {
      {
        {
          {
            {
              {
                {
                  int t_14;
                  boolean var_4_ws_1;

                  t_14 = var_1_a;
                  var_1_a = var_1_a + (byte)-1;
                  var_4_ws_1 = t_14  >  0;
                  while (var_4_ws_1) {
                    boolean t_15;
                    boolean t_16;
                    boolean t_17;
                    boolean t_18;
                    int t_19;

                    t_16 = o  >  15;

                    if (t_16) {
                      {
                        {
                          t_15 = true;
                        }
                      }
                    } else {
                      {
                        {
                          if (var_3_b) {
                            {
                              {
                                t_15 = true;
                              }
                            }
                          } else {
                            {
                              {
                                t_15 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    roops.core.objectsInstrumented.OurTests.roops_goal_0 = t_15;
                    roops.core.objectsInstrumented.OurTests.roops_goal_1 = o  >  15;
                    roops.core.objectsInstrumented.OurTests.roops_goal_2 = var_3_b;
                    t_18 = o  >  15;

                    if (t_18) {
                      {
                        {
                          t_17 = true;
                        }
                      }
                    } else {
                      {
                        {
                          if (var_3_b) {
                            {
                              {
                                t_17 = true;
                              }
                            }
                          } else {
                            {
                              {
                                t_17 = false;
                              }
                            }
                          }
                        }
                      }
                    }

                    if (t_17) {
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
                    t_19 = var_1_a;
                    var_1_a = var_1_a + (byte)-1;
                    var_4_ws_1 = t_19  >  0;
                  }
                  var_2_m = var_1_a;
                }
              }
            }
          }
        }
      }
    }
  }


  public void test2(int o) {
    int var_5_i = 0;
    int var_6_a = 0;
    boolean var_7_ws_2;

    var_7_ws_2 = var_5_i  <  5;
    while (var_7_ws_2) {
      int t_26;
      boolean t_27;

      t_26 = var_6_a % 2;
      t_27 = t_26  ==  0;

      if (t_27) {
        {
          {
            {
              {
                {
                  {
                    var_6_a = var_6_a + 2;
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
                    var_6_a = var_6_a + 1;
                  }
                }
              }
            }
          }
        }
      }
      var_5_i = var_5_i + 1;
      var_7_ws_2 = var_5_i  <  5;
    }
  }


  public void test3(int o) {
    int var_8_i = 0;
    int var_9_a = 0, var_10_b = 0, var_11_c = 0;
    boolean var_12_ws_3;

    var_12_ws_3 = var_8_i  <  5;
    while (var_12_ws_3) {
      int t_28;
      boolean t_29;

      t_28 = var_9_a % 2;
      t_29 = t_28  ==  0;

      if (t_29) {
        {
          {
            {
              {
                {
                  {
                    var_9_a = var_9_a + 2;
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
                    var_9_a = var_9_a + 1;
                  }
                }
              }
            }
          }
        }
      }
      var_8_i = var_8_i + 1;
      var_12_ws_3 = var_8_i  <  5;
    }
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.OurTests.roops_goal_0 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_1 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_2 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_3 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_4 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_5 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_6 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_7 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_8 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_9 = false;
  }


  public OurTests() {
  }

}
