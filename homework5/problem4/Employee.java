package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public abstract double getPayment();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {

        String objectDescription = "First name: " + firstName + ", Last name: " + lastName + ", Social security number: " + socialSecurityNumber;
        return objectDescription;
    }
}
