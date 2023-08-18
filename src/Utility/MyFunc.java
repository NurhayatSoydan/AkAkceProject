package Utility;

public class MyFunc {

    public static void Wait(int sn) { // MyFunc.Wait(3);

        try {
            Thread.sleep(sn * 1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
