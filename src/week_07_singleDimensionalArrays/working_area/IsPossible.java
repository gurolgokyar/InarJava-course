package week_07_singleDimensionalArrays.working_area;

import java.util.Arrays;
import java.util.Scanner;

public class IsPossible {
    public static int[] createArray(){
        Scanner input = new Scanner(System.in);

        int[] array = new int[input.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array: ");
        int[] array = createArray();

        System.out.println(Arrays.toString(array));

    }
}
