package multi_threading.example_14;

/**
 * Created by zjutK on 16/9/21.
 */
public class Singleton {
    private static Singleton instance;
    private static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
