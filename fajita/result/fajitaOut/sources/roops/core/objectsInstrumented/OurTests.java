package roops.core.objectsInstrumented;

public class OurTests {

    /**
     * @Modifies_Everything
     * @Ensures false;
     */

    public void test1(int o) {
        fajita_roopsGoal_initialization();
        int a = 7;
        variable_definition_0 = true;
        if (a > 5) {
            int q = 0;
            variable_definition_1 = true;
            a = a + q;
            roops_goal_0 = variable_definition_1;
            roops_goal_1 = variable_definition_0;
            variable_definition_2 = true;
            variable_definition_0 = false;
            q = a;
            roops_goal_2 = variable_definition_0;
            roops_goal_3 = variable_definition_2;
            variable_definition_3 = true;
            variable_definition_1 = false;
        }
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static boolean roops_goal_2;

    public static boolean roops_goal_3;

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static void fajita_roopsGoal_initialization() {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
    }
}
