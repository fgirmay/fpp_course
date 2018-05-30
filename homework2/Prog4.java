import java.util.Scanner;

public class Prog4 {

    public static void main(String[] args) {

        System.out.println("Enter the string to be in reverse order:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}