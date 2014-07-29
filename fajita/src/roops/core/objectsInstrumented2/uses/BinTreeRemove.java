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
public class BinTreeRemove {
    static public void addTest(BinTreeRemove tree, int x) {
        if (tree != null && tree.repOK()) {
            tree.add(x);
        }
    }

    static public void containsTest(BinTreeRemove tree, int x) {
        if (tree != null && tree.repOK()) {
            tree.contains(x);
        }
    }

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void removeTest(BinTreeRemove tree, BinTreeNode z) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_1;
        roops_goal_2 = variable_definition_0;
        if (tree != null && z != null && tree.repOK()) {
            tree.remove(z);
            roops_goal_3 = variable_definition_1;
            roops_goal_4 = variable_definition_0;
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
        variable_definition_2 = true;
        BinTreeNode x = x_param;
        roops_goal_5 = variable_definition_2;
        variable_definition_3 = true;
        roops_goal_6 = variable_definition_3;
        while (x.left != null) {
            {

            }
            x = x.left;
            roops_goal_7 = variable_definition_3;
            variable_definition_4 = true;
            variable_definition_3 = false;
        }
        {

        }
        roops_goal_8 = variable_definition_3;
        roops_goal_9 = variable_definition_4;
        return x;
    }

    public BinTreeNode treeSuccessor(final BinTreeNode x_param) {
        variable_definition_5 = true;
        BinTreeNode x = x_param;
        roops_goal_10 = variable_definition_5;
        variable_definition_6 = true;
        BinTreeNode result;
        variable_definition_7 = true;
        roops_goal_11 = variable_definition_6;
        if (x.right != null) {
            {

            }
            result = treeMinimum(x.right);
            roops_goal_12 = variable_definition_6;
            variable_definition_8 = true;
            variable_definition_7 = false;
        } else {
            {

            }
            BinTreeNode y = x.parent;
            roops_goal_13 = variable_definition_6;
            variable_definition_9 = true;
            roops_goal_14 = variable_definition_9;
            roops_goal_15 = variable_definition_6;
            roops_goal_16 = variable_definition_9;
            while (y != null && x == y.right) {
                {

                }
                x = y;
                roops_goal_17 = variable_definition_9;
                variable_definition_10 = true;
                variable_definition_6 = false;
                y = y.parent;
                roops_goal_18 = variable_definition_9;
                variable_definition_11 = true;
                variable_definition_9 = false;
            }

            result = y;
            roops_goal_19 = variable_definition_9;
            roops_goal_20 = variable_definition_11;
            variable_definition_12 = true;
            variable_definition_7 = false;
            variable_definition_8 = false;
        }
        {

        }
        roops_goal_21 = variable_definition_7;
        roops_goal_22 = variable_definition_8;
        roops_goal_23 = variable_definition_12;
        return result;
    }

