package roops.core.objects;

public class OurTests {

    public void test1 (int m) {
        {
            boolean terminatesInTime = true;
            if ( m > 0 ) {
                m --;
                if ( m == 3 ) {
                    m = 7;
                }
            }
            if ( m > 0 ) {
                m --;
                if ( m == 3 ) {
                    m = 7;
                }
            }
            if ( m > 0 )
            {
                terminatesInTime = false;
            }
        }
    }
}
