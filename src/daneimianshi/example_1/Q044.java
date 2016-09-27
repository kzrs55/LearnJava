package daneimianshi.example_1;

/**
 * Created by zjutK on 16/9/13.
 */
public class Q044 {
    public static void main(String[] args) {
        for (int i = 5; i <= 1000; i++) {
            if ((i % 5 == 0 || i % 7 == 0) && i % 35 != 0) {
                System.out.println(i);
            }
        }
    }
}
