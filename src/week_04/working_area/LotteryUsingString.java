package week_04.working_area;
import java.util.Scanner;
public class LotteryUsingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

        System.out.print("Enter your lottery pick(two digits):");
        String guess = input.nextLine();

        if (guess.length()!=2){
            System.out.println("Your answer must be two digit");
            System.exit(1);
        }

        //Compare the lottery and guess
        System.out.println("The lottery is " + lottery);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match all digits: you win 3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                   guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1.000");
        }else {
            System.out.println("Sorry, no match");
        }


    }

}
