package daneimianshi.example_1;

/**
 * Created by zjutK on 16/9/13.
 */
class A{
    static {
        int i = 0;
        System.out.println("A staic");
    }
    private int ss;
    public A() {
        System.out.println("A constructor");
    }
    public void test(){
        System.out.println("A not static");
    }

}

class B extends A{
    static {
        System.out.println("B static");
    }
    private int kk;
    public B() {
        System.out.println("B constructor");

    }

    @Override
    public void test() {
        System.out.println("B not static");
    }
}
public class TEST {
    public static void main(String[] args) {
        int s = 10;
        System.out.println(String.valueOf(s));
        String ss = "10";
        System.out.println(Integer.parseInt(ss));

    }
}
