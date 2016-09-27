package multi_threading.example_14;

/**
 * Created by zjutK on 16/9/20.
 */
public class J_Thread extends Thread{

    private int Thread_id;
    public J_Thread(int j) {
        Thread_id = j;
        System.out.println("创建线程:"+Thread_id);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("多线程"+Thread_id+":"+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e ){
                System.out.println("异常");
            }
        }
    }

    public static void main(String[] args) {
        J_Thread s1 = new J_Thread(1);
        J_Thread s2 = new J_Thread(2);
        s2.setDaemon(true);
        s1.start();
        s2.start();
        if(s2.isDaemon()){
            System.out.println("后台进程");
        }else{
            System.out.println("用户进程");
        }



    }
}
