package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] employee = getWorkingHour();
        displayTotalHours(employee);
    }
    public static int[][] getWorkingHour(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee number: ");
        int[][] workingHour = new int[input.nextInt()][7];

        System.out.println("Enter the working hours of employees:");
        for(int employee = 0; employee < workingHour.length; employee++){
            for (int i = 0; i < 7; i++) {
                workingHour[employee][i] = input.nextInt();
            }
        }
        return workingHour;
    }

    public static void displayTotalHours(int[][] employees){
        int [][] sortedHours = sortHours(employees);
        System.out.println("Employees and their total hours in decreasing order of the total hours:");

        for (int employee = 0; employee < employees.length; employee++) {
            System.out.printf("Employee %d's total hour is %d\n",sortedHours[employee][0],sortedHours[employee][1]);
        }
    }
    public static int[][] sortHours(int[][] hours){
        int[][] totalHours = getTotalHours(hours);
        for (int employee = 0; employee < totalHours.length; employee++){
            int maxHour = totalHours[employee][1];
            int index = employee;
            for (int i = employee + 1; i < totalHours.length; i++) {
                if (totalHours[i][1] > maxHour){
                    maxHour = totalHours[i][1];
                    index = i;
                }
            }
            if (index != employee){
                totalHours[index][1] = totalHours[employee][1];
                totalHours[employee][1] = maxHour;

                totalHours[index][0] = employee;
                totalHours[employee][0] = index;
            }
        }
        return totalHours;
    }
    public static int[][] getTotalHours(int[][] hours){
        int[][] totalHours = new int[hours.length][2];
        for (int employee = 0; employee < hours.length; employee++) {
            int sum = 0;
            for (int day = 0; day < 7; day++) {
                sum += hours[employee][day];
            }
            totalHours[employee][0] = employee;
            totalHours[employee][1] = sum;
        }
        return totalHours;
    }
}
