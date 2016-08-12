package multi_threading.example_8;

/**
 * Created by zjutK on 16/8/11.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行...");
    }
}
