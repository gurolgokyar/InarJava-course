package week_09_objectOrientedPrograming_1.assignments.exercise_09_13;

public class Location {
    private int row;
    private int column;
    private double maxValue;

    Location(double[][] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (this.maxValue < numbers[i][j]){
                    this.row = i;
                    this.column = j;
                    this.maxValue = numbers[i][j];
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String toString(){
        return "The max value is " + this.maxValue + " and the location of the largest element is (" + this.row + ", " + this.column + ")";
    }
}
