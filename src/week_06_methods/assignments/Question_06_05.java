package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        displaySortedNumbers(n1, n2, n3);
    }
    public static void displaySortedNumbers(double n1, double n2, double n3){
        if (n2 < n1){
            double temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n3 < n1){
            double temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n3 < n2){
            double temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
