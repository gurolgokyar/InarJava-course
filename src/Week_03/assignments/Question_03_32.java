package week_03.assignments;

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2:");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        double situation = (p1x-p0x)*(p2y-p0y)-(p2x-p0x)*(p1y-p0y);

        System.out.print("("+p2x+", "+p2y+") is on the ");

        if (situation>0){
            System.out.print("  left side of the line from ");
        }
        else if (situation<0){
            System.out.print(" right side of the line from ");
        }
        else{
            System.out.print("line from ");
        }
        System.out.println("("+p0x+", "+p0y+") to ("+p1x+", "+p1y+")");
    }
}
