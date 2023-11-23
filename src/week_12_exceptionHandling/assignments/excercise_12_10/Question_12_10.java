package week_12_exceptionHandling.assignments.excercise_12_10;

public class Question_12_10 {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(getnumber());
        }
    }
    public static int getnumber(){
        return getnumber();
    }
}
