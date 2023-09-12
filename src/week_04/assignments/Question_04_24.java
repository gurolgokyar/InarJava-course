package week_04.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String order;
        if (city1.compareTo(city3) < 0) {
            if (city2.compareTo(city3) < 0) {
                if (city1.compareTo(city2) < 0) {
                    order = city1 + " " + city2 + " " + city3;
                } else {
                    order = city2 + " " + city1 + " " + city3;
                }
            } else {
                order = city1 + " " + city3 + " " + city2;
            }
        } else {
            if (city1.compareTo(city2) < 0) {
                order = city3 + " " + city1 + " " + city2;
            } else {
                if (city2.compareTo(city3) < 0) {
                    order = city2 + " " + city3 + " " + city1;
                } else {
                    order = city3 + " " + city2 + " " + city1;
                }
            }
        }

        //Display the results
        System.out.println("The three cities in alphabetical order are " + order);
    }
}
