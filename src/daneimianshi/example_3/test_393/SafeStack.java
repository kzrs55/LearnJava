package daneimianshi.example_3.test_393;

/**
 * Created by zjutK on 16/9/18.
 */
public class SafeStack implements SafeInterface {
    private int top = 0;
    private int[] value = new int[20];
    private boolean dataAvailble = false;

    @Override
    public void push(int n) {
        synchronized (this) {
            while (dataAvailble) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            value[top] = n;
            System.out.println("压入数字" + n + "步骤1完成");
            top++;
            dataAvailble = true;
            notifyAll();
            System.out.println("压入数字完成");
        }

    }

    @Override
    public int[] pop() {
        synchronized (this) {
            while (!dataAvailble) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            System.out.println("弹出");
            top--;
            int[] test = {value[top], top};
            dataAvailble = false;
            notifyAll();
            return test;
        }
    }
}