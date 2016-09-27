package daneimianshi.example_1;

/**
 * Created by zjutK on 16/9/13.
 */

public class AnonymousInner {
    class test implements funcInterface{
        @Override
        public void test() {
            System.out.println("test");
        }

        public test() {
            System.out.println("heiheiheiheiehie");
        }
    }

    public AnonymousInner() {
        test a = new test();
        a.test();
        System.out.println("hahahahaah");
    }

    public static void main(String[] args) {
        AnonymousInner ss = new AnonymousInner();
    }
}
