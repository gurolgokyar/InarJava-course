package week_08_multiDimensionalArrays.assignments;

public class Question_08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        System.out.print("Enter matrix1: ");
        Question_08_05.getMatrix(matrix1);

        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix2: ");
        Question_08_05.getMatrix(matrix2);

        multiplyAndDisplayMatrix(matrix1, matrix2);
    }

    public static void multiplyAndDisplayMatrix(double[][] matrix1, double[][] matrix2){
        double[][] multiplicationOfMatrix= multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < multiplicationOfMatrix.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if (i == 1) {
                System.out.print("  *  ");
            }else {
                System.out.print("     ");
            }
            for (int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            if (i == 1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }
            for (int j = 0; j < multiplicationOfMatrix[0].length; j++) {
                System.out.printf("%1.2f ",multiplicationOfMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2){
        double[][] multiplication = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiplication;
    }
}
