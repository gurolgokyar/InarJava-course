package week_03;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT:");
        int zone = input.nextInt();

        long milliSeconds = System.currentTimeMillis();

        //Find the current time
        long totalSeconds = milliSeconds/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;

        long currentSecond = totalSeconds%60;
        long currentMinute = totalMinutes%60;
        long currentHour = (totalHours+zone)%24;

        if (currentHour>=12){
            if (currentHour>12){
                currentHour -= 12;
            }
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond +" PM");
        }
        else {
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond +" AM");
        }
    }

}
