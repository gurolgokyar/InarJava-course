package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String answer = input.nextLine();
        char letter = answer.charAt(0);

        if (answer.length()!=1 || ((letter<'A'||letter>'Z')&&(letter<'a' || letter>'z'))){
            System.out.println( answer +" is invalid input!");
            System.exit(1);
        }
        String output;
        if (letter=='A'||letter=='a' ||letter=='E'||letter=='e'||letter=='I'||
            letter=='i'||letter=='O'||letter=='o'||letter=='U'||letter=='u'){
            output="vowel";
        }else {
            output="consonant";
        }

        //Display the results
        System.out.println(letter +" is a " + output);
    }
}
