package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliSeconds: ");
        long milliSeconds = input.nextLong();

        printTime(milliSeconds);
    }
    public static void printTime(long milliSeconds){
        int second = getSecond(milliSeconds);
        int minute = getMinute(milliSeconds);
        int hour = getHour(milliSeconds);
        String isAm = (hour >= 12 ? " PM" : " AM");

        System.out.println("hours:minutes:seconds-> " + hour + ":" + minute + ":" + second + isAm);
    }
    public  static int getSecond(long milliSeconds){
        return (int)(getTotalSeconds(milliSeconds) % 60);
    }
    public static long getTotalSeconds(long milliSeconds){
        return milliSeconds / 1000;
    }
    public static int getMinute(long milliSeconds){
        return getTotalMinute(milliSeconds) % 60;
    }
    public static int getTotalMinute(long milliSeconds){
        return (int)(getTotalSeconds(milliSeconds) / 60);
    }
    public static int getHour(long milliSeconds){
        return getTotalHour(milliSeconds) % 24;
    }
    public static int getTotalHour(long milliSeconds){
        return getTotalMinute(milliSeconds) / 60 + 3;
    }
}
