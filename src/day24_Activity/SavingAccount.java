package day24_Activity;

public class SavingAccount extends Account implements Transaction {

    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("============================");
        System.out.println("       Savings Account");
        System.out.println("============================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate : " + interestRate);
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
        if (amount <= balance) {
            balance -= amount;
            System.out.println("");
            System.out.println("Withdrawn : P " + amount);
            System.out.println("New Balance : P" + balance);
        } else {
            System.out.println("Insufficient balance.");

        }
    }

}
