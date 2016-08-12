package multi_threading;



/**
 * Created by zjutK on 16/7/29.
 */
public class test {
    public static void main(String[] args) {
        try{
            int s  = 100/0;
            System.out.println("dsfs");
        }catch (NullPointerException e){
            System.out.println("dfgdsfg");
        }catch (Exception e){
            System.out.println("gdsgdsgs");
        }
    }
}
