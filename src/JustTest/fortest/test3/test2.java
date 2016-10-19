package JustTest.fortest.test3;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by zjutK on 16/10/10.
 */
public class test2 implements Runnable{
    String name;
    public test2(String i) {
        this.name = i;
    }

    @Override
    public void run() {
        for(int i =0;i<100;i++){
            System.out.println(name+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread ss = new Thread(new test2("1"));
        Thread ss2 = new Thread(new test2("2"));
        ss.start();
        ss2.start();

    }
}
