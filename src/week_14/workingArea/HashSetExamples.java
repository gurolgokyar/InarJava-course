package week_14.workingArea;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");

        System.out.println("HashSet Elements: ");
        for (String fruits: hashSet) {
            System.out.print(fruits + " ");
        }

        String searchFruit = "Banana";
        System.out.println("\nDoes hashSet contain " + searchFruit + " ?" + hashSet.contains(searchFruit));
        System.out.println(hashSet.remove("Orange"));


    }
}
