/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_activity;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class Activity6_table1_Buhayan {

    // Main method
    public static void main(String[] args) {

        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");

        // Store the user's input
        int number = input.nextInt();

        // Display the title
        System.out.println("\nMultiplication Table of " + number);

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Display the multiplication table
            System.out.println(number + " * " + i + " = " + (number * i));

        }

        // Close the Scanner
        input.close();
    }
}
