/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class InfiniteLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxAttempts = 2;

        int pin = 12345;
        int enteredPIN;

        System.out.println("Enter Your Pin ");

        enteredPIN = input.nextInt();
        boolean accessGranded = false;
        //Validation check : compared entered Pin with the correct Pin
        //Keep Askin until the user enter the correct pin
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            if (pin != enteredPIN) {
                System.out.println("Incorrect Pin, Try Again!");
                System.out.println("Enter Your Pin :");
                enteredPIN = input.nextInt();
            } else {
                System.out.println("Access Granded!");
                break;
            }
        }
    }
}
