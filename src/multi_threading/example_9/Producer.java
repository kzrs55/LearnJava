package multi_threading.example_9;

/**
 * Created by zjutK on 16/8/11.
 */
public class Producer extends Thread {
    private int neednum;                //生产产品的数量
    private Godown godown;            //仓库

    Producer(int neednum, Godown godown) {
        this.neednum = neednum;
        this.godown = godown;
    }

    public void run() {
        //生产指定数量的产品
        godown.produce(neednum);
    }
}
