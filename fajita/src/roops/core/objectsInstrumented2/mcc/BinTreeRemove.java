package roops.core.objectsInstrumented2.mcc;

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
public class BinTreeRemove { static
     public void addTest (BinTreeRemove tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.add (x);
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */ static
     public void removeTest (BinTreeRemove tree, BinTreeNode z) {
        fajita_roopsGoal_initialization ();
        BinTreeNode ret_val;
        roops_goal_0 = (tree != null) == false;
        roops_goal_1 = tree != null;
        roops_goal_2 = ( z != null) == false;
        roops_goal_3 = z != null;
        if ( tree != null && z != null && tree.repOK () )
        {
            ret_val = tree.remove (z);
        }
    }


    public /*@ nullable @*/ BinTreeNode root;


    public void add (int x) {
        BinTreeNode current = root;

        if ( root == null ) {
            {}
            root = new BinTreeNode ();
            initNode (root, x);
            return;
        }

        while ( current.key != x ) {

            {}

            if ( x < current.key ) {

                {}

                if ( current.left == null ) {
                    {}
                    current.left = new BinTreeNode ();
                    initNode (current.left, x);
                } else {
                    {}
                    current = current.left;
                }
            } else {
                {}

                if ( current.right == null ) {
                    {}
                    current.right = new BinTreeNode ();
                    initNode (current.right, x);
                } else {
                    {}
                    current = current.right;
                }
            }
        }

        {}
    }

    public void initNode (BinTreeNode node, int x) {
        node.key = x;
        node.left = null;
        node.right = null;
    }

    public BinTreeNode treeMinimum (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        roops_goal_4 = (x.left != null) == false;
        roops_goal_5 = x.left != null;
        while (  x.left != null )
        {
            {}
            x = x.left;
        }
        {}
        return x;
    }

    public BinTreeNode treeSuccessor (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        BinTreeNode result;
        roops_goal_10 = (x.right != null) == false;
        roops_goal_11 = x.right != null;
        if ( x.right != null )
        {
            {}
            result = treeMinimum (x.right);
        } else
        {
            {}
            BinTreeNode y = x.parent;
            roops_goal_6 = (y != null) == false;
            roops_goal_7 = y != null;
            roops_goal_8 = ( x == y.right) == false;
            roops_goal_9 = x == y.right;
            while (  y != null && x == y.right )
            {
                {}
                x = y;
                y = y.parent;
            }

            result = y;
        }
        {}
        return result;
    }


    public BinTreeNode remove (final BinTreeNode z) {
        BinTreeNode y = null;
        roops_goal_12 = (z.left == null) == false;
        roops_goal_13 = z.left == null;
        roops_goal_14 = ( z.right == null) == false;
        roops_goal_15 = z.right == null;
        if ( z.left == null || z.right == null )
        {
            {}
            y = z;
        } else
        {
            {}
            y = treeSuccessor (z);
        }

        BinTreeNode x = null;
        roops_goal_16 = (y.left != null) == false;
        roops_goal_17 = y.left != null;
        if ( y.left != null )
        {
            {}
            x = y.left;
        } else
        {
            {}
            x = y.right;
        }
        roops_goal_18 = (x != null) == false;
        roops_goal_19 = x != null;

        if ( x != null )
        {
            {}
            x.parent = y.parent;
        }
        roops_goal_22 = (y.parent == null) == false;
        roops_goal_23 = y.parent == null;

        if ( y.parent == null )
        {
            {}
            this.root = x;
        } else
        {
            {}
            roops_goal_20 = (y == y.parent.left) == false;
            roops_goal_21 = y == y.parent.left;
            if ( y == y.parent.left )
            {
                {}
                y.parent.left = x;
            }
            else
            {
                {}
                y.parent.right = x;
            }
        }
        roops_goal_24 = (y != z) == false;
        roops_goal_25 = y != z;

        if ( y != z )
        {
            {}
            z.key = y.key;
        }

        {}
        return y;
    }


    public BinTreeRemove () {}

    //*************************************************************************
    //************** From now on repOK()  *************************************
    //*************************************************************************

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

    public static boolean roops_goal_24;

    public static boolean roops_goal_25;

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
        roops_goal_24 = false;
        roops_goal_25 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
