package week_05.assignments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g.,2012): ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int numberOfTheDaysToAdd;
        for (int i = 1; i <= 12; i++) {
            //Firstly find the number of the days in the month
            if (i == 1) {
                numberOfTheDaysToAdd = 0;
            } else if (i == 3) {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    numberOfTheDaysToAdd = 29;
                } else {
                    numberOfTheDaysToAdd = 28;
                }
            } else if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11) {
                numberOfTheDaysToAdd = 31;
            } else {
                numberOfTheDaysToAdd = 30;
            }
            firstDay = (firstDay + numberOfTheDaysToAdd) % 7;


            String nameOfDay = switch (firstDay) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "";
            };

            String nameOfTheMonth = switch (i) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };

            //Display the results
            System.out.println(nameOfTheMonth + " 1, " + year + " is " + nameOfDay);

        }
    }
}
