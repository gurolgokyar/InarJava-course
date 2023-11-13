package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        fillTheMatrix(matrix);
        findRowsColumnDiagonalWithJust1s(matrix);
    }

    public static void fillTheMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void findRowsColumnDiagonalWithJust1s(int[][] matrix) {
        displayMatrix(matrix);
        displayRowsWithSameNumber(matrix);
        displayColumnWithSameNumber(matrix);
        displayMajorDiagonalStatus(matrix);
        displaySub_DiagonalStatus(matrix);
    }

    public static void displayColumnWithSameNumber(int[][] matrix) {
        boolean[] isSame = new boolean[matrix[0].length];
        int counter1 = 0;//To count the number of columns with 1s
        int counter2 = 0;//To count the number of column with 0s

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][i] != matrix[j + 1][i]) {
                    isSame[i] = false;
                    break;
                } else {
                    isSame[i] = true;
                }
            }
            if (isSame[i]) {
                if (matrix[0][i] == 1) {
                    counter1++;
                } else {
                    counter2++;
                }
            }
        }
        if (counter1 == 0 && counter2 == 0) {
            System.out.println("No same number on a column");
        }
        if (counter1 > 0) {
            System.out.print("All 1s on column -> ");
            for (int i = 0; i < isSame.length; i++) {
                if (isSame[i] && matrix[i][0] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        if (counter2 > 0) {
            System.out.print("All 0s on row -> ");
            for (int i = 0; i < isSame.length; i++) {
                if (isSame[i] && matrix[i][0] == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }

    public static void displayRowsWithSameNumber(int[][] matrix) {
        boolean[] isSame = new boolean[matrix.length];
        int counter1 = 0;//To count the number of rows with 1s
        int counter2 = 0;//To count the number of rows with 0s

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] != matrix[i][j + 1]) {
                    isSame[i] = false;
                    break;
                } else {
                    isSame[i] = true;
                }
            }
            if (isSame[i]) {
                if (matrix[i][0] == 1) {
                    counter1++;
                } else {
                    counter2++;
                }
            }
        }
        if (counter1 == 0 && counter2 == 0) {
            System.out.println("No same number on a row");
        }
        if (counter1 > 0) {
            System.out.print("All 1s on row -> ");
            for (int i = 0; i < isSame.length; i++) {
                if (isSame[i] && matrix[i][0] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        if (counter2 > 0) {
            System.out.print("All 0s on row -> ");
            for (int i = 0; i < isSame.length; i++) {
                if (isSame[i] && matrix[i][0] == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void displayMajorDiagonalStatus(int[][] matrix) {
        boolean isSame = true;
        for (int i = 0, j = 0; i < matrix.length - 1; i++, j++) {
            if (matrix[i][j] != matrix[i + 1][j + 1]) {
                isSame = false;
                break;
            }
        }
        //Display the results
        if (isSame) {
            if (matrix[0][0] == 1) {
                System.out.println("All 1s on major diagonal");
            } else {
                System.out.println("All 0s on major diagonal");
            }
        } else {
            System.out.println("No same number on major diagonal");
        }
    }

    public static void displaySub_DiagonalStatus(int[][] matrix) {
        boolean isSame = true;
        for (int i = 0, j = matrix[0].length - 1; i < matrix.length - 1; i++, j--) {
            if (matrix[i][j] != matrix[i + 1][j - 1]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            if (matrix[0][matrix[0].length - 1] == 1) {
                System.out.println("All 1s on sub-diagonal");
            } else {
                System.out.println("All 0s on sub-diagonal");
            }
        } else {
            System.out.println("No same number on sub-diagonal");
        }
    }
}
