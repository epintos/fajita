package roops.core.objects;

public class OurTests {
    
    public void test1(Object o) {
        int a = 1;
        int m = 0;
        if (o != null) {
            a = 7;
        }
        m += a;
    }

}
