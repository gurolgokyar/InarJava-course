package week_10.exercise_09_01;

public class Time {
    private int hour;
    private int minute;
    private int second;
    Time(){
        long milliseconds = System.currentTimeMillis();
        this.hour = getHour(milliseconds);
        this.minute = getMinuts(milliseconds);
        this.getSecond = getSeconds(milliseconds);

    }
    public int getHour(long milliseconds){
        return (int)(getTotalHour(milliseconds) % 24);
    }
    public long getTotalHour(long milliseconds){
        return getTotalMinutes(milliseconds) / 60;
    }
}
