package week_10.exercise_10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;
    public MyRectangle2D(){
        this(0, 0, 1, 1);
    }
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (height + width);
    }
    public boolean contains(double x, double y){
       double upPoint = this.y + height / 2;
       double downPoint = this.y - height / 2;

       double rightPoint = this.x + width / 2;
       double leftPoint = this.x - width / 2;

       return x < rightPoint && x > leftPoint && y < upPoint && y > downPoint;
    }
    public boolean contains(MyRectangle2D m){
        double[][] pointsOfRectangle = getPointsOfRectangle(m);
        return contains(pointsOfRectangle[0][0], pointsOfRectangle[0][1]) && contains(pointsOfRectangle[1][0],
                pointsOfRectangle[1][1]) &&contains(pointsOfRectangle[2][0], pointsOfRectangle[2][1]) &&contains(pointsOfRectangle[3][0],
                pointsOfRectangle[3][1]);
    }
    public double[][] getPointsOfRectangle(MyRectangle2D m){
        double[][] points = new double[4][2];
        points[0][0] = m.x + m.width/2;
        points[0][1] = m.y + m.height/2;

        points[1][0] = m.x + m.width/2;
        points[1][1] = m.y - m.height/2;

        points[2][0]= m.x - m.width/2;
        points[2][1] = m.y + m.height/2;

        points[3][0] = m.x - m.width/2;
        points[3][1] = m.y - m.height/2;

        return points;
    }

    public boolean overlaps(MyRectangle2D m){
        double[][] pointsOfRectangle = getPointsOfRectangle(m);

        int numberOfPointsInRectangle = 0;
        for (int i = 0; i < 4; i++) {
            if (contains(pointsOfRectangle[i][0], pointsOfRectangle[i][1])){
                numberOfPointsInRectangle++;
            }
        }

        return numberOfPointsInRectangle >= 1 && numberOfPointsInRectangle < 4;
    }
}
