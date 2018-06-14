package problem2;

/**
 * Created by fissehaye on 6/14/18.
 */
public class Driver {

    public static void main(String[] args) {

        Stack1<String> llsi = new LinkedListStackImpl();
        llsi.push("Fissehaye");
        llsi.push("Adeway");
        llsi.push("Mihret");
        llsi.push("Temesgen");
        llsi.push("Selam");

        llsi.pop();
        llsi.pop();

        System.out.println("The size is " + llsi.size());

        System.out.println(llsi.peek());
    }
}
