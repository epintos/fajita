package roops.core.objects;

public class MCCTest {

	public void test1() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		if (a && b && (c || (d && e))) {
			return;
		}
	}
	
	public void test2() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		if (((a || b) && (c || d)) && e) {
			return;
		}
	}
	
	public void test3() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		while (((a || b) && (c || d)) && e) {
			return;
		}
	}
	

}
