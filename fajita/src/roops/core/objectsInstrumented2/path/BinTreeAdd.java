package roops.core.objectsInstrumented2.path;

//Authors: Marcelo Frias
import roops.core.objectsInstrumented2.base.BinTreeNode;
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
public class BinTreeAdd {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void addTest (BinTreeAdd tree, int x) {
        fajita_roopsGoal_initialization ();
        if ( tree != null && tree.repOK () )
        {
            roops_goal_0 = true;
            tree.add (x);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void containsTest (BinTreeAdd tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.contains (x);
        }
        else
        {}
    }
    static public void removeTest (BinTreeAdd tree, BinTreeNode z) {
        if ( tree != null && z != null && tree.repOK () ) {
            tree.remove (z);
        }
        else
        {}
    }

    public /* @ nullable @ */BinTreeNode root;

    public void add (int x) {
        BinTreeNode current = root;

        if ( root == null )
        {
            roops_goal_2 = true;
            {

    }
            root = new BinTreeNode ();
            initNode (root, x);
            return;
        }
        else
        {
            roops_goal_3 = true;
        }
        {
            boolean terminatesInTime = true;
            if ( current.key != x )
            {
                roops_goal_4 = true;

                {

    }

                if ( x < current.key )
                {
                    roops_goal_6 = true;

                    {

    }

                    if ( current.left == null )
                    {
                        roops_goal_8 = true;
                        {


    }
                        current.left = new BinTreeNode ();
                        initNode (current.left, x);
                    } else
                    {
                        roops_goal_9 = true;
                        {


    }
                        current = current.left;
                    }
                } else
                {
                    roops_goal_7 = true;
                    {

    }

                    if ( current.right == null )
                    {
                        roops_goal_10 = true;
                        {


    }
                        current.right = new BinTreeNode ();
                        initNode (current.right, x);
                    } else
                    {
                        roops_goal_11 = true;
                        {


    }
                        current = current.right;
                    }
                }
            }
            else
            {
                roops_goal_5 = true;
            }
            if ( current.key != x )
            {
                roops_goal_12 = true;

                {

    }

                if ( x < current.key )
                {
                    roops_goal_14 = true;

                    {

    }

                    if ( current.left == null )
                    {
                        roops_goal_16 = true;
                        {


    }
                        current.left = new BinTreeNode ();
                        initNode (current.left, x);
                    } else
                    {
                        roops_goal_17 = true;
                        {


    }
                        current = current.left;
                    }
                } else
                {
                    roops_goal_15 = true;
                    {

    }

                    if ( current.right == null )
                    {
                        roops_goal_18 = true;
                        {


    }
                        current.right = new BinTreeNode ();
                        initNode (current.right, x);
                    } else
                    {
                        roops_goal_19 = true;
                        {


    }
                        current = current.right;
                    }
                }
            }
            else
            {
                roops_goal_13 = true;
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
            if ( x.left != null ) {
                {

    }
                x = x.left;
            }
            else
            {}
            if ( x.left != null ) {
                {

    }
                x = x.left;
            }
            else
            {}
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
            {
                boolean terminatesInTime = true;
                if ( y != null && x == y.right ) {
                    {


    }
                    x = y;
                    y = y.parent;
                }
                else
                {}
                if ( y != null && x == y.right ) {
                    {


    }
                    x = y;
                    y = y.parent;
                }
                else
                {}
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
        else
        {}

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
        else
        {}

        {

    }
        return y;
    }

    public BinTreeAdd () {
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
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
