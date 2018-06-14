package problem1;

/**
 * Created by fissehaye on 6/13/18.
 */
public class ArrayQueueImpl {

    private int[] arr;
    private int front = -1;
    private int rear = 0;
    private int capacity = 0;
    private int size = 0;

    public ArrayQueueImpl(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.size = 0;
        this.rear = 0;
        this.arr = new int[this.capacity];
    }

    // return front without removing it
    public int peek() {
        //implemented

        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return arr[front];
    }

    public void enqueue(int obj){
        //implemented
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % capacity;
        arr[rear] = obj;
        rear++;
        size++;
    }

    public int dequeue() {

        //implemented
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public boolean isEmpty () {
        //implemented
        return (this.size == 0);
    }

    public boolean isFull() {
        //implemented
        return (capacity == size);
    }

    public int size () {

        //implemented
        return this.size;
    }

    private void resize () {
        //implemented
        capacity = capacity * 2;
        int[] resizedArray = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            resizedArray[i] = arr[i];
        }

        arr = resizedArray;
    }
}
