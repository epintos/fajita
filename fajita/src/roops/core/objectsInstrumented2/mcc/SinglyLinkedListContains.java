package roops.core.objectsInstrumented2.mcc;

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
        roops_goal_0 = (list != null) == false;
        roops_goal_1 = list != null;
        if ( list != null && list.repOK () )
        {
            list.contains (value_param);
        }
    }
    static public void insertBackTest (SinglyLinkedListContains list, int arg) {
        if ( list != null && list.repOK () ) {
            list.insertBack (arg);
        }
    }
    static public void removeTest (SinglyLinkedListContains list, int index) {
        if ( list != null && list.repOK () ) {
            list.remove (index);
        }
    }

    public /*@ nullable @*/ SinglyLinkedListNode header;

    public boolean contains (int value_param) {
        SinglyLinkedListNode current;
        boolean result;
        current = this.header;
        result = false;
        roops_goal_6 = (result == false) == false;
        roops_goal_7 = result == false;
        roops_goal_8 = ( current != null) == false;
        roops_goal_9 = current != null;
        while (  result == false && current != null )
        {
            boolean equalVal;
            roops_goal_2 = (value_param == current.value) == false;
            roops_goal_3 = value_param == current.value;
            if ( value_param == current.value )
            {
                equalVal = true;
            } else
            {
                equalVal = false;
            }
            roops_goal_4 = (equalVal == true) == false;
            roops_goal_5 = equalVal == true;
            if ( equalVal == true )
            {
                result = true;
            }
            current = current.next;
        }
        return result;
    }

    public void remove (int index) {

        if ( index < 0 ) {
            throw new RuntimeException ();
        }

        SinglyLinkedListNode current;
        current = this.header;
        SinglyLinkedListNode previous;
        previous = null;
        int current_index;
        current_index = 0;

        boolean found = false;

        while ( found == false && current != null ) {

            if ( index == current_index ) {
                found = true;
            } else {
                current_index = current_index + 1;
                previous = current;
                current = current.next;
            }
        }

        if ( found == false ) {
            throw new RuntimeException ();
        }

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
            while ( current.next != null ) {
                current = current.next;
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedListContains () {}

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
    }
}
/* end roops.core.objects */
