package roops.core.objects;

public class SinglyLinkedListNode {

	public /*@ nullable @*/ SinglyLinkedListNode next;
	
	public /*@ nullable @*/ Object value;
	
	public SinglyLinkedListNode() {}
	
	public SinglyLinkedListNode getNext() {
	    return next;
	}
}
