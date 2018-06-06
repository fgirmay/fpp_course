package problem6.clonedeep;

/**
 * Created by fissehaye on 6/6/18.
 */
public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Apple", "Intel Dual-core", 32, 2.5);
        Person person = new Person("Fissehaye", computer);

        // Deep cloning of person object since computer also overrides clone object new computer object is created for the clone person
        Person clonePerson = (Person) person.clone();



        // Modify the computer's object in person object
        person.getComputer().setRamSize(16);

        System.out.println("The value of the ram size of the original person is " + person.getComputer().getRamSize());
        System.out.println("The value of the ram size of the deep cloned person is " + clonePerson.getComputer().getRamSize());
    }
}