package day9_Activity;

import java.util.Scanner;

public class Act5_Buhayan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // Activity 5.1 - Sum
        // =========================
        System.out.print("Enter a Number for Sum: ");
        int N = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);

        // =========================
        // Activity 5.2 - Product
        // =========================
        System.out.print("\nEnter a Number for Product: ");
        int P = input.nextInt();

        int product = 1;

        for (int i = 1; i <= P; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);

        // =========================
        // Activity 5.3 - Arithmetic Sequence (Sum Only)
        // =========================
        int startnumber = 1;
        int commondifferent = 5;
        int terms = 5;

        int sum1 = 0;

        System.out.print("\nArithmetic Sequence (Sum Only)\n");
        for (int i = 0; i < terms; i++) {
            int term = startnumber + (i * commondifferent);
            sum1 += term;

            System.out.print(term);

            if (i < terms - 1) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum1);

        // =========================
        // Activity 5.4 - Arithmetic Sequence (Sum and Product)
        // =========================
        int startNumber = 1;
        int commonDifference = 5;
        int n = 10;

        int totalSum = 0;
        long totalProduct = 1;
        
        
        // Sum
        System.out.println("\nArithmetic Sequence (Sum and Product)");
        for (int i = 0; i < n; i++) {
            int term = startNumber + (i * commonDifference);
            totalSum += term;

            System.out.print(term);

            if (i < n - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + totalSum);

        // Product
        System.out.print("Product: ");
        for (int i = 0; i < n; i++) {
            int term = startNumber + (i * commonDifference);
            totalProduct *= term;

            System.out.print(term);

            if (i < n - 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + totalProduct);

        input.close();
    }
}