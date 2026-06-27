/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8_Discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class AgeClassificationNested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Age 0 - 12 - Child
            Age : 0 - 5 - Toddler
            Age : 6 - 12 - Pre-Teen
        Age 13 - 19 - Teenager
            Age : 13 - 15 - Eary Teen
            Age : 16 - 19 - Late Teen
        Age 20 - 59 - Adult
            Age : 20 - 35 - Young Adult
            Age : 36 - 59 - Middle Age
        Age 60 - 100 -Senior Citizen
            Age : 60 -75 - Young Senior
            Age : 75 - 120 - Elderly
        
        Invalid Age - Invalid Input
        */
        System.out.print("Enter Age :");
        int age = input.nextInt();
        
        if (age >= 0 && age <= 120) {
            if (age <= 12) {// 0 - 12 
                System.out.print("You are a Child - ");
                if (age <= 5) {// Toddler
                    System.out.println("Specifically You are Toddler");
                } else {
                    System.out.println("Specifically You are Pre-Teen");
                }
            } else if (age <= 19) {// 13 - 19
                System.out.print("You are a Teenager - ");
                if (age <= 15) {
                    System.out.println("Specifically you are Eary Teen");
                } else {
                    System.out.println("Specifically you are Late Teen");
                }
            } else if (age <= 59) {// 20 - 59
                System.out.print("You are a Adult - ");
                if (age <= 35) {
                    System.out.println("Specifically you are Young Adult");
                } else {
                    System.out.println("Specifically you are Middle Age");
                }
            } else if (age <= 120) {// 60 - 120
                System.out.print("You are a Senion Citizen - ");
                if (age <= 75) {
                    System.out.println("Specifically you are young Senior");
                } else {
                    System.out.println("Specifically you are Elderly");
                }
            }
        } else {
            System.out.println("Invalid Age Entered");
        }
        
        
      
        // Code minimization
        //alt shift + f
    }
    
}
