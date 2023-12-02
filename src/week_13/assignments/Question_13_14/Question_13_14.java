package week_13.assignments.Question_13_14;

public class Question_13_14 {
    public static void main(String[] args) {
        Rational rational1 = new Rational(2, 1);
        Rational rational2 = new Rational(2, 3);

        System.out.println(rational1 + " + " + rational2  + " = " + rational1.add(rational2));
        System.out.println(rational1 + " - " + rational2  + " = " + rational1.subtract(rational2));
        System.out.println(rational1 + " * " + rational2  + " = " + rational1.multiply(rational2));
        System.out.println(rational1 + " / " + rational2  + " = " + rational1.divide(rational2));
        System.out.println(rational2 + " is " + rational2.doubleValue());
    }
}
