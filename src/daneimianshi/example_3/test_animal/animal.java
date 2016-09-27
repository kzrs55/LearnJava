package daneimianshi.example_3.test_animal;

/**
 * Created by zjutK on 16/9/18.
 */
public class animal {
    private int age;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public animal(String sex,int age){
        this.age = age;
        this.sex = sex;
    }
    public void ToString(){
        System.out.println(this.getSex()+"**********"+this.getAge());
    }

}
