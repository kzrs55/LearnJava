package JustTest.code_block;

/**
 * Created by zjutK on 16/7/19.
 */
public class Test {
    static {
        System.out.println("静态");
    }

    {
        System.out.println("构造");
    }

    public Test(){
        System.out.println("无参");
    }

    public Test(int a){
        System.out.println("有参");
    }

    public static void main(String[] args) {
        System.out.println("=======================");
        new Test();
        System.out.println("=======================");
        new Test(1);
    }
}
