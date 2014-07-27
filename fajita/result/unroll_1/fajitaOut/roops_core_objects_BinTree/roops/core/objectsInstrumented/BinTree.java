package roops.core.objectsInstrumented;

//Authors: Marcelo Frias
import roops.utilInstrumented.RoopsArray;
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
public class BinTree { static
     public void addTest (BinTree tree, int x) {
        if ( tree != null && tree.repOK () ) {
            tree.add (x);
        }
        else
        {}
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */ static
     public void containsTest (BinTree tree, int x) {
        fajita_roopsGoal_initialization ();
        boolean ret_val;
        if ( tree != null && tree.repOK () ) {
            ret_val = tree.contains (x);
        }
        else
        {}
    } static
     public void removeTest (BinTree tree, BinTreeNode z) {
        BinTreeNode ret_val;
        if ( tree != null && z != null && tree.repOK () ) {
            ret_val = tree.remove (z);
        }
        else
        {}
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
        else
        {}

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

    public boolean contains (int x) {
        BinTreeNode current = root;
        {

            while ( current != null )
            {
                {}

                if ( current.key == x ) {
                    {}
                    return true;
                }
                else
                {
                    roops_goal_5 = true;
                }

                if ( x < current.key )
                {
                    roops_goal_6 = true;
                    {}
                    current = current.left;
                } else
                {
                    roops_goal_7 = true;
                    {}
                    current = current.right;
                }
            }
        }

        {}
        return false;
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
        else
        {}

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
        else
        {}

        {}
        return y;
    }


    public BinTree () {}

    //*************************************************************************
    //************** From now on repOK()  *************************************
    //*************************************************************************

    public boolean repOK () {
        return true;
    }

    public static boolean roops_goal_5;

    public static boolean roops_goal_6;

    public static boolean roops_goal_7;

    public static RoopsArray myRoopsArray;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_5 = false;
        roops_goal_6 = false;
        roops_goal_7 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
