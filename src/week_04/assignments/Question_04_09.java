package week_04.assignments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String s = input.next();

        if (s.length()>1){
            System.out.println("Incorrect input!");
            System.exit(1);
        }
        char ch = s.charAt(0);
        int unicode = ch;

        System.out.println("The unicode for the character " + s + " is " + unicode);

    }

}
