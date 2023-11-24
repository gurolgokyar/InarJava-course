package week_11_inheritanceAndPolymorphism.assignments.exercise_11_03;

import week_09_objectsAndClasses.assignments.exercise_09_07.Account;

public class SavingAccount extends Account {
    public SavingAccount(int id, double balance){
        super(id, balance);
    }
    public void withdraw(double amount){
        if (getBalance() - amount >= 0){
            setBalance(getBalance() - amount);
        }else {
            System.out.println("You can not withdraw money");
        }
    }
    public String toString(){
        return "ID: " + getId() +
                "\nBalance: $" + getBalance();
    }
}
