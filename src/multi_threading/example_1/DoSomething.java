package multi_threading.example_1;

/**
 * Created by zjutK on 16/7/29.
 */
public class DoSomething implements Runnable {
    public String name;

    public DoSomething(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + i);
        }
    }
}
