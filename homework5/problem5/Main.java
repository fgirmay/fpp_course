package problem5;

/**
 * Created by fissehaye on 6/5/18.
 */
public class Main {

    public static void main(String[] args) {

        // String manufacturer : Apple
        // String processor : Intel Dual-core processors, Intel Pentium , AMD, Intel Pentium D
        // int ramSize : 16 GB
        // double processorSpeed : 2.2 GHz

        Computer computer1 = new Computer("Apple", "Intel Dual-core", 16, 2.2);
        Computer computer2 = new Computer("Apple", "Intel Dual-core", 16, 2.2);
        Computer computer3 = new Computer("Dell", "Intel Dual-core", 16, 2.2);

        System.out.println("Is computer 1 equal to computer 2 ? " + computer1.equals(computer2));
        System.out.println("Is computer 2 equal to computer 3 ? " + computer2.equals(computer3));
    }
}
