package roops.core.objectsInstrumented;

public class OurTests {

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test1 (int o) {
        fajita_roopsGoal_initialization ();
        int a = 8;
        int m = 0;
        if ( o > 9 )
        {
            roops_goal_0 = true;
            m = a;
        }
        else
        {
            roops_goal_1 = true;
        }
    }

    public void test2 (int o) {
        int i = 0;
        int a = 0;
        while ( i < 5 ) {
            if ( a % 2 == 0 ) {
                a = a + 2;
            } else {
                a = a + 1;
            }
            i = i + 1;
        }
    }

    public void test3 (int o) {
        int i = 0;
        int a = 0, b = 0, c = 0;
        while ( i < 5 ) {
            if ( a % 2 == 0 ) {
                a = a + 2;
            } else {
                a = a + 1;
            }
            i = i + 1;
        }
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
    }
}
