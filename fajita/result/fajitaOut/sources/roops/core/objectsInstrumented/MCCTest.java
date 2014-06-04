package roops.core.objectsInstrumented;

public class MCCTest {

    public void test1 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        if ( a && b && (c || (d && e)) ) {
            ;
        }
    }

    public void test2 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        if ( ((a || b) && (c || d)) && e ) {
            ;
        }
    }

    public void test3 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        while ( ((a || b) && (c || d)) && e ) {
            ;
        }
    }

    public void test4 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        int i = 0;
        for ( i = 0; ((a || b) && (c || d)) && e; i ++ ) {
            ;
        }
    }

    public void test5 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        int i = 0;
        for ( i = 0; i < 5; i ++ ) {
            ;
        }
    }

    public void test6 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        int i = 0;
        while ( i < 5 ) {
            i ++;
        }
    }

    public void test7 () {
        int i = 3;
        if ( i < 5 ) {
            ;
        }
    }

    public void test8 (int i) {
        if ( i < 5 ) {
            ;
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test9 (boolean a, boolean b, boolean c, boolean d, boolean e) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = a && b && (c || (d && e));
        roops_goal_1 = a && b;
        roops_goal_2 = a;
        roops_goal_3 = b;
        roops_goal_4 = c || (d && e);
        roops_goal_5 = c;
        roops_goal_6 = d && e;
        roops_goal_7 = d;
        roops_goal_8 = e;
        if ( a && b && ( c || ( d && e)) )
        {
            ;
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
    }
}
