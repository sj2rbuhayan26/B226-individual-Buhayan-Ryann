/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16_activity;

/**
 *
 * @author 03
 */


public class Activity12_Buhayan {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Check if the number is odd or even
        identifyOddEven(20);
        // Print the name 5 times
        printname5("Ryann U. Buhayan");
        // Display the square root of 71
        getsquareroot(71);
        // Display the result of 5 raised to the power of 9
        getpower(5, 9);
        // Generate and print a random number
        randomnumber();
        // Compute the area of a circle with radius 9
        getcircle(9);
        // Check if a 25-year-old person can vote
        identifyvoters(25);
        // Display the length of the given word
        getwordlength("Ryann U. Buhayan");
        // Print the given word in reverse order
        getreverseword("Ryann U. Buhayan");
        // Display the full name and age
        printfullNameandAge("Ryann U. Buhayan", 10);
    }

    // Method to determine whether a number is odd or even
    public static void identifyOddEven(int number) {

        // Print the title
        System.out.println("--- Identify Odd or Even ---");
        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            // This should say Even (your original code prints Odd)
            System.out.println(number + " is Odd");
        } else {
            // This should say Odd (your original code prints Even)
            System.out.println(number + " is Even");
        }
        System.out.println("");
    }

    // Method to print the name 5 times
    public static void printname5(String name) {
        // Print the title
        System.out.println("--- Print Name ---");
        // Loop from 1 to 5
        for (int i = 1; i < 6; i++) {
            // Print the current count and name
            System.out.println(i + " Print " + name);
        }
        System.out.println("");
    }

    // Method to compute the square root
    public static void getsquareroot(double root) {
        // Print the title
        System.out.println("--- Get Square Root ---");
        // Display the square root
        System.out.println("Square root : " + Math.sqrt(root));
        System.out.println("");
    }

    // Method to compute the power of a number
    public static void getpower(int base, int exponent) {
        // Print the title
        System.out.println("--- Power Number ---");
        // Display the result of base raised to exponent
        System.out.println("Power: " + Math.pow(base, exponent));
        System.out.println("");
    }

    // Method to generate a random number
    public static void randomnumber() {

        // Print the title
        System.out.println("--- Random Number ---");
        // Generate a random integer from 1 to 100
        int random = (int) (Math.random() * 100 + 1);
        // Display the random number
        System.out.println("Random Number : " + random);
        System.out.println("");
    }

    // Method to compute the area of a circle
    public static void getcircle(double radius) {
        // Print the title
        System.out.println("--- Get Circle ---");
        // Compute the area using the formula πr²
        double area = Math.PI * radius * radius;
        // Display the area
        System.out.println("Area of Circle : " + area);
        System.out.println("");
    }

    // Method to determine voter eligibility
    public static void identifyvoters(int age) {
        // Print the title
        System.out.println("--- Identify Voters ---");
        // Check if age is at least 18
        if (age >= 18) {
            // Eligible to vote
            System.out.println("You eligible to Vote");
        } else {
            // Not eligible to vote
            System.out.println("You not eligible to Vote");
        }
        System.out.println("");
    }

    // Method to display the length of a word
    public static void getwordlength(String word) {
        // Print the title
        System.out.println("--- Word Length ---");
        // Display the number of characters
        System.out.println("Length : " + word.length());
        System.out.println("");
    }

    // Method to print the word in reverse
    public static void getreverseword(String reverse) {
        // Print the title
        System.out.println("--- Reverse Length ---");
        // Loop from the last character to the first
        for (int i = reverse.length() - 1; i >= 0; i--) {
            // Print one character at a time
            System.out.print(reverse.charAt(i));
        }
        // Move to the next line
        System.out.println();
        System.out.println("");
    }

    // Method to display the full name and age
    public static void printfullNameandAge(String fullName, int age) {
        // Print the title
        System.out.println("--- Print Fullname and Age ---");
        // Display the full name
        System.out.println("Full Name : " + fullName);
        // Display the age
        System.out.println("Age : " + age);
    }
}
