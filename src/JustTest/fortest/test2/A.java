package JustTest.fortest.test2;

/**
 * Created by zjutK on 16/9/27.
 */
class A {
    public void show(D obj){
        System.out.println("ad");
    }
    public void show(A obj){
        System.out.println("aa");
    }
}
class B extends A{
    public void show(B obj){
        System.out.println("bb");
    }
    public void show(A obj){
        System.out.println("ba");
    }
}
class C extends B{
    public void show(B obj){
        System.out.println("bc");
    }
    public void show(C obj){
        System.out.println("cc");
    }
}

class D extends B{
    public void show(D obj){
        System.out.println("dd");
    }
    public void show(B obj){
        System.out.println("bd");
    }
}

class  Test{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        a1.show(a1);
        a1.show(d);
        a1.show(a2);
        a2.show(a1);
        a2.show(d);
        a2.show(b);
        a2.show(c);
    }
}