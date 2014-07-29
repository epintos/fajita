package roops.core.objectsInstrumented2.mcc;

//Authors: Marcelo Frias
import roops.core.objectsInstrumented2.base.AvlNode;
import roops.util.RoopsArray;
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
public class AvlTreeSearchMin {
    static public void searchNodeTest (AvlTreeSearchMin tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.searchNode (x);
        }
    }
    static public void searchMaxTest (AvlTreeSearchMin tree) {
        if ( tree != null && tree.repOK () ) {
            tree.searchMax ();
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void searchMinTest (AvlTreeSearchMin tree) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = (tree != null) == false;
        roops_goal_1 = tree != null;
        if ( tree != null && tree.repOK () )
        {
            tree.searchMin ();
        }
    }

    public /* @ nullable @ */AvlNode root;

    public /* @ nullable @ */AvlNode searchNode (final int x) {
        return search (x, this.root);
    }

    public AvlNode search (final int x, final AvlNode arg) {
        AvlNode t = arg;
        while ( t != null ) {

            {

    }
            if ( x < t.element ) {

                {

    }
                t = t.left;
            } else if ( x > t.element ) {

                    {

    }
                    t = t.right;
                } else {

                    {

    }
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
        roops_goal_2 = (t == null) == false;
        roops_goal_3 = t == null;
        if ( t == null )
        {
            {

    }
            return t;
        }
        roops_goal_4 = (t.left != null) == false;
        roops_goal_5 = t.left != null;

        while (  t.left != null )
        {
            {

    }
            t = t.left;
        }

        {

    }
        return t;
    }

    public AvlTreeSearchMin () {}

    // *************************************************************************
    // ************** From now on repOk() *************************************
    // *************************************************************************

    public boolean repOK () {
        return true;
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static boolean roops_goal_2;

    public static boolean roops_goal_3;

    public static boolean roops_goal_4;

    public static boolean roops_goal_5;

    public static RoopsArray myRoopsArray;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
        roops_goal_4 = false;
        roops_goal_5 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
