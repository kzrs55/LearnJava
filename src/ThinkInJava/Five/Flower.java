package ThinkInJava.Five;

/**
 * Created by zjutK on 16/5/23.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int args only,petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String args string" + ss);
        s = ss;
    }

    Flower(String s, int Petals) {
        this(Petals);
        this.s = s;
        System.out.println("String and args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default contructor (no args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + "s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
