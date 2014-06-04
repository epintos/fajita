package roops.core.objectsInstrumented;

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
		if (c >= 5) {
			b = 2;
			a = b + c;
		} else {
			int f = c;
		}
		int e = c;
	}

	/**
	 * @Modifies_Everything
	 * @Ensures false;
	 */

	public void test6(int a) {
		fajita_roopsGoal_initialization();
		variable_definition_0 = true;
		while (a < 3) {
			a = a + 1;
			roops_goal_0 = variable_definition_0;
			variable_definition_1 = true;
			variable_definition_0 = false;
		}
	}

	public static boolean roops_goal_0;

	public static boolean variable_definition_0;

	public static boolean variable_definition_1;

	public static void fajita_roopsGoal_initialization() {
		roops_goal_0 = false;
		variable_definition_0 = false;
		variable_definition_1 = false;
	}
}
