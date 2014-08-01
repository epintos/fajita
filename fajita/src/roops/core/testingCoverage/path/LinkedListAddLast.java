package roops.core.testingCoverage.path;

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
public class LinkedListAddLast {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void addLastTest (LinkedListAddLast list, Object o) {
        fajita_roopsGoal_initialization ();
        if ( list != null && list.repOK () )
        {
            roops_goal_0 = true;
            list.addLast (o);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void containsTest (LinkedListAddLast list, Object arg) {
        if ( list != null && list.repOK () ) {
            list.contains (arg);
        }
        else
        {}
    }
    static public void removeIndexTest (LinkedListAddLast list, int index) {
        if ( list != null && list.repOK () ) {
            list.removeIndex (index);
        }
        else
        {}
    }

    public /* @ nullable @ */LinkedListNode header;

    public int size;

    public int modCount;

    // -----------------------------------------------------------------------
    public int indexOf (Object new_value) {
        int i = 0;
        LinkedListNode node = header.next;
        {
            boolean terminatesInTime = true;
            if ( node != header ) {
                {

    }
                boolean equal = isEqualValue (node.object_value, new_value);
                if ( equal ) {
                    {

    }
                    return i;
                }
                else
                {}
                i ++;
                node = node.next;
            }
            else
            {}
            if ( node != header ) {
                {

    }
                boolean equal = isEqualValue (node.object_value, new_value);
                if ( equal ) {
                    {

    }
                    return i;
                }
                else
                {}
                i ++;
                node = node.next;
            }
            else
            {}
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

    public LinkedListAddLast () {
    }

    // *************************************************************************
    // ************** From now on repOK() *************************************
    // *************************************************************************

    public boolean repOK () {
        return true;
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
    }
}
/* end roops.core.objects */
