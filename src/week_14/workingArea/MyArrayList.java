package week_14.workingArea;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
       Integer[] array = {1, 4, 5, 5, 2,1};
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

       Integer[] array2 = new Integer[list.size()];
       list.toArray(array2);
    }
}
