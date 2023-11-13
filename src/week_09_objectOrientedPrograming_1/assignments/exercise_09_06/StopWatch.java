package week_09_objectOrientedPrograming_1.assignments.exercise_09_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
       this.startTime = System.currentTimeMillis();
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    long getStartTime() {
        return startTime;
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    long getEndTime() {
        return endTime;
    }
    long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
