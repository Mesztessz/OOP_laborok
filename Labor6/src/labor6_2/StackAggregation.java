package labor6_2;

import java.util.ArrayList;

public class StackAggregation {
    private ArrayList<Object> items = new ArrayList<>();
    private int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
//        if(items.size() == capacity){
//            return true;
//        }
//        return false;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push(Object object){
        if(isFull()){
            return;
        }
        items.add(object);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        items.remove(items.size()-1);
    }

    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return items.get(items.size()-1);
    }
    public int getSize(){
        return items.size();
    }
}
