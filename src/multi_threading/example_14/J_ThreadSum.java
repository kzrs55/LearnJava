package multi_threading.example_14;

import java.util.Collections;

/**
 * Created by zjutK on 16/9/20.
 */


public class J_ThreadSum extends Thread{
    private static int data= 0;
    private static int times = 10000;
    private int id;
    private boolean done;
    public int jjj;
    public J_ThreadSum(int kk) {
        id = kk;
    }

    @Override
    public void run() {
        done = false;
        int d = ((id%2==0)?1:-1);
        System.out.println("线程:"+id+"增量"+d);
        for (int i=0;i<times;i++)
            for (int j=0;j<times;j++){
                data+=d;
            }
        done = true;
        System.out.println("结束进程"+id);
    }

    public static void main(String[] args) {
        J_ThreadSum s1 = new J_ThreadSum(1);
        J_ThreadSum s2 = new J_ThreadSum(2);
        s1.start();
        s2.start();
        while (s1.done && s2.done){
            System.out.println("wait");
        }
        System.out.println(data);
    }
}
class A extends J_ThreadSum{
    public A(int kk) {
        super(kk);

    }
}