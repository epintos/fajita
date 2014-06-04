package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class AllDefTest extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;

  public void test1() {
    boolean t_1;
    int var_1_a = 2;
    int var_2_b = 5;

    var_1_a = 2 + var_2_b;
    t_1 = var_1_a  >  3;

    if (t_1) {
      {
        {
          {
            {
              {
                {
                  int var_3_c = 20;

                  var_1_a = var_3_c + var_1_a;
                }
              }
            }
          }
        }
      }
    }
    int var_4_j = var_1_a;
  }


  public void test2() {
    int var_5_a = 2;
    int var_6_b = 5;

    var_5_a = 2 + var_6_b;
  }


  public void test3() {
    int t_2;
    int var_7_a = 2;
    int var_8_b = 5;

    var_7_a = 2 + var_8_b;
    t_2 = var_8_b + var_7_a;
    int var_9_c = t_2;
  }


  public void test4(int a, int f, int p) {
    int t_3;
    int t_4;

    t_3 = 0 + f;
    int var_10_b = t_3;

    a = 5;
    t_4 = p + 3;
    int var_11_c = t_4;
  }


  public void test5(int a, int b, int c) {
    int t_5;
    boolean t_6;

    t_5 = a + b;
    int var_12_d = t_5;

    b = b - a;
    t_6 = c  >=  5;

    if (t_6) {
      {
        {
          {
            {
              {
                {
                  b = 2;
                  a = b + c;
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
                  int var_13_f = c;
                }
              }
            }
          }
        }
      }
    }
    int var_14_e = c;
  }
/** @Modifies_Everything
 @Ensures false;
*/

  public void test6(int a) {
    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.AllDefTest.variable_definition_0 = true;
    boolean var_15_ws_1;

    var_15_ws_1 = a  <  3;
    while (var_15_ws_1) {
      a = a + 1;
      roops.core.objectsInstrumented.AllDefTest.roops_goal_0 = roops.core.objectsInstrumented.AllDefTest.variable_definition_0;
      roops.core.objectsInstrumented.AllDefTest.variable_definition_1 = true;
      roops.core.objectsInstrumented.AllDefTest.variable_definition_0 = false;
      var_15_ws_1 = a  <  3;
    }
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.AllDefTest.roops_goal_0 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_0 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_1 = false;
  }


  public AllDefTest() {
  }

}
