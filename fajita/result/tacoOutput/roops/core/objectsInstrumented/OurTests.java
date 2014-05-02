package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class OurTests extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;/** @Modifies_Everything
 @Ensures false;
*/

  public void test1(int o) {
    boolean t_1;

    fajita_roopsGoal_initialization();
    int var_1_a = 8;
    int var_2_m = 0;

    t_1 = o  >  9;
    if (t_1) {
      {
        {
          {
            {
              {
                {
                  roops.core.objectsInstrumented.OurTests.roops_goal_0 = true;
                  var_2_m = var_1_a;
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
                  roops.core.objectsInstrumented.OurTests.roops_goal_1 = true;
                }
              }
            }
          }
        }
      }
    }
  }


  public void test2(int o) {
    int var_3_i = 0;
    int var_4_a = 0;
    boolean var_5_ws_1;

    var_5_ws_1 = var_3_i  <  5;
    while (var_5_ws_1) {
      int t_2;
      boolean t_3;

      t_2 = var_4_a % 2;
      t_3 = t_2  ==  0;

      if (t_3) {
        {
          {
            {
              {
                {
                  {
                    var_4_a = var_4_a + 2;
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
                    var_4_a = var_4_a + 1;
                  }
                }
              }
            }
          }
        }
      }
      var_3_i = var_3_i + 1;
      var_5_ws_1 = var_3_i  <  5;
    }
  }


  public void test3(int o) {
    int var_6_i = 0;
    int var_7_a = 0, var_8_b = 0, var_9_c = 0;
    boolean var_10_ws_2;

    var_10_ws_2 = var_6_i  <  5;
    while (var_10_ws_2) {
      int t_4;
      boolean t_5;

      t_4 = var_7_a % 2;
      t_5 = t_4  ==  0;

      if (t_5) {
        {
          {
            {
              {
                {
                  {
                    var_7_a = var_7_a + 2;
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
                    var_7_a = var_7_a + 1;
                  }
                }
              }
            }
          }
        }
      }
      var_6_i = var_6_i + 1;
      var_10_ws_2 = var_6_i  <  5;
    }
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.OurTests.roops_goal_0 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_1 = false;
  }


  public OurTests() {
  }

}
