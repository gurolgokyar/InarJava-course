package week_13.assignments.Question_13_16;


import week_13.assignments.Question_13_14.Rational;

public class Question_13_16 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Invalid input format ! \nFormat: operand1 operator operand2");
            System.exit(1);
        }
        System.out.println("-------1");
        String[] number1 = args[0].split("/ ");
        String operator = args[1];
        String[] number2 = args[2].split("/ ");
        System.out.println(operator);

        if (number1[1].equals("0") || number2[1].equals("0")){
            System.out.println("Denominator can not be 0 !");
            System.exit(2);
        }
        System.out.println("-------2");
        display(number1);
        display(number2);

        Rational rational1 = new Rational(Long.parseLong(number1[0]),Long.parseLong(number1[1]));
        Rational rational2 = new Rational(Long.parseLong(number2[0]),Long.parseLong(number2[1]));

        String result = (operator.equals("+") ? rational1.add(rational2) : operator.equals("-") ?
                rational1.subtract(rational2) : operator.equals(".") ? rational1.multiply(rational2) :
                rational1.divide(rational2)).toString();

        System.out.println(args + " = " + result);
    }
    public static void display(String[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
