/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12_discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class MultiDimensionalUsingScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[2][2];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (i == 0) {
                    System.out.print("Enter a Number :[" + i + "][" + j + "]: ");
                    number[i][j] = scanner.nextInt();
                } else {
                    System.out.print("Enter a Number :[" + i + "][" + j + "]: ");
                    number[i][j] = scanner.nextInt();
                }

            }

        }
        System.out.println("\nPrinting all the numbers :");
        for (int[] row : number) {
            for (int column : row) {
                System.out.println(column);
            }
            System.out.println();
        }
    }
}
