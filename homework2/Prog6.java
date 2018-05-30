import java.util.Arrays;

public class Prog6 {

    static int duplicateCounter = 0;
    static String[] result;

    public static void main(String[] args) {

        String[] input = {"horse", "dog", "cat", "horse","dog"};
        String[] result = removeDups(input);

        // Out is ["horse","dog","cat"]
        System.out.println(Arrays.toString(result));
    }

    public static String[] removeDups(String[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[i] == input[j]) {
                    input[i] = "";
                    duplicateCounter++;
                }
            }
        }

        return retrieveNonDuplicates(input);
    }

    private static String[] retrieveNonDuplicates(String[] source) {
        result = new String[source.length - duplicateCounter];
        System.out.println("Size of result is " + result.length);
        int emptyCounter = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != "") {
                result[i-emptyCounter] = source[i];
            } else {
                emptyCounter++;
            }
        }
        return result;
    }
}