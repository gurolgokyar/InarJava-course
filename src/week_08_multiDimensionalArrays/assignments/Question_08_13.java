package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        int[] indices = getIndices(matrix);
        System.out.printf("The location of the largest element is at (%d, %d)\n",indices[0],indices[1]);
    }

    public static int[] getIndices(double[][] matrix) {
        int row = 0;
        int column = 0;
        double maxElement = matrix[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new int[]{row,column};
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and column of the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
}
