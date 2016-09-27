package daneimianshi.example_3.test_393;

import java.util.Random;

/**
 * Created by zjutK on 16/9/18.
 */
public class PushThread implements Runnable{
    private SafeInterface s;

    public PushThread(SafeInterface s) {
        this.s = s;
    }

    @Override
    public void run() {
        int i = 0;
        Random r = new Random();
        i = r.nextInt(10);
        s.push(i);
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){}

    }
}
