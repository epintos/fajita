package roops.core.objectsInstrumented;

public class OurTests {

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test1 (int m) {
        fajita_roopsGoal_initialization ();
        {
            boolean fajita_cicle_0 = false;
            while ( m > 0 )
            { fajita_cicle_0 = true;
                roops_goal_0 = true;
                m --;
                if ( m == 3 )
                {
                    roops_goal_2 = true;
                    m = 7;
                }
                else
                {
                    roops_goal_3 = true;
                }
            }
            if ( ! fajita_cicle_0 )
                roops_goal_1 = true;
        }
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static boolean roops_goal_2;

    public static boolean roops_goal_3;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
    }
}
