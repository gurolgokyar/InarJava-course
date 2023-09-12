package week_05.working_area;

import java.util.Scanner;

public class CheckingPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String answer=input.nextLine();

        int frontLetter=0;
        int lastLetter=answer.length()-1;
        boolean isPalindrome=true;

        while (isPalindrome && (frontLetter<lastLetter)){
            char ch1=answer.charAt(frontLetter);
            char ch2=answer.charAt(lastLetter);

            if (ch1 != ch2){
                isPalindrome=false;
            }
            frontLetter++;
            lastLetter--;
        }

        //display the results
        System.out.println(answer + (isPalindrome?" is ":" is not ") + "a palindrome");

    }
}
