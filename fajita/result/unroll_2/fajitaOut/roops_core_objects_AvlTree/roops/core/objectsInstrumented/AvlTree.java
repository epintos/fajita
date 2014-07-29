package roops.core.objectsInstrumented;

//Authors: Marcelo Frias
import roops.utilInstrumented.RoopsArray;
/**
 * @Invariant all x: AvlNode | x in this.root.*(left @+ right) @- null => 
 * (
 *		(x !in x.^(left @+ right)) && 
 *		(all y: AvlNode | (y in x.left.*(left @+ right) @-null) => y.element < x.element ) && 
 *		(all y: AvlNode | (y in x.right.*(left @+right) @- null) => x.element < y.element ) && 
 *		(x.left=null && x.right=null => x.height=0) && 
 *		(x.left=null && x.right!=null => x.height=1 && x.right.height=0) && 
 *		(x.left!=null && x.right=null => x.height=1 && x.left.height=0) && 
 *		(x.left!=null && x.right!=null => x.height= (x.left.height>x.right.height ? x.left.height : x.right.height )+1 && ( (x.left.height > x.right.height ? x.left.height - x.right.height : x.right.height - x.left.height ))<=1)
 * );
 * 
 */
public class AvlTree {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void searchNodeTest (AvlTree tree, int x) {
        fajita_roopsGoal_initialization ();
        variable_definition_0 = true;
        variable_definition_1 = true;
        if ( tree != null && tree.repOK () )
        {
            tree.searchNode (x);
        }
    }
    static public void searchMaxTest (AvlTree tree) {
        if ( tree != null && tree.repOK () ) {
            tree.searchMax ();
        }
    }
    static public void searchMinTest (AvlTree tree) {
        if ( tree != null && tree.repOK () ) {
            tree.searchMin ();
        }
    }

    public /* @ nullable @ */AvlNode root;

    public /* @ nullable @ */AvlNode searchNode (final int x) {
        variable_definition_2 = true;
        return search (x, this.root);
    }

    public AvlNode search (final int x, final AvlNode arg) {
        variable_definition_3 = true;
        variable_definition_4 = true;
        AvlNode t = arg;
        variable_definition_5 = true;
        while ( t != null )
        {

            {

    }
            if ( x < t.element )
            {

                {

    }
                t = t.left;
                variable_definition_6 = true;
                variable_definition_5 = false;
            } else if ( x > t.element )
                {

                    {

    }
                    t = t.right;
                    roops_goal_9 =
                     variable_definition_6;
                    variable_definition_7 = true;
                    variable_definition_5 = false;
                     variable_definition_6 = false;
                } else
                {

                    {

    }
                    roops_goal_11 =
                     variable_definition_6;
                    roops_goal_12 =
                     variable_definition_7;
                    return t; // Match
                }
        }

        {

    }
        return null; // No match
    }

    public AvlNode searchMax () {
        return searchMax (this.root);
    }

    public AvlNode searchMax (final AvlNode arg) {
        AvlNode t = arg;
        if ( t == null ) {
            {

    }
            return t;
        }

        while ( t.right != null ) {
            {

    }
            t = t.right;
        }

        {

    }
        return t;
    }

    public AvlNode searchMin () {
        return searchMin (this.root);
    }

    public AvlNode searchMin (final AvlNode arg) {
        AvlNode t = arg;
        if ( t == null ) {
            {

    }
            return t;
        }

        while ( t.left != null ) {
            {

    }
            t = t.left;
        }

        {

    }
        return t;
    }

    public AvlTree () {}

    // *************************************************************************
    // ************** From now on repOk() *************************************
    // *************************************************************************

    public boolean repOK () {
        return true;
    }

    public static boolean roops_goal_9;

    public static boolean roops_goal_11;

    public static boolean roops_goal_12;

    public static RoopsArray myRoopsArray;

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static boolean variable_definition_4;

    public static boolean variable_definition_5;

    public static boolean variable_definition_6;

    public static boolean variable_definition_7;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_9 = false;
        roops_goal_11 = false;
        roops_goal_12 = false;
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
        variable_definition_4 = false;
        variable_definition_5 = false;
        variable_definition_6 = false;
        variable_definition_7 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
