package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class OurTests extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean variable_definition_0;
  public static boolean variable_definition_1;
  public static boolean variable_definition_2;
  public static boolean variable_definition_3;/** @Modifies_Everything
 @Ensures false;
*/

  public void test1(java.lang.Object o) {
    boolean t_1;

    fajita_roopsGoal_initialization();
    int var_1_a = 1;

    roops.core.objectsInstrumented.OurTests.variable_definition_0 = true;
    int var_2_m = 0;

    roops.core.objectsInstrumented.OurTests.variable_definition_1 = true;
    t_1 = o  !=  null;

    if (t_1) {
      {
        {
          {
            {
              {
                {
                  var_1_a = 7;
                  roops.core.objectsInstrumented.OurTests.variable_definition_2 = true;
                  roops.core.objectsInstrumented.OurTests.variable_definition_0 = false;
                }
              }
            }
          }
        }
      }
    }
    var_2_m += var_1_a;
    roops.core.objectsInstrumented.OurTests.roops_goal_0 = roops.core.objectsInstrumented.OurTests.variable_definition_0;
    roops.core.objectsInstrumented.OurTests.roops_goal_1 = roops.core.objectsInstrumented.OurTests.variable_definition_2;
    roops.core.objectsInstrumented.OurTests.variable_definition_3 = true;
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.OurTests.roops_goal_0 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_1 = false;
    roops.core.objectsInstrumented.OurTests.variable_definition_0 = false;
    roops.core.objectsInstrumented.OurTests.variable_definition_1 = false;
    roops.core.objectsInstrumented.OurTests.variable_definition_2 = false;
    roops.core.objectsInstrumented.OurTests.variable_definition_3 = false;
  }


  public OurTests() {
  }

}