    public BinTreeNode remove(final BinTreeNode z) {
        variable_definition_13 = true;
        BinTreeNode y = null;
        variable_definition_14 = true;
        roops_goal_24 = variable_definition_13;
        roops_goal_25 = variable_definition_13;
        if (z.left == null || z.right == null) {
            {

            }
            y = z;
            roops_goal_26 = variable_definition_13;
            variable_definition_15 = true;
            variable_definition_14 = false;
        } else {
            {

            }
            y = treeSuccessor(z);
            roops_goal_27 = variable_definition_13;
            variable_definition_16 = true;
            variable_definition_14 = false;
            variable_definition_15 = false;
        }

        BinTreeNode x = null;
        variable_definition_17 = true;
        roops_goal_28 = variable_definition_14;
        roops_goal_29 = variable_definition_15;
        roops_goal_30 = variable_definition_16;
        if (y.left != null) {
            {

            }
            x = y.left;
            roops_goal_31 = variable_definition_14;
            roops_goal_32 = variable_definition_15;
            roops_goal_33 = variable_definition_16;
            variable_definition_18 = true;
            variable_definition_17 = false;
        } else {
            {

            }
            x = y.right;
            roops_goal_34 = variable_definition_14;
            roops_goal_35 = variable_definition_15;
            roops_goal_36 = variable_definition_16;
            variable_definition_19 = true;
            variable_definition_17 = false;
            variable_definition_18 = false;
        }
        roops_goal_37 = variable_definition_17;
        roops_goal_38 = variable_definition_18;
        roops_goal_39 = variable_definition_19;

        if (x != null) {
            {

            }
            x.parent = y.parent;
            roops_goal_40 = variable_definition_14;
            roops_goal_41 = variable_definition_15;
            roops_goal_42 = variable_definition_16;
            variable_definition_20 = true;
            variable_definition_17 = false;
            variable_definition_18 = false;
            variable_definition_19 = false;
        }
        roops_goal_43 = variable_definition_14;
        roops_goal_44 = variable_definition_15;
        roops_goal_45 = variable_definition_16;

        if (y.parent == null) {
            {

            }
            this.root = x;
            roops_goal_46 = variable_definition_17;
            roops_goal_47 = variable_definition_18;
            roops_goal_48 = variable_definition_19;
            roops_goal_49 = variable_definition_20;
            variable_definition_21 = true;
        } else {
            {

            }
            roops_goal_50 = variable_definition_14;
            roops_goal_51 = variable_definition_15;
            roops_goal_52 = variable_definition_16;
            roops_goal_53 = variable_definition_14;
            roops_goal_54 = variable_definition_15;
            roops_goal_55 = variable_definition_16;
            if (y == y.parent.left) {
                {

                }
                y.parent.left = x;
                roops_goal_56 = variable_definition_17;
                roops_goal_57 = variable_definition_18;
                roops_goal_58 = variable_definition_19;
                roops_goal_59 = variable_definition_20;
                variable_definition_22 = true;
                variable_definition_14 = false;
                variable_definition_15 = false;
                variable_definition_16 = false;
            } else {
                {

                }
                y.parent.right = x;
                roops_goal_60 = variable_definition_17;
                roops_goal_61 = variable_definition_18;
                roops_goal_62 = variable_definition_19;
                roops_goal_63 = variable_definition_20;
                variable_definition_23 = true;
                variable_definition_14 = false;
                variable_definition_15 = false;
                variable_definition_16 = false;
                variable_definition_22 = false;
            }
        }
        roops_goal_64 = variable_definition_14;
        roops_goal_65 = variable_definition_15;
        roops_goal_66 = variable_definition_16;
        roops_goal_67 = variable_definition_22;
        roops_goal_68 = variable_definition_23;
        roops_goal_69 = variable_definition_13;

        if (y != z) {
            {

            }
            z.key = y.key;
            roops_goal_70 = variable_definition_14;
            roops_goal_71 = variable_definition_15;
            roops_goal_72 = variable_definition_16;
            roops_goal_73 = variable_definition_22;
            roops_goal_74 = variable_definition_23;
            variable_definition_24 = true;
            variable_definition_13 = false;
        }

        {

        }
        roops_goal_75 = variable_definition_14;
        roops_goal_76 = variable_definition_15;
        roops_goal_77 = variable_definition_16;
        roops_goal_78 = variable_definition_22;
        roops_goal_79 = variable_definition_23;
        return y;
    }

