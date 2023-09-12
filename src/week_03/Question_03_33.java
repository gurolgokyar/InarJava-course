package week_03;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and price for package 1:");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter the weight and price for package 2:");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        //Calculate the price per weight
        double package1 =(int) (price1/weight1*10000)/10000.0;
        double package2 =(int) (price2/weight2*10000)/10000.0;

        if (package1<package2){
            System.out.println("Package 1 has a better price.");
        }else if (package2<package1){
            System.out.println("Package 2 has a better price.");
        }else {
            System.out.println("Two package have the same price");
        }
    }
}
