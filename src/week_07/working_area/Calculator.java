package week_07.working_area;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        double result = switch (args[1].charAt(0)) {
            case '+' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '-' -> Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
            case '.' -> Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
            case '/' -> Double.parseDouble(args[0]) / Double.parseDouble(args[2]);
            default -> 0;
        };
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
