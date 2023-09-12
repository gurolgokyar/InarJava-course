package week_05.assignments;

public class Question_05_35 {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 624; i++) {
            sum += 1.0 / (Math.pow(i, 0.5) + Math.pow(i + 1, 0.5));
        }
        System.out.println("The sum of the series is " + sum);
    }
}
