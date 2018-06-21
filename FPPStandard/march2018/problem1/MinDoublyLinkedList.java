package march2018.problem1;

/**
 * Created by fissehaye on 6/20/18.
 */
public class MinDoublyLinkedList {

    private Node header;

    public MinDoublyLinkedList() {

        header = new Node(null, null, null);
    }

    public void add(String str) {

        if (header.next == null) {

            Node node = new Node(header, str, null);
            header.next = node;

        } else {

            if (str.compareTo(header.next.value) < 0) {
                Node node = new Node(header, str, header.next);
                header.next = node;
                header.next.previous = node;

            } else {

                if (header.next.next == null) {
                    Node node = new Node (header.next, str, null);
                    header.next.next = node;

                } else {
                    Node node = new Node (header.next, str, header.next.next);
                    header.next.next.previous = node;
                    header.next.next = node;
                }

            }
        }

    }

    private class Node {

        private Node previous;
        private Node next;
        private String value;

        public Node(Node previous, String value, Node next) {

            this.previous = previous;
            this.next = next;
            this.value = value;
        }
    }

    public String toString() {

        String result = "[";

        Node node = header;

        while (node.next != null) {

            node = node.next;

            result += node.value + "->";
        }

        result += "]";
        return result;
    }

}
