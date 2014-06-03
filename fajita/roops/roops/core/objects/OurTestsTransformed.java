package roops.core.objects;

public class OurTests {

	public void test() {
		int a = 1;
		int c = 1;
		{
			boolean terminatesInTime = false;
			if (a < 10) {
				int b = 5;
				{
					if (b < 10) {
						b++;
					}
					if (b < 10) {
						b++;
					}
					if (b < 10)
						terminatesInTime = true;
				}
				a++;
			}
			if (a < 10) {
				int b = 5;
				{
					if (b < 10) {
						b++;
					}
					if (b < 10) {
						b++;
					}
					if (b < 10)
						terminatesInTime = true;
				}
				a++;
			}
			if (a < 10)
				terminatesInTime = true;
		}
		{
			if (c < 10) {
				c++;
			}
			if (c < 10) {
				c++;
			}
			if (c < 10)
				terminatesInTime = true;
		}
	}

	public void test2() {
		int a = 9;
		{
			boolean terminatesInTime = false;
			if (a < 10) {
				a++;
			}
			if (a < 10) {
				a++;
			}
			if (a < 10)
				terminatesInTime = true;
		}
	}

}
