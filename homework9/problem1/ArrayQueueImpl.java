package problem1;

/**
 * Created by fissehaye on 6/13/18.
 */
public class ArrayQueueImpl {

    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {

        //implement
        return -1;
    }

    public void enqueue(int obj){
        //implement
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {

        //implement

        return -1;
    }

    public boolean isEmpty () {
        //implement
        return false;
    }

    public int size () {

        //implement
        return 0;
    }

    private void resize () {
        //implement
    }
}
