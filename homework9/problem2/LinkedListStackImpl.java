package problem2;

/**
 * Created by fissehaye on 6/14/18.
 */

// Stack implementation using Linked List

interface Stack1<T> {
    public void push(T obj);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
}

public class LinkedListStackImpl<T> implements Stack1<T> {

    private Node top;
    private int size;


    @Override
    public void push(T obj) {

        Node node = new Node(top, obj);
        top = node;
        size++;
    }

    @Override
    public T pop() {

        if(isEmpty()) {
            System.out.println("There is no elemement");
        }

        Node previousTop = top;
        top = previousTop.next;
        size--;
        return previousTop.obj;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            System.out.println("There is no element");
        }
        return top.obj;
    }

    @Override
    public boolean isEmpty() {

        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }


    private class Node {
        Node next;
        T obj;

        Node(Node next, T obj) {
            this.next = next;
            this.obj = obj;
        }

    }
}
