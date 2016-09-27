package daneimianshi.example_1;

/**
 * Created by zjutK on 16/9/13.
 */
public class Foo {
    public static void main(String[] args) {
        int random = (int) (Math.random() * Integer.MAX_VALUE + 1);
        String str = Integer.toBinaryString(random);
//        System.out.println(str);
//        System.out.println(str.length());
        if (str.length() < 32) {
            int str_length = 32 - str.length();
            for (int i = 0; i < str_length; i++) {
                str = '0'+str;
            }
        }
//        System.out.println(str);
        int[] a = new int[32];
        for(int i=0;i<32;i++){
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.print(a[i]+" ");
        }
    }
}
