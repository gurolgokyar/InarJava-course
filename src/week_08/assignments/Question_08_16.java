package week_08.assignments;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{1,1,2,3},{1,1,1,2},{0,1,9,8},{0,2,3,4},{2,0,0,0}};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print(", ");
        }
    }
    public static void sort(int[][] array){
        for (int counter = 0; counter < array[0].length; counter++) {
            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i][counter];
                int index = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j][counter] < min){
                        boolean isSmall = true;
                        for (int k = counter; k >= 0; k--){
                            if (array[j][k] > array[i][k]){
                                isSmall = false;
                                break;
                            }
                        }
                        if (isSmall){
                            min = array[j][counter];
                            index = j;
                        }
                    }
                }
                if (index != i) {
                    int[] temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                }
            }
        }
    }
}
