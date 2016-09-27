package daneimianshi.example_1;


import java.util.Arrays;

/**
 * Created by zjutK on 16/9/13.
 */

class Stack{
    private Object[] data;
    private int size = 0;
    public Stack() {
        data = new Object[0];
    }
    public boolean isFull(){
        return data.length == size ||(data.length == 0 && size == 0);
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void increData(){
        data = Arrays.copyOf(data, data.length+10);
    }
    public void push(Object obj){
        if(isFull()){
            increData();
        }
        size++;
        data[size - 1] =obj;
    }
    public Object pop(){
        Object o = data[size-1];
        data[size - 1] =null;
        size -- ;
        return o;
    }
}

public class Stack_Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("123");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
