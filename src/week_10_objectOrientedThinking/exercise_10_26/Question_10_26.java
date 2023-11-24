package week_10_objectOrientedThinking.exercise_10_26;

public class Question_10_26 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[2]);
        char operator = args[1].charAt(0);

        double result = switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '/' -> number1 / (number2 * 1.0);
            case '.' -> number1 * number2;
            default -> 0;
        };
        if (result == (int)result){
            System.out.println((int)result);
        }else {
            System.out.println(result);
        }

    }
}
