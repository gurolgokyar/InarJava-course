package week_08_twoDimensionalArrays.assignments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        int[] columnAndRowWithMost1s = getColumnAndRow(matrix);
        displayResult(matrix,columnAndRowWithMost1s);
    }
    public static int[][] getMatrix(){
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        return matrix;
    }

    public static int[] getColumnAndRow(int[][] matrix){
        int row = getRow(matrix);
        int column = getColumn(matrix);
        return new int[]{row,column};
    }
    public static int getRow(int[][] matrix){
        int maxNumberOf1 = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++){
            int numberOf1InRow= 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1){
                    numberOf1InRow++;
                }
            }
            if (numberOf1InRow > maxNumberOf1){
                index = i;
                maxNumberOf1 = numberOf1InRow;
            }
        }
        return index;
    }

    public static int getColumn(int[][] matrix){
        int maxNumberOf1 = 0;
        int index = 0;
        for (int i = 0; i < matrix[0].length; i++){
            int numberOf1Column= 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1){
                    numberOf1Column++;
                }
            }
            if (numberOf1Column > maxNumberOf1){
                index = i;
            }
        }
        return index;
    }

    public static void displayResult(int[][] matrix,int[] indexes){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + indexes[0] +
                "\nThe largest column index: " + indexes[1]);
    }
}
