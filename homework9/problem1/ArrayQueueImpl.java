package problem1;

/**
 * Created by fissehaye on 6/13/18.
 */
public class ArrayQueueImpl {

    public int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public ArrayQueueImpl(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.size = 0;
        this.rear = -1;
        this.arr = new int[this.capacity];
    }

    public int peek() {

        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return arr[front];
    }

    public void enqueue(int obj){
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % capacity;
        arr[rear] = obj;
        size++;
    }

    public int dequeue() {

        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public boolean isEmpty () {
        return (this.size == 0);
    }

    public boolean isFull() {
        return (capacity == size);
    }

    public int size () {
        return this.size;
    }

    private void resize () {
        capacity = capacity * 2;
        int[] resizedArray = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            resizedArray[i] = arr[i];
        }
        arr = resizedArray;
    }
}
