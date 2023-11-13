package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT :");
        int zone = input.nextInt();

        //firstly find the current time at GMT
        long milliseconds = System.currentTimeMillis();
        long totalSeconds = milliseconds/1000;

        long totalMinutes =totalSeconds/60 ;
        long currentSecond =  totalSeconds % 60 ;

        long totalHours = totalMinutes / 60 ;
        long currentMinute = totalMinutes % 60 ;

        //Add the time zone
        long currentHour = (totalHours + zone) % 24 ;

        //Display the results
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);



    }
    
}
