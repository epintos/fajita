package roops.core.objects;

public class OurTests {

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
}
