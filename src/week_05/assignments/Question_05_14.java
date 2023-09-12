package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1=input.nextInt();

        System.out.print("Enter second integer: ");
        int number2=input.nextInt();
        if (number2>number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int possibleGreatestCommonDivisor=number2;
        int greatestCommonDivisor =1;

        while (possibleGreatestCommonDivisor>=1){
            if(number1%possibleGreatestCommonDivisor==0 && number2%possibleGreatestCommonDivisor==0){
                greatestCommonDivisor=possibleGreatestCommonDivisor;
                break;
            }
            possibleGreatestCommonDivisor--;
        }

        System.out.printf("The greatest common divisor for %d and %d is %d" ,number1,number2,greatestCommonDivisor);
    }
}
