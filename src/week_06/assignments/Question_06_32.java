package week_06.assignments;

public class Question_06_32 {
    public static void main(String[] args) {
        int numberOfTheGames = 10000;
        printCraps(numberOfTheGames);
    }

    public static void printCraps(int numberOfGames) {
        int countWins = 0;
        for (int i = 0; i < numberOfGames; i++) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);

            int sum = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You win");
                countWins++;
            } else {
                System.out.println("point is " + sum);
                countWins += printWinnerAndGetCountWins(sum);
            }
            System.out.println();
        }
        System.out.println("The number of the winning games " + countWins);
    }

    public static int printWinnerAndGetCountWins(int sum) {
        int countWins = 0;

        while (true) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int point = dice1 + dice2;

            if (point == sum) {
                countWins++;
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                System.out.println("You win");
                return countWins;
            } else if (point == 7) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                System.out.println("You lose");
                return countWins;
            } else {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
            }
        }
    }
}