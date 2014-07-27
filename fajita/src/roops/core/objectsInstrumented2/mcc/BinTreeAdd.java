package roops.core.objectsInstrumented2.mcc;

import roops.core.objectsInstrumented2.base.BinTreeNode;
import roops.util.RoopsArray;
//Authors: Marcelo Frias
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
	 */ static
     public void addTest (BinTreeAdd tree, int x) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = (tree != null) == false;
        roops_goal_1 = tree != null;
        if ( tree != null && tree.repOK () )
        {
            tree.add (x);
        }
    } static
     public void removeTest (BinTreeAdd tree, BinTreeNode z) {
        BinTreeNode ret_val;
        if ( tree != null && z != null && tree.repOK () ) {
            ret_val = tree.remove (z);
        }
    }


    public /*@ nullable @*/ BinTreeNode root;


    public void add (int x) {
        BinTreeNode current = root;
        roops_goal_2 = (root == null) == false;
        roops_goal_3 = root == null;

        if ( root == null )
        {
            {}
            root = new BinTreeNode ();
            initNode (root, x);
            return;
        }
        roops_goal_10 = (current.key != x) == false;
        roops_goal_11 = current.key != x;

        while (  current.key != x )
        {

            {}
            roops_goal_8 = (x < current.key) == false;
            roops_goal_9 = x < current.key;

            if ( x < current.key )
            {

                {}
                roops_goal_4 = (current.left == null) == false;
                roops_goal_5 = current.left == null;

                if ( current.left == null )
                {
                    {}
                    current.left = new BinTreeNode ();
                    initNode (current.left, x);
                } else
                {
                    {}
                    current = current.left;
                }
            } else
            {
                {}
                roops_goal_6 = (current.right == null) == false;
                roops_goal_7 = current.right == null;

                if ( current.right == null )
                {
                    {}
                    current.right = new BinTreeNode ();
                    initNode (current.right, x);
                } else
                {
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
        while ( x.left != null ) {
            {}
            x = x.left;
        }
        {}
        return x;
    }

    public BinTreeNode treeSuccessor (final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        BinTreeNode result;
        if ( x.right != null ) {
            {}
            result = treeMinimum (x.right);
        } else {
            {}
            BinTreeNode y = x.parent;
            while ( y != null && x == y.right ) {
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
        if ( z.left == null || z.right == null ) {
            {}
            y = z;
        } else {
            {}
            y = treeSuccessor (z);
        }

        BinTreeNode x = null;
        if ( y.left != null ) {
            {}
            x = y.left;
        } else {
            {}
            x = y.right;
        }

        if ( x != null ) {
            {}
            x.parent = y.parent;
        }

        if ( y.parent == null ) {
            {}
            this.root = x;
        } else {
            {}
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

        if ( y != z ) {
            {}
            z.key = y.key;
        }

        {}
        return y;
    }


    public BinTreeAdd () {}

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
