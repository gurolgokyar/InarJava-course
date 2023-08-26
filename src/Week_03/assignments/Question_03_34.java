package week_03.assignments;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2:");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        //Find the point's situation
        double situation = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        double maxX = p0x;
        double minX = p1x;
        if (p1x > maxX) {
            maxX = p1x;
            minX = p0x;
        }

        double maxY = p0y;
        double minY = p1y;
        if (p1x > maxY) {
            maxY = p1y;
            minY = p0y;
        }

        double slope = (p0y - p1y) / (p0x - p1x);

        if (situation == 0) {
            if ((minX <= p2x && p2x <= maxX) && (minY <= p2y && p2y <= maxY) && ((p2y - p0y) / (p2x - p0x) == slope)) {
                System.out.println("(" + p2x + ", " + p2y + ") is on the line segment from (" + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
            } else {
                System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from (" + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
            }
        } else {
            System.out.println("(" + p2x + ", " + p2y + ") is not on the line segment from (" + p0x + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }
    }
}
