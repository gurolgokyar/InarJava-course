package week_06.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String answer = input.nextLine();
        answer = answer.toUpperCase();

        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) <= 'Z' && answer.charAt(i) >= 'A') {
                System.out.print(getNumber(answer.charAt(i)));
            } else {
                System.out.print(answer.charAt(i));
            }
        }
    }

    public static int getNumber(char ch) {
        int number = 2;
        if (ch <= 'R') {
            number += (ch - 'A') / 3;
        } else if (ch == 'Z') {
            number += ('Z' - 'A' - 2) / 3;
        } else {
            number += (ch - 'A' - 1) / 3;
        }
        return number;
    }
}
