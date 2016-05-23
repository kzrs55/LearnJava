package ThinkInJava.Five;

/**
 * Created by zjutK on 16/5/23.
 */

class Bird {
    Bird(int i) {
        System.out.println("Bird int " + i);
    }

    Bird(String i) {
        System.out.println("Bird string " + i);
    }
}

public class NoSynthesis {
    public static void main(String[] args) {
        new Bird(1);
        new Bird("111111");
    }
}
