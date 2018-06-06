package problem6.cloneshallow;

/**
 * Created by fissehaye on 6/6/18.
 */
public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Apple", "Intel Dual-core", 64, 2.5);
        Person person = new Person("Fissehaye", computer);

        // Shallow cloning of person object since no new object of computer is created for the clone person
        Person clonePerson = (Person) person.clone();
        clonePerson.setComputer(computer);


        // Modify the computer's object in person object
        person.getComputer().setRamSize(16);

        System.out.println("The value of the ram size of the original person is " + person.getComputer().getRamSize());
        System.out.println("The value of the ram size of the shallow cloned person is " + clonePerson.getComputer().getRamSize());
    }
}