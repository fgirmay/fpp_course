public class Proj1 {

    public static void main(String[] args){

        int randomNumber = RandomNumbers.getRandomInt(1, 9);
        double result1 = getPowersOfPI(randomNumber);
        double result2 = getExponentsOfPI(randomNumber);

        System.out.println("The random number is " + randomNumber);

        System.out.println("The power of " + randomNumber + " to the base PI is " + result1);
        System.out.println("The power of PI to the base " + randomNumber + " is " + result2);
    }

    public static double getPowersOfPI(int power){
        return Math.pow(Math.PI, power);
    }
     
    public static double getExponentsOfPI(int base){
        return Math.pow(base, Math.PI);
    }
}
