package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degree:");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        double latitude1InRadius =Math.toRadians(latitude1);
        double longitude1InRadius =Math.toRadians(longitude1);

        System.out.println("Enter point 2 (latitude and longitude) in degree:");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();
        double latitude2InRadius =Math.toRadians(latitude2);
        double longitude2InRadius =Math.toRadians(longitude2);

        //Find the distance
        double distance =(6371.01)*Math.acos(Math.sin(latitude1InRadius)*Math.sin(latitude2InRadius)
                +Math.cos(latitude1InRadius)*Math.cos(latitude2InRadius)*Math.cos(longitude1InRadius-longitude2InRadius));

        System.out.println("The distance between the two points is " + distance + " km");
    }

}
