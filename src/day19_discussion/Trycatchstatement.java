/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day19_discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class Trycatchstatement {

    static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
        while (true) {
            System.out.println("** Load Registration **");
            System.out.println("    [1] Unli Text");
            System.out.println("    [2] Unli Call");
            System.out.println("    [3] Unli Call N Text");
            System.out.println("    [4] Check Balance");
            System.out.println("    [5] Exit");
            System.out.print("Enter choice: ");
            try {
                int mainMenuChoice = scanner.nextInt();

                switch (mainMenuChoice) {
                    case 1:
                        System.out.println("Enjoy Unli Text");

                        break;
                    case 2:
                        System.out.println("Enjoy Unli Call");

                        break;
                    case 3:
                        System.out.println("Enjoy Unli Call N Text");

                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please enter numeric only!. Exception occur: " + e.getMessage());
                scanner.nextLine();
            }
        }

    }
}