package roops.core.objectsInstrumented2.mcc;

import roops.core.objectsInstrumented2.base.SinglyLinkedListNode;

//Authors: Marcelo Frias
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedListInsertBack {
    static public void containsTest (SinglyLinkedListInsertBack list, int value_param) {
        if ( list != null && list.repOK () ) {
            list.contains (value_param);
        }
    }

    /** @Modifies_Everything
	 * @Ensures false;
	 */
    static public void insertBackTest (SinglyLinkedListInsertBack list, int arg) {
        fajita_roopsGoal_initialization ();
        roops_goal_0 = (list != null) == false;
        roops_goal_1 = list != null;
        if ( list != null && list.repOK () )
        {
            list.insertBack (arg);
        }
        System.out.println("Finished");
    }
    static public void removeTest (SinglyLinkedListInsertBack list, int index) {
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
        while ( result == false && current != null ) {
            boolean equalVal;
            if ( value_param == current.value ) {
                equalVal = true;
            } else {
                equalVal = false;
            }
            if ( equalVal == true ) {
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
        roops_goal_4 = (this.header == null) == false;
        roops_goal_5 = this.header == null;

        if ( this.header == null )
        {
            this.header = freshNode;
        } else
        {
            SinglyLinkedListNode current;
            current = this.header;
            roops_goal_2 = (current.next != null) == false;
            roops_goal_3 = current.next != null;
            while (  current.next != null )
            {
                current = current.next;
            }
            current.next = freshNode;
        }
    }
    
    public SinglyLinkedListInsertBack() {
        init();
    }
    
    private void init() {
        this.header = createHeaderNode();
    }
    
    private SinglyLinkedListNode createHeaderNode() {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode();
        singlyLinkedListNode.next = null;
        return singlyLinkedListNode;
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

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
        roops_goal_2 = false;
        roops_goal_3 = false;
        roops_goal_4 = false;
        roops_goal_5 = false;
    }
}
/* end roops.core.objects */
