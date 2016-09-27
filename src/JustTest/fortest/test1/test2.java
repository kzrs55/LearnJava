package JustTest.fortest.test1;

/**
 * Created by zjutK on 16/9/27.
 */

public class test2 extends test1 {
    static {
        System.out.println("BBBBBBBBBB static");
    }
    {
        System.out.println("BBBBBBBBBBB  BBBBBBBBBBBB");
    }

    public test2() {
        System.out.println("BBBBBBBBBB CCCCCCCCCCCCCCC");
    }

    public static void main(String[] args) {
        test2 ss= new test2();
    }
}
