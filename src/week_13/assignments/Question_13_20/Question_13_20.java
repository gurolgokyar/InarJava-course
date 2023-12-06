package week_13.assignments.Question_13_20;

import week_13.assignments.Question_13_17.Complex;

import java.util.Map;
import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c --> ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = getDiscriminant(a, b, c);

        findRoots(discriminant, a, b);
    }

    public static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void findRoots(double discriminant, double a, double b){
        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root1 = %1.4f and Root2 = %1.4f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root is %1.4f\n", root);
        }else {
            Complex root1 = new Complex(-b / 2 * a, Math.sqrt(Math.abs(discriminant)) / (2 * a));
            Complex root2 = new Complex(-b/ (2 * a), -  Math.sqrt(Math.abs(discriminant)) / (2 * a));
            System.out.printf("Root1 = %1.4f and Root2 = %1.4f\n", root1, root2);
        }
    }

}
