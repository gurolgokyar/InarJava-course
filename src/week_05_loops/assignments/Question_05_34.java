package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerWins = 0;
        int userWins = 0;

        while (Math.abs(computerWins - userWins) < 3) {
            System.out.print("Enter a number for scissor(0), rock(1), paper(2): ");
            int user = input.nextInt();

            if (user < 0 || user > 2) {
                System.out.println("Invalid input!");
                continue;
            }
            int computer = (int) (Math.random() * 3);

            String userIs = switch (user) {
                case 0 -> "scissor";
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "";
            };
            String computerIs = switch (computer) {
                case 0 -> "scissor";
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "";
            };

            if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
                userWins++;
                System.out.println("The computer is " + computerIs + ". You are " + userIs + ". You won");
                System.out.println("  Computer wins: " + computerWins + "\n  User wins: " + userWins + "\n");
            } else if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
                computerWins++;
                System.out.println("The computer is " + computerIs + ". You are " + userIs + ". You lose");
                System.out.println("  Computer wins: " + computerWins + "\n  User wins: " + userWins + "\n");
            } else {
                System.out.println("The computer is " + computerIs + ". You are " + userIs + ". It is a draw");
                System.out.println("  Computer wins: " + computerWins + "\n  User wins: " + userWins + "\n");
            }
        }

        //Display the final result
        System.out.println("Final result is "+((userWins >computerWins)?"congratulations!"+
            " "+"You won":"computer won. Try again"));
    }
}