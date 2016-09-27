package daneimianshi.example_3.test_393;

/**
 * Created by zjutK on 16/9/18.
 */
public class PopThread implements Runnable {
    private SafeInterface s;

    public PopThread(SafeInterface s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(s.pop()[0]);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}