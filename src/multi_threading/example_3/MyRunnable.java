package multi_threading.example_3;

/**
 * Created by zjutK on 16/8/5.
 */
public class MyRunnable implements Runnable {
    private Foo foo = new Foo();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.fix(30);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : 当前foo对象的x值= " + foo.getX());
        }
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread ta = new Thread(r, "Thread-A");
        Thread tb = new Thread(r, "Thread-B");
        ta.start();
        tb.start();
    }

    public int fix(int y) {
        return foo.fix(y);
    }
}
