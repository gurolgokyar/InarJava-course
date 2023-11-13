package week_06_methods.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        int possibleMaxPrime = 1000;
        printTwinPrime(possibleMaxPrime);
    }
    public static void printTwinPrime(int maxNumber){
        for (int possiblePrime = 2; possiblePrime <maxNumber ; possiblePrime++) {
            if(Question_06_26.isPrime(possiblePrime) && Question_06_26.isPrime(possiblePrime + 2)){
                System.out.println("(" + possiblePrime + ", " + (possiblePrime + 2) + ")");
            }
        }
    }
}
