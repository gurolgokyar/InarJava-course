package Week_03.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as an integer :");
        int firstNine = input.nextInt();

        //Now find the ninth digit and others
        int digit9 = firstNine % 10 ;
        int remainingDegits = firstNine / 10;

        int digit8 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit7 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit6 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit5 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit4 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit3 = remainingDegits%10;
        remainingDegits = remainingDegits/10;

        int digit2 = remainingDegits%10;

        //Find the tenth digit
        int digit10 = (digit2*2 + digit3*3 + digit4*4 + digit5*5 + digit6*6
                + digit7*7 + digit8*8 + digit9*9) % 11;
        //Display the results
        System.out.println("The ISBN-10 number is 0"+ firstNine + ((digit10==10) ? "x" :digit10));
    }

}
