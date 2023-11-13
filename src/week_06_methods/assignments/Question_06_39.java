package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three points for p0, p1, and p2: ");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        System.out.printf("(%1.1f, %1.1f) is on the ",p2x,p2y);
        findWhichSide(p0x,p0y,p1x,p1y,p2x,p2y);
        System.out.printf(" from (%1.1f, %1.1f) to (%1.1f, %1.1f)\n",p0x,p0y,p1x,p1y);
    }
    public static void findWhichSide(double p0x,double p0y,double p1x,double p1y,double p2x,double p2y){
        if(onTheLineSegment(p0x,p0y,p1x,p1y,p2x,p2y)){
            System.out.print("line segment");
        } else if (onTheSameLine(p0x,p0y,p1x,p1y,p2x,p2y)) {
            System.out.print("same line");
        } else if (onTheLeftOfTheLine(p0x,p0y,p1x,p1y,p2x,p2y)) {
            System.out.print("left side");
        }else {
            System.out.print("right side");
        }
    }
    public static boolean onTheLineSegment(double p0x,double p0y,double p1x,double p1y,double p2x,double p2y){
        return  (onTheSameLine(p0x,p0y,p1x,p1y,p2x,p2y) && (p2x <= Math.max(p0x,p1x) && p2x>= Math.min(p0x,p1x))
        && (p2y <= Math.max(p0y,p1y) && p2y >= Math.min(p0y,p1y)));
    }
    public static boolean onTheSameLine(double p0x,double p0y,double p1x,double p1y,double p2x,double p2y){
        return (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y) == 0;
    }
    public static boolean onTheLeftOfTheLine(double p0x,double p0y,double p1x,double p1y,double p2x,double p2y){
        return (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y) > 0;
    }
}
