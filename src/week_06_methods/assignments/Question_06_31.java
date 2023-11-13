package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        String possibleCardNumber = input.nextLine();
        possibleCardNumber = possibleCardNumber.trim();

        System.out.println(possibleCardNumber + (isValid(possibleCardNumber) ? " is valid" : " is invalid!"));
    }
    public static boolean isValid(String cartNumber){
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(cartNumber);
        int sumOfOddPlace = sumOfOddPlace(cartNumber);
        boolean isDivisible10 = isDivisible10(sumOfOddPlace,sumOfDoubleEvenPlace);
        boolean prefixMatched = prefixMatched(cartNumber);
        boolean isAllDigit = isAllDigit(cartNumber);

        return isDivisible10 && prefixMatched && isAllDigit;
    }
    public static int sumOfDoubleEvenPlace(String cartNumber){
        int sum = 0;
        for (int i = cartNumber.length() - 2; i >= 0 ; i-= 2) {
            int digit = cartNumber.charAt(i) - '0';
            sum += getDigit(2 * digit);
        }
        return sum;
    }
    public static int getDigit(int digit){
        int sum = 0;
      while(digit > 0){
            sum += digit % 10;
            digit /= 10;
        }
      return sum;
    }
    public static int sumOfOddPlace(String cartNumber){
        int sum = 0;
        for (int i = cartNumber.length() -1; i >= 0 ; i-= 2) {
            sum += cartNumber.charAt(i) - '0';
        }
        return sum;
    }
    public static boolean isDivisible10(int n1, int n2){
        return (n1 + n2) % 10 == 0;
    }
    public static boolean prefixMatched(String cartNumber){
        int firstDigits;
        for (int i = 1; i < 3; i++){
            firstDigits = getPrefix(cartNumber,i);
            if (isPrefixMatched(firstDigits)){
                return true;
            }
        }
        return false;
    }
    public static int getPrefix(String cartNumber, int k){
        String prefix = "";
        for (int i = 0; i < k; i++){
            prefix += cartNumber.charAt(i);
        }
        return Integer.parseInt(prefix);
    }
    public static boolean isPrefixMatched(int firstDigit){
        return firstDigit == 4 || firstDigit == 5 || firstDigit == 37 || firstDigit == 6;
    }
    public static boolean isAllDigit(String cartNumber){
        for (int i = 0; i < cartNumber.length(); i++){
            char digit = cartNumber.charAt(i);
            if (!Character.isDigit(digit)){
                return false;
            }
        }
        return true;
    }
}
