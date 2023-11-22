package week_12_exceptionHandling.assignments.excercise_12_04;

public class Question_12_04 {
    public static void main(String[] args) {
        try{
            Loan loan = new Loan(3, 4, -2000);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
