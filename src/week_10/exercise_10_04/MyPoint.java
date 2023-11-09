package week_10.exercise_10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0, 0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(MyPoint myPoint){
        return distance(myPoint.getX(), myPoint.getY());
    }
    public double distance(double x1, double y1){
        return Math.sqrt(Math.pow(x1 - x,2) + Math.pow(y1 - y, 2));
    }
}
