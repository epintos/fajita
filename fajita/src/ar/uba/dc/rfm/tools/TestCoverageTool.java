package ar.uba.dc.rfm.tools;

import java.lang.reflect.Field;

public class TestCoverageTool {

	public static StringBuilder report(Object obj) {
		Class<?> objClass = obj.getClass();
		StringBuilder ret = new StringBuilder(Thread.currentThread().getStackTrace()[2].getMethodName() + ";");

		Field[] fields = objClass.getDeclaredFields();
		for (Field field : fields) {
			String name = field.getName();
			if (name.contains("roops_goal_")) {
				Object value;
				try {
					value = field.get(obj);
				} catch (Exception e) {
					e.printStackTrace();
					return ret;
				}
				if ((boolean) value)
					ret.append("1;");
				else
					ret.append("0;");
			}
		}

		if (ret.length() > 0)
			ret.replace(ret.length() - 1, ret.length(), "");
		System.out.println(ret);
		return ret;
	}

	public static void main(String[] args) {
		Roops goal = new Roops();
		System.out.println(report(goal));
	}

	public static class Roops {
		boolean roops_goal_0 = true;
		boolean roops_goal_1 = false;
		boolean roops_goal_2 = true;
		String s = "hola";
		boolean roops_goal_3 = true;
		boolean roops_goal_4 = true;
		boolean roops_goal_5 = true;

		public void test() {
			roops_goal_8 = false;
		}

		boolean roops_goal_6 = true;
		boolean roops_goal_7 = true;
		boolean roops_goal_8 = true;
	}
	
}
