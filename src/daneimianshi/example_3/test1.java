package daneimianshi.example_3;

import java.util.ArrayList;

/**
 * Created by zjutK on 16/9/14.
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> ss = new ArrayList();
        ss.add("Tom");
        ss.add("jerry");
        ss.add("bob");
        ss.add("Lee");
        for(int i =0 ; i<ss.size();i++){
            System.out.println(ss.get(i));
        }
    }
}
