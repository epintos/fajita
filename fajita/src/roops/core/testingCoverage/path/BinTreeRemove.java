package roops.core.testingCoverage.path;

//Authors: Marcelo Frias
import roops.core.testingCoverage.base.BinTreeNode;
import roops.util.RoopsArray;
/**
 * 
 * @Invariant all n : BinTreeNode | n in this.root.*(left @+ right ) => ( 
 *            ( n !in n.^(left @+ right) ) && 
 *            ( all m: BinTreeNode | m in n.left.*(left @+right) => m.key < n.key ) && 
 *            ( all m: BinTreeNode | m in n.right.*(left @+right) => n.key < m.key ) && 
 *            ( n.left!=null => n.left.parent=n ) &&
 *            ( n.right!=null=> n.right.parent=n ) && 
 *            ( n=this.root => n.parent=null ) ) ;
 * 
 */
public class BinTreeRemove {
    static public void addTest (BinTreeRemove tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.add (x);
        }
        else
        {}
    }
    static public void containsTest (BinTreeRemove tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.contains (x);
        }
        else
        {}
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void removeTest (BinTreeRemove tree, BinTreeNode z) {
        fajita_roopsGoal_initialization ();
        if ( tree != null && z != null && tree.repOK () )
        {
            roops_goal_0 = true;
            tree.remove (z);
        }
        else
        {
            roops_goal_1 = true;
        }
    }

    public /* @ nullable @ */BinTreeNode root;

    public void add (int x) {
        BinTreeNode current = root;

        if ( root == null ) {
            {

    }
            root = new BinTreeNode ();
            initNode (root, x);
            return;
        }
        else
        {}
        {
            boolean terminatesInTime = true;
            if ( current.key != x ) {

                {

    }

                if ( x < current.key ) {

                    {

    }

                    if ( current.left == null ) {
                        {


    }
                        current.left = new BinTreeNode ();
                        initNode (current.left, x);
                    } else {
                        {


    }
                        current = current.left;
                    }
                } else {
                    {

    }

                    if ( current.right == null ) {
                        {


    }
                        current.right = new BinTreeNode ();
                        initNode (current.right, x);
                    } else {
                        {


    }
                        current = current.right;
                    }
                }
            }
            else
            {}
            if ( current.key != x ) {

                {

    }

                if ( x < current.key ) {

                    {

    }

                    if ( current.left == null ) {
                        {


    }
                        current.left = new BinTreeNode ();
                        initNode (current.left, x);
                    } else {
                        {


    }
                        current = current.left;
                    }
                } else {
                    {

    }

                    if ( current.right == null ) {
                        {


    }
                        current.right = new BinTreeNode ();
                        initNode (current.right, x);
                    } else {
                        {


    }
                        current = current.right;
                    }
                }
            }
            else
            {}
        }

        {

    }
    }

    public void initNode (BinTreeNode node, int x) {
        node.key = x;
        node.left = null;
        node.right = null;
    }

    public boolean contains (int x) {
        BinTreeNode current = root;
        {
            boolean terminatesInTime = true;
            if ( current != null ) {
                {

    }

                if ( current.key == x ) {
                    {

    }
                    return true;
                }
                else
                {}

                if ( x < current.key ) {
                    {

    }
                    current = current.left;
                } else {
                    {

    }
                    current = current.right;
                }
            }
            else
            {}
            if ( current != null ) {
                {

    }

                if ( current.key == x ) {
                    {

    }
                    return true;
                }
                else
                {}

                if ( x < current.key ) {
                    {

    }
                    current = current.left;
                } else {
                    {

    }
                    current = current.right;
                }
            }
            else
            {}
        }

        {

    }
        return false;
    }

    public BinTreeNode treeMinimum (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        {
            boolean terminatesInTime = true;
            if ( x.left != null )
            {
                roops_goal_2 = true;
                {

    }
                x = x.left;
            }
            else
            {
                roops_goal_3 = true;
            }
            if ( x.left != null )
            {
                roops_goal_4 = true;
                {

    }
                x = x.left;
            }
            else
            {
                roops_goal_5 = true;
            }
        }
        {

    }
        return x;
    }

    public BinTreeNode treeSuccessor (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        BinTreeNode result;
        if ( x.right != null )
        {
            roops_goal_6 = true;
            {

    }
            result = treeMinimum (x.right);
        } else
        {
            roops_goal_7 = true;
            {

    }
            BinTreeNode y = x.parent;
            {
                boolean terminatesInTime = true;
                if ( y != null && x == y.right )
                {
                    roops_goal_8 = true;
                    {


    }
                    x = y;
                    y = y.parent;
                }
                else
                {
                    roops_goal_9 = true;
                }
                if ( y != null && x == y.right )
                {
                    roops_goal_10 = true;
                    {


    }
                    x = y;
                    y = y.parent;
                }
                else
                {
                    roops_goal_11 = true;
                }
            }

            result = y;
        }
        {

    }
        return result;
    }

    public BinTreeNode remove (final BinTreeNode z) {
        BinTreeNode y = null;
        if ( z.left == null || z.right == null )
        {
            roops_goal_12 = true;
            {

    }
            y = z;
        } else
        {
            roops_goal_13 = true;
            {

    }
            y = treeSuccessor (z);
        }

        BinTreeNode x = null;
        if ( y.left != null )
        {
            roops_goal_14 = true;
            {

    }
            x = y.left;
        } else
        {
            roops_goal_15 = true;
            {

    }
            x = y.right;
        }

        if ( x != null )
        {
            roops_goal_16 = true;
            {

    }
            x.parent = y.parent;
        }
        else
        {
            roops_goal_17 = true;
        }

        if ( y.parent == null )
        {
            roops_goal_18 = true;
            {

    }
            this.root = x;
        } else
        {
            roops_goal_19 = true;
            {

    }
            if ( y == y.parent.left )
            {
                roops_goal_20 = true;
                {

    }
                y.parent.left = x;
            } else
            {
                roops_goal_21 = true;
                {

    }
                y.parent.right = x;
            }
        }

        if ( y != z )
        {
            roops_goal_22 = true;
            {

    }
            z.key = y.key;
        }
        else
        {
            roops_goal_23 = true;
        }

        {

    }
        return y;
    }

    public BinTreeRemove () {
    }

    // *************************************************************************
    // ************** From now on repOK() *************************************
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

    public static boolean roops_goal_12;

    public static boolean roops_goal_13;

    public static boolean roops_goal_14;

    public static boolean roops_goal_15;

    public static boolean roops_goal_16;

    public static boolean roops_goal_17;

    public static boolean roops_goal_18;

    public static boolean roops_goal_19;

    public static boolean roops_goal_20;

    public static boolean roops_goal_21;

    public static boolean roops_goal_22;

    public static boolean roops_goal_23;

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
        roops_goal_12 = false;
        roops_goal_13 = false;
        roops_goal_14 = false;
        roops_goal_15 = false;
        roops_goal_16 = false;
        roops_goal_17 = false;
        roops_goal_18 = false;
        roops_goal_19 = false;
        roops_goal_20 = false;
        roops_goal_21 = false;
        roops_goal_22 = false;
        roops_goal_23 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
