package week_03.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F :");
        double fahrenheit = input.nextDouble();
        if(-58>fahrenheit||fahrenheit>=41) {
            System.out.println("The temperature is invalid");
            System.exit(1);
        }


        System.out.println("Enter the wind speed (>=2) in miles per hour :");
        double windSpeed = input.nextDouble();
        if(windSpeed<2) {
            System.out.println("The wind speed is invalid");
            System.exit(2);
        }

        //Find the wind chill
        double windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed,0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed,0.16);

        //Display the results
        System.out.println("The wind chill index is " + windChill);
    }

}
