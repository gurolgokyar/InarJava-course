package week_06.assignments;

public class Question_06_33 {
    public static void main(String[] args) {
        findDateAndTime(System.currentTimeMillis());
    }

    public static void findDateAndTime(long milliSeconds) {
        findDate(milliSeconds);
        findTime(milliSeconds);
    }

    public static void findDate(long milliSeconds) {
        int year = findCurrentYear(milliSeconds);
        String monthName = findCurrentMonthName(milliSeconds);
        int day = findCurrentDay(milliSeconds);

        System.out.print(monthName + " " + day + ", " + year + " ");
    }

    public static int findCurrentYear(long milliSeconds) {
        int totalDay = findTotalDay(milliSeconds);
        int year = 1970;
        while (totalDay >= findNumberOfDaysInYear(year)) {
            year++;
            totalDay -= findNumberOfDaysInYear(year);
        }
        return year;
    }

    public static int findTotalDay(long milliSeconds) {
        return findTotalHour(milliSeconds) / 24;
    }

    public static int findNumberOfDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static String findCurrentMonthName(long milliSeconds) {
        int month = findCurrentMonth(milliSeconds);
        String monthName = switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> "";
        };
        return monthName;
    }

    public static int findCurrentMonth(long milliSeconds) {
        int month = 1;
        int remainingDay = findRemainingDayAfterYearPassed(findTotalDay(milliSeconds));

        while (remainingDay >= findNumberOfDaysInMonth(month, milliSeconds)) {
            remainingDay -= findNumberOfDaysInMonth(month, milliSeconds);
            month++;
        }
        return month;
    }

    public static int findRemainingDayAfterYearPassed(int totalDay) {
        int year = 1970;
        while (totalDay >= findNumberOfDaysInYear(year)) {
            totalDay -= findNumberOfDaysInYear(year);
            year++;
        }
        return totalDay;
    }

    public static int findNumberOfDaysInMonth(int month, long milliSeconds) {
        int currentYear = findCurrentYear(milliSeconds);
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(currentYear) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static int findCurrentDay(long milliSeconds) {
        int remainingDay = findRemainingDayAfterYearPassed(findTotalDay(milliSeconds));
        int currentYear = findCurrentYear(milliSeconds);
        int month = 1;
        int day = 1;

        while (remainingDay >= findNumberOfDaysInMonth(month, currentYear)) {
            remainingDay -= findNumberOfDaysInMonth(month, milliSeconds);
            month++;
        }
        return day + remainingDay;
    }
    public static void findTime(long milliSeconds) {
        int hour = findCurrentHour(milliSeconds);
        int second = findCurrentSecond(milliSeconds);
        int minute = findCurrentMinute(milliSeconds);

        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static int findCurrentHour(long milliSeconds) {
        return findTotalHour(milliSeconds) % 24;
    }

    public static int findTotalHour(long milliseconds) {
        return (int) (findTotalMinute(milliseconds) / 60) + 3;
    }

    public static long findTotalMinute(long milliSeconds) {
        return findTotalSeconds(milliSeconds) / 60;
    }

    public static long findTotalSeconds(long milliseconds) {
        return milliseconds / 1000;
    }

    public static int findCurrentSecond(long milliSeconds) {
        return (int) (findTotalMinute(milliSeconds) % 60);
    }

    public static int findCurrentMinute(long milliSecond) {
        return (int) (findTotalMinute(milliSecond) % 60);
    }

}
