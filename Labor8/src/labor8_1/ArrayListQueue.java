package labor8_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private final int CAPACITY;
    private ArrayList<Object> items;

    public ArrayListQueue(int cap) {
        this.CAPACITY = cap;
        this.items = new ArrayList<Object>();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    public boolean isFull(){
        return this.items.size() == this.CAPACITY;
    }
    public void enQueue(Object object){
        if (!this.isFull()) {
            this.items.add(object);
        }
        else{
            System.out.println("Queue is full");
        }
    }

    public Object deQueue(){
        if(!this.isEmpty()){
            return this.items.remove(0);
        }
        else{
            System.out.println("Queue is empty");
            return null;
        }
    }

    public void printQueue(){
        System.out.println("Arraylist queue " + this.items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

}
