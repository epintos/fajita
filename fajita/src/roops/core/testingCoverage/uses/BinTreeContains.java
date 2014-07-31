package roops.core.testingCoverage.uses;

//Authors: Marcelo Frias
import roops.core.testingCoverage.base.BinTreeNode;
import roops.util.RoopsArray;

/**
 * 
 * @Invariant all n : BinTreeNode | n in this.root.*(left @+ right ) => ( ( n
 *            !in n.^(left @+ right) ) && ( all m: BinTreeNode | m in
 *            n.left.*(left @+right) => m.key < n.key ) && ( all m: BinTreeNode
 *            | m in n.right.*(left @+right) => n.key < m.key ) && (
 *            n.left!=null => n.left.parent=n ) && ( n.right!=null=>
 *            n.right.parent=n ) && ( n=this.root => n.parent=null ) ) ;
 * 
 */
public class BinTreeContains {
    static public void addTest(BinTreeContains tree, int x) {
        if (tree != null && tree.repOK()) {
            tree.add(x);
        }
    }

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void containsTest(BinTreeContains tree, int x) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (tree != null && tree.repOK()) {
            tree.contains(x);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    static public void removeTest(BinTreeContains tree, BinTreeNode z) {
        if (tree != null && z != null && tree.repOK()) {
            tree.remove(z);
        }
    }

    public/* @ nullable @ */BinTreeNode root;

    public void add(int x) {
        BinTreeNode current = root;

        if (root == null) {
            {

            }
            root = new BinTreeNode();
            initNode(root, x);
            return;
        }

        while (current.key != x) {

            {

            }

            if (x < current.key) {

                {

                }

                if (current.left == null) {
                    {

                    }
                    current.left = new BinTreeNode();
                    initNode(current.left, x);
                } else {
                    {

                    }
                    current = current.left;
                }
            } else {
                {

                }

                if (current.right == null) {
                    {

                    }
                    current.right = new BinTreeNode();
                    initNode(current.right, x);
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

    public void initNode(BinTreeNode node, int x) {
        node.key = x;
        node.left = null;
        node.right = null;
    }

    public boolean contains(int x) {
        variable_definition_2 = true;
        BinTreeNode current = root;
        variable_definition_3 = true;
        roops_goal_4 = variable_definition_3;

        while (current != null) {
            {

            }
            roops_goal_5 = variable_definition_3;
            roops_goal_6 = variable_definition_2;

            if (current.key == x) {
                {

                }
                return true;
            }

            if (x < current.key) {
                {

                }
                current = current.left;
                roops_goal_7 = variable_definition_3;
                variable_definition_4 = true;
                variable_definition_3 = false;
            } else {
                {

                }
                current = current.right;
                roops_goal_8 = variable_definition_3;
                roops_goal_9 = variable_definition_4;
                variable_definition_5 = true;
                variable_definition_3 = false;
                variable_definition_4 = false;
            }
        }

        {

        }
        return false;
    }

    public BinTreeNode treeMinimum(final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        while (x.left != null) {
            {

            }
            x = x.left;
        }
        {

        }
        return x;
    }

    public BinTreeNode treeSuccessor(final BinTreeNode x_param) {
        BinTreeNode x = x_param;
        BinTreeNode result;
        if (x.right != null) {
            {

            }
            result = treeMinimum(x.right);
        } else {
            {

            }
            BinTreeNode y = x.parent;
            while (y != null && x == y.right) {
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

    public BinTreeNode remove(final BinTreeNode z) {
        BinTreeNode y = null;
        if (z.left == null || z.right == null) {
            {

            }
            y = z;
        } else {
            {

            }
            y = treeSuccessor(z);
        }

        BinTreeNode x = null;
        if (y.left != null) {
            {

            }
            x = y.left;
        } else {
            {

            }
            x = y.right;
        }

        if (x != null) {
            {

            }
            x.parent = y.parent;
        }

        if (y.parent == null) {
            {

            }
            this.root = x;
        } else {
            {

            }
            if (y == y.parent.left) {
                {

                }
                y.parent.left = x;
            } else {
                {

                }
                y.parent.right = x;
            }
        }

        if (y != z) {
            {

            }
            z.key = y.key;
        }

        {

        }
        return y;
    }

    public BinTreeContains() {
    	fajita_roopsGoal_initialization();
    }

    // *************************************************************************
    // ************** From now on repOK() *************************************
    // *************************************************************************

    public boolean repOK() {
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

    public static RoopsArray myRoopsArray;

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static boolean variable_definition_4;

    public static boolean variable_definition_5;

    public static void fajita_roopsGoal_initialization() {
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
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
        variable_definition_4 = false;
        variable_definition_5 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
