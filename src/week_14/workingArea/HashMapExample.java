package week_14.workingArea;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");

        System.out.println("HashMap Elements : ");
       for (Integer keys: hashMap.keySet()){
           System.out.println("Key: " + keys + ", Value: " + hashMap.get(keys));
       }

       hashMap.remove(1);
        System.out.println("\nUpdated hasMap Elements:");
       for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
           System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
       }
    }
}
