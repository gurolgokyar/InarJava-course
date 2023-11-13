package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int[] eliminatedArray = eliminateDuplicates(numbers);
        for (int v: eliminatedArray){
            System.out.print(v + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] array){
        int numberOfDistinct = 0;
        int[] distinctNumbers = new int[10];

        for (int v:array) {
            if (!isContain(distinctNumbers,v,numberOfDistinct)){
                distinctNumbers[numberOfDistinct] = v;
                numberOfDistinct++;
            }
        }
        int[] eliminatedArray = new int[numberOfDistinct];
       System.arraycopy(distinctNumbers,0,eliminatedArray,0,numberOfDistinct);
        return eliminatedArray;
    }
    public static boolean isContain(int[] distinctNumbers,int number, int numberOfDistinct){
        for (int i = 0; i < numberOfDistinct; i++) {
            if (distinctNumbers[i] == number){
                return true;
            }
        }
        return false;
    }
}
