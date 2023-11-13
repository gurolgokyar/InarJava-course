package week_07_singleDimensionalArrays.working_area;

public class LinerSearch {
    public static void main(String[] args) {
        int[] list= {1,4,4,2,5,-3,6,2};
        for (int v : list) {
            int index = linerSearch(list,v);
            System.out.println(index);
        }

    }
    public static int linerSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key){
                return i;
            }
        }
        return -1;
    }
}
