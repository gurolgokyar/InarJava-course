package week_12_exceptionHandling.assignments.excercise_12_07;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.next();

        try{
            int decimalNumber = bin2Decimal(binaryString);
            System.out.println("The decimal value for binary number " + binaryString + " is " + decimalNumber);
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int bin2Decimal(String binaryString){
        int sum = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (isBinaryDigit(ch)){
                sum = 2 * sum + ch - '0';
            }else{
                throw new NumberFormatException("It is not binary string!");
            }
        }
        return sum;
    }

    public static boolean isBinaryDigit(char ch){
        return Character.isDigit(ch) && (ch == '0' || ch == '1');
    }
}
