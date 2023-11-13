package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of minutes :");
        long minutes = input.nextLong();

        //Firstly find the number of years
        long years = minutes /(60*24*365) ;
        long remainingMinutes = minutes % (60*24*365);

        //now find the number of days that can t be a year
        int days = (int)remainingMinutes/(60*24);

        //Display the results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
