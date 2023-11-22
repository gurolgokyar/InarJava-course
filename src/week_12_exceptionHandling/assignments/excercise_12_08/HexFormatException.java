package week_12_exceptionHandling.assignments.excercise_12_08;

public class HexFormatException extends Exception {
    public HexFormatException() {

    }

    public HexFormatException(String message) {
        super(message);
    }
}
