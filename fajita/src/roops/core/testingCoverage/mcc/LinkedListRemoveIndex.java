package roops.core.testingCoverage.mcc;

import roops.core.testingCoverage.base.LinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant 
 *		( this.header!=null ) &&
 *		( this.header.next!=null ) &&
 *		( this.header.previous!=null ) &&
 *		( this.size==#(this.header.*next @- null)-1 ) &&
 *		( this.size>=0 ) &&
 *		(all n: LinkedListNode | ( n in this.header.*next @- null ) => (
 *				  n!=null &&
 *				  n.previous!=null &&
 *				  n.previous.next==n &&
 *				  n.next!=null &&
 *				  n.next.previous==n )) ; 
 *
 */
public class LinkedListRemoveIndex {
    static public void addLastTest (LinkedListRemoveIndex list, Object o) {
        if ( list != null && list.repOK () ) {
            list.addLast (o);
        }
    }
    static public void containsTest (LinkedListRemoveIndex list, Object arg) {
        if ( list != null && list.repOK () ) {
            list.contains (arg);
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void removeIndexTest (LinkedListRemoveIndex list, int index) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = (list != null) == false;
        roops_goal_1 = list != null;
        if ( list != null && list.repOK () )
        {
            list.removeIndex (index);
        }
    }

    public /* @ nullable @ */LinkedListNode header;

    public int size;

    public int modCount;

    // -----------------------------------------------------------------------
    public int indexOf (Object new_value) {
        int i = 0;
        LinkedListNode node = header.next;
        while ( node != header ) {
            {

    }
            boolean equal = isEqualValue (node.object_value, new_value);
            if ( equal ) {
                {

    }
                return i;
            }
            i ++;
            node = node.next;
        }
        {

    }
        return (0 - 1);
    }

    public boolean contains (Object arg) {
        return indexOf (arg) != (0 - 1);
    }

    public Object removeIndex (int index) {
        LinkedListNode node = getNode (index, false);
        Object oldValue = node.object_value;
        removeNode (node);

        {

    }
        return oldValue;
    }

    public boolean addLast (Object o) {
        addNodeBefore (header, o);
        return true;
    }

    public boolean isEqualValue (Object value1, Object value2) {
        boolean ret_val;
        if ( value1 == value2 ) {
            ret_val = true;
        } else {
            if ( value1 == null ) {
                ret_val = false;
            } else {
                ret_val = value1.equals (value2);
            }
        }
        return ret_val;
    }

    public LinkedListNode createNode (Object new_object_value) {
        {

    }
        LinkedListNode node = new LinkedListNode ();
        node.previous = node;
        node.next = node;
        node.object_value = new_object_value;
        return node;
    }

    public void addNodeBefore (LinkedListNode node, Object new_object_value) {
        LinkedListNode newNode = createNode (new_object_value);
        {

    }

        addNode (newNode, node);
    }

    public void addNode (LinkedListNode nodeToInsert,
            LinkedListNode insertBeforeNode) {
        nodeToInsert.next = insertBeforeNode;
        nodeToInsert.previous = insertBeforeNode.previous;
        insertBeforeNode.previous.next = nodeToInsert;
        insertBeforeNode.previous = nodeToInsert;
        size ++;
        modCount ++;

        {

    }
    }

    public void removeNode (LinkedListNode node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
        size --;
        modCount ++;
        {

    }
    }

    public LinkedListNode getNode (int index, boolean endMarkerAllowed) {
        roops_goal_2 = (index < 0) == false;
        roops_goal_3 = index < 0;
        // Check the index is within the bounds
        if ( index < 0 )
        {
            {}
            throw new RuntimeException ();
        }
        roops_goal_4 = (endMarkerAllowed == false) == false;
        roops_goal_5 = endMarkerAllowed == false;
        roops_goal_6 = ( index == size) == false;
        roops_goal_7 = index == size;
        if ( endMarkerAllowed == false && index == size )
        {
            {}
            throw new RuntimeException ();
        }
        roops_goal_8 = (index > size) == false;
        roops_goal_9 = index > size;
        if ( index > size )
        {
            {}
            throw new RuntimeException ();
        }
        // Search the list and get the node
        LinkedListNode node;
        int size_div_2 = size / 2;
        roops_goal_14 = (index < size_div_2) == false;
        roops_goal_15 = index < size_div_2;

        if ( index < size_div_2 )
        {
            {}
            // Search forwards
            node
             = header.next;
            int currentIndex = 0;
            roops_goal_10 = (currentIndex < index) == false;
            roops_goal_11 = currentIndex < index;
            while (  currentIndex < index )
            {
                {}
                node = node.next;
                currentIndex ++;
            }
        } else
        {

            {}

            // Search backwards
            node = header;
            int currentIndex = size;
            roops_goal_12 = (currentIndex > index) == false;
            roops_goal_13 = currentIndex > index;
            while (  currentIndex > index )
            {
                {}
                node = node.previous;
                currentIndex --;
            }
        }
        {}
        return node;
    }

    public LinkedListRemoveIndex () {
    }

    // *************************************************************************
    // ************** From now on repOK() *************************************
    // *************************************************************************

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

    public static boolean roops_goal_12;

    public static boolean roops_goal_13;

    public static boolean roops_goal_14;

    public static boolean roops_goal_15;

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
        roops_goal_12 = false;
        roops_goal_13 = false;
        roops_goal_14 = false;
        roops_goal_15 = false;
    }
}
/* end roops.core.objects */
