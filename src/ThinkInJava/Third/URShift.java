package ThinkInJava.Third;



/**
 * Created by zjutK on 16/5/12.
 */
public class URShift {
    public static void main(String[] args) {
        int i = 16;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(i);
    }
}
