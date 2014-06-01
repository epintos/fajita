package roops.core.objectsInstrumented;

public class OurTests {

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test1 (int o) {
        fajita_roopsGoal_initialization ();
        int a = 8;
        int m = 0;
        boolean b = o % 2 == 0;
        roops_goal_3 = (o > 9 && b) || (o < (0 - 1) && ! b);
        roops_goal_4 = o > 9 && b;
        roops_goal_5 = o > 9;
        roops_goal_6 = b;
        roops_goal_7 = o < (0 - 1) && ! b;
        roops_goal_8 = o < (0 - 1);
        roops_goal_9 = ! b;
        if ( ( o > 9 && b) || ( o < (0 - 1) && ! b) )
        {
            while ( a -- > 0 )
            {
                roops_goal_0 = o > 15 || b;
                roops_goal_1 = o > 15;
                roops_goal_2 = b;
                if ( o > 15 || b )
                {}
            }
            m = a;
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

    public static boolean roops_goal_2;

    public static boolean roops_goal_3;

    public static boolean roops_goal_4;

    public static boolean roops_goal_5;

    public static boolean roops_goal_6;

    public static boolean roops_goal_7;

    public static boolean roops_goal_8;

    public static boolean roops_goal_9;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
        roops_goal_4 = false;
        roops_goal_5 = false;
        roops_goal_6 = false;
        roops_goal_7 = false;
        roops_goal_8 = false;
        roops_goal_9 = false;
    }
}
