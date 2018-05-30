public class Prog2 {

    public static void main(String[] args){

        float variable1 = 1.27f;
        float variable2 = 3.881f;
        float variable3 = 9.6f;

        //The sum of the float is 14.751
        float floatSum = variable1 + variable2 + variable3;

        /*The sum of the floats as an integer, obtained by 
          casting the sum to type int is 14
        */
        int sum1 = (int)(floatSum);

        /*The sum of the floats as an integer, obtained by 
          rounding the sum to the nearest integer is 15
        */
        int sum2 = Math.round(floatSum);
        
        System.out.println("The sum of the floats is " + (floatSum));
        System.out.println("The sum of the floats is " + sum1);
        System.out.println("The sum of the floats is " + sum2);
    }

}