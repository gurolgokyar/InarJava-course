package week_06.assignments;

public class Question_06_24 {
    public static void main(String[] args) {
        printDateAndTime(System.currentTimeMillis());
    }

    public static void printDateAndTime(long milliSeconds) {
        printTime(milliSeconds);
        printDate(milliSeconds);
    }

    //Print the current time
    public static void printTime(long milliSeconds) {
        System.out.print(
                getCurrentHour(milliSeconds) + ":" +
                        getCurrentMinute(milliSeconds) + ":" +
                        getCurrentSecond(milliSeconds));
    }

    public static int getCurrentSecond(long milliSeconds) {
        return (int) (getTotalSeconds(milliSeconds) % 60);
    }

    public static long getTotalSeconds(long milliSeconds) {
        return milliSeconds / 1000;
    }

    public static int getCurrentMinute(long milliSeconds) {
        return getTotalMinute(milliSeconds) % 60;
    }

    public static int getTotalMinute(long milliSeconds) {
        return (int) (getTotalSeconds(milliSeconds) / 60);
    }

    public static int getCurrentHour(long milliSeconds) {
        return getTotalHour(milliSeconds) % 24;
    }

    public static int getTotalHour(long milliSeconds) {
        return getTotalMinute(milliSeconds) / 60 + 3;
    }

    //Print current date
    public static void printDate(long milliSeconds) {
        System.out.println(" " +
                getCurrentDay(milliSeconds) + " / " +
                        getCurrentMonth(milliSeconds) + " / " +
                        getCurrentYear(milliSeconds));
    }

    public static int getCurrentYear(long milliSeconds) {
        int totalDay = getTotalDay(milliSeconds);
        int year = 1970;
        while (totalDay >= getNumberOfDaysInTheYear(year)) {
            year++;
            totalDay -= getNumberOfDaysInTheYear(year);
        }
        return year;
    }

    public static int getTotalDay(long millisecond) {
        return getTotalHour(millisecond) / 24;
    }

    public static int getNumberOfDaysInTheYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getCurrentMonth(long milliSeconds) {
        int remainingDay = getRemainingDay(milliSeconds);
        int currentMonth = 1;
        while (remainingDay >= getNumberOfDaysInTheMonth(currentMonth, getCurrentYear(milliSeconds))) {
            remainingDay -= getNumberOfDaysInTheMonth(currentMonth, getCurrentYear(milliSeconds));
            currentMonth++;
        }
        return currentMonth;
    }

    public static int getRemainingDay(long milliSeconds) {
        int totalDay = getTotalDay(milliSeconds);
        int year = 1970;

        while (totalDay >= getNumberOfDaysInTheYear(year)) {
            totalDay -= getNumberOfDaysInTheYear(year);
            year++;
        }
        return totalDay;
    }

    public static int getNumberOfDaysInTheMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return (isLeapYear(year) ? 29 : 28);
        } else {
            return 31;
        }
    }

    public static int getCurrentDay(long milliSeconds) {
        int remainingDay = getRemainingDay(milliSeconds);
        int month = 1;
        int day = 1;

        while (remainingDay >= getNumberOfDaysInTheMonth(month, getCurrentYear(milliSeconds))) {
            remainingDay -= getNumberOfDaysInTheMonth(month, getCurrentYear(milliSeconds));
            month++;
        }

        return day + remainingDay;
    }


}
