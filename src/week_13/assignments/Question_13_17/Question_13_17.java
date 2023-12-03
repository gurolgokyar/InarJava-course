package week_13.assignments.Question_13_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {
       try {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the first complex number: ");
           Complex number1 = new Complex(input.nextDouble(), input.nextDouble());

           System.out.print("Enter the second complex number: ");
           Complex number2 = new Complex(input.nextDouble(), input.nextDouble());
           calculateMathApps(number1, number2);
       }catch (InputMismatchException exception){
           System.out.println("Invalid input!");
           System.exit(1);
       }
    }

    public static void calculateMathApps(Complex number1, Complex number2){
        System.out.println(number1 + " + " + number2 + " = " + number1.add(number2));
        System.out.println(number1 + " - " + number2 + " = " + number1.subtract(number2));
        System.out.println(number1 + " * " + number2 + " = " + number1.multiply(number2));
        System.out.println(number1 + " / " + number2 + " = " + number1.divide(number2));
        System.out.println("| " + number1 + " | = " + number1.abs());
    }
}
