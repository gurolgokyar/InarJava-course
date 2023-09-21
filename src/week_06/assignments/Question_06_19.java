package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1,side2,side3)){
            double area = area(side1,side2,side3);
            System.out.println("The area of the triangle is " + area);
        }else {
            System.out.println("Invalid input!");
        }
    }

    public static boolean isValid(double s1, double s2, double s3){
        return (s1 < (s2 + s3) || s2 < (s1 + s3) || s3 < (s2 + s1));
    }

    public static double area(double s1, double s2, double s3){
        double s = (s1 + s2 + s3) / 2;
        return Math.pow(s * (s -s1) * (s -s2) * (s - s3),0.5);
    }
}
