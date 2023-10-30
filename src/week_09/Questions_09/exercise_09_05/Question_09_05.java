package week_09.Questions_09.exercise_09_05;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar();
        System.out.printf("Current year: %d\n" +
                "Current month: %d\n" +
                "Current day: %d\n", date1.get(GregorianCalendar.YEAR), date1.get(GregorianCalendar.MONTH),
                date1.get(GregorianCalendar.DAY_OF_MONTH));

        date1.setTimeInMillis(1234567898765L);
        System.out.printf("\nAfter setTime:\nCurrent year: %d\n" +
                        "Current month: %d\n" +
                        "Current day: %d\n", date1.get(GregorianCalendar.YEAR), date1.get(GregorianCalendar.MONTH),
                date1.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
