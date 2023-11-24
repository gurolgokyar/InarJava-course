package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        int[] largestBlock = findLargestBlock(matrix);
        displayLargestBlock(largestBlock,matrix);
    }

    public static int[][] getMatrix(){
        System.out.println("Enter the number of rows in the matrix: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[][] matrix = new int[number][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        return matrix;
    }

    public static int[] findLargestBlock(int[][] matrix){
        int[] block = new  int[3];
        int size = 2;
        int row;
        int column;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                row = i;
                column = j;
               if (isBlock(size,row,column,matrix) && size > block[2]){
                  block[0] = i;
                  block[1] = j;
                  block[2] = size;
                   j--;
                  size++;
               }else if (isBlock(size,row,column,matrix)){
                   j--;
                   size++;
               }else {
                   size = 2;
               }
            }
        }
        return block;
    }

    public static boolean isBlock(int size, int row, int column, int[][] matrix){
        if (size + row > matrix.length || size + column > matrix.length){
            return false;
        }
        int counter1 = 0;
        for (int i = row; i < matrix.length && counter1 < size; i++) {
            int counter2 = 0;
            for (int j = column; j < matrix[0].length && counter2 < size; j++) {
                if (matrix[i][j] != 1){
                    return false;
                }
                counter2++;
            }
            counter1++;
        }
        return true;
    }

    public static void displayLargestBlock(int[] largestBlock,int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (largestBlock[2] == 0){
            System.out.println("There isn't sub-matrix");
        }else {
            System.out.printf("The maximum square sub-matrix is at (%d, %d) with size %d\n",largestBlock[0],
                    largestBlock[1],largestBlock[2]);
        }
    }
}
