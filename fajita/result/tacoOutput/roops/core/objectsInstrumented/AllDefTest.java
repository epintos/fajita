package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class AllDefTest extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;
  public static boolean variable_definition_4;
  public static boolean variable_definition_5;

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
  }


  public void test2() {
    int var_4_a = 2;
    int var_5_b = 5;

    var_4_a = 2 + var_5_b;
  }


  public void test3() {
    int t_2;
    int var_6_a = 2;
    int var_7_b = 5;

    var_6_a = 2 + var_7_b;
    t_2 = var_7_b + var_6_a;
    int var_8_c = t_2;
  }
/** @Modifies_Everything
 @Ensures false;
*/

  public void test4(int a, int f, int p) {
    int t_3;
    int t_4;

    fajita_roopsGoal_initialization();
    roops.core.objectsInstrumented.AllDefTest.variable_definition_0 = true;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_1 = true;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_2 = true;
    t_3 = 0 + f;
    int var_9_b = t_3;

    roops.core.objectsInstrumented.AllDefTest.roops_goal_0 = roops.core.objectsInstrumented.AllDefTest.variable_definition_1;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_3 = true;
    a = 5;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_4 = true;
    t_4 = p + 3;
    int var_10_c = t_4;

    roops.core.objectsInstrumented.AllDefTest.roops_goal_1 = roops.core.objectsInstrumented.AllDefTest.variable_definition_2;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_5 = true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.AllDefTest.roops_goal_0 = false;
    roops.core.objectsInstrumented.AllDefTest.roops_goal_1 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_0 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_1 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_2 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_3 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_4 = false;
    roops.core.objectsInstrumented.AllDefTest.variable_definition_5 = false;
  }


  public AllDefTest() {
  }

}
