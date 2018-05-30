public class Prog8 {

    public static void main(String[] args) {

        int[] input = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        int result = getMinimum(null);
        System.out.println("The result is " + result);
    }

    public static int getMinimum(int[] {

        int min = 0;
        if (input != null && input.length > 0) {
            min = input[0];
        } else {
            System.out.println("Input is invalid");
        }
        for (int i = 0; i < input.length; i++) {    
            if (min > input[i]) {
                min = input[i];
            }
        }
        return min;
    }
}