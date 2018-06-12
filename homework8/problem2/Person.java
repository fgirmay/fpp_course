package problem2;

/**
 * Created by fissehaye on 6/11/18.
 */
public class Person {

    private String lastName;
    private String firstName;
    private int age;

    // --------------------------------------------------------------
    public Person(String lastName, String firstName, int age) { // constructor
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    // --------------------------------------------------------------
    public String getLast() {
        return lastName;
    }
    @Override
    public String toString() {
        return "Person [lastName = " + lastName + " FirstName = " + firstName + " Age = " + age + "] \n";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person)obj;

        if (person.getLast().equals(this.getLast()) ) {
            return true;
        }
        return false;
    }
}
