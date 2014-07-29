package roops.core.objectsInstrumented2.uses;

import roops.core.objectsInstrumented2.base.LinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant ( this.header!=null ) && ( this.header.next!=null ) && (
 *            this.header.previous!=null ) && ( this.size==#(this.header.*next @-
 *            null)-1 ) && ( this.size>=0 ) && (all n: LinkedListNode | ( n in
 *            this.header.*next @- null ) => ( n!=null && n.previous!=null &&
 *            n.previous.next==n && n.next!=null && n.next.previous==n )) ;
 * 
 */
public class LinkedListAddLast {

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void addLastTest(LinkedListAddLast list, Object o) {
        fajita_roopsGoal_initialization();
        variable_definition_0 = true;
        variable_definition_1 = true;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_0;
        if (list != null && list.repOK()) {
            list.addLast(o);
            roops_goal_2 = variable_definition_1;
            roops_goal_3 = variable_definition_0;
        }
    }

    static public void containsTest(LinkedListAddLast list, Object arg) {
        if (list != null && list.repOK()) {
            list.contains(arg);
        }
    }

    static public void removeIndexTest(LinkedListAddLast list, int index) {
        if (list != null && list.repOK()) {
            list.removeIndex(index);
        }
    }

    public/* @ nullable @ */LinkedListNode header;

    public int size;

    public int modCount;

    public void init() {
        header = createHeaderNode();
    }

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
        LinkedListNode node = getNode(index, false);
        Object oldValue = node.object_value;
        removeNode(node);

        {

        }
        return oldValue;
    }

    public boolean addLast(Object o) {
        variable_definition_2 = true;
        addNodeBefore(header, o);
        roops_goal_4 = variable_definition_2;
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

    public LinkedListNode createHeaderNode() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.next = linkedListNode;
        linkedListNode.previous = linkedListNode;
        return linkedListNode;
    }

    public LinkedListNode createNode(Object new_object_value) {
        variable_definition_3 = true;
        {

        }
        LinkedListNode node = new LinkedListNode();
        variable_definition_4 = true;
        node.previous = node;
        roops_goal_5 = variable_definition_4;
        variable_definition_5 = true;
        node.next = node;
        roops_goal_6 = variable_definition_5;
        variable_definition_6 = true;
        node.object_value = new_object_value;
        roops_goal_7 = variable_definition_3;
        variable_definition_7 = true;
        roops_goal_8 = variable_definition_7;
        return node;
    }

    public void addNodeBefore(LinkedListNode node, Object new_object_value) {
        variable_definition_8 = true;
        variable_definition_9 = true;
        LinkedListNode newNode = createNode(new_object_value);
        roops_goal_9 = variable_definition_9;
        variable_definition_10 = true;
        {

        }

        addNode(newNode, node);
        roops_goal_10 = variable_definition_8;
        roops_goal_11 = variable_definition_10;
    }

    public void addNode(LinkedListNode nodeToInsert, LinkedListNode insertBeforeNode) {
        variable_definition_11 = true;
        variable_definition_12 = true;
        nodeToInsert.next = insertBeforeNode;
        roops_goal_12 = variable_definition_12;
        variable_definition_13 = true;
        nodeToInsert.previous = insertBeforeNode.previous;
        roops_goal_13 = variable_definition_12;
        variable_definition_14 = true;
        insertBeforeNode.previous.next = nodeToInsert;
        roops_goal_14 = variable_definition_14;
        variable_definition_15 = true;
        insertBeforeNode.previous = nodeToInsert;
        roops_goal_15 = variable_definition_14;
        variable_definition_16 = true;
        size++;
        modCount++;

        {

        }
    }

    public void removeNode(LinkedListNode node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
        size--;
        modCount++;
        {

        }
    }

    public LinkedListNode getNode(int index, boolean endMarkerAllowed) {
        // Check the index is within the bounds
        if (index < 0) {
            {
            }
            throw new RuntimeException();
        }
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
        int size_div_2 = size / 2;

        if (index < size_div_2) {
            {
            }
            // Search forwards
            node = header.next;
            int currentIndex = 0;
            while (currentIndex < index) {
                {
                }
                node = node.next;
                currentIndex++;
            }
        } else {

            {
            }

            // Search backwards
            node = header;
            int currentIndex = size;
            while (currentIndex > index) {
                {
                }
                node = node.previous;
                currentIndex--;
            }
        }
        {
        }
        return node;
    }

    public LinkedListAddLast() {
        init();
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
    }
}
/* end roops.core.objects */
