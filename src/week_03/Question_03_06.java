package week_03;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Obtain the inputs
        System.out.print("Enter weight in pounds :");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter feet :");
        int feet = input.nextInt();

        System.out.println("Enter inches :");
        int inch = input.nextInt();

        //Find the BMI
        double weightInKilogram = weightInPounds * 0.45359237;
        double heightInMeters = (inch + feet * 12 ) *0.0254 ;
        double bmi = weightInKilogram / (heightInMeters * heightInMeters) ;
        System.out.println("BMI is " + bmi);

        //Find the interpretation
        if (bmi<18.5){
            System.out.println("Underweight");
        }
        else if (18.5<=bmi && bmi<25.0){
            System.out.println("Normal");
        }
        else if (25.0<=bmi && bmi<30.0){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }



    }

}
