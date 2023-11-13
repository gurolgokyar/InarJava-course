package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String answer = input.nextLine();

        int numberOfVowels = 0;
        int numberOfConsonant = 0;

        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
                ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' ){
                numberOfVowels++;
            }else if (ch!=' '){
                numberOfConsonant++;
            }
        }

        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonant is " + numberOfConsonant);
    }
}
