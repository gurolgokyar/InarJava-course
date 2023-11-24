package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        for (int column = 0; column < matrix[0].length; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix,column));
        }
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        System.out.println("Enter 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double sumColumn(double[][] m, int column) {
        double sum = 0;
        for (double[] doubles : m) {
            sum += doubles[column];
        }
        return sum;
    }

}
