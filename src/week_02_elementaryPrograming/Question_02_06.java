package week_02_elementaryPrograming;
import java.util.Scanner;
public class Question_02_06 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number as integer between 0 and 1000 :");
        int number= input.nextInt();

        int sum ; //for sum of digits
        int firstDigit = number % 10 ;
         number = number / 10 ;

        int secondDigit = number % 10 ;
        int thirdDigit = number%10 ;
        sum= firstDigit + secondDigit + thirdDigit ;

        System.out.println("The sum of the digits is " + sum);

    }
}
