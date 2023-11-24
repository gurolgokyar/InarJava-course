package week_04_mathFunctions_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        char character1 = ssn.charAt(0);
        char character2 = ssn.charAt(1);
        char character3 = ssn.charAt(2);
        char character4 = ssn.charAt(3);
        char character5 = ssn.charAt(4);
        char character6 = ssn.charAt(5);
        char character7 = ssn.charAt(6);
        char character8 = ssn.charAt(7);
        char character9 = ssn.charAt(8);
        char character10 = ssn.charAt(9);
        char character11 = ssn.charAt(10);

        if ((character4 != '-' && character7 != '-') && (Character.isDigit(character1) && Character.isDigit(character2) && Character.isDigit(character3)
                && Character.isDigit(character5) && Character.isDigit(character6) && Character.isDigit(character8)
                && Character.isDigit(character9) && Character.isDigit(character10) && Character.isDigit(character11))) {
            System.out.println(ssn + " is an invalid social security number");
        } else {
            System.out.println(ssn + " is a valid social security number");
        }

    }
}
