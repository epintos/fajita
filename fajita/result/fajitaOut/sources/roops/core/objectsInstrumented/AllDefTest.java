package roops.core.objectsInstrumented;

public class AllDefTest {

    public void test1 () {
        int a = 2;
        int b = 5;
        a = 2 + b;
        if ( a > 3 ) {
            int c = 20;
            a = c + a;
        }
    }

    public void test2 () {
        int a = 2;
        int b = 5;
        a = 2 + b;
    }

    public void test3 () {
        int a = 2;
        int b = 5;
        a = 2 + b;
        int c = b + a;
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test4 (int a, int f, int p) {
        fajita_roopsGoal_initialization ();
        variable_definition_0 = true;
        variable_definition_1 = true;
        variable_definition_2 = true;
        int b = 0 + f;
        roops_goal_0 =
         variable_definition_1;
        variable_definition_3 = true;
        a = 5;
        variable_definition_4 = true;
        int c = p + 3;
        roops_goal_1 =
         variable_definition_2;
        variable_definition_5 = true;
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static boolean variable_definition_4;

    public static boolean variable_definition_5;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
        variable_definition_4 = false;
        variable_definition_5 = false;
    }
}
