package multi_threading.example_6;

/**
 * Created by zjutK on 16/8/5.
 */
public class ThreadB extends Thread{
    int total;
    public void run(){
        synchronized (this){
            for(int i=0; i<100; i++){
                total+=i;
//                System.out.println(total);
            }
            notify();
        }
    }
}
