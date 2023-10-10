package week_07.assignment;

import java.util.Arrays;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        int key = (int) (Math.random() * 100_000);

        for (int i = 0; i < 100_000; i++) {
            array[i] = (int) (Math.random() * 100_000);
        }
        Arrays.sort(array);

        int timeOfLinerSearch = findExecutionTimeInLinerSearch(array, key);
        System.out.println("Execution time of the linerSearch in milliseconds: " + timeOfLinerSearch);

        int timeOfBinarySearch = findExecutionTimeInBinarySearch(array, key);
        System.out.println("Execution time of the linerSearch in milliseconds: " + timeOfBinarySearch);
    }

    public static int findExecutionTimeInLinerSearch(int[] array, int key) {
        long startTime = System.currentTimeMillis();
        for (int v : array) {
            if (v == key) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }

    public static int findExecutionTimeInBinarySearch(int[] array, int key) {
        long startTime = System.currentTimeMillis();
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == key) {
                break;
            } else if (key > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        long endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }
}
