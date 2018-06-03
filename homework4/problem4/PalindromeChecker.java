package problem4;

/**
 * Created by fissehaye on 6/3/18.
 */
public class PalindromeChecker {

    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker();

        System.out.println(pc.isPalindrome("red rum sir is murder"));
        System.out.println(pc.isPalindrome("Step on no pets"));
        System.out.println(pc.isPalindrome("MaaM"));

    }

    public boolean isPalindrome(String string) {

        string = string.toUpperCase();

        //Base case 1
        if ("".equals(string)) {
            return true;
        }

        if (string.charAt(string.length() - 1) != string.charAt(0)) {
                return false;
        }

        if (string.length() == 1) { //Base case 2
            return true;
        } else if (string.length() == 2 && string.charAt(0) == string.charAt(1)) {
            return true;
        }

        // Small cases and upper cases are treated equal and spaces don't count
        string = string.substring(1, string.length() - 1).trim();

        return isPalindrome(string);
    }
}
