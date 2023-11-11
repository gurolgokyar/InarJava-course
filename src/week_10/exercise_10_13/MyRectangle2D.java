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
        double[][] boarderPoints = getPointsOfRectangle(m);
        int numberOfPointsInOtherRectangle = 0;
        for (int i = 0; i < boarderPoints.length; i++) {
            if (contains(boarderPoints[i][0], boarderPoints[i][1])){
                numberOfPointsInOtherRectangle++;
            }
        }
        return numberOfPointsInOtherRectangle >= 1 && numberOfPointsInOtherRectangle < 4;
    }

    public static MyRectangle2D
    getRectangle(double[][] points) {
        MyRectangle2D myRectangle2D = new MyRectangle2D();

        double[] boarderPoints = myRectangle2D.getBoarderPoints(points);

        myRectangle2D.height = boarderPoints[1] - boarderPoints[0];
        myRectangle2D.width = boarderPoints[2] - boarderPoints[3];
        myRectangle2D.x = boarderPoints[3] + myRectangle2D.width / 2;
        myRectangle2D.y = boarderPoints[0] + myRectangle2D.height / 2;
        return myRectangle2D;
    }

    public double[] getBoarderPoints(double[][] points) {
        //Firstly find the lowest, upper, rightest and leftest point
        double lowest = points[0][1];
        double upper = points[0][1];
        double rightest = points[0][0];
        double leftest = points[0][0];

        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < lowest) {
                lowest = points[i][1];
            }
            if (points[i][1] > upper) {
                upper = points[i][1];
            }
            if (points[i][0] > rightest) {
                rightest = points[i][0];
            }
            if (points[i][0] < leftest) {
                lowest = points[i][0];
            }
        }
        return new double[]{lowest, upper, rightest, leftest};
    }

}
