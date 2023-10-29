package week_09.Questions_09.exercise_09_03;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        Date date = new Date();
        long milliSeconds = 10000;
        for (long i = 0; i < 8; i++) {
            date.setTime(milliSeconds);
            System.out.println("For elapsed " + milliSeconds + " time is " + date.toString());
            milliSeconds *= 10;
        }
    }
}
