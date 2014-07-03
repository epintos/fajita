package roops.core.objects;

public class OurTests {

<<<<<<< HEAD
    public void test1 (int m) {
        int a = 5;
        {
            boolean terminatesInTime = true;
            if ( a < 10 ) {
                a ++;
            }
            if ( a < 10 ) {
                a ++;
            }
            if ( a < 10 )
            {
                terminatesInTime = false;
            }
        }
    }
=======
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

>>>>>>> 64114f45d8f697ae7f3f7dbf07d8a5c91d0a5102
}
