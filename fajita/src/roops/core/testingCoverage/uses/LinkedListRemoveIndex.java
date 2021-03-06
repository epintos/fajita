package roops.core.testingCoverage.uses;

import roops.core.testingCoverage.base.LinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant ( this.header!=null ) && ( this.header.next!=null ) && (
 *            this.header.previous!=null ) && ( this.size==#(this.header.*next @-
 *            null)-1 ) && ( this.size>=0 ) && (all n: LinkedListNode | ( n in
 *            this.header.*next @- null ) => ( n!=null && n.previous!=null &&
 *            n.previous.next==n && n.next!=null && n.next.previous==n )) ;
 * 
 */
public class LinkedListRemoveIndex {
    static public void addLastTest(LinkedListRemoveIndex list, Object o) {
        if (list != null && list.repOK()) {
            list.addLast(o);
        }
    }

    static public void containsTest(LinkedListRemoveIndex list, Object arg) {
        if (list != null && list.repOK()) {
            list.contains(arg);
        }
    }

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void removeIndexTest(LinkedListRemoveIndex list, int index) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (list != null && list.repOK()) {
            list.removeIndex(index);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    public/* @ nullable @ */LinkedListNode header;

    public int size;

    public int modCount;

    // -----------------------------------------------------------------------
    public int indexOf(Object new_value) {
        int i = 0;
        LinkedListNode node = header.next;
        while (node != header) {
            {

            }
            boolean equal = isEqualValue(node.object_value, new_value);
            if (equal) {
                {

                }
                return i;
            }
            i++;
            node = node.next;
        }
        {

        }
        return (0 - 1);
    }

    public boolean contains(Object arg) {
        boolean exists = indexOf(arg) != (0 - 1);
        return exists;
    }

    public Object removeIndex(int index) {
        variable_definition_2 = true;
        LinkedListNode node = getNode(index, false);
        roops_goal_4 = variable_definition_2;
        variable_definition_3 = true;
        Object oldValue = node.object_value;
        roops_goal_5 = variable_definition_3;
        variable_definition_4 = true;
        removeNode(node);
        roops_goal_6 = variable_definition_3;

        {

        }
        roops_goal_7 = variable_definition_4;
        return oldValue;
    }

    public boolean addLast(Object o) {
        addNodeBefore(header, o);
        return true;
    }

    public boolean isEqualValue(Object value1, Object value2) {
        boolean ret_val;
        if (value1 == value2) {
            ret_val = true;
        } else {
            if (value1 == null) {
                ret_val = false;
            } else {
                ret_val = value1.equals(value2);
            }
        }
        return ret_val;
    }


    public LinkedListNode createNode(Object new_object_value) {
        {

        }
        LinkedListNode node = new LinkedListNode();
        node.previous = node;
        node.next = node;
        node.object_value = new_object_value;
        return node;
    }

    public void addNodeBefore(LinkedListNode node, Object new_object_value) {
        LinkedListNode newNode = createNode(new_object_value);
        {

        }

        addNode(newNode, node);
    }

    public void addNode(LinkedListNode nodeToInsert, LinkedListNode insertBeforeNode) {
        nodeToInsert.next = insertBeforeNode;
        nodeToInsert.previous = insertBeforeNode.previous;
        insertBeforeNode.previous.next = nodeToInsert;
        insertBeforeNode.previous = nodeToInsert;
        size++;
        modCount++;

        {

        }
    }

    public void removeNode(LinkedListNode node) {
        variable_definition_5 = true;
        node.previous.next = node.next;
        roops_goal_8 = variable_definition_5;
        variable_definition_6 = true;
        node.next.previous = node.previous;
        roops_goal_9 = variable_definition_6;
        variable_definition_7 = true;
        size--;
        modCount++;
        {

        }
    }

    public LinkedListNode getNode(int index, boolean endMarkerAllowed) {
        variable_definition_8 = true;
        variable_definition_9 = true;
        // Check the index is within the bounds
        if (index < 0) {
            {
            }
            throw new RuntimeException();
        }
        roops_goal_10 = variable_definition_8;
        if (!endMarkerAllowed && index == size) {
            {
            }
            throw new RuntimeException();
        }
        if (index > size) {
            {
            }
            throw new RuntimeException();
        }
        // Search the list and get the node
        LinkedListNode node;
        variable_definition_10 = true;
        int size_div_2 = size / 2;
        variable_definition_11 = true;

        if (index < size_div_2) {
            {
            }
            // Search forwards
            node = header.next;
            variable_definition_12 = true;
            variable_definition_10 = false;
            int currentIndex = 0;
            variable_definition_13 = true;
            while (currentIndex < index) {
                {
                }
                node = node.next;
                roops_goal_11 = variable_definition_10;
                roops_goal_12 = variable_definition_12;
                variable_definition_14 = true;
                variable_definition_10 = false;
                variable_definition_12 = false;
                currentIndex++;
                roops_goal_13 = variable_definition_13;
            }
        } else {

            {
            }

            // Search backwards
            node = header;
            variable_definition_15 = true;
            variable_definition_10 = false;
            variable_definition_12 = false;
            variable_definition_14 = false;
            int currentIndex = size;
            variable_definition_16 = true;
            variable_definition_13 = false;
            while (currentIndex > index) {
                {
                }
                node = node.previous;
                roops_goal_14 = variable_definition_10;
                roops_goal_15 = variable_definition_12;
                roops_goal_16 = variable_definition_14;
                roops_goal_17 = variable_definition_15;
                variable_definition_17 = true;
                variable_definition_10 = false;
                variable_definition_12 = false;
                variable_definition_14 = false;
                variable_definition_15 = false;
                currentIndex--;
                roops_goal_18 = variable_definition_13;
                roops_goal_19 = variable_definition_16;
            }
        }
        {
        }
        roops_goal_20 = variable_definition_10;
        roops_goal_21 = variable_definition_12;
        roops_goal_22 = variable_definition_14;
        roops_goal_23 = variable_definition_15;
        roops_goal_24 = variable_definition_17;
        return node;
    }

    public LinkedListRemoveIndex() {
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
    }
}
/* end roops.core.objects */
