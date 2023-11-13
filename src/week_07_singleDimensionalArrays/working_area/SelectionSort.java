package week_07_singleDimensionalArrays.working_area;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(double[] array){
        for (int i = 0; i < array.length; i++) {
            double smallElement= array[i];
            int indexOfSmallElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallElement){
                    smallElement = array[j];
                    indexOfSmallElement = j;
                }
            }
            if (array[i] !=smallElement){
                array[indexOfSmallElement] = array[i];
                array[i] = smallElement;
            }
        }
    }
    public static void main(String[] args){
        double[] list = {4,1,2,5,7,3,6,0,9};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
