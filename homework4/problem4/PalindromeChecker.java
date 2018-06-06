package problem4;

/**
 * Created by fissehaye on 6/3/18.
 */
public class PalindromeChecker {

    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker();

        System.out.println(pc.isPalindrome("red rum sir is murder"));
        System.out.println(pc.isPalindrome("Step on no pets"));
        System.out.println(pc.isPalindrome("Maar"));

    }

    /*
        The method check if a string is palindrome ignoring cases and spaces. All other characters such as commas are not ignored.
        For example, "Ma,m" is not palindrome to "Mam because of the comma. But "Mam" is palindrome to "Ma m". If the input is
        empty or only with one character, I assumed that it's a palindrome.
     */
    public boolean isPalindrome(String string) {

        string = string.toUpperCase();

        if ("".equals(string)) {
            return true;
        }

        if (string.charAt(string.length() - 1) != string.charAt(0)) {
                return false;
        }

        if (string.length() == 1) {
            return true;
        } else if (string.length() == 2 && string.charAt(0) == string.charAt(1)) {
            return true;
        }

        // Small cases and upper cases are treated equal and spaces don't count
        string = string.substring(1, string.length() - 1).trim();

        return isPalindrome(string);
    }
}
