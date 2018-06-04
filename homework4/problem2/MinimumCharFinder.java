package problem2;

/**
 * Created by fissehaye on 6/2/18.
 */
public class MinimumCharFinder {

    char minimumCharacter;

    public static void main(String[] args) {

        MinimumCharFinder mcf = new MinimumCharFinder();
        String input = "fissehaye";
        char c = mcf.getMinimumChar(input);

        System.out.println("The minimum character from the input " + input + " is " + c);

    }

    /*
        It is assumed that cases are not ignored. For example, Z is smaller than a.
     */
    public char getMinimumChar(String str) {
        minimumCharacter = str.charAt(0);
        return getMinimumChar(str, str.charAt(0));
    }

    private char getMinimumChar(String str, char c) {
        //minimumCharacter = c;
        if (str.length() == 0) {
            return minimumCharacter;
        } else {
            if (minimumCharacter > str.charAt(0)) {
                minimumCharacter = str.charAt(0);
            }
            str = str.substring(1);
            getMinimumChar(str, minimumCharacter);
        }
        return minimumCharacter;
    }
}
