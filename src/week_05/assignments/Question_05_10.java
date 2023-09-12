package week_05.assignments;

public class Question_05_10 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        int counter = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                counter++;
                if (counter % NUMBER_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
