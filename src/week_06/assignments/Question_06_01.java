package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {

        final int NUMBER_PER_LINE = 10;

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));

            if (i % NUMBER_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
