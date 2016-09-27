package JustTest.fortest.test1;

/**
 * Created by zjutK on 16/9/27.
 */
public class test1 {
    static {
        System.out.println("AAAAAAAAAAAA static");
    }
    {
        System.out.println("AAAAAAAAAAA  BBBBBBB");
    }

    public test1() {
        System.out.println("AAAAAAAAAAA  CCCCCCCCC");
    }
}
