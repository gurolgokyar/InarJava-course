package week_14.workingArea;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);

        list.add("Banana");
        list.add(1, "Grapes");
        System.out.println("Fruit -> " + list);
    }
}
