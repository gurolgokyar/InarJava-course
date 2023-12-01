package week_13.assignments.Question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question_13_04 {
    public static void main(String[] args) {
//        if (args.length != 2){
//            System.out.println("Invalid input! \nThe format: month(in integer) Year(in integer).");
//            System.exit(1);
//        }
        int year = 2016;//Integer.parseInt(args[1]);
        int month = 4;//Integer.parseInt(args[0]);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDay = calendar.get(Calendar.DAY_OF_WEEK) -1;
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        displayTheMonth(year,month,numberOfDays, firstDay);
    }

    public static void displayTheMonth(int year,int month, int numberOfDays, int firstDay){
        System.out.printf("%10s%s, %d\n"," ",getMonthName(month),year);
        System.out.println("---------------------------------");
        System.out.printf("%s  %s  %s  %s  %s  %s  %s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        for (int i = 1; i <= numberOfDays; i++) {
            displayBlanks(firstDay);
            System.out.printf("%3d%2s",i," ");
            if ((firstDay + i) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month){
        String[] monthNames ={"January", "February", "March","April","May","June","July","August","September",
                "October", "November", "December"};
        return monthNames[month];
    }

    public static void displayBlanks(int firstDay){
        for (int i = 1; i < firstDay; i++) {
            System.out.printf("%3s  "," ");
        }
    }
}
