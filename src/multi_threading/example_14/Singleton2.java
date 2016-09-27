package multi_threading.example_14;

/**
 * Created by zjutK on 16/9/21.
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private static Singleton2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        if(s1==s2){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
