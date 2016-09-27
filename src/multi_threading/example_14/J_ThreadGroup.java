package multi_threading.example_14;

/**
 * Created by zjutK on 16/9/20.
 */
public class J_ThreadGroup {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup tg = t.getThreadGroup();
        for(;tg!=null;tg = tg.getParent()){
            System.out.print("线程租含有"+tg.getName());
            System.out.print("含有");
            System.out.println(tg.activeCount()+"线程");
            int n = tg.activeCount();
            Thread [] tList = new Thread[tg.activeCount()];
            for(int i=0;i<tg.enumerate(tList);i++){
                System.out.println("其中第"+(i+1)+"个线程为"+tList[i].getName());
            }

        }
    }
}
