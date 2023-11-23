package week_12_exceptionHandling.assignments.exercise_12_21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12_exceptionHandling/assignments/exercise_12_21/SortedStrings.txt");
        Scanner input = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.next());
        }
        input.close();

        ArrayList<Integer> stringsOtOfOrder = findUnsorted(list);

        System.out.println("File\n :" + file);
        displayList(stringsOtOfOrder);
    }

    public static ArrayList<Integer> findUnsorted(ArrayList<String> list) {
        ArrayList<String> unSortedList = new ArrayList<>();
        unSortedList.addAll(list);

        java.util.Collections.sort(list);
        ArrayList<Integer> unSortedStrings = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (unSortedList.get(i).compareTo(list.get(i)) != 0){
                unSortedStrings.add(i);
                counter++;
                if (counter == 2){
                    return unSortedStrings;
                }
            }
        }
        return unSortedStrings;
    }

    public static void displayList(ArrayList<Integer> list){
        String output = switch (list.size()){
            case 0 -> "There is any string out of order";
            case 1 -> "The string " + list.get(0) + " is out of order";
            case 2 -> "The strings " + list.get(0) + " and " + list.get(1) + " are out of order";
            default -> "";
        };

        System.out.println(output);
    }
}
