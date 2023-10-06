package week_07.working_area;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 4, 5, 6, 2, 44, 7};
        java.util.Arrays.sort(list);
//        for (int i = 0; i < list.length; i++) {
//            int index = binarySearch(list, list[i]);
//            System.out.println(index);
//        }
        System.out.println( binarySearch(list,-1));

    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (key < list[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }

}
