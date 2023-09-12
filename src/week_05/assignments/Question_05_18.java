package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }


        System.out.println();

        System.out.println("Pattern B");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("Pattern C");
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j-1 > i; j--) {
                System.out.print("  ");
            }
            for (int k = i + 1; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 25; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=6-i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
