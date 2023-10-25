package week_08.assignments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] locations = getInputs();
        double[] distances = getTotalDistances(locations);
        int centralCity = getCentralCity(distances);

        System.out.printf("The central city is at (%1.1f, %1.1f)\n",locations[centralCity][0],
                locations[centralCity][1]);
        System.out.printf("The total distance to all other cities is %1.2f", distances[centralCity]);

    }
    public static double[][] getInputs(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        double[][] coordinates = new double[input.nextInt()][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }
        return coordinates;
    }

    public static double[] getTotalDistances(double[][] coordinates){
        double[] distances = new double[coordinates.length];

        for (int i = 0; i < coordinates.length; i++){
            double distance = 0;
            for (double[] coordinate : coordinates) {
                distance += getDistance(coordinates[i], coordinate);
            }
            distances[i] = distance;
        }
        return distances;
    }
    public static double getDistance(double[] city1, double[] city2){
        return Math.pow(Math.pow(city1[0] - city2[0],2) + Math.pow(city1[1] - city2[1],2), 0.5);
    }

    public static int getCentralCity(double[] distances){
        int centralCity = 0;
        double totalDistanceOfCentralCity = distances[0];

        for (int i = 1; i < distances.length; i++) {
            if (distances[i] < totalDistanceOfCentralCity){
                centralCity = i;
                totalDistanceOfCentralCity = distances[i];
            }
        }
        return centralCity;
    }
}
