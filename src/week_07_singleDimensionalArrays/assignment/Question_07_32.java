package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the list: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        list = portion(list);

        for (int v : list) {
            System.out.print(v + " ");
        }
    }
    public static int[] portion(int[] list){
        int[] rearrangedList = new int[list.length];
        int indexOfPivot = 0;
        rearrangedList[0] = list[0];
        int numberOfElementWritenToLast = 0;

        for (int i = 1; i < list.length ; i++) {
            if (list[i] <= rearrangedList[indexOfPivot]){
                int temp = rearrangedList[indexOfPivot];
                rearrangedList[indexOfPivot] = list[i];
                rearrangedList[++indexOfPivot] = temp;
            }else {
                rearrangedList[rearrangedList.length - 1 - numberOfElementWritenToLast] = list[i];
                numberOfElementWritenToLast++;
            }
        }
        return rearrangedList;
    }
}
