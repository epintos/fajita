package roops.core.objectsInstrumented;

//@ model import org.jmlspecs.lang.*;


public class OurTests extends java.lang.Object {

  public static boolean roops_goal_0;
  public static boolean roops_goal_1;
  public static boolean roops_goal_2;
  public static boolean roops_goal_3;/** @Modifies_Everything
 @Ensures false;
*/

  public void test1(int m) {
    fajita_roopsGoal_initialization();
    {
      boolean t_3;
      boolean var_1_fajita_cicle_0 = false;
      boolean var_2_ws_1;

      var_2_ws_1 = m  >  0;
      while (var_2_ws_1) {
        int t_1;
        boolean t_2;

        var_1_fajita_cicle_0 = true;
        roops.core.objectsInstrumented.OurTests.roops_goal_0 = true;
        t_1 = m;
        m = m + (byte)-1;
        t_2 = m  ==  3;

        if (t_2) {
          {
            {
              {
                {
                  {
                    {
                      roops.core.objectsInstrumented.OurTests.roops_goal_2 = true;
                      m = 7;
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
                      roops.core.objectsInstrumented.OurTests.roops_goal_3 = true;
                    }
                  }
                }
              }
            }
          }
        }
        var_2_ws_1 = m  >  0;
      }
      t_3 = ! var_1_fajita_cicle_0;
      if (t_3) {
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
  }


  public static void fajita_roopsGoal_initialization() {
    roops.core.objectsInstrumented.OurTests.roops_goal_0 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_1 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_2 = false;
    roops.core.objectsInstrumented.OurTests.roops_goal_3 = false;
  }


  public OurTests() {
  }

}
