package multi_threading.example_1;

/**
 * Created by zjutK on 16/7/29.
 */
public class Main {
    public static void main(String[] args) {
        DoSomething name1 = new DoSomething("hhhhhhhhhh");
        DoSomething name2 = new DoSomething("oooooooooo");
        Thread t1 = new Thread(name1);
        Thread t2 = new Thread(name2);
        t1.start();
        t2.start();
    }
}
