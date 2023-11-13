package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilogram :");
        double waterAmount = input.nextDouble();

        System.out.println("Enter the initial temperature :");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature :");
        double finalTemperature = input.nextDouble();

        //Find the energy needed
        double energyNeeded = waterAmount*(finalTemperature-initialTemperature) * 4184 ;

        System.out.println("The energy needed is " + energyNeeded);


    }
}
