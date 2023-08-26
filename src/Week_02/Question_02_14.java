package week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds :");
        double weight = input.nextDouble() *0.45359237 ;

        System.out.println("Enter height in inches :");
        double height = input.nextDouble() * 0.0254 ;

        //Compute the body mass index
        double bmi = weight / Math.pow(height, 2) ;

        System.out.println("BMI is " + (int)(bmi*10000) / 10000.0);

    }
}
