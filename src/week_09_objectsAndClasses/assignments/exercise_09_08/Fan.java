package week_09_objectsAndClasses.assignments.exercise_09_08;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 3){
            this.speed = FAST;
        } else if (speed == 2) {
            this.speed = MEDIUM;
        }else {
            this.speed = SLOW;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String s;
        if (on) {
            s = "Fan speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            s = "Fan color: " + this.color + ", radius: " + this.radius + " fan is off";
        }
        return s;
    }
}
