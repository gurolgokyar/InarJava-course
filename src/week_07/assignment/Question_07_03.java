package week_07.assignment;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");
        int[] occur = new int[100];

        while(true){
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            if (number > 100 || number < 0){
                System.out.println("Invalid input!");
               continue;
            }
            occur[number]++;
        }
        //Display occur of the inputs
        printOccur(occur);
    }

    public static void printOccur(int[] occur) {
        for(int i = 0; i < 100; i++){
            if (occur[i] == 0){
                continue;
            }
            System.out.println(i + " occur " + occur[i] + ((occur[i] > 1) ? " times" : " time"));
        }
    }


}
