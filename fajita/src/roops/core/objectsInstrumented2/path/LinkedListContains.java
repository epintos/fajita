package roops.core.objectsInstrumented2.path;

import roops.core.objectsInstrumented2.base.LinkedListNode;

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
public class LinkedListContains {
    static public void addLastTest (LinkedListContains list, Object o) {
        if ( list != null && list.repOK () ) {
            list.addLast (o);
        }
        else
        {}
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void containsTest (LinkedListContains list, Object arg) {
        fajita_roopsGoal_initialization ();
        if ( list != null && list.repOK () )
        {
            roops_goal_0 = true;
            list.contains (arg);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void removeIndexTest (LinkedListContains list, int index) {
        if ( list != null && list.repOK () ) {
            list.removeIndex (index);
        }
        else
        {}
    }

    public /* @ nullable @ */LinkedListNode header;

    public int size;

    public int modCount;

    public void init () {
        header = createHeaderNode ();
    }

    // -----------------------------------------------------------------------
    public int indexOf (Object new_value) {
        int i = 0;
        LinkedListNode node = header.next;
        {
            boolean terminatesInTime = true;
            if ( node != header )
            {
                roops_goal_2 = true;
                {

    }
                boolean equal = isEqualValue (node.object_value, new_value);
                if ( equal )
                {
                    roops_goal_4 = true;
                    {

    }
                    return i;
                }
                else
                {
                    roops_goal_5 = true;
                }
                i ++;
                node = node.next;
            }
            else
            {
                roops_goal_3 = true;
            }
            if ( node != header )
            {
                roops_goal_6 = true;
                {

    }
                boolean equal = isEqualValue (node.object_value, new_value);
                if ( equal )
                {
                    roops_goal_8 = true;
                    {

    }
                    return i;
                }
                else
                {
                    roops_goal_9 = true;
                }
                i ++;
                node = node.next;
            }
            else
            {
                roops_goal_7 = true;
            }
        }
        {

    }
        return (0 - 1);
    }

    public boolean contains (Object arg) {
        boolean exists = indexOf (arg) != (0 - 1);
        return exists;
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
        if ( value1 == value2 )
        {
            roops_goal_10 = true;
            ret_val = true;
        } else
        {
            roops_goal_11 = true;
            if ( value1 == null )
            {
                roops_goal_12 = true;
                ret_val = false;
            } else
            {
                roops_goal_13 = true;
                ret_val = value1.equals (value2);
            }
        }
        return ret_val;
    }

    public LinkedListNode createHeaderNode () {
        LinkedListNode linkedListNode = new LinkedListNode ();
        linkedListNode.next = linkedListNode;
        linkedListNode.previous = linkedListNode;
        return linkedListNode;
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

    public LinkedListNode getNode (int index, boolean endMarkerAllowed)
             {
        // Check the index is within the bounds
        if ( index < 0 ) {
            {}
            throw new RuntimeException ();
        }
        else
        {}
        if ( ! endMarkerAllowed && index == size ) {
            {}
            throw new RuntimeException ();
        }
        else
        {}
        if ( index > size ) {
            {}
            throw new RuntimeException ();
        }
        // Search the list and get the node
        else
        {}
        LinkedListNode node;
        int size_div_2 = size / 2;

        if ( index < size_div_2 ) {
            {}
            // Search forwards
            node
             = header.next;
            int currentIndex = 0;
            {
                boolean terminatesInTime = true;
                if ( currentIndex < index )
                {
                    {}
                    node = node.next;
                    currentIndex ++;
                }
                else
                {}
                if ( currentIndex < index )
                {
                    {}
                    node = node.next;
                    currentIndex ++;
                }
                else
                {}
            }
        } else {

            {}

            // Search backwards
            node = header;
            int currentIndex = size;
            {
                if ( currentIndex > index )
                {
                    {}
                    node = node.previous;
                    currentIndex --;
                }
                else
                {}
                if ( currentIndex > index )
                {
                    {}
                    node = node.previous;
                    currentIndex --;
                }
                else
                {}
            }
        }
        {}
        return node;
    }

    public LinkedListContains () {
        init ();
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
    }
}
/* end roops.core.objects */
