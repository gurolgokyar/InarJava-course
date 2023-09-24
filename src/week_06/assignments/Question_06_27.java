package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        int numberOfEmirp = 100;
        displayEmirp(numberOfEmirp);
    }

    public static void displayEmirp(int n){
        final int NUMBER_PER_LINE = 10;
        int counter = 0;
        int possibleEmirp =2;
        while(counter < n){
            if (Question_06_26.isPrime(possibleEmirp) && !Question_06_26.isPalindrome(possibleEmirp) && isReversePalindrome(possibleEmirp)){
                counter++;
                System.out.print(possibleEmirp + " ");

                if (counter % NUMBER_PER_LINE == 0){
                    System.out.println();
                }
            }
            possibleEmirp++;
        }
    }
   public static boolean isReversePalindrome(int number){
       return Question_06_26.isPrime(reverse(number));
   }
   public static int reverse(int number){
       String reverse = "";
       String number1 = "" + number;
       for (int i = 0; i < number1.length(); i++) {
           reverse = number1.charAt(i) + reverse;
       }
       return Integer.parseInt(reverse);
   }
}
