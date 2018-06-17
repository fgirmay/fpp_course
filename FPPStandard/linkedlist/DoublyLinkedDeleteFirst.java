package linkedlist;

/**
 * Created by fissehaye on 6/17/18.
 */

public class DoublyLinkedDeleteFirst {

    Node header;

    public DoublyLinkedDeleteFirst() {
        header = new Node();
    }

    //removes the node at position 1 and returns
    //the string contained in that node
    public String deleteFirst() {
        //implement

        if (header.next == null || header.next.next == null) {
            throw new IllegalStateException();
        }

        Node tmp = header.next.next;

        header.next.next = tmp.next;

        if (tmp.next != null) {
            tmp.next.previous = header.next;
        }

        tmp.previous = null;
        tmp.next = null;

        return tmp.value;
    }

    public boolean isEmpty() {
        //implement
        return (header.next == null);
    }

    // adds to the end of the list
    public void addLast(String item) {

        Node next = header;

        while (next.next != null) {

            next = next.next;
        }

        Node n = new Node();
        n.value = item;
        next.next = n;
        n.previous = next;

    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null)
            return;
        if (n.value != null)
            sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
        list.addLast("Bob");
        list.addLast("Fissehaye");
        list.addLast("Harry");
        list.addLast("Steve");
        String deleted = list.deleteFirst();
        System.out.println("This item was deleted: " + deleted);
        System.out.println(list);

    }
}
