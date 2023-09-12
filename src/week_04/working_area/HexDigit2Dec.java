package week_04.working_area;

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit:");
        String hexDigit = input.next();

        if (hexDigit.length() != 1) {
            System.out.println("You must enter exactly one character:");
            System.exit(1);
        }
        char ch = hexDigit.charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + (ch - '0'));
        } else if ('A' <= ch && ch <= 'F') {
            System.out.println("The decimal value for hex digit " + ch + " is " + (ch - 'A' + 10));
        } else {
            System.out.println(ch + " is invalid input");
        }

    }
}
