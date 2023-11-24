package week_09_objectsAndClasses.assignments.exercise_09_13;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        double[][] numbers = getNumbers();
        Location maxValue = locateLargest(numbers);
        System.out.println(maxValue.toString());
    }

    public static double[][] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the arrays: ");
        double[][] numbers = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        return numbers;
    }

    public static Location locateLargest(double[][] array){
        Location maxValue = new Location(array);
        return maxValue;
    }
}
