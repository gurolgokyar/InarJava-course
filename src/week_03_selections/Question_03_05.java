package week_03_selections;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today´s day :");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today :");
        int elapsedDay = input.nextInt();

        //Find the future day
        int futureDay = (today + elapsedDay) % 7 ;
        switch (futureDay) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }
}
