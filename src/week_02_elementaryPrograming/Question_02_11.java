package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years :");
        int numberOfYears = input.nextInt();

        //Find the increment of population in a year
        double incrementOfPopulation = (1/7.0 - 1/13.0 + 1/45.0) * (365 * 24 * 60 *60) *numberOfYears;

        //the increment of the population can´t be double value
        //so cast it to an integer value
        int increment = (int)incrementOfPopulation ;

        int sumOfPopulation = 312_032_486 + increment ;
        System.out.println("The population in " + numberOfYears + " years is " + sumOfPopulation);

    }

}
