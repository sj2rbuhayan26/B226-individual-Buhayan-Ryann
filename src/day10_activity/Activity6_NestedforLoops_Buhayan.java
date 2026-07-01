/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_activity;

/**
 *
 * @author 03
 */
public class Activity6_NestedforLoops_Buhayan {
     public static void main(String[] args) {

        // Outer loop for each multiplication table
        for (int table = 1; table <= 2; table++) {

            // Display the table title
            System.out.println("Multiplication Table of " + table);

            // Inner loop for the multiples from 1 to 10
            for (int i = 1; i <= 10; i++) {

                // Display the multiplication result
                System.out.println(table + " * " + i + " = " + (table * i));

            }

            // Print a blank line after each table
            System.out.println();

        }

    }
}

