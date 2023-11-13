package week_06_methods.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t%s\n", "Year", "Days in year");

        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%d\t\t    %d\n", year, numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int numberOfDays = 0;
        for (int month = 1; month <= 12; month++) {
            if (month ==4 || month ==6 || month == 9 || month == 11){
                numberOfDays += 30;
            } else if (month == 2) {
                if (isLeapYear(year)){
                    numberOfDays += 29;
                }else {
                    numberOfDays += 28;
                }
            }else {
                numberOfDays += 31;
            }
        }
        return numberOfDays;
    }

    public static boolean isLeapYear(int year){
        return ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0));
    }
}
