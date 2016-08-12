package multi_threading.example_2;

/**
 * Created by zjutK on 16/8/5.
 */
public class MyThread extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            if(i%10 == 0){
                System.out.println("=============="+i);
            }
            System.out.print(i+"  ");
            try{
                Thread.sleep(1);
                System.out.println("线程睡眠1毫秒");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
