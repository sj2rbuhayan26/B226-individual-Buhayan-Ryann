package day11_Activity; 

import java.util.Scanner; 

public class Activity7_Buhayan { 

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        // Declare an array that can store 5 integers
        int[] numbers = new int[5];

        // Variable to store the total sum
        int sum = 0;

        // Variables to store the highest and lowest numbers
        int highest, lowest;

        // Variable to store the average
        double average;

        // Ask the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");

        // Loop to input 5 numbers into the array
        for (int i = 0; i < numbers.length; i++) {

            // Display the current number being entered
            System.out.print("Number " + (i + 1) + ": ");

            // Store the user's input in the array
            numbers[i] = input.nextInt();
        }

        // Assume the first element is the highest
        highest = numbers[0];

        // Assume the first element is the lowest
        lowest = numbers[0];

        // Display the numbers entered
        System.out.println("\nNumbers entered:");

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {

            // Display each number
            System.out.println(numbers[i] + " ");

            // Add each number to the sum
            sum += numbers[i];

            // Check if the current number is greater than the highest
            if (numbers[i] > highest) {
                highest = numbers[i]; // Update highest number
            }

            // Check if the current number is less than the lowest
            if (numbers[i] < lowest) {
                lowest = numbers[i]; // Update lowest number
            }
        }

        // Compute the average
        average = (double) sum / numbers.length;

        // Display the total sum
        System.out.println("\n\nSum = " + sum);

        // Display the average
        System.out.println("Average = " + average);

        // Close the Scanner object
        input.close();
    }
}