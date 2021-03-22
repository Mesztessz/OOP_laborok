package labor6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object>{
    private int capacity;

    public StackInheritance(int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    public boolean isFull(){
        return this.size() == capacity;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void push(Object object){
        if(this.size() < capacity){
            this.add(object);
        }
//        System.out.println("Stack is full");
        return;
    }

    public void pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        this.remove(this.size()-1);
    }

    public Object top(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return this.get(this.size()-1);
    }

    public int getSize(){
        return this.size();
    }
}
