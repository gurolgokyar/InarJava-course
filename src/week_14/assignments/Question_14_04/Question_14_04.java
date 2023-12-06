package week_14.assignments.Question_14_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        ArrayList<Integer> A = getList("A");
        ArrayList<Integer> B = getList("B");
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        ArrayList<Integer> C = mergeLists(A, B);
        Collections.sort(C);

        System.out.println("Merged and sorted ArrayList C: \n" + C);

    }

    public static ArrayList<Integer> getList(String listName) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the size 'n' for ArrayList %s: \n", listName);
        int size = input.nextInt();

        System.out.printf("Enter %d integers for ArrayList %s: \n", size, listName);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        return list;
    }
}
