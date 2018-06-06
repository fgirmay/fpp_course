package problem6;

import problem5.Computer;


/**
 * Created by fissehaye on 6/5/18.
 */
public class Person implements Cloneable {

    String name;
    Computer computer;

    public Person(String name, Computer computer) {
        this.name = name;
        this.computer = computer;

        this.computer.toString();
    }


    @Override
    public Object clone() {

        Person personClone = null;
        
        try {
            personClone = (Person)super.clone();

        } catch (CloneNotSupportedException cnse) {

            return new Person(this.name, this.computer);
        }

        return personClone;

    }
}
