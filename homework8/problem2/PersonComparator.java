package problem2;

import java.util.Comparator;

/**
 * Created by fissehaye on 6/11/18.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLast().compareTo(o2.getLast());
    }
}
