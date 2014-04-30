package roops.core.objectsInstrumented;

import roops.core.objectsInstrumented.LinkedListNode;
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
public class LinkedList {

    /** @Modifies_Everything
	 * @Ensures false;
	 */ static
     public void addLastTest (LinkedList list, Object o) {
        fajita_roopsGoal_initialization ();
        int m = 1;
        roops_goal_0 = true;
        m += 2;
        roops_goal_1 = true;
        if ( list != null && list.repOK () )
        {
            int i = 2;
            roops_goal_2 = true;
            while ( i -- > 0 )
            {
                int pipe = i;
                roops_goal_4 = true;
                pipe = pipe + i;
                roops_goal_5 = true;
            }
            boolean ret_val = list.addLast (o);
            roops_goal_3 = true;
        }
    } static
     public void containsTest (LinkedList list, Object arg) {
        if ( list != null && list.repOK () )
        {
            boolean ret_val = list.contains (arg);
            roops_goal_6 = true;
        }
    } static
     public void removeIndexTest (LinkedList list, int index) {
        if ( list != null && list.repOK () )
        {
            Object ret_val = list.removeIndex (index);
            roops_goal_7 = true;
        }
    }


    public /*@ nullable @*/LinkedListNode header;

    public int size;

    public int modCount;

    public void init () {
        header = createHeaderNode ();
        roops_goal_8 = true;
    }


    //-----------------------------------------------------------------------
    public int indexOf (Object new_value) {
        int i = 0;
        roops_goal_9 = true;
        for ( LinkedListNode node = header.next; node != header; node = node.next )
        {
            {}
            if ( isEqualValue (node.object_value, new_value) )
            {
                {}
                return i;
            }
            i ++;
        }
        {}
        return (0 - 1);
    }


    public boolean contains (Object arg) {
        return indexOf (arg) != (0 - 1);
    }


    public Object removeIndex (int index) {
        LinkedListNode node = getNode (index, false);
        roops_goal_10 = true;
        Object oldValue = node.object_value;
        roops_goal_11 = true;
        removeNode (node);

        {}
        return oldValue;
    }


    public boolean addLast (Object o) {
        addNodeBefore (header, o);
        return true;
    }

    public boolean isEqualValue (Object value1, Object value2) {
        boolean ret_val;
        roops_goal_12 = true;
        if ( value1 == value2 )
        {
            ret_val = true;
            roops_goal_13 = true;
        } else
        {
            if ( value1 == null )
            {
                ret_val = false;
                roops_goal_14 = true;
            } else
            {
                ret_val = value1.equals (value2);
                roops_goal_15 = true;
            }
        }
        return ret_val;
    }

    public LinkedListNode createHeaderNode () {
        LinkedListNode linkedListNode = new LinkedListNode ();
        roops_goal_16 = true;
        linkedListNode.next = linkedListNode;
        roops_goal_17 = true;
        linkedListNode.previous = linkedListNode;
        roops_goal_18 = true;
        return linkedListNode;
    }

    public LinkedListNode createNode (Object new_object_value) {
        {}
        LinkedListNode node = new LinkedListNode ();
        roops_goal_19 = true;
        node.previous = node;
        roops_goal_20 = true;
        node.next = node;
        roops_goal_21 = true;
        node.object_value = new_object_value;
        roops_goal_22 = true;
        return node;
    }

    public void addNodeBefore (LinkedListNode node, Object new_object_value) {
        LinkedListNode newNode = createNode (new_object_value);
        roops_goal_23 = true;
        {}

        addNode (newNode, node);
    }

    public void addNode (LinkedListNode nodeToInsert,
            LinkedListNode insertBeforeNode) {
        nodeToInsert.next = insertBeforeNode;
        roops_goal_24 = true;
        nodeToInsert.previous = insertBeforeNode.previous;
        roops_goal_25 = true;
        insertBeforeNode.previous.next = nodeToInsert;
        roops_goal_26 = true;
        insertBeforeNode.previous = nodeToInsert;
        roops_goal_27 = true;
        size ++;
        modCount ++;

        {}
    }

    public void removeNode (LinkedListNode node) {
        node.previous.next = node.next;
        roops_goal_28 = true;
        node.next.previous = node.previous;
        roops_goal_29 = true;
        size --;
        modCount ++;
        {}
    }

    public LinkedListNode getNode (int index, boolean endMarkerAllowed) {
        // Check the index is within the bounds
        if ( index < 0 )
        {
            {}
            throw new RuntimeException ();
        }
        if ( ! endMarkerAllowed && index == size )
        {
            {}
            throw new RuntimeException ();
        }
        if ( index > size )
        {
            {}
            throw new RuntimeException ();
        }
        // Search the list and get the node
        LinkedListNode node;
        roops_goal_30 = true;
        int size_div_2 = size / 2;
        roops_goal_31 = true;

        if ( index < size_div_2 )
        {
            {}
            // Search forwards
            node
             = header.next;
            roops_goal_32 = true;
            for ( int currentIndex = 0; currentIndex < index; currentIndex ++ )
            {
                {}
                node = node.next;
                roops_goal_34 = true;
            }
        } else
        {

            {}

            // Search backwards
            node = header;
            roops_goal_33 = true;
            for ( int currentIndex = size; currentIndex > index; currentIndex -- )
            {
                {}
                node = node.previous;
                roops_goal_35 = true;
            }
        }
        {}
        return node;
    }

        public LinkedList () {
           init ();
    }

    //*************************************************************************
    //************** From now on repOK()  *************************************
    //*************************************************************************

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
    }
}
/* end roops.core.objects */
