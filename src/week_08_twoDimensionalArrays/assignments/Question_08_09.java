package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        char[][] game = new char[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = ' ';
            }
        }
        Scanner input = new Scanner(System.in);
        int counter = 0; // for which player is playing

        while (!isGameFinished(game) && counter < 9) {
            System.out.print("Enter a row(0, 1, or 2) for player " + (counter % 2 == 0 ? "X: " : "O: "));
            int row = input.nextInt();
            if (!isInputAvailable(row)) {
                System.out.println("Invalid input!");
                continue;
            }
            System.out.print("Enter a column(0, 1, or 2) for player " + (counter % 2 == 0 ? "X:" : "O:"));
            int column = input.nextInt();
            if (!isInputAvailable(column)) {
                System.out.println("Invalid input!");
                continue;
            }
            if (game[row][column] != 'X' && game[row][column] != 'O') {
                if (counter % 2 == 0) {
                    game[row][column] = 'X';
                } else {
                    game[row][column] = 'O';
                }
            } else {
                System.out.println("the position you entered is already entered");
                continue;
            }
            counter++;

            //Display the result
            displayGame(game);
        }
        if (counter == 9) {
            System.out.println("The game is finished.Anybody won");
        }
    }

    public static void displayGame(char[][] game) {
        for (int i = 0; i < game.length; i++) {
            System.out.println("---------------");
            for (int j = 0; j < game[0].length; j++) {
                System.out.print("| " + game[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public static boolean isInputAvailable(int answer) {
        return (answer >= 0 && answer <= 2);
    }

    public static boolean isGameFinished(char[][] game) {
        return (isColumn(game) || isRow(game) || isDiagonal(game));
    }

    public static boolean isColumn(char[][] game) {
        for (int i = 0; i < game.length; i++) {
            int numberOf_X = 0;
            int numberOf_O = 0;
            for (int j = 0; j < game[0].length; j++) {
                if (game[j][i] == 'X') {
                    numberOf_X++;
                    if (numberOf_X == 3) {
                        System.out.println("X player won");
                        return true;
                    }
                    if (game[j][i] == 'O') {
                        numberOf_O++;
                        if (numberOf_O == 3) {
                            System.out.println("o player won");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isDiagonal(char[][] game) {
        int numberOf_X = 0;
        int numberOf_O = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i][i] == 'X') {
                numberOf_X++;
                if (numberOf_X == 3) {
                    System.out.println("X player won");
                    return true;
                }
            }
            if (game[i][i] == 'O') {
                numberOf_O++;
                if (numberOf_O == 3) {
                    System.out.println("O player won");
                    return true;
                }
            }
        }
        numberOf_X = 0;
        numberOf_O = 0;
        for (int j = 2, l = 0; j >= 0; j--, l++) {
            if (game[l][j] == 'X') {
                numberOf_X++;
                if (numberOf_X == 3) {
                    System.out.println("X player won");
                    return true;
                }
            }
            if (game[l][j] == 'O') {
                numberOf_O++;
                if (numberOf_O == 3) {
                    System.out.println("X player won");
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isRow(char[][] game) {
        for (int i = 0; i < game.length; i++) {
            int numberOf_X = 0;
            int numberOf_O = 0;
            for (int j = 0; j < game[0].length; j++) {
                if (game[i][j] == 'X') {
                    numberOf_X++;
                    if (numberOf_X == 3) {
                        System.out.println("X player won");
                        return true;
                    }
                }
                if (game[i][j] == 'O') {
                    numberOf_O++;
                    if (numberOf_O == 3) {
                        System.out.println("o player won");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
