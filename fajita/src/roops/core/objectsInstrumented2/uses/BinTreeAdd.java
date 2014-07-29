package roops.core.objectsInstrumented2.uses;

//Authors: Marcelo Frias
import roops.core.objectsInstrumented2.base.BinTreeNode;
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
public class BinTreeAdd {

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void addTest(BinTreeAdd tree, int x) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (tree != null && tree.repOK()) {
            tree.add(x);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    static public void containsTest(BinTreeAdd tree, int x) {
        if (tree != null && tree.repOK()) {
            tree.contains(x);
        }
    }

    static public void removeTest(BinTreeAdd tree, BinTreeNode z) {
        if (tree != null && z != null && tree.repOK()) {
            tree.remove(z);
        }
    }

    public/* @ nullable @ */BinTreeNode root;

    public void add(int x) {
        variable_definition_2 = true;
        BinTreeNode current = root;
        variable_definition_3 = true;

        if (root == null) {
            {

            }
            root = new BinTreeNode();
            variable_definition_4 = true;
            initNode(root, x);
            roops_goal_4 = variable_definition_4;
            roops_goal_5 = variable_definition_2;
            return;
        }
        roops_goal_6 = variable_definition_3;
        roops_goal_7 = variable_definition_2;

        while (current.key != x) {

            {

            }

            if (x < current.key) {

                {

                }
                roops_goal_8 = variable_definition_3;

                if (current.left == null) {
                    {

                    }
                    current.left = new BinTreeNode();
                    variable_definition_5 = true;
                    variable_definition_3 = false;
                    initNode(current.left, x);
                    roops_goal_9 = variable_definition_3;
                    roops_goal_10 = variable_definition_5;
                    roops_goal_11 = variable_definition_2;
                } else {
                    {

                    }
                    current = current.left;
                    roops_goal_12 = variable_definition_3;
                    roops_goal_13 = variable_definition_5;
                    variable_definition_6 = true;
                    variable_definition_3 = false;
                    variable_definition_5 = false;
                }
            } else {
                {

                }
                roops_goal_14 = variable_definition_3;
                roops_goal_15 = variable_definition_5;
                roops_goal_16 = variable_definition_6;

                if (current.right == null) {
                    {

                    }
                    current.right = new BinTreeNode();
                    variable_definition_7 = true;
                    variable_definition_3 = false;
                    variable_definition_5 = false;
                    variable_definition_6 = false;
                    initNode(current.right, x);
                    roops_goal_17 = variable_definition_3;
                    roops_goal_18 = variable_definition_5;
                    roops_goal_19 = variable_definition_6;
                    roops_goal_20 = variable_definition_7;
                    roops_goal_21 = variable_definition_2;
                } else {
                    {

                    }
                    current = current.right;
                    roops_goal_22 = variable_definition_3;
                    roops_goal_23 = variable_definition_5;
                    roops_goal_24 = variable_definition_6;
                    roops_goal_25 = variable_definition_7;
                    variable_definition_8 = true;
                    variable_definition_3 = false;
                    variable_definition_5 = false;
                    variable_definition_6 = false;
                    variable_definition_7 = false;
                }
            }
        }

        {

        }
    }

    public void initNode(BinTreeNode node, int x) {
        variable_definition_9 = true;
        variable_definition_10 = true;
        node.key = x;
        roops_goal_26 = variable_definition_10;
        variable_definition_11 = true;
        node.left = null;
        variable_definition_12 = true;
        node.right = null;
        variable_definition_13 = true;
    }

    public boolean contains(int x) {
        BinTreeNode current = root;

        while (current != null) {
            {

            }

            if (current.key == x) {
                {

                }
                return true;
            }

            if (x < current.key) {
                {

                }
                current = current.left;
            } else {
                {

                }
                current = current.right;
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

    public BinTreeAdd() {
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

    public static boolean roops_goal_26;

    public static RoopsArray myRoopsArray;

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static boolean variable_definition_4;

    public static boolean variable_definition_5;

    public static boolean variable_definition_6;

    public static boolean variable_definition_7;

    public static boolean variable_definition_8;

    public static boolean variable_definition_9;

    public static boolean variable_definition_10;

    public static boolean variable_definition_11;

    public static boolean variable_definition_12;

    public static boolean variable_definition_13;

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
        roops_goal_26 = false;
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
        variable_definition_4 = false;
        variable_definition_5 = false;
        variable_definition_6 = false;
        variable_definition_7 = false;
        variable_definition_8 = false;
        variable_definition_9 = false;
        variable_definition_10 = false;
        variable_definition_11 = false;
        variable_definition_12 = false;
        variable_definition_13 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
