package roops.core.objectsInstrumented2.path;

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
public class AvlTreeSearchNode {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void searchNodeTest (AvlTreeSearchNode tree, int x) {
        fajita_roopsGoal_initialization ();
        if ( tree != null && tree.repOK () )
        {
            roops_goal_0 = true;
            tree.searchNode (x);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void searchMaxTest (AvlTreeSearchNode tree) {
        if ( tree != null && tree.repOK () ) {
            tree.searchMax ();
        }
        else
        {}
    }
    static public void searchMinTest (AvlTreeSearchNode tree) {
        if ( tree != null && tree.repOK () ) {
            tree.searchMin ();
        }
        else
        {}
    }

    public /* @ nullable @ */AvlNode root;

    public /* @ nullable @ */AvlNode searchNode (final int x) {
        return search (x, this.root);
    }

    public AvlNode search (final int x, final AvlNode arg) {
        AvlNode t = arg;
        {
            boolean terminatesInTime = true;
            if ( t != null )
            {
                roops_goal_2 = true;

                {

    }
                if ( x < t.element )
                {
                    roops_goal_4 = true;

                    {

    }
                    t = t.left;
                } else if ( x > t.element )
                    {
                        roops_goal_5 = true;

                        {

    }
                        t = t.right;
                    } else
                    {
                        roops_goal_6 = true;

                        {

    }
                        return t; // Match
                    }
            }
            else
            {
                roops_goal_3 = true;
            }
            if ( t != null )
            {
                roops_goal_7 = true;

                {

    }
                if ( x < t.element )
                {
                    roops_goal_9 = true;

                    {

    }
                    t = t.left;
                } else if ( x > t.element )
                    {
                        roops_goal_10 = true;

                        {

    }
                        t = t.right;
                    } else
                    {
                        roops_goal_11 = true;

                        {

    }
                        return t; // Match
                    }
            }
            else
            {
                roops_goal_8 = true;
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
        else
        {}
        {
            boolean terminatesInTime = true;
            if ( t.right != null ) {
                {

    }
                t = t.right;
            }
            else
            {}
            if ( t.right != null ) {
                {

    }
                t = t.right;
            }
            else
            {}
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
        else
        {}
        {
            boolean terminatesInTime = true;
            if ( t.left != null ) {
                {

    }
                t = t.left;
            }
            else
            {}
            if ( t.left != null ) {
                {

    }
                t = t.left;
            }
            else
            {}
        }

        {

    }
        return t;
    }

    public AvlTreeSearchNode () {
    }

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

    public static boolean roops_goal_6;

    public static boolean roops_goal_7;

    public static boolean roops_goal_8;

    public static boolean roops_goal_9;

    public static boolean roops_goal_10;

    public static boolean roops_goal_11;

    public static RoopsArray myRoopsArray;

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
        roops_goal_10 = false;
        roops_goal_11 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
