package week_10.exercise_10_14;

import week_06.assignments.Question_06_24;

import java.util.GregorianCalendar;

public class MyDate {
    private int year = 1970;
    private int month = 0;
    private int day = 1;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long milliSeconds) {
       setDate(milliSeconds);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return ((month + 1) < 10 ? "0" + (month + 1) : "" + (month + 1));
    }

    public String getDay() {
        return day < 10 ? "0" + day : "" + day;
    }
    public void setDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        year = gregorianCalendar.get(GregorianCalendar.YEAR);
        month = gregorianCalendar.get(GregorianCalendar.MONTH);
        day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public String toString(){
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
