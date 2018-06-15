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

        Node node = new Node(null, top, obj);
        if (top != null) {
            top.previous = node;
        }
        top = node;
        size++;
    }

    @Override
    public T pop() {

        if(isEmpty()) {
            System.out.println("There is no elemement");
        }

        Node tmp = top;

        top = tmp.next;

        tmp.next = null; // Make it ready for garbage collection

        top.previous = null;
        size--;
        return tmp.obj;
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
        Node previous;
        T obj;

        Node(Node previous, Node next, T obj) {
            this.previous = previous;
            this.next = next;
            this.obj = obj;
        }

    }
}
