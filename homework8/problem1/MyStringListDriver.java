package problem1;

import java.util.Arrays;

/**
 * Created by fissehaye on 6/18/18.
 */
public class MyStringListDriver {

    public static void main(String[] args) {
        MyStringList msl = new MyStringList();

        msl.add("Monday");
        msl.add("Tuesday");
        msl.add("Wednesdasy");

        System.out.println("The size of the list is " + msl.size());

        msl.insert("Thursday", msl.size());

    }
}
