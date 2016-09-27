package daneimianshi.example_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by zjutK on 16/9/14.
 */
public class test2 {
    public static void main(String[] args) {
        Set ss = new HashSet<>();
        ss.add("Tom");
        ss.add("jerry");
        ss.add("bob");
        ss.add("Lee");
        Iterator ite = ss.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
