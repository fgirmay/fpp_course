package problem1;

/**
 * Created by fissehaye on 6/1/18.
 */

//Using recursive approach merge two sorted string into a single sorted string.
//Note : Your input should be a sorted input string. Example : String1 = “ ace ”
//String2 = “ bdf ”
//Output : “ abcdef ”

public class StringMerger {

    StringBuilder result = new StringBuilder();

    public static void main(String[] args) {

        System.out.println(new StringMerger().mergeStrings("adfxyz", "bcemno"));
        System.out.println(new StringMerger().mergeStrings("aeefhissy", "aahksy"));


    }

    public String mergeStrings(String input1, String input2) {

        if (input1 == null && input2 == null) {
            return "Error: Invalid input";
        } else if (input1 == null && input2 != null) {
            return input2;
        } else if (input2 == null && input2 != null) {
            return input1;
        } else if (input1.length() == 0 && input2.length() > 0) {
            return result.append(input2).toString();
        } else if (input1.length() > 0 && input2.length() == 0) {
            return result.append(input1).toString();
        } else if (input1.length() > 0 && input2.length() > 0) {
            if (input1.compareTo(input2) < 0) {
                result.append(input1.charAt(0));
                input1 = input1.substring(1);
            } else {
                result.append(input2.charAt(0));
                input2 = input2.substring(1);
            }
            mergeStrings(input1, input2);
        }

        return result.toString();
    }

}
