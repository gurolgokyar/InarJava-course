package week_07_singleDimensionalArrays.assignment;

public class Question_07_06 {
    public static void main(String[] args) {

        int numberOfPrime = 0;
        int possiblePrime = 2;
        int[] primeNumbers = new int[50];

        while(numberOfPrime < 50){
            if (isPrime(possiblePrime,primeNumbers,numberOfPrime)){
                primeNumbers[numberOfPrime] = possiblePrime;
                numberOfPrime++;
            }
            possiblePrime++;
        }
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%3d ",primeNumbers[i]);
            if ((i +1) % 10 == 0){
                System.out.println();
            }
        }
    }
    public static boolean isPrime(int possiblePrime,int[] primeNumbers, int numberOfPrime){
        for (int i = 0; i < numberOfPrime; i++) {
            if (possiblePrime % primeNumbers[i] == 0){
                return false;
            }
        }
        return true;
    }
}
