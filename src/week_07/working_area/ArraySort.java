package week_07.working_area;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] list= {9,8,7,6,5,4,3,2,1,0};
        int[] list2 ={9,87,6};
        Arrays.sort(list,2,3);
        System.out.println(Arrays.toString(list));

        System.out.println(Arrays.equals(list,list2));

        Arrays.fill(list,2);
        System.out.println(Arrays.toString(list));

        Arrays.fill(list,2,3,7);
        System.out.println(Arrays.toString(list));
    }
}
