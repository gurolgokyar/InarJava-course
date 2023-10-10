package week_07.assignment;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] coefficients = new double[3];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = input.nextDouble();
        }

        double[] roots = new double[2];
        int numberOfRealRoots = solveQuadratic(coefficients,roots);

        //Display the roots
        displayRoots(roots,numberOfRealRoots);
    }
    public static int solveQuadratic(double[] coefficient, double[] roots){
        //Firstly find the discriminant
        double discriminant = getDiscriminant(coefficient);

        //Now find the roots
        int numberOfRealRoots = 0;
        if (discriminant < 0){
            return numberOfRealRoots;
        }else if (discriminant == 0){
            roots[0] = -coefficient[1] / (2 * coefficient[0]);
            return ++numberOfRealRoots;
        }else {
            roots[0] = (-coefficient[1] + Math.pow(discriminant, 0.5)) / (2 * coefficient[0]);
            roots[1] = (-coefficient[1] - Math.pow(discriminant,0.5)) / (2 * coefficient[0]);
            return (numberOfRealRoots + 2);
        }
    }
    public static double getDiscriminant(double[] coefficient){
        return Math.pow(coefficient[1],2) - 4 * coefficient[0] * coefficient[2];
    }

    public static void displayRoots(double[] roots, int numberOfRealRoots){
        System.out.println(numberOfRealRoots > 0 ?"The number of the real roots: " + numberOfRealRoots + "\nThe root" +
                "(s) of equation: " : "The equation has no real root.");
        for (int i = 0; i < numberOfRealRoots; i++) {
            System.out.print(roots[i] + " ");
        }
    }
}
