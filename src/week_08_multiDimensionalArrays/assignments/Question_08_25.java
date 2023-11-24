package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        System.out.println("It is " + (isMarkovMatrix(matrix) ? "" : "not ") + "a markov matrix");
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static boolean isMarkovMatrix(double[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] <= 0){
                    return false;
                }
                sum += matrix[j][i];
            }
            if (sum != 1){
                return false;
            }
        }
        return true;
    }
}
