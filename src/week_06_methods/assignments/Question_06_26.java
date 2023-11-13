package week_06_methods.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        int numberOfThePalindromicPrime = 100;
        displayPalindromicPrime(numberOfThePalindromicPrime);
    }
    public static void displayPalindromicPrime(int n){
        final int NUMBER_PER_LINE = 10;
        int possiblePrime = 2;
        int counter = 0;
        while(counter < n){
            if (isPalindrome(possiblePrime) && isPrime(possiblePrime)){
                counter++;
                System.out.print(possiblePrime + " ");
                if (counter % NUMBER_PER_LINE == 0){
                    System.out.println();
                }
            }
            possiblePrime++;
        }
    }
    public  static boolean isPalindrome(int number){
        String number1 = "" + number;
        int first = 0;
        int last = number1.length() - 1;
        while(first < last){
            if (number1.charAt(first) != number1.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}
