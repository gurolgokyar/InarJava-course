package week_11_inheritanceAndPolymorphism.assignments.exercise_11_03;

public class Question_11_03 {
    public static void main(String[] args) {
        Object o1= new CheckingAccount(11, 1550,-500);
        Object o2 = new SavingAccount(16,48500);

        ((CheckingAccount)o1).withdraw(100);
        ((SavingAccount)o2).withdraw(300);

        System.out.println(o1);
        System.out.println("--------------------------");
        System.out.println(o2);
    }
}
