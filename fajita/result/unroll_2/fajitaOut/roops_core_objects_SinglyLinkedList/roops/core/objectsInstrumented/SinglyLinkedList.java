package roops.core.objectsInstrumented;

//Authors: Marcelo Frias
import roops.utilInstrumented.RoopsArray;
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedList {

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void containsTest (SinglyLinkedList list, Object value_param) {
        fajita_roopsGoal_initialization ();
        variable_definition_0 = true;
        variable_definition_1 = true;
        boolean ret_val;
        variable_definition_2 = true;
        if ( list != null && list.repOK () )
        {
            ret_val = list.contains (value_param);
            roops_goal_2 =
             variable_definition_1;
            roops_goal_3 =
             variable_definition_0;
            variable_definition_3 = true;
            variable_definition_2 = false;
        }
    }
    static public void insertBackTest (SinglyLinkedList list, Object arg) {
        if ( list != null && list.repOK () ) {
            list.insertBack (arg);
        }
    }
    static public void removeTest (SinglyLinkedList list, int index) {
        if ( list != null && list.repOK () ) {
            list.remove (index);
        }
    }

    public /* @ nullable @ */SinglyLinkedListNode header;

    public boolean contains (Object value_param) {
        variable_definition_4 = true;
        SinglyLinkedListNode current;
        variable_definition_5 = true;
        boolean result;
        variable_definition_6 = true;

        current = this.header;
        variable_definition_7 = true;
        result = false;
        variable_definition_8 = true;
        roops_goal_4 =
         variable_definition_8;
        roops_goal_5 =
         variable_definition_7;
        while ( result == false && current != null )
        {

            boolean equalVal;
            variable_definition_9 = true;
            roops_goal_6 =
             variable_definition_4;
            roops_goal_7 =
             variable_definition_7;

            if ( value_param == null && current.value == null )
            {
                equalVal = true;
                variable_definition_10 = true;
                variable_definition_9 = false;
            } else if ( value_param != null )
                {
                    roops_goal_8 =
                     variable_definition_4;
                    roops_goal_9 =
                     variable_definition_7;

                    if ( value_param == current.value )
                    {
                        equalVal = true;
                        variable_definition_11 = true;
                        variable_definition_9 = false;
                        variable_definition_10 = false;
                    } else
                    {
                        equalVal = false;
                        variable_definition_12 = true;
                        variable_definition_9 = false;
                        variable_definition_10 = false;
                        variable_definition_11 = false;
                    }
                } else
                {
                    equalVal = false;
                    variable_definition_13 = true;
                        variable_definition_9 = false;
                        variable_definition_10 = false;
                        variable_definition_11 = false;
                        variable_definition_12 = false;
                }
            roops_goal_10 =
                        variable_definition_9;
            roops_goal_11 =
                        variable_definition_10;
            roops_goal_12 =
                        variable_definition_11;
            roops_goal_13 =
                        variable_definition_12;
            roops_goal_14 =
                    variable_definition_13;

            if ( equalVal == true )
            {
                result = true;
                variable_definition_14 = true;
                variable_definition_8 = false;
            }
            current = current.next;
            roops_goal_15 =
                     variable_definition_7;
            variable_definition_15 = true;
                     variable_definition_7 = false;
        }
        roops_goal_16 =
                variable_definition_8;
        roops_goal_17 =
                variable_definition_14;
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

    public void insertBack (Object arg) {
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

    public SinglyLinkedList () {}

    // *************************************************************************
    // ************** From now on repOK() *************************************
    // *************************************************************************

    public boolean repOK () {
        return true;
    }

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

    public static RoopsArray myRoopsArray;

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

    public static void fajita_roopsGoal_initialization () {
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
        myRoopsArray = null;
    }
}
/* end roops.core.objects */
