package problem1;

import java.util.Objects;

/**
 * Created by fissehaye on 6/15/18.
 */
public class Key {
    private String firstName;
    private String lastName;

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Key)) {
            return false;
        }

        Key y = (Key)obj;

        if (this.firstName.equals(y.firstName) && this.lastName.equals(y.lastName)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        //return Objects.hash(firstName, lastName);
        int result = 31;
        result = result * 31 + firstName.hashCode();
        result = result * 31 + lastName.hashCode();
        return result;
    }

}
