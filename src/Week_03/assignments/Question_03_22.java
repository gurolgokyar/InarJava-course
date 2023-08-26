package Week_03.assignments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinate : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double x1 = 0;//circle's coordinates
        double y1 = 0;

        double distanceToCenter = Math.pow(Math.pow(x - x1, 2) + Math.pow(y - y1, 2), 0.5);

        if (distanceToCenter <= 10) {
            System.out.println("Point (" + x + "," + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + "," + y + ") is not in the circle");
        }

    }
}
