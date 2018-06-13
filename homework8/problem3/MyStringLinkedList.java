package problem3;

/**
 * Created by fissehaye on 6/12/18.
 */
public class MyStringLinkedList {

    Node header;

    MyStringLinkedList() {
        header = null;
    }

    public void addSort(String item){
        // Implement

        if (header == null) {

            header = new Node(null, item, null);

        } else if (header.next == null) {

            if (header.value.compareToIgnoreCase(item) < 0) {
                Node newNode = new Node(header, item, null);
                header.next = newNode;
            } else {
                Node newNode = new Node(null, item, header);
                header = newNode;
            }
        } else {

            Node nextNode = header;

            while (nextNode.next != null && nextNode.value.compareToIgnoreCase(item) < 0) {
                nextNode = nextNode.next;
            }

            // We are here means that we found the node where  the item should be
            // inserted but we need to check if it should be inserted before or after nextNode

            if (nextNode.next == null) { // Adding node at the last of the LinkedList
                Node newNode = new Node(nextNode, item, null);
                nextNode.next = newNode;

            } else if (nextNode.previous == null) { // Adding node at the beginning of the LinkedList

                Node newNode = new Node(nextNode.previous, item, nextNode);
                header.previous = newNode;
                header = newNode;

            } else { // Adding node in the middle of the LinkedList

                Node newNode = new Node(nextNode.previous, item, nextNode);
                nextNode.previous.next = newNode;
                nextNode.previous = newNode;
            }
        }

    }  // insert in a Sorted Order

    public int size(){

        // Implement
        Node startNode = header;
        int size = 0;

        while (startNode != null) {
            size++;
            startNode = startNode.next;
        }
        return size;
    }

    public boolean isEmpty(){
        // Implement
        return (header == null);
    }

    public Node getFirst(){
        // Implement
        return header;
    }

    public Node getLast(){
        // Implement

        // No need to check if header is null
        Node last = header;

        while (last != null) {

            last = last.next;
        }

        return last;
    }

    public boolean contains(String item){
        // Implement
        Node node = header;
        while (node != null ) {

            if (item.equalsIgnoreCase(node.value)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void removeFirst(){
        Node tmp = header;
        header = header.next;
        tmp.next = null;
        // Implement
    }

    void removeLast(){
        // Implement
        Node lastNode = header;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.previous.next = null;
        lastNode.previous = null;

    }
    public void print(){
        print(header);
    }

    //Write a recursive print method to display the elements in the list.
    void  print(Node n) {

        if (n == null) {
            return;
        } else {
            System.out.print(n.value + "->");
            print(n.next);
        }
    }

    public String toString() {
        String str ="";
        Node temp = header;
        while (temp != null) {
            str = str + "-->[" + temp.value.toString() + "]";
            temp = temp.next;
        }
        str = str + "-->[" + "NULL" + "]";
        return str;
    }


    public class Node {
        String value;
        Node next;
        Node previous;

        Node(Node previous, String value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return value;
        }
    }

    public static void main(String[] args) {

        MyStringLinkedList mySL = new MyStringLinkedList();
        // Make use of the implemented methods

        mySL.addSort("big");
        mySL.addSort("cat");
        mySL.addSort("tall");
        mySL.addSort("short");
        mySL.addSort("round");
        mySL.addSort("square");
        mySL.addSort("enormous");
        mySL.addSort("tiny");
        mySL.addSort("gargantuan");
        mySL.addSort("lilliputian");
        mySL.addSort("numberless");
        mySL.addSort("none");
        mySL.addSort("vast");
        mySL.addSort("miniscule");
        mySL.addSort("small");
        mySL.addSort("bat");

        System.out.println(mySL);

        //mySL.removeFirst();
        //System.out.println(mySL);

        //mySL.print();

        //System.out.println(mySL.header.value);

//        mySL.removeLast();
//        System.out.println(mySL);
        System.out.println(mySL.contains("numberless"));
        System.out.println(mySL.contains("Fissehaye"));
        mySL.addSort("Fissehaye");
        System.out.println(mySL);
        System.out.println(mySL.contains("Fissehaye"));

    }
}
