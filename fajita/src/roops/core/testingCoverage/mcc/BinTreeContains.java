package roops.core.testingCoverage.mcc;

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
public class BinTreeContains {
    static public void addTest (BinTreeContains tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.add (x);
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void containsTest (BinTreeContains tree, int x) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = (tree != null) == false;
        roops_goal_1 = tree != null;
        if ( tree != null && tree.repOK () )
        {
            tree.contains (x);
        }
    }
    static public void removeTest (BinTreeContains tree, BinTreeNode z) {
        if ( tree != null && z != null && tree.repOK () ) {
            tree.remove (z);
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

        while ( current.key != x ) {

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
        roops_goal_6 = (current != null) == false;
        roops_goal_7 = current != null;

        while (  current != null )
        {
            {

    }
            roops_goal_2 = (current.key == x) == false;
            roops_goal_3 = current.key == x;

            if ( current.key == x )
            {
                {

    }
                return true;
            }
            roops_goal_4 = (x < current.key) == false;
            roops_goal_5 = x < current.key;

            if ( x < current.key )
            {
                {

    }
                current = current.left;
            } else
            {
                {

    }
                current = current.right;
            }
        }

        {

    }
        return false;
    }

    public BinTreeNode treeMinimum (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        while ( x.left != null ) {
            {

    }
            x = x.left;
        }
        {

    }
        return x;
    }

    public BinTreeNode treeSuccessor (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        BinTreeNode result;
        if ( x.right != null ) {
            {

    }
            result = treeMinimum (x.right);
        } else {
            {

    }
            BinTreeNode y = x.parent;
            while ( y != null && x == y.right ) {
                {


    }
                x = y;
                y = y.parent;
            }

            result = y;
        }
        {

    }
        return result;
    }

    public BinTreeNode remove (final BinTreeNode z) {
        BinTreeNode y = null;
        if ( z.left == null || z.right == null ) {
            {

    }
            y = z;
        } else {
            {

    }
            y = treeSuccessor (z);
        }

        BinTreeNode x = null;
        if ( y.left != null ) {
            {

    }
            x = y.left;
        } else {
            {

    }
            x = y.right;
        }

        if ( x != null ) {
            {

    }
            x.parent = y.parent;
        }

        if ( y.parent == null ) {
            {

    }
            this.root = x;
        } else {
            {

    }
            if ( y == y.parent.left ) {
                {

    }
                y.parent.left = x;
            } else {
                {

    }
                y.parent.right = x;
            }
        }

        if ( y != z ) {
            {

    }
            z.key = y.key;
        }

        {

    }
        return y;
    }

    public BinTreeContains () {}

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
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
