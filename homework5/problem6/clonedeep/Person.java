package problem6.clonedeep;

/**
 * Created by fissehaye on 6/6/18.
 */
public class Person implements Cloneable {

    String name;
    private Computer computer;

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

            // Need to clone the Computer reference variable too
            personClone.computer = (Computer)this.computer.clone();
        } catch (CloneNotSupportedException cnse) {
            // Otherwise return new object
            return new Person(this.name, this.computer);
        }
        return personClone;
    }

    public Computer getComputer() {
        return this.computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
