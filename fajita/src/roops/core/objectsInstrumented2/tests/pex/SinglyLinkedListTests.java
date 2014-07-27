package roops.core.objectsInstrumented2.tests.pex;

import org.junit.Test;

//Para correrlo con los otros criteros, reemplazar "mcc" por el paquete del criterio que se quiere testear

public class SinglyLinkedListTests {

	@Test
	public void testcontainsTest_1() {
		roops.core.objectsInstrumented2.uses.SinglyLinkedListContains s = new roops.core.objectsInstrumented2.uses.SinglyLinkedListContains();
		s.header = null;
		roops.core.objectsInstrumented2.uses.SinglyLinkedListContains
				.containsTest(s, 0);
	}

	@Test
	public void testcontainsTest_2() {
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains s = new roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains();
		s.header = new roops.core.objectsInstrumented2.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains
				.containsTest(s, 0);
	}

	@Test
	public void testcontainsTest_3() {
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains s = new roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains();
		s.header = new roops.core.objectsInstrumented2.base.SinglyLinkedListNode();
		s.header.value = 0;
		s.header.next = null;
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains
				.containsTest(s, 1);
	}

	@Test
	public void testcontainsTest_4() {
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains s = new roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains();
		s.header = new roops.core.objectsInstrumented2.base.SinglyLinkedListNode();
		s.header.next = new roops.core.objectsInstrumented2.base.SinglyLinkedListNode();
		;
		s.header.next.value = 0;
		s.header.next.next = null;
		roops.core.objectsInstrumented2.mcc.SinglyLinkedListContains
				.containsTest(s, 0);
	}

}
