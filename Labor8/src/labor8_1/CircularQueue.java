package labor8_1;

import java.util.Arrays;
import java.util.Objects;

public class CircularQueue implements IQueue{

    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object object) {
        if (this.isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = object;
        }
    }

    @Override
    public Object deQueue() {
        Object element;
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % CAPACITY;
            }
            return element;
        }
    }

    @Override
    public void printQueue() {
        if(this.isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front: " + front);
            for(int i = front; i != rear; i = (i+1)%CAPACITY){
                System.out.print(items[i] + " ");
            }
            System.out.println("Rear: " + rear);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        int first = that.front;
        for(int i = front; i != rear; i = (i+1)%CAPACITY){
            if(items[i] != that.items[first]) {
                return false;
            }
            first = (first + 1) % that.CAPACITY;
        }
        return true;
    }
}
