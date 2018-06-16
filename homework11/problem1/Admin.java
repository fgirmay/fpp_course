package problem1;

/**
 * Created by fissehaye on 6/15/18.
 */
import java.util.*;
public class Admin {

    public static HashMap<Key, Student> processStudents(List<Student> students) {

        HashMap<Key, Student> hashMap = new HashMap<>();
        Key key = null;

        for (Student student : students) {
           key = new Key(student.getFirstName(), student.getLastName());
            hashMap.put(key, student);
        }

        return hashMap;
    }
}
