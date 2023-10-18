package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},{3.5,2,-1},{3,1.5,3},{-1.5,4,2}};
        int[] nearestPoints = getNearestPoints(points);
        displayNearestPoints(points,nearestPoints);
    }

    public static int[] getNearestPoints(double[][] points){
        int[] nearestPoints = new int[2];
        nearestPoints[1] = 1;
        double min = getDistance(points[0],points[1]);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (getDistance(points[i],points[j]) < min){
                    nearestPoints[0] = i;
                    nearestPoints[1] = j;
                    min = getDistance(points[i],points[j]);
                }
            }
        }
        return nearestPoints;
    }
    public static double getDistance(double[] point1, double[] point2){
        return Math.sqrt(Math.pow(point1[0] - point2[0],2) + Math.pow(point1[1] - point2[1],2) + Math.pow(point1[2] - point2[2],2));
    }

    public static void displayNearestPoints(double[][] points, int[] nearestPoints){
        System.out.print("The nearest points are (" +
                points[nearestPoints[0]][0] + ", " + points[nearestPoints[0]][1] + ", " + points[nearestPoints[0]][2] + ") and (" +
                points[nearestPoints[1]][0] + ", " + points[nearestPoints[1]][1] + ", " + points[nearestPoints[1]][2] + ")");
    }
}
