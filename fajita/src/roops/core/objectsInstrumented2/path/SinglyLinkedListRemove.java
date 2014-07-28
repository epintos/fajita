package roops.core.objectsInstrumented2.path;

import roops.core.objectsInstrumented2.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListRemove {
    static public void containsTest (SinglyLinkedListRemove list, int value_param) {
        if ( list != null && list.repOK () ) {
            list.contains (value_param);
        }
        else
        {}
    }
    static public void insertBackTest (SinglyLinkedListRemove list, int arg) {
        if ( list != null && list.repOK () ) {
            list.insertBack (arg);
        }
        else
        {}
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void removeTest (SinglyLinkedListRemove list, int index) {
        fajita_roopsGoal_initialization ();
        if ( list != null && list.repOK () )
        {
            roops_goal_0 = true;
            list.remove (index);
        }
        else
        {
            roops_goal_1 = true;
        }
    }

    public /*@ nullable @*/ SinglyLinkedListNode header;

    public boolean contains (int value_param) {
        SinglyLinkedListNode current;
        boolean result;
        current = this.header;
        result = false;
        {
            boolean terminatesInTime = true;
            if ( result == false && current != null ) {
                boolean equalVal;
                if ( value_param == current.value ) {
                    equalVal = true;
                } else {
                    equalVal = false;
                }
                if ( equalVal == true ) {
                    result = true;
                }
                else
                {}
                current = current.next;
            }
            else
            {}
            if ( result == false && current != null ) {
                boolean equalVal;
                if ( value_param == current.value ) {
                    equalVal = true;
                } else {
                    equalVal = false;
                }
                if ( equalVal == true ) {
                    result = true;
                }
                else
                {}
                current = current.next;
            }
            else
            {}
        }
        return result;
    }

    public void remove (int index) {

        if ( index < 0 )
        {
            roops_goal_2 = true;
            throw new RuntimeException ();
        }
        else
        {
            roops_goal_3 = true;
        }

        SinglyLinkedListNode current;
        current = this.header;
        SinglyLinkedListNode previous;
        previous = null;
        int current_index;
        current_index = 0;

        boolean found = false;
        {
            boolean terminatesInTime = true;
            if ( found == false && current != null )
            {
                roops_goal_4 = true;

                if ( index == current_index )
                {
                    roops_goal_6 = true;
                    found = true;
                } else
                {
                    roops_goal_7 = true;
                    current_index = current_index + 1;
                    previous = current;
                    current = current.next;
                }
            }
            else
            {
                roops_goal_5 = true;
            }
            if ( found == false && current != null )
            {
                roops_goal_8 = true;

                if ( index == current_index )
                {
                    roops_goal_10 = true;
                    found = true;
                } else
                {
                    roops_goal_11 = true;
                    current_index = current_index + 1;
                    previous = current;
                    current = current.next;
                }
            }
            else
            {
                roops_goal_9 = true;
            }
        }

        if ( found == false )
        {
            roops_goal_12 = true;
            throw new RuntimeException ();
        }
        else
        {
            roops_goal_13 = true;
        }

        if ( previous == null )
        {
            roops_goal_14 = true;
            this.header = current.next;
        } else
        {
            roops_goal_15 = true;
            previous.next = current.next;
        }
    }

    public void insertBack (int arg) {
        SinglyLinkedListNode freshNode = new SinglyLinkedListNode ();
        freshNode.value = arg;
        freshNode.next = null;

        if ( this.header == null ) {
            this.header = freshNode;
        } else {
            SinglyLinkedListNode current;
            current = this.header;
            {
                boolean terminatesInTime = true;
                if ( current.next != null ) {
                    current = current.next;
                }
                else
                {}
                if ( current.next != null ) {
                    current = current.next;
                }
                else
                {}
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedListRemove () {
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
