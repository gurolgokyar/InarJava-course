package week_12_exceptionHandling.assignments.excercise_12_01;

import java.util.InputMismatchException;

public class Question_12_01_withExceptionHandler {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("The format must be number1 operand number2");
            System.exit(1);
        }
        char ch = args[1].charAt(0);
        int number1 = getNumber(args[0]);
        int number2 = getNumber(args[2]);
        int result = switch (ch) {
            case '.' -> number1 * number2;
            case '/' -> number1 / number2;
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            default -> 0;
        };
        System.out.println( "" + number1 + ch + number2 + " = " + result);
    }

    public static int getNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            return number;
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + str);
            System.exit(1);
            return 0;
        }
    }
}
