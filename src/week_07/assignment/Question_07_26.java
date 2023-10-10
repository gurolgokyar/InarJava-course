package week_07.assignment;

import java.util.Scanner;

public class Question_07_26 {

    public static boolean equals(int[] list1, int[] list2){
        if (list1.length != list2.length){
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.print("Enter list1(first input indicate number of the elements): ");
        int[] list1 = getInputs();

        System.out.print("Enter list2(first input indicate number of the elements): ");
        int[] list2 = getInputs();

        System.out.println("The two arrays are " + (equals(list1,list2) ? "" : "not ") + "strictly identical");
    }
    public static int[] getInputs(){
        Scanner input = new Scanner(System.in);
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        return list;
    }
}
