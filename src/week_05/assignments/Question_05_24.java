package week_05.assignments;

public class Question_05_24 {
    public static void main(String[] args) {

        double sumOfSeries=0;

        for (int i=1;i<=97;i+=2){
            sumOfSeries+=(i*1.0)/(i+2);
        }
        System.out.println("Sum of series: " + sumOfSeries);
    }
}
