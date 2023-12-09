package week_14.assignments.Question_14_22;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_14_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int  number = input.nextInt();

        boolean isHappy = isHappy(number);
        System.out.println(number + " is " + (isHappy ? "" : "not ") + "a happy number");
    }

    public static boolean isHappy(int number){
        Set<Integer> set = new HashSet<>();
        while (number != 1){
            if (set.contains(number)){
                return false;
            }else{
                set.add(number);
            }
            number = getSquaresOfDigits(number);
        }

        return true;
    }

    public static int getSquaresOfDigits(int number){
        int sum = 0;
        while(number > 0){
            sum += Math.pow(number % 10, 2);
            number /= 10;
        }

        return sum;
    }
}
