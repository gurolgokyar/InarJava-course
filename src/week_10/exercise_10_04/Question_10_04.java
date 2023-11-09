package week_10.exercise_10_04;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0,0);
        MyPoint myPoint2 = new MyPoint(10,30.5);
        System.out.printf("The distance between (%1.1f, %1.1f) and (%1.1f, %1.1f) is: %1.2f\n", myPoint.getX(),
                myPoint.getY(),
                myPoint2.getX(),myPoint2.getY(),myPoint.distance(myPoint2));
    }
}
