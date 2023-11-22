package week_12_exceptionHandling.assignments.excercise_12_05;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(){
        super();
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
