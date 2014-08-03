package roops.core.testingCoverage.uses;

import roops.core.testingCoverage.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null )
 *            => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListInsertBack {
    static public void containsTest(SinglyLinkedListInsertBack list, int value_param) {
        if (list != null && list.repOK()) {
            list.contains(value_param);
        }
    }

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void insertBackTest(SinglyLinkedListInsertBack list, int arg) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (list != null && list.repOK()) {
            list.insertBack(arg);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    static public void removeTest(SinglyLinkedListInsertBack list, int index) {
        if (list != null && list.repOK()) {
            list.remove(index);
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

        if (index < 0) {
            throw new RuntimeException();
        }

        SinglyLinkedListNode current;
        current = this.header;
        SinglyLinkedListNode previous;
        previous = null;
        int current_index;
        current_index = 0;

        boolean found = false;

        while (found == false && current != null) {

            if (index == current_index) {
                found = true;
            } else {
                current_index = current_index + 1;
                previous = current;
                current = current.next;
            }
        }

        if (found == false) {
            throw new RuntimeException();
        }

        if (previous == null) {
            this.header = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public void insertBack(int arg) {
        variable_definition_2 = true;
        SinglyLinkedListNode freshNode = new SinglyLinkedListNode();
        variable_definition_3 = true;
        freshNode.value = arg;
        roops_goal_4 = variable_definition_2;
        variable_definition_4 = true;
        freshNode.next = null;
        variable_definition_5 = true;

        if (this.header == null) {
            this.header = freshNode;
            roops_goal_5 = variable_definition_5;
            variable_definition_6 = true;
        } else {
            SinglyLinkedListNode current;
            variable_definition_7 = true;
            current = this.header;
            roops_goal_6 = variable_definition_6;
            variable_definition_8 = true;
            variable_definition_7 = false;
            roops_goal_7 = variable_definition_7;
            roops_goal_8 = variable_definition_8;
            while (current.next != null) {
                current = current.next;
                roops_goal_9 = variable_definition_7;
                roops_goal_10 = variable_definition_8;
                variable_definition_9 = true;
                variable_definition_7 = false;
                variable_definition_8 = false;
            }
            current.next = freshNode;
            roops_goal_11 = variable_definition_5;
            variable_definition_10 = true;
            variable_definition_7 = false;
            variable_definition_8 = false;
            variable_definition_9 = false;
        }
    }

    public SinglyLinkedListInsertBack() {
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

    public static boolean roops_goal_10;

    public static boolean roops_goal_11;

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
    }
}
/* end roops.core.objects */
