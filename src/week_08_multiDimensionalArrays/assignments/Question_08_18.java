package week_08_multiDimensionalArrays.assignments;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void shuffle(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int randomIndex = (int)(Math.random()* matrix.length);

            int[] temp = matrix[i];
            matrix[i] = matrix[randomIndex];
            matrix[randomIndex] = temp;
        }
    }
}
