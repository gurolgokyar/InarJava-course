package week_05_loops.working_area;

public class PrimeNumbers {
    public static void main(String[] args) {

        int possiblePrimeNumber=2;
        int numberOfPrimeNumbers=0;

        System.out.println("The first 50 prime numbers are\n");

        while(numberOfPrimeNumbers<50){
            boolean isPrime=true;
            int divisor=2;
            while(divisor<=(possiblePrimeNumber/2)){
                if (possiblePrimeNumber%divisor==0){
                    isPrime=false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                numberOfPrimeNumbers++;
                if (numberOfPrimeNumbers % 10 == 0) {
                    System.out.println( possiblePrimeNumber );
                } else {
                    System.out.print(possiblePrimeNumber +"  ");
                }
            }
            possiblePrimeNumber++;
        }
        System.out.println();
    }
}
