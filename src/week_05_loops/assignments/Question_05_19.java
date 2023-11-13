package week_05_loops.assignments;

public class Question_05_19 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            System.out.println();
        }
    }
}
