package week_03_selections;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x- , -y coordinates, width, and height:");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        System.out.println("Enter r2's center x- , -y coordinates, width, and height:");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        //We can use translation technique in mathematics
        if (r2height * r2width > r1height * r1width) {
            if ((r1width / 2 + r1x <= r2x + r2width) && (r1x - r1width / 2 >= r2x - r2width / 2) && (r1height / 2 + r1y <= r2height / 2 + r2y) && (r1y - r1height / 2 >= r2y - r2height / 2)) {
                System.out.println("r1 is inside r2");
                System.exit(0);
            }
        }


        if ((r2width / 2 + r2x <= r1x + r1width) && (r2x - r2width / 2 >= r1x - r1width / 2) && (r2height / 2 + r2y <= r1height / 2 + r1y) && (r2y - r2height / 2 >= r1y - r1height / 2)) {
            System.out.println("r2 is inside r1");
        } else if ((r2x - r2width / 2 >= r1x + r1width) || (r2x + r2width / 2 <= r1x - r1width / 2) || (r2y - r2height / 2 >= r1height / 2 + r1y) || (r2y + r2height / 2 <= r1y - r1height / 2)) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlaps r1");
        }

    }
}
