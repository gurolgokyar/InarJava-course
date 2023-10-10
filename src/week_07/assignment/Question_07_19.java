package week_07.assignment;
import java.util.Scanner;
public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the list: ");
        double[] list = new double[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        System.out.println("The list is " + (isSorted(list) ? "already ": "not ") + "sorted");
    }

    public static boolean isSorted(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }

}