    public BinTreeRemove() {
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

    public static boolean roops_goal_27;

    public static boolean roops_goal_28;

    public static boolean roops_goal_29;

    public static boolean roops_goal_30;

    public static boolean roops_goal_31;

    public static boolean roops_goal_32;

    public static boolean roops_goal_33;

    public static boolean roops_goal_34;

    public static boolean roops_goal_35;

    public static boolean roops_goal_36;

    public static boolean roops_goal_37;

    public static boolean roops_goal_38;

    public static boolean roops_goal_39;

    public static boolean roops_goal_40;

    public static boolean roops_goal_41;

    public static boolean roops_goal_42;

    public static boolean roops_goal_43;

    public static boolean roops_goal_44;

    public static boolean roops_goal_45;

    public static boolean roops_goal_46;

    public static boolean roops_goal_47;

    public static boolean roops_goal_48;

    public static boolean roops_goal_49;

    public static boolean roops_goal_50;

    public static boolean roops_goal_51;

    public static boolean roops_goal_52;

    public static boolean roops_goal_53;

    public static boolean roops_goal_54;

    public static boolean roops_goal_55;

    public static boolean roops_goal_56;

    public static boolean roops_goal_57;

    public static boolean roops_goal_58;

    public static boolean roops_goal_59;

    public static boolean roops_goal_60;

    public static boolean roops_goal_61;

    public static boolean roops_goal_62;

    public static boolean roops_goal_63;

    public static boolean roops_goal_64;

    public static boolean roops_goal_65;

    public static boolean roops_goal_66;

    public static boolean roops_goal_67;

    public static boolean roops_goal_68;

    public static boolean roops_goal_69;

    public static boolean roops_goal_70;

    public static boolean roops_goal_71;

    public static boolean roops_goal_72;

    public static boolean roops_goal_73;

    public static boolean roops_goal_74;

    public static boolean roops_goal_75;

    public static boolean roops_goal_76;

    public static boolean roops_goal_77;

    public static boolean roops_goal_78;

    public static boolean roops_goal_79;

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

    public static boolean variable_definition_14;

    public static boolean variable_definition_15;

    public static boolean variable_definition_16;

    public static boolean variable_definition_17;

    public static boolean variable_definition_18;

    public static boolean variable_definition_19;

    public static boolean variable_definition_20;

    public static boolean variable_definition_21;

    public static boolean variable_definition_22;

    public static boolean variable_definition_23;

    public static boolean variable_definition_24;

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
        roops_goal_27 = false;
        roops_goal_28 = false;
        roops_goal_29 = false;
        roops_goal_30 = false;
        roops_goal_31 = false;
        roops_goal_32 = false;
        roops_goal_33 = false;
        roops_goal_34 = false;
        roops_goal_35 = false;
        roops_goal_36 = false;
        roops_goal_37 = false;
        roops_goal_38 = false;
        roops_goal_39 = false;
        roops_goal_40 = false;
        roops_goal_41 = false;
        roops_goal_42 = false;
        roops_goal_43 = false;
        roops_goal_44 = false;
        roops_goal_45 = false;
        roops_goal_46 = false;
        roops_goal_47 = false;
        roops_goal_48 = false;
        roops_goal_49 = false;
        roops_goal_50 = false;
        roops_goal_51 = false;
        roops_goal_52 = false;
        roops_goal_53 = false;
        roops_goal_54 = false;
        roops_goal_55 = false;
        roops_goal_56 = false;
        roops_goal_57 = false;
        roops_goal_58 = false;
        roops_goal_59 = false;
        roops_goal_60 = false;
        roops_goal_61 = false;
        roops_goal_62 = false;
        roops_goal_63 = false;
        roops_goal_64 = false;
        roops_goal_65 = false;
        roops_goal_66 = false;
        roops_goal_67 = false;
        roops_goal_68 = false;
        roops_goal_69 = false;
        roops_goal_70 = false;
        roops_goal_71 = false;
        roops_goal_72 = false;
        roops_goal_73 = false;
        roops_goal_74 = false;
        roops_goal_75 = false;
        roops_goal_76 = false;
        roops_goal_77 = false;
        roops_goal_78 = false;
        roops_goal_79 = false;
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
        variable_definition_14 = false;
        variable_definition_15 = false;
        variable_definition_16 = false;
        variable_definition_17 = false;
        variable_definition_18 = false;
        variable_definition_19 = false;
        variable_definition_20 = false;
        variable_definition_21 = false;
        variable_definition_22 = false;
        variable_definition_23 = false;
        variable_definition_24 = false;
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
