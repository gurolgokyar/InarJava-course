package week_10.exercise_10_07;

import week_09.assignments.exercise_09_07.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
        checkTheAccounts(accounts);
    }

    public static void checkTheAccounts(Account[] accounts) {
        int id = getId(accounts);
        execute(id, accounts);
    }

    public static int getId(Account[] accounts) {
        Scanner input = new Scanner(System.in);
        boolean isAccountAvailable = false;
        int id = -1;
        while (!isAccountAvailable) {
            System.out.print("Enter an id: ");
            id = input.nextInt();
            for (int i = 0; i < accounts.length; i++) {
                if (id == accounts[i].getId()) {
                    isAccountAvailable = true;
                    break;
                }
            }
            if (!isAccountAvailable) {
                System.out.println("Invalid input!");
            }
        }
        return id;
    }

    public static void execute(int id, Account[] accounts) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Main manu\n 1: check balance\n 2: withdraw\n 3: deposit\n 4: exit\nEnter a choice: ");
            int answer = input.nextInt();
            if (answer == 1) {
                System.out.println("The balance is " + accounts[id].getBalance());
            } else if (answer == 2) {
                System.out.println("Enter an amount to withdraw: ");
                double amount = input.nextDouble();
                accounts[id].withdraw(amount);
            } else if (answer == 3) {
                System.out.print("Enter an amount to deposit: ");
                double amount = input.nextDouble();
                accounts[id].deposit(amount);
            } else {
                System.out.println();
                checkTheAccounts(accounts);

            }
        }
    }
}
