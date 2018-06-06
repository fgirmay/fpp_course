package problem6;

import problem5.Computer;

/**
 * Created by fissehaye on 6/5/18.
 */
public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple", "Intel Dual-core", 32, 2.5);
        Person person1 = new Person("Fissehaye", computer1);

        // Deep cloning of person object since new computer is created for the clone person
        Person clonePerson1 = (Person) person1.clone();
        Computer cloneComputer = (Computer)computer1.clone();
        clonePerson1.setComputer(cloneComputer);

        Person clonePerson2 = (Person) person1.clone();


        // Modify the computer's object in person object
        person1.getComputer().setRamSize(16);

        System.out.println("The value of the ram size of the original person is " + person1.getComputer().getRamSize());
        System.out.println("The value of the ram size of the deep cloned person is " + clonePerson1.getComputer().getRamSize());
        System.out.println("The value of the ram size of the shallow cloned person is " + clonePerson2.getComputer().getRamSize());
    }
}
