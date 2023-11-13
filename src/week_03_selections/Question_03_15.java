package week_03_selections;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lottery = (int) (Math.random() * 1000);

        System.out.print("Enter your lottery pick (three digits) : ");
        int guess = input.nextInt();

        if (9 < lottery && lottery < 100)
            System.out.println("The lottery number is 0" + lottery);
        else if (lottery < 10) {
            System.out.println("The lottery number is 00" + lottery);
        } else
            System.out.println("The lottery number is " + lottery);

        //Obtain thr digits of the guess and lottery
        int lotteryDigit1 = lottery % 10;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery / 100;

        int guessDigit1 = guess % 10;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess / 100;

        if (lottery == guess)
            System.out.println("Exact mach ! You win $10.000 ");
        else if ((lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2) ||
                (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3) ||
                (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1) ||
                (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1) ||
                (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)) {
            System.out.println("Mach all digits ! You win $3.000");
        } else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 ||
                lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 ||
                lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3 ) {
            System.out.println("Matched one number !!! You win $1.000 ");
        } else {
            System.out.println("Sorry no match");
        }
    }
}