/****************************************************************************
Author: Juan Pablo Galeotti and Marcelo Frias, Relational Formal Methods 
Group, University of Buenos Aires and Buenos Aires Institute of Technology,
Buenos Aires, Argentina.
Companion LinkedListNode implementation for a ROOPS class implementing the 
apache.commons.collections class NodeCachingLinkedList.

The class has annotations in JFSL [1] given as ROOPS comments.

[1] http://sdg.csail.mit.edu/forge/plugin.html
****************************************************************************/

package roops.core.objectsInstrumented;

public class LinkedListNode {

    public /*@ nullable @*/LinkedListNode previous;
    public /*@ nullable @*/LinkedListNode next;
    public /*@ nullable @*/Object object_value;

    public LinkedListNode () {}

    public /*@ pure @*/Object getValue () {
        return object_value;
    }

    public void setValue (Object new_value) {
        this.object_value = new_value;
    }

    public LinkedListNode getPreviousNode () {
        return previous;
    }

    public void setPreviousNode (LinkedListNode previous) {
        this.previous = previous;
    }

    public LinkedListNode getNextNode () {
        return next;
    }

    public void setNextNode (LinkedListNode next) {
        this.next = next;
    }

    public static boolean roops_goal_0;

    public static boolean roops_goal_1;

    public static void fajita_roopsGoal_initialization () {
        roops_goal_0 = false;
        roops_goal_1 = false;
    }
}
/* end roops.core.objects */
