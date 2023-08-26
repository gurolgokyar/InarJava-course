package Week_03.assignments;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as an integer : ");
        int month = input.nextInt();

        System.out.println("Enter the year as an integer : ");
        int year = input.nextInt();

        //Find the number of the day in the month
        int numberOfDay ;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            numberOfDay = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            numberOfDay = 30 ;
        else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                numberOfDay = 29;
            else
                numberOfDay = 28;

        }
        String nameOfMonth = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August ";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };

        //Display the results
        System.out.println(nameOfMonth + " " + year +" had " + numberOfDay + " days");
    }
}
