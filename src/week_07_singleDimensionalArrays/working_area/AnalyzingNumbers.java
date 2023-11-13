package week_07_singleDimensionalArrays.working_area;

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numberOfItems = input.nextInt();

        double [] list = new double[numberOfItems];
        double sum = 0;

        for (int i = 0; i < numberOfItems; i++){
            list[i] = input.nextDouble();
            sum+= list[i];
        }
        double average = sum / numberOfItems;

       int numberOfItemsGreaterThanAverage = getNumberOfItemsGreaterThanAverage(list,average);
        System.out.println("Average is " + average +"\nNumber of the elements above the average is " + numberOfItemsGreaterThanAverage);
    }
    public static int getNumberOfItemsGreaterThanAverage(double [] list,double average){
      int result = 0;
      for (int i = 0; i < list.length; i++){
          if (list[i] > average){
              result++;
          }
      }
      return result;
    }
}
