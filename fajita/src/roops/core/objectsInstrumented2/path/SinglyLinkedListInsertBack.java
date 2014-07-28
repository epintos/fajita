package roops.core.objectsInstrumented2.path;

import roops.core.objectsInstrumented2.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListInsertBack {
    static public void containsTest (SinglyLinkedListInsertBack list, int value_param) {
        boolean ret_val;
        if ( list != null && list.repOK () ) {
            ret_val = list.contains (value_param);
        }
        else
        {}
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void insertBackTest (SinglyLinkedListInsertBack list, int arg) {
        fajita_roopsGoal_initialization ();
        if ( list != null && list.repOK () )
        {
            roops_goal_0 = true;
            list.insertBack (arg);
        }
        else
        {
            roops_goal_1 = true;
        }
    }
    static public void removeTest (SinglyLinkedListInsertBack list, int index) {
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

        if ( this.header == null )
        {
            roops_goal_2 = true;
            this.header = freshNode;
        } else
        {
            roops_goal_3 = true;
            SinglyLinkedListNode current;
            current = this.header;
            {
                boolean terminatesInTime = true;
                if ( current.next != null )
                {
                    roops_goal_4 = true;
                    current = current.next;
                }
                else
                {
                    roops_goal_5 = true;
                }
                if ( current.next != null )
                {
                    roops_goal_6 = true;
                    current = current.next;
                }
                else
                {
                    roops_goal_7 = true;
                }
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedListInsertBack () {
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

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
        roops_goal_4 = false;
        roops_goal_5 = false;
        roops_goal_6 = false;
        roops_goal_7 = false;
    }
}
/* end roops.core.objects */
