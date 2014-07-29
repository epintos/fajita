package roops.core.objectsInstrumented2.uses;

import roops.core.objectsInstrumented2.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null )
 *            => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListRemove {
    static public void containsTest(SinglyLinkedListRemove list, int value_param) {
        if (list != null && list.repOK()) {
            list.contains(value_param);
        }
    }

    static public void insertBackTest(SinglyLinkedListRemove list, int arg) {
        if (list != null && list.repOK()) {
            list.insertBack(arg);
        }
    }

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void removeTest(SinglyLinkedListRemove list, int index) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (list != null && list.repOK()) {
            list.remove(index);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    public/* @ nullable @ */SinglyLinkedListNode header;

    public boolean contains(int value_param) {
        SinglyLinkedListNode current;
        boolean result;
        current = this.header;
        result = false;
        while (result == false && current != null) {
            boolean equalVal;
            if (value_param == current.value) {
                equalVal = true;
            } else {
                equalVal = false;
            }
            if (equalVal == true) {
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    public void remove(int index) {
        variable_definition_2 = true;

        if (index < 0) {
            throw new RuntimeException();
        }

        SinglyLinkedListNode current;
        variable_definition_3 = true;
        current = this.header;
        variable_definition_4 = true;
        SinglyLinkedListNode previous;
        variable_definition_5 = true;
        previous = null;
        variable_definition_6 = true;
        int current_index;
        variable_definition_7 = true;
        current_index = 0;
        variable_definition_8 = true;

        boolean found = false;
        variable_definition_9 = true;
        roops_goal_4 = variable_definition_9;
        roops_goal_5 = variable_definition_4;

        while (found == false && current != null) {
            roops_goal_6 = variable_definition_2;
            roops_goal_7 = variable_definition_8;

            if (index == current_index) {
                found = true;
                variable_definition_10 = true;
                variable_definition_9 = false;
            } else {
                current_index = current_index + 1;
                roops_goal_8 = variable_definition_8;
                variable_definition_11 = true;
                variable_definition_8 = false;
                previous = current;
                roops_goal_9 = variable_definition_4;
                variable_definition_12 = true;
                variable_definition_6 = false;
                current = current.next;
                roops_goal_10 = variable_definition_4;
                variable_definition_13 = true;
                variable_definition_4 = false;
            }
        }
        roops_goal_11 = variable_definition_9;
        roops_goal_12 = variable_definition_10;

        if (found == false) {
            throw new RuntimeException();
        }
        roops_goal_13 = variable_definition_6;
        roops_goal_14 = variable_definition_12;

        if (previous == null) {
            this.header = current.next;
            roops_goal_15 = variable_definition_4;
            roops_goal_16 = variable_definition_13;
            variable_definition_14 = true;
        } else {
            previous.next = current.next;
            roops_goal_17 = variable_definition_4;
            roops_goal_18 = variable_definition_13;
            variable_definition_15 = true;
            variable_definition_6 = false;
            variable_definition_12 = false;
        }
    }

    public void insertBack(int arg) {
        SinglyLinkedListNode freshNode = new SinglyLinkedListNode();
        freshNode.value = arg;
        freshNode.next = null;

        if (this.header == null) {
            this.header = freshNode;
        } else {
            SinglyLinkedListNode current;
            current = this.header;
            while (current.next != null) {
                current = current.next;
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedListRemove() {
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
    }
}
/* end roops.core.objects */
