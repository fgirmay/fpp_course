
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog7 {

    static int inputLength = 0;
    static int aCounter = 0;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        inputLength = getInputStringLengthCounter(input);
        aCounter = countStartingWithA(input);

        System.out.println("The input length is " + inputLength);
        System.out.println("The counter of string which start with A is " + aCounter);
    }

    public static int getInputStringLengthCounter(String input) {

        String[] inputArray = input.split(" ");
        return inputArray.length;
    }

    public static int countStartingWithA(String input) {
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].charAt(0) == 'A') {
                aCounter++;
            }
        }

        return aCounter;
    }
}