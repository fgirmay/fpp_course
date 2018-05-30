public class Prog5 {
    public static void main(String[] args) {
        int[][] additionMatrix = new int[4][4];
        displayAdditionForKids(additionMatrix);
    }

    public static void displayAdditionForKids(int[][] additionMatrix) {
        // Added 3 to count for additional lines to print for one new line and two dashes
        for (int i = 0; i < additionMatrix.length + 3; i++) {
            for (int j = 0; j < additionMatrix.length; j++) {

                if (i < 4 && i < 4) {
                    additionMatrix[i][j] = RandomNumbers.getRandomInt(1, 99);
                }

                if (i == 0) {
                    System.out.print("  " + additionMatrix[i][j] + "   ");
                }else if (i == 1) {
                    System.out.print("+ " + additionMatrix[i][j] + "   ");
                } else if (i == 2) {
                    System.out.print(" ---   ");
                }  else if (i == 3) {
                    System.out.println();
                } else if (i == 4) {
                    System.out.print("  " + additionMatrix[i - 2][j] + "   ");
                } else if (i == 5) {
                    System.out.print("+ " + additionMatrix[i - 3][j] + "   ");
                } else {
                    System.out.print(" ---   ");
                }                
                  
            }
            System.out.println();
        }
    }
}