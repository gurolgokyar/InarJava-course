package week_09.assignments.exercise_09_07;

public class Question_09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122,20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        System.out.println("          Account Statement :\n" +
                "-------------------------------------------");
        System.out.println(account.toString());
    }
}
