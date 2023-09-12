package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        for (int i = 1; i <= 12; i++) {

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

            System.out.printf("%12s%s " + year + "\n", " ", nameOfTheMonth);

            for (int j = 0; j <= 38; j++) {
                System.out.print("-");
            }
            System.out.printf("\n%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            firstDay %= 7;
            for (int j = 0; j < firstDay; j++) {
                System.out.printf("%6s", " ");
            }

            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                for (int j = 1; j <= 31; j++, firstDay++) {
                    if (( firstDay + 1) % 7 == 0) {
                        System.out.printf("%2d\n", j);
                    } else {
                        System.out.printf("%2d%4s", j, " ");
                    }
                }
            } else if (i == 2) {
                int numberOfDays;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                for (int j = 1; j <= numberOfDays; j++, firstDay++) {
                    if ((firstDay + 1) % 7 == 0) {
                        System.out.printf("%2d\n", j);
                    } else {
                        System.out.printf("%2d%4s", j, " ");
                    }
                }
            } else {
                for (int j = 1; j <= 30; j++, firstDay++) {
                    if (( firstDay + 1) % 7 == 0) {
                        System.out.printf("%2d\n", j);
                    } else {
                        System.out.printf("%2d%4s", j, " ");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
