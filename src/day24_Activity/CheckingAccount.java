package day24_Activity;

import java.util.Scanner;

public class CheckingAccount extends Account implements Transaction {
    static Scanner scanner = new Scanner(System.in);

    private double overDraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overDraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("        Checking Account ");
        System.out.println("============================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
        System.out.println("Overdraft Limit : " + overDraftLimit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("");
        System.out.println("Deposit : P " + amount);
        System.out.println("New Balance : P " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("");
            System.out.println("Withdrawn: P " + amount);
            System.out.println("New Balance: P " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}
