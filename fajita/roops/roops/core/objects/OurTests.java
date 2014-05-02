package roops.core.objects;

public class OurTests {

    public void test1(int o) {
        int a = 8;
        int m = 0;
        if (o > 9) {
            m = a;
        }
    }

    public void test2(int o) {
        int i = 0;
        int a = 0;
        while (i < 5) {
            if (a % 2 == 0) {
                a = a + 2;
            } else {
                a = a + 1;
            }
            i = i + 1;
        }
    }

    public void test3(int o) {
        int i = 0;
        int a = 0, b = 0, c = 0;
        while (i < 5) {
            if (a % 2 == 0) {
                a = a + 2;
            } else {
                a = a + 1;
            }
            i = i + 1;
        }
    }

}
