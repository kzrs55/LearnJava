package mianshi.example_luohao;

/**
 * Created by zjutK on 16/9/12.
 */
public class AutoUnboxingTest {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(b));
    }
}
