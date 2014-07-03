package roops.core.objects;

public class AllDefTest {

	public void test1() {
		int a = 2;
		int b = 5;
		a = 2 + b;
		if (a > 3) {
			int c = 20;
			a = c + a;
		}
		int j = a;
	}

	public void test2() {
		int a = 2;
		int b = 5;
		a = 2 + b;
	}

	public void test3() {
		int a = 2;
		int b = 5;
		a = 2 + b;
		int c = b + a;
	}

	public void test4(int a, int f, int p) {
		int b = 0 + f;
		a = 5;
		int c = p + 3;
	}
	
	public void test5(int a, int b, int c) {
		int d = a + b;
		b = b - a;
		if(c >= 5) {
			b = 2;
			a = b + c;
		} else {
			int f = c;
		}
		int e = c;
	}
	
	public void test6(int a){
		while(a < 3) {
			a = a + 1;
		}
	}

}
