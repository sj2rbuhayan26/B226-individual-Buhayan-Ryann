package day21_activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        // Create account / object
        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        // Display  the user information
        System.out.println("\n===== USER ACCOUNT =====");
        System.out.println("Full Name : " +
                user.getFirstName() + " " +
                user.getMiddleName() + " " +
                user.getLastName());

        System.out.println("Email     : " + user.getEmail());
        System.out.println("Address   : " + user.getAddress());

        input.close();
    }
}