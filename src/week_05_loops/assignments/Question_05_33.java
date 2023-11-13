package week_05_loops.assignments;

public class Question_05_33 {
    public static void main(String[] args) {

        int possiblePerfect=1;
        System.out.println("Perfect numbers are:");

        while(possiblePerfect<=10000){
            int sumOfDivisor=0;
            int divisor=1;
            while(divisor<=possiblePerfect/2){
                if (possiblePerfect%divisor==0){
                    sumOfDivisor+=divisor;
                }
                divisor++;
            }
            if (sumOfDivisor==possiblePerfect){
                System.out.println(possiblePerfect);
            }
            possiblePerfect++;
        }
    }

}

