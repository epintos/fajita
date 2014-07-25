package roops.core.objects;

//Authors: Marcelo Frias

@roops.util.BenchmarkClass
/**
 * @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
 */
public class SinglyLinkedList {

    @roops.util.NrOfGoals(7)
    @roops.util.BenchmarkMethod
    static public void containsTest(SinglyLinkedList list, int value_param) {
        boolean ret_val;
        if (list != null && list.repOK()) {
            ret_val = list.contains(value_param);
        }
    }

    @roops.util.NrOfGoals(4)
    @roops.util.BenchmarkMethod
    static public void insertBackTest(SinglyLinkedList list, int arg) {
        if (list != null && list.repOK()) {
            list.insertBack(arg);
        }
    }

    @roops.util.NrOfGoals(7)
    @roops.util.BenchmarkMethod
    static public void removeTest(SinglyLinkedList list, int index) {
        if (list != null && list.repOK()) {
            list.remove(index);
        }
    }

    public /*@ nullable @*/ SinglyLinkedListNode header;

    public boolean contains(int value_param) {
		SinglyLinkedListNode current;
		boolean result;
		current = this.header;
		result = false;
		while (result == false && current != null) {
			boolean equalVal;
			if (value_param == current.value) { 
				equalVal = true;
			} else {
				equalVal = false;
			}
			if (equalVal == true) {
				result = true;
			}
			current = current.next;
		}
		return result;
	}

    public void remove(int index) {

        if (index < 0) {
            throw new RuntimeException();
        }

        SinglyLinkedListNode current;
        current = this.header;
        SinglyLinkedListNode previous;
        previous = null;
        int current_index;
        current_index = 0;

        boolean found = false;

        while (found == false && current != null) {

            if (index == current_index) {
                found = true;
            } else {
                current_index = current_index + 1;
                previous = current;
                current = current.next;
            }
        }

        if (found == false) {
            throw new RuntimeException();
        }

        if (previous == null) {
            this.header = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public void insertBack(int arg) {
        SinglyLinkedListNode freshNode = new SinglyLinkedListNode();
        freshNode.value = arg;
        freshNode.next = null;

        if (this.header == null) {
            this.header = freshNode;
        } else {
            SinglyLinkedListNode current;
            current = this.header;
            while (current.next != null) {
                current = current.next;
            }
            current.next = freshNode;
        }
    }

    public SinglyLinkedList() {
    }

    // *************************************************************************
    // ************** From now on repOK() *************************************
    // *************************************************************************

    public boolean repOK() {

        RoopsSet visited = new RoopsSet();

        SinglyLinkedListNode current = header;

        while (true) {
            SinglyLinkedListNode next = current;
            if (next == null)
                break;

            if (!visited.add(next))
                return false;

            current = current.next;
        }

        return true;
    }

}
/* end roops.core.objects */
