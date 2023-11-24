package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        char[][] letters = getInputs();
        System.out.println("The input array is " + (isLatinSquare(letters) ? "" : "not ") + "a Latin square");
    }

    public static char[][] getInputs() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();

        char[][] letters = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces: ");
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                char ch = Character.toUpperCase(input.next().charAt(0));
                if (ch >= 'A' + n) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + n - 1));
                    System.exit(1);
                }
                letters[i][j] = ch;
            }
        }
        return letters;
    }

    public static boolean isLatinSquare(char[][] letters){
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                if (!isSingle(letters,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSingle(char[][] array, int i, int j){
        return isRow(array, i, j) && isColumn(array, i, j);
    }

    public static boolean isRow(char[][] array,int row, int column){
        int counter = 0;
        for (int i = 0; i < array[0].length; i++) {
            if (array[row][i] == array[row][column]){
                counter++;
            }
        }
        return (counter <= 1);
    }

    public static boolean isColumn(char[][] array,int row, int column){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][column] == array[row][column]){
                counter++;
            }
        }
        return (counter <= 1);
    }
}
