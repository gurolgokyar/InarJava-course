package week_07.assignment;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {

        System.out.print("Enter list1(first input indicate the number of elements):");
        int[] list1 = getInputs();

        System.out.print("Enter list2(first input indicate the number of elements):");
        int[] list2 = getInputs();

        int[] mergedList = merge(list1,list2);

        for (int v : mergedList) {
            System.out.print(v + " ");
        }
    }

    private static int[] merge(int[] list1, int[] list2) {
       int[] result = mergeTwoArray(list1, list2);

        int indexOfMinNumber;
        int minNumber;
        for (int i = 0; i < result.length; i++) {
             indexOfMinNumber = i;
             minNumber = result[i];
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < minNumber){
                    minNumber = result[j];
                    indexOfMinNumber = j;
                }
            }

            if (indexOfMinNumber != i){
                result[indexOfMinNumber] = result[i];
                result[i] = minNumber;
            }
        }
       return result;
    }

    private static int[] mergeTwoArray(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];

        //You can copy list1 and list2 with Arrays.copy() method
        //System.arraycopy(list1, 0, result, 0, list1.length);
        //System.arraycopy(list2, 0, result, list1.length, list2.length

        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++){
            result[list1.length + i] = list2[i];
        }
        return result;
    }

    public static int[] getInputs(){
        Scanner input = new Scanner(System.in);

        int[] array = new int[input.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
