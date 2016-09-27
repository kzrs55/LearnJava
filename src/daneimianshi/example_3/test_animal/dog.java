package daneimianshi.example_3.test_animal;

/**
 * Created by zjutK on 16/9/18.
 */
public class dog extends animal {
    public dog(String sex, int age) {
        super(sex, age);
    }

    @Override
    public void ToString() {
        System.out.println(this.getSex()+"&&&&&&&&&&&&&&&"+this.getAge());
    }

    public void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        dog kk = new dog("man",18);
        kk.ToString();
        kk.hello();
        animal ss = new dog("women",12);
        ss.ToString();
    }

}


