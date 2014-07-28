package roops.core.objectsInstrumented2.path;

import roops.core.objectsInstrumented2.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListContains {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void containsTest (SinglyLinkedListContains list, int value_param) {
        fajita_roopsGoal_initialization ();
        boolean ret_val;
        if ( list != null && list.repOK () )
        {
            roops_goal_0 = true;
            ret_val = list.contains (value_param);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void insertBackTest (SinglyLinkedListContains list, int arg) {
        if ( list != null && list.repOK () ) {
            list.insertBack (arg);
        }
        else
        {}
    }
    static public void removeTest (SinglyLinkedListContains list, int index) {
        if ( list != null && list.repOK () ) {
            list.remove (index);
        }
        else
        {}
    }

    public /*@ nullable @*/ SinglyLinkedListNode header;

    public boolean contains (int value_param) {
        SinglyLinkedListNode current;
        boolean result;
        current = this.header;
        result = false;
        {
            boolean terminatesInTime = true;
            if ( result == false && current != null )
            {
                roops_goal_2 = true;
                boolean equalVal;
                if ( value_param == current.value )
                {
                    roops_goal_4 = true;
                    equalVal = true;
                } else
                {
                    roops_goal_5 = true;
                    equalVal = false;
                }
                if ( equalVal == true )
                {
                    roops_goal_6 = true;
                    result = true;
                }
                else
                {
                    roops_goal_7 = true;
                }
                current = current.next;
            }
            else
            {
                roops_goal_3 = true;
            }
            if ( result == false && current != null )
            {
                roops_goal_8 = true;
                boolean equalVal;
                if ( value_param == current.value )
                {
                    roops_goal_10 = true;
                    equalVal = true;
                } else
                {
                    roops_goal_11 = true;
                    equalVal = false;
                }
                if ( equalVal == true )
                {
                    roops_goal_12 = true;
                    result = true;
                }
                else
                {
                    roops_goal_13 = true;
                }
                current = current.next;
            }
            else
            {
                roops_goal_9 = true;
            }
            if ( result == false && current != null )
            {
                roops_goal_14 = true;
                boolean equalVal;
                if ( value_param == current.value )
                {
                    roops_goal_16 = true;
                    equalVal = true;
                } else
                {
                    roops_goal_17 = true;
                    equalVal = false;
                }
                if ( equalVal == true )
                {
                    roops_goal_18 = true;
                    result = true;
                }
                else
                {
                    roops_goal_19 = true;
                }
                current = current.next;
            }
            else
            {
                roops_goal_15 = true;
            }
        }
        return result;
    }

    public void remove (int index) {

        if ( index < 0 ) {
            throw new RuntimeException ();
        }
        else
        {}

        SinglyLinkedListNode current;
        current = this.header;
        SinglyLinkedListNode previous;
        previous = null;
        int current_index;
        current_index = 0;

        boolean found = false;
        {
            boolean terminatesInTime = true;
            if ( found == false && current != null ) {

                if ( index == current_index ) {
                    found = true;
                } else {
                    current_index = current_index + 1;
                    previous = current;
                    current = current.next;
                }
            }
            else
            {}
            if ( found == false && current != null ) {

                if ( index == current_index ) {
                    found = true;
                } else {
                    current_index = current_index + 1;
                    previous = current;
                    current = current.next;
                }
            }
            else
            {}
            if ( found == false && current != null ) {

                if ( index == current_index ) {
                    found = true;
                } else {
                    current_index = current_index + 1;
                    previous = current;
                    current = current.next;
                }
            }
            else
            {}
        }

        if ( found == false ) {
            throw new RuntimeException ();
        }
        else
        {}

        if ( previous == null ) {
            this.header = current.next;
        } else {
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
                if ( current.next != null ) {
                    current = current.next;
                }
                else
                {}
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedListContains () {
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

    public static boolean roops_goal_16;

    public static boolean roops_goal_17;

    public static boolean roops_goal_18;

    public static boolean roops_goal_19;

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
    }
}
/* end roops.core.objects */
