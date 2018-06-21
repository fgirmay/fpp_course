package march2018.problem1;

/**
 * Created by fissehaye on 6/20/18.
 */
public class Main {

    public static void main(String[] args) {

        MinDoublyLinkedList mdll = new MinDoublyLinkedList();

        mdll.add("bill");
        mdll.add("tom");
        mdll.add("mike");

        System.out.println(mdll);

        mdll.add("anne");
        System.out.println(mdll);
        mdll.add("chris");
        System.out.println(mdll);
        mdll.add("vivek");
        System.out.println(mdll);
    }
}
