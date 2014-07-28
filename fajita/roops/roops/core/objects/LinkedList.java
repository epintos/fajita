package roops.core.objects;

import roops.core.objects.LinkedListNode;

//Authors: Marcelo Frias
@roops.util.BenchmarkClass
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

	@roops.util.NrOfGoals(3)
	@roops.util.BenchmarkMethod
	static public void addLastTest(LinkedList list, Object o) {
		if (list != null && list.repOK()) {
			list.addLast(o);
		}
	}

	@roops.util.NrOfGoals(3)
	@roops.util.BenchmarkMethod
	static public void containsTest(LinkedList list, Object arg) {
		if (list != null && list.repOK()) {
			list.contains(arg);
		}
	}

	@roops.util.NrOfGoals(10)
	@roops.util.BenchmarkMethod
	static public void removeIndexTest(LinkedList list, int index) {
		if (list != null && list.repOK()) {
			list.removeIndex(index);
		}
	}

	public/* @ nullable @ */LinkedListNode header;

	public int size;

	public int modCount;

	private void init() {
		header = createHeaderNode();
	}

	// -----------------------------------------------------------------------
	private int indexOf(Object new_value) {
		int i = 0;
		LinkedListNode node = header.next;
		while (node != header) {
			{
				roops.util.Goals.reached(0, roops.util.Verdict.REACHABLE);
			}
			boolean equal = isEqualValue(node.object_value, new_value);
			if (equal) {
				{
					roops.util.Goals.reached(1, roops.util.Verdict.REACHABLE);
				}
				return i;
			}
			i++;
			node = node.next;
		}
		{
			roops.util.Goals.reached(2, roops.util.Verdict.REACHABLE);
		}
		return -1;
	}

	public boolean contains(Object arg) {
		boolean exists = indexOf(arg) != -1;
		return exists;
	}

	public Object removeIndex(int index) {
		LinkedListNode node = getNode(index, false);
		Object oldValue = node.object_value;
		removeNode(node);

		{
			roops.util.Goals.reached(9, roops.util.Verdict.REACHABLE);
		}
		return oldValue;
	}

	public boolean addLast(Object o) {
		addNodeBefore(header, o);
		return true;
	}

	private boolean isEqualValue(Object value1, Object value2) {
		boolean ret_val;
		if (value1 == value2) {
			ret_val = true;
		} else {
			if (value1 == null) {
				ret_val = false;
			} else {
				ret_val = value1.equals(value2);
			}
		}
		return ret_val;
	}

	private LinkedListNode createHeaderNode() {
		LinkedListNode linkedListNode = new LinkedListNode();
		linkedListNode.next = linkedListNode;
		linkedListNode.previous = linkedListNode;
		return linkedListNode;
	}

	private LinkedListNode createNode(Object new_object_value) {
		{
			roops.util.Goals.reached(0, roops.util.Verdict.REACHABLE);
		}
		LinkedListNode node = new LinkedListNode();
		node.previous = node;
		node.next = node;
		node.object_value = new_object_value;
		return node;
	}

	private void addNodeBefore(LinkedListNode node, Object new_object_value) {
		LinkedListNode newNode = createNode(new_object_value);
		{
			roops.util.Goals.reached(1, roops.util.Verdict.REACHABLE);
		}

		addNode(newNode, node);
	}

	private void addNode(LinkedListNode nodeToInsert,
			LinkedListNode insertBeforeNode) {
		nodeToInsert.next = insertBeforeNode;
		nodeToInsert.previous = insertBeforeNode.previous;
		insertBeforeNode.previous.next = nodeToInsert;
		insertBeforeNode.previous = nodeToInsert;
		size++;
		modCount++;

		{
			roops.util.Goals.reached(2, roops.util.Verdict.REACHABLE);
		}
	}

	private void removeNode(LinkedListNode node) {
		node.previous.next = node.next;
		node.next.previous = node.previous;
		size--;
		modCount++;
		{
			roops.util.Goals.reached(8, roops.util.Verdict.REACHABLE);
		}
	}

	private LinkedListNode getNode(int index, boolean endMarkerAllowed)
			 {
		// Check the index is within the bounds
		if (index < 0) {
			{roops.util.Goals.reached(0, roops.util.Verdict.REACHABLE);}
			throw new RuntimeException();
		}
		if (!endMarkerAllowed && index == size) {
			{roops.util.Goals.reached(1, roops.util.Verdict.REACHABLE);}
			throw new RuntimeException();
		}
		if (index > size) {
			{roops.util.Goals.reached(2, roops.util.Verdict.REACHABLE);}
			throw new RuntimeException();
		}
		// Search the list and get the node
		LinkedListNode node;
		int size_div_2 = size /2;
		
		if (index < size_div_2) {
			{roops.util.Goals.reached(3, roops.util.Verdict.REACHABLE);}
			// Search forwards
			node = header.next;
			int currentIndex = 0
			while(currentIndex < index){
				{roops.util.Goals.reached(4, roops.util.Verdict.REACHABLE);}
				node = node.next;
				currentIndex++
			}
		} else {
			
			{roops.util.Goals.reached(5, roops.util.Verdict.REACHABLE);}
			
			// Search backwards
			node = header;
			int currentIndex = size
			while(currentIndex > index){
				{roops.util.Goals.reached(6, roops.util.Verdict.REACHABLE);}
				node = node.previous;
				currentIndex--
			}
		}
		{roops.util.Goals.reached(7, roops.util.Verdict.REACHABLE);}
		return node;
	}

	public LinkedList() {
		init();
	}

	// *************************************************************************
	// ************** From now on repOK() *************************************
	// *************************************************************************

	public boolean repOK() {
		if (header == null) {
			return false;
		}
		if (header.object_value != null) {
			return false;
		}

		RoopsSet visited = new RoopsSet();
		visited.add(header);
		LinkedListNode current = header;

		while (true) {
			LinkedListNode next = current.next;
			if (next == null) {
				return false;
			}
			if (next.previous != current) {
				return false;
			}
			current = next;
			if (!visited.add(next)) {
				break;
			}
		}
		if (current != header) {
			return false;
		}

		if (visited.getSize() - 1 != size) {
			return false;
		}

		return true;
	}
}
/* end roops.core.objects */
