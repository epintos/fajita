package roops.core.objectsInstrumented;

import roops.core.objectsInstrumented.LinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant ( this.header!=null ) && ( this.header.next!=null ) && (
 *            this.header.previous!=null ) && ( this.size==#(this.header.*next @-
 *            null)-1 ) && ( this.size>=0 ) && (all n: LinkedListNode | ( n in
 *            this.header.*next @- null ) => ( n!=null && n.previous!=null &&
 *            n.previous.next==n && n.next!=null && n.next.previous==n )) ;
 * 
 */
public class LinkedList {

    /**
     * @Modifies_Everything
     * @Ensures false;
     */
    static public void addLastTest(LinkedList list, Object o) {
        fajita_roopsGoal_initialization();
        int a = 1;
        variable_definition_0 = true;
        int m = 0;
        variable_definition_1 = true;
        if (o != null) {
            a = 7;
            variable_definition_2 = true;
            variable_definition_0 = false;
        } else {
            a = 4;
            variable_definition_3 = true;
            variable_definition_0 = false;
            variable_definition_2 = false;
        }
        m += a;
        roops_goal_0 = variable_definition_0;
        roops_goal_1 = variable_definition_2;
        roops_goal_2 = variable_definition_3;
        variable_definition_4 = true;
    }

    static public void containsTest(LinkedList list, Object arg) {
        if (list != null && list.repOK()) {
            boolean ret_val = list.contains(arg);
        }
    }

    static public void removeIndexTest(LinkedList list, int index) {
        if (list != null && list.repOK()) {
            Object ret_val = list.removeIndex(index);
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
        for (LinkedListNode node = header.next; node != header; node = node.next) {
            {
            }
            if (isEqualValue(node.object_value, new_value)) {
                {
                }
                return i;
            }
            i++;
        }
        {
        }
        return (0 - 1);
    }

    public boolean contains(Object arg) {
        return indexOf(arg) != (0 - 1);
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

    public LinkedListNode createHeaderNode() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.next = linkedListNode;
        linkedListNode.previous = linkedListNode;
        return linkedListNode;
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
            for (int currentIndex = 0; currentIndex < index; currentIndex++) {
                {
                }
                node = node.next;
            }
        } else {

            {
            }

            // Search backwards
            node = header;
            for (int currentIndex = size; currentIndex > index; currentIndex--) {
                {
                }
                node = node.previous;
            }
        }
        {
        }
        return node;
    }

    public LinkedList() {
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

    public static boolean variable_definition_0;

    public static boolean variable_definition_1;

    public static boolean variable_definition_2;

    public static boolean variable_definition_3;

    public static boolean variable_definition_4;

    public static void fajita_roopsGoal_initialization() {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        variable_definition_0 = false;
        variable_definition_1 = false;
        variable_definition_2 = false;
        variable_definition_3 = false;
        variable_definition_4 = false;
    }
}
/* end roops.core.objects */
