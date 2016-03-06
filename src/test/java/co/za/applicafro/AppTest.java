package co.za.applicafro;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test(timeout = 5000)
    public void testTimeout()
    throws InterruptedException{

            while (true) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
