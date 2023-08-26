package week_02;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon:");
        double milePerGallon = input.nextDouble();

        System.out.println("Enter price per gallon:");
        double pricePerGallon = input.nextDouble();

        //Now find the cost of the trip
        double cost = distance / milePerGallon * pricePerGallon ;

        System.out.println("The cost of driving is $" + (int)(cost * 100) /100.0);

    }
}
