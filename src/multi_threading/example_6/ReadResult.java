package multi_threading.example_6;

/**
 * Created by zjutK on 16/8/5.
 */
public class ReadResult extends Thread {
    Calculator c;

    public ReadResult(Calculator c) {
        this.c = c;
    }

    public void run() {
        synchronized (c) {
            try {
                System.out.println(Thread.currentThread() + "等待计算结果。。。");
                c.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "计算结果为：" + c.total);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //启动三个线程，分别获取计算结果
        new ReadResult(calculator).start();
        new ReadResult(calculator).start();
        new ReadResult(calculator).start();
        //启动计算线程
        calculator.start();
    }
}
