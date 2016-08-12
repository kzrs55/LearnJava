package multi_threading.example_3;

/**
 * Created by zjutK on 16/8/5.
 * 同步问题
 */
public class Foo {
    private int x = 100;
    public int getX(){
        return x;
    }
    public int fix(int y){
        x = x-y;
        return x;
    }
}
