package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code : ");
        int asciiCode = input.nextInt();

        if (0>=asciiCode || asciiCode>=127){
            System.out.println("Invalid input!");
            System.exit(1);
        }
        char ch =  (char)asciiCode;

        System.out.println("The character for ASCII code " + asciiCode + " is " + ch);

    }
}
