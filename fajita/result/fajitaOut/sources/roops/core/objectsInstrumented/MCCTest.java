package roops.core.objectsInstrumented;

public class MCCTest {

    public void test1 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        if ( a && b && (c || (d && e)) ) {
            return;
        }
    }

    public void test2 () {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        if ( ((a || b) && (c || d)) && e ) {
            return;
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */

    public void test3 () {
        fajita_roopsGoal_initialization ();
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;
        while ( ((a || b) && (c || d)) && e )
        {
            return;
        }
    }

    public static void fajita_roopsGoal_initialization () {}
}
