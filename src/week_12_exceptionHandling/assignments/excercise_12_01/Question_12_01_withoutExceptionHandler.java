package week_12_exceptionHandling.assignments.excercise_12_01;

public class Question_12_01_withoutExceptionHandler {
    public static void main(String[] args) {
        int number1 = getNumber(args[0]);
        int number2 = getNumber(args[2]);
        char ch = args[1].charAt(0);

        int result = switch (ch) {
            case '.' -> number1 * number2;
            case '/' -> number1 / number2;
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            default -> 0;
        };
        System.out.println( "" + number1 + ch + number2 + " = " + result);

    }
    public static int getNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                System.out.println("Wrong input : " + str);
                System.exit(1);
            }
        }
        return Integer.parseInt(str);
    }
}
