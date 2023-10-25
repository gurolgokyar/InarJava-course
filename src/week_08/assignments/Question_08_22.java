package week_08.assignments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        boolean isRow = isRow(matrix);
        boolean isColumn = isColumn(matrix);

        displayMatrix(matrix);

        System.out.println("Every row " + (isRow ? "" : "does not ") + "have an even number of 1s");
        System.out.println("Every column " + (isColumn ? "" : "does not ") + "have an even number of 1s");

    }

    public static int[][] generateRandomMatrix(){
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]  = (int)(Math.random()*2);
            }
        }
        return matrix;
    }

    public static boolean isRow(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int numberOf1s = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1){
                    numberOf1s++;
                }
            }
            if (numberOf1s % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isColumn(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            int numberOf0s = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1){
                    numberOf0s++;
                }
            }
            if (numberOf0s % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void displayMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
