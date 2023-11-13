package week_09.assignments.exercise_09_07;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    final private Date dateCreated = new Date();

    public Account(){}

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/(100 * 12);
    }
    public double getMonthlyInterest(){
        return this.getMonthlyInterestRate()*this.balance;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    public String toString(){
        return  "Account ID      : " + this.id + "\n" +
                "Date created    : " + this.dateCreated + "\n" +
                "Balance         : $" + this.balance + "\n" +
                "Monthly Interest: $" + this.getMonthlyInterest();
    }
}
