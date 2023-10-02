package week_07.assignment;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int gcd = gcd(numbers);
        System.out.println("The common divisor is " + gcd);
    }
    public static int gcd(int... numbers){
        int minNumber = getMin(numbers);
        int gcd = 1;
        int possibleGcd = 2;
        while(possibleGcd <= minNumber){
            boolean isGcd = true;
           for (int v: numbers){
               if (v % possibleGcd != 0){
                   isGcd = false;
                   break;
               }
           }
           if (isGcd){
               gcd = possibleGcd;
           }
           possibleGcd++;
        }
        return gcd;
    }
    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


}
