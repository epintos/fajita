package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class MCCTest extends java.lang.Object {


  public void test1() {
    boolean t_1;
    boolean t_2;
    boolean t_3;
    boolean t_4;
    boolean var_1_a = false;
    boolean var_2_b = false;
    boolean var_3_c = false;
    boolean var_4_d = false;
    boolean var_5_e = false;


    if (var_1_a) {
      {
        {
          if (var_2_b) {
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

    if (var_4_d) {
      {
        {
          if (var_5_e) {
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

    if (var_3_c) {
      {
        {
          t_3 = true;
        }
      }
    } else {
      {
        {
          if ((t_4)) {
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

    if (t_2) {
      {
        {
          if ((t_3)) {
            {
              {
                t_1 = true;
              }
            }
          } else {
            {
              {
                t_1 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_1 = false;
        }
      }
    }
    if (t_1) {
      {
        {
          {
            {
              {
                {
                  return;
                }
              }
            }
          }
        }
      }
    }
  }


  public void test2() {
    boolean t_5;
    boolean t_6;
    boolean t_7;
    boolean t_8;
    boolean var_6_a = false;
    boolean var_7_b = false;
    boolean var_8_c = false;
    boolean var_9_d = false;
    boolean var_10_e = false;


    if (var_6_a) {
      {
        {
          t_7 = true;
        }
      }
    } else {
      {
        {
          if (var_7_b) {
            {
              {
                t_7 = true;
              }
            }
          } else {
            {
              {
                t_7 = false;
              }
            }
          }
        }
      }
    }

    if (var_8_c) {
      {
        {
          t_8 = true;
        }
      }
    } else {
      {
        {
          if (var_9_d) {
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
    }

    if ((t_7)) {
      {
        {
          if ((t_8)) {
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

    if ((t_6)) {
      {
        {
          if (var_10_e) {
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
                  return;
                }
              }
            }
          }
        }
      }
    }
  }
/** @Modifies_Everything
 @Ensures false;
*/

  public void test3() {
    boolean t_9;
    boolean t_10;
    boolean t_11;
    boolean t_12;

    fajita_roopsGoal_initialization();
    boolean var_11_a = false;
    boolean var_12_b = false;
    boolean var_13_c = false;
    boolean var_14_d = false;
    boolean var_15_e = false;
    boolean var_16_ws_1;


    if (var_11_a) {
      {
        {
          t_11 = true;
        }
      }
    } else {
      {
        {
          if (var_12_b) {
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
    }

    if (var_13_c) {
      {
        {
          t_12 = true;
        }
      }
    } else {
      {
        {
          if (var_14_d) {
            {
              {
                t_12 = true;
              }
            }
          } else {
            {
              {
                t_12 = false;
              }
            }
          }
        }
      }
    }

    if ((t_11)) {
      {
        {
          if ((t_12)) {
            {
              {
                t_10 = true;
              }
            }
          } else {
            {
              {
                t_10 = false;
              }
            }
          }
        }
      }
    } else {
      {
        {
          t_10 = false;
        }
      }
    }

    if ((t_10)) {
      {
        {
          if (var_15_e) {
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
    var_16_ws_1 = t_9;
    while (var_16_ws_1) {
      boolean t_13;
      boolean t_14;
      boolean t_15;
      boolean t_16;


      return;

      if (var_11_a) {
        {
          {
            t_15 = true;
          }
        }
      } else {
        {
          {
            if (var_12_b) {
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

      if (var_13_c) {
        {
          {
            t_16 = true;
          }
        }
      } else {
        {
          {
            if (var_14_d) {
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
      }

      if ((t_15)) {
        {
          {
            if ((t_16)) {
              {
                {
                  t_14 = true;
                }
              }
            } else {
              {
                {
                  t_14 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_14 = false;
          }
        }
      }

      if ((t_14)) {
        {
          {
            if (var_15_e) {
              {
                {
                  t_13 = true;
                }
              }
            } else {
              {
                {
                  t_13 = false;
                }
              }
            }
          }
        }
      } else {
        {
          {
            t_13 = false;
          }
        }
      }
      var_16_ws_1 = t_13;
    }
  }


  public static void fajita_roopsGoal_initialization() {
  }


  public MCCTest() {
  }

}
