package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by fissehaye on 6/18/18.
 */
public class ExceptionHandler {

    //get the input of mark in the range of 0 to 100

    public static void main(String[] args) {

        int mark = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter mark in the range of 0 to 100?");

        try {

            mark = scanner.nextInt();

            if (mark < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("The mark is " + mark);

        } catch (InputMismatchException ime) {

            System.out.println("You entered an invalid mark!");

        } catch (IllegalArgumentException iae) {

            System.out.println("Mark cannot be negative!");

        } finally {

            scanner.close();
        }

    }
}
