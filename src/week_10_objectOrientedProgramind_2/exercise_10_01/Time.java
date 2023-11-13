package week_10_objectOrientedProgramind_2.exercise_10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long milliseconds) {
        this.hour = getHour(milliseconds);
        this.minute = getMinute(milliseconds);
        this.second = getSecond(milliseconds);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(long milliseconds){
        return (int)(getTotalHour(milliseconds) % 24);
    }
    public long getTotalHour(long milliseconds){
        return getTotalMinutes(milliseconds) / 60 + 3;
    }

    public long getTotalMinutes(long milliseconds) {
        return getTotalSeconds(milliseconds) / 60;
    }

    public long getTotalSeconds(long milliseconds) {
        return milliseconds / 1000;
    }

    public int getMinute(long milliseconds) {
        return (int) (getTotalMinutes(milliseconds) % 60);
    }

    public int getSecond(long milliseconds) {
        return (int) (getTotalSeconds(milliseconds) % 60);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long milliseconds){
        this.hour = getHour(milliseconds);
        this.minute = getMinute(milliseconds);
        this.second = getSecond(milliseconds);
    }
    public String toString(){
        return getHour() + ":" + getMinute() + ":" + getSecond() + (getHour() >= 12 ? " PM" : " AM");
    }
}
