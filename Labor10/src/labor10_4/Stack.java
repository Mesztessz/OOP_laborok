package labor10_4;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Double> items = new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push(double object) throws StackException {
        if(this.isFull()){
            throw new StackException("Stack is full");
        }
        items.add(object);
    }

    public void pop() throws StackException{
        if(this.isEmpty()){
            throw new StackException("Stack is empty");
        }
        items.remove(items.size()-1);
    }

    public double top() throws StackException {
        if(this.isEmpty()){
            throw new StackException("Stack is empty");
        }
        return items.get(items.size()-1);
    }


    public int getSize(){
        return items.size();
    }
}
