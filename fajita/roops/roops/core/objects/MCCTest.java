package roops.core.objects;

public class MCCTest {

	public void test1() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		if (a && b && (c || (d && e))) {
			;
		}
	}

	public void test2() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		if (((a || b) && (c || d)) && e) {
			;
		}
	}

	public void test3() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		while (((a || b) && (c || d)) && e) {
			;
		}
	}

	public void test4() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		int i = 0;
		for (i = 0; ((a || b) && (c || d)) && e; i++) {
			;
		}
	}

	public void test5() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		int i = 0;
		for (i = 0; i < 5; i++) {
			;
		}
	}

	public void test6() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		int i = 0;
		while (i < 5) {
			i++;
		}
	}

	public void test7() {
		int i = 3;
		if (i < 5) {
			;
		}
	}

	public void test8(int i) {
		if (i < 5) {
			;
		}
	}
	
	public void test9(boolean a, boolean b, boolean c, boolean d, boolean e) {
		if (a && b && (c || (d && e))) {
			;
		}
	}

}
