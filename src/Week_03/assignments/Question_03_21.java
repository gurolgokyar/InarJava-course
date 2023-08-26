package Week_03.assignments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year (e.g.,2012) :");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12 :");
        int month = input.nextInt();

        System.out.println("Enter the day of the month: 1-31:");
        int day = input.nextInt();


        //Find the month , yearOfCentury and century to use in formula
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;


        int dayOfTheWeek = (day + (13 * (month + 1)) / 5 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;

        //find the day name
        String nameOfDay = switch (dayOfTheWeek) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "";
        };

        //Display the results
        System.out.println("Day of the week " + nameOfDay);

    }
}