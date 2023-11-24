package week_11_inheritanceAndPolymorphism.assignments.exercise_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    final private Date dateCreated = new Date();
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        this(0, 0, 0, "unknown");
    }

    public Account(int id, double balance) {
        this(id, balance, 0, "Unknown");
    }

    public Account(int id, double balance, double annualInterestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (balance - amount < 0){
            System.out.println("You can not withdraw $" + amount);
            return;
        }
        this.balance = this.balance - amount;
        transactions.add(new Transaction('W', amount, getBalance(), "Withdraw"));
    }

    public void deposit(double amount) {
        if (amount < 0){
            System.out.println("You can bot deposit -(minus) amount" );
            return;
        }
        this.balance = this.balance + amount;
        transactions.add(new Transaction('D', amount, getBalance(), "Deposit"));
    }

    public String toString() {
        return "Name: " + name +
                "\nID: " + id +
                "\nInterest Rate: " + annualInterestRate +
                "\nBalance: " + balance;
    }

}
