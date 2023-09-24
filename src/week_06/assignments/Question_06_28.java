package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        int p = 31;
        printMersennePrime(p);
    }
    public static void printMersennePrime(int p){
        System.out.printf("%-2s\t\t\t%s\n","p","2^p - 1");
        System.out.println("---------------");
        for (int i = 2; i <= p; i++){
            int possibleMersenne = (int)(Math.pow(2,i) -1);
            if (Question_06_26.isPrime(possibleMersenne)){
                System.out.printf("%-2d\t\t\t%d\n",i,possibleMersenne);
            }
        }
    }
}
