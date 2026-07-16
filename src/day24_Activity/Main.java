package day24_Activity;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("");
        System.out.println("    Account Transaction ");
        System.out.println("");
        System.out.println("============================");
        System.out.println("   Create Saving Account ");
        System.out.println("============================");
        System.out.println("");
        System.out.print("Enter Account Number : ");
        String aNumber = scanner.nextLine();

        System.out.print("Enter Account Name : ");
        String aName = scanner.nextLine();

        System.out.print("Enter Balance : ");
        double aBalance = scanner.nextDouble();

        System.out.print("Enter Interest Rate (%) : ");
        double aRate = scanner.nextDouble();

        SavingAccount savings = new SavingAccount(aNumber, aName, aBalance, aRate);

        scanner.nextLine(); // Clear the newline

        // Checking Account
        System.out.println("============================");
        System.out.println("  Create Checking Account");
        System.out.println("============================");
        System.out.println("");
        System.out.print("Enter Account Number: ");
        String cAccNo = scanner.nextLine();

        System.out.print("Enter Account Name: ");
        String cName = scanner.nextLine();

        System.out.print("Enter Balance: ");
        double cBalance = scanner.nextDouble();

        System.out.print("Enter Overdraft Limit: ");
        double overdraft = scanner.nextDouble();

        CheckingAccount checking = new CheckingAccount(cAccNo, cName, cBalance, overdraft);
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
        System.out.println("Checking Account Information");
        System.out.println("");
        System.out.println("============================");

        checking.displayAccountInfo();

        System.out.println("============================");
        System.out.println("          Deposit ");
        System.out.println("============================");
        System.out.print("Enter Deposit Amount: ");
        double deposit = scanner.nextDouble();
        
        if (deposit > 0 ) {
            System.out.println("Deposit Successful....");
            System.out.println("Amount Deposit : P " + deposit);
        }else{
                System.out.println("Invalid input! Please enter a amount greater than 0");
        }
        checking.deposit(deposit);

        System.out.println("============================");
        System.out.println("         Withdrawn");
        System.out.println("============================");
        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = scanner.nextDouble();
        
        if (withdraw > 0) {
            System.out.println("Withdraw Successful...");
            System.out.println("Amount Withdraw : P " + withdraw );
        }else{
            System.out.println("Invalid Input! Please enter a amount greater than 0");
        }
        checking.withdraw(withdraw);

        scanner.close();
    }
}
