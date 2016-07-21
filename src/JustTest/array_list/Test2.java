package JustTest.array_list;

import JustTest.equals.Person;

import java.util.Arrays;

/**
 * Created by zjutK on 16/7/20.
 */
public class Test2 {
    public static void main(String[] args) {
        Person person_01 = new Person("chenssy_01");
        Person[] persons1 = new Person[]{person_01};
        Person[] persons2 = Arrays.copyOf(persons1 , persons1.length);
//      这里是浅拷贝
    }
}
