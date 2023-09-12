package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {
        final int PRIME_NUMBER_PER_LINE = 8;

        int possiblePrimeNumber = 2;
        int counter = 0;
        boolean isPrime;

        while (possiblePrimeNumber <= 1000) {
            isPrime = true;
            int divisor = 2;
            while (divisor <= possiblePrimeNumber / 2) {
                if (possiblePrimeNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                counter++;
                if (counter % PRIME_NUMBER_PER_LINE == 0) {
                    System.out.println(possiblePrimeNumber);
                } else {
                    System.out.print(possiblePrimeNumber + " ");
                }
            }
            possiblePrimeNumber++;
        }
    }
}
