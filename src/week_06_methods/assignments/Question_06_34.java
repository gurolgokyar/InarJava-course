package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }
    public static void printMonth(int year, int month) {
        //Firstly find first day of the month
        int firstDay = getFirstDay(year, month);

        //find the month name
        String monthName = Question_06_33.findCurrentMonthName(month);

        printCalenderTitle(year, monthName);
        printCalenderBody(month, firstDay, year);
    }
    public static void printCalenderTitle(int year, String monthName) {
        System.out.printf("%5s%s\t%d\n", " ", monthName, year);
        for (int i = 0; i < 28; i++) {
            System.out.print("-");
        }
        System.out.printf("\n%3s\t%3s\t%3s\t%3s\t%3s\t%3s\t%3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri",
                "Sat");
    }

    public static int getFirstDay(int year, int month) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int day = (1 + 13 * (month + 1) / 5 + (year % 100) / 4 + year / 400 + 5 * year / 100) % 7;
        return (day + 6) % 7; //Day for regular calender
    }
    public static void printCalenderBody(int month, int firstDay,int year){
        for (int i = 0; i < firstDay; i++){
            System.out.printf("%3s\t"," ");
        }
        for (int i = 1; i <= getNumberOfDaysInMonth(month,year); i++){
            System.out.printf("%-3d\t",i);
            if ((firstDay + i) % 7 == 0){
                System.out.println();
            }
        }
    }
    public static int getNumberOfDaysInMonth(int month,int year){
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        } else if (month == 2){
            return Question_06_33.isLeapYear(year) ? 29 : 28;
        }else {
            return 31;
        }
    }
}
