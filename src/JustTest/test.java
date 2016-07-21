package JustTest;

/**
 * Created by zjutK on 16/6/2.
 */
public class test {
    class A{
        public A(){
            System.out.println("a");
        }
    }
    public A getA(){
        return new A();
    }

    public static void main(String[] args) {
        test t = new test();
        test.A tA = t.getA();
    }
}
