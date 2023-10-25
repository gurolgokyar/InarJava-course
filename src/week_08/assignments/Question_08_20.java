package week_08.assignments;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {
        letsPlay();
    }

    public static void letsPlay() {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        char[][] drills = new char[6][7];
        fillBlanks(drills);
        while (counter < 42) {
            displayDrills(drills);
            System.out.print("Drop a " + (counter % 2 == 0 ? "red" : "yellow") + " disk at column(0-6): ");
            int answer = input.nextInt();

            if (isAlreadyFiled(drills, answer, counter)) {
                System.out.println("The positions you entered is already entered!");
                continue;
            }
            placeTheAnswer(drills, answer, counter);

            if (isFinished(drills)) {
                System.out.println("The " + (counter % 2 == 0 ? "red" : "yellow") + " player won.");
                break; // To finish the game
            }
            counter++;
        }
    }

    public static void fillBlanks(char[][] drills) {
        for (int i = 0; i < drills.length; i++) {
            for (int j = 0; j < drills[0].length; j++) {
                drills[i][j] = ' ';
            }
        }
    }

    public static void displayDrills(char[][] drills) {
        for (char[] drill : drills) {
            for (int j = 0; j < drills[0].length; j++) {
                System.out.print("|" + drill[j]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public static boolean isAlreadyFiled(char[][] drills, int answer, int counter) {
        for (int i = 1; i <= drills.length; i++) {
            if (counter % 2 == 0 && drills[drills.length - i][answer] == 'Y') {
                return true;
            }
            if (counter % 2 == 1 && drills[drills.length - i][answer] == 'R') {
                return true;
            }
        }
        return false;
    }

    public static void placeTheAnswer(char[][] drills, int answer, int counter) {
        for (int i = drills.length - 1; i >= 0; i--) {
            if (drills[i][answer] == 'R' || drills[i][answer] == 'Y') {
                continue;
            }
            if (counter % 2 == 0) {
                drills[i][answer] = 'R';
            } else {
                drills[i][answer] = 'Y';
            }
            return;
        }
    }

    public static boolean isFinished(char[][] drills) {
        for (int i = 0; i < drills.length; i++) {
            for (int j = 0; j < drills[0].length; j++) {
                if (drills[i][j] == ' '){
                   continue;
                }
                if (isRow(drills, i, j) || isColumn(drills, i, j) || isDiagonal(drills, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isRow(char[][] drill, int row, int column) {
        if (column + 3 >= drill[0].length) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (drill[row][column] != drill[row][column + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isColumn(char[][] drill, int row, int column) {
        if (row + 3 >= drill.length) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (drill[row][column] != drill[row + i][column]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDiagonal(char[][] drill, int row, int column) {
        return isRight(drill, row, column) || isLeft(drill, row, column);
    }

    public static boolean isRight(char[][] drill, int row, int column) {
        if (row + 3 >= drill.length) {
            return false;
        }
        if (column + 3 >= drill[0].length) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (drill[row][column] != drill[row + i][column + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLeft(char[][] drill, int row, int column) {
        if (row - 3 < 0) {
            return false;
        }
        if (column + 3 == drill[0].length) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (drill[row][column] != drill[row - i][column + i]) {
                return false;
            }
        }
        return true;
    }
}
