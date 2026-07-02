/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13_disccussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class StringClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Display the exit Confirmation menu
        System.out.println("Are you sure you want to Exit \n\t[Y] Yes \n\t [N] No ");

        //Prompt the user for their choice
        System.out.println("Enter your choice : ");
        String choice = scanner.nextLine();//Read the user input as a string

        if(choice.equalsIgnoreCase("Y")){
            System.out.println("Loggin Out...");//if user enter Y or y
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Go back to the Menu");// for any other input
            }else{
             System.out.println("Invalid Output");   
                }
        
        
        
        
        
         int num = 10;//Fixed Value

        String word = "Hello";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(2));

        System.out.println("Enter Gender :");
        String gender = "Male";

        char genderPrefix = gender.charAt(0);
        System.out.println(genderPrefix);
        System.out.println("");

        // Casing
        String name = "Ryann Buhayan U.";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println("");

        // concat
        String firstName = "Ryann";
        String lastName = "Buhayan";

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + lastName);

        // equals () methods
        System.out.println("");

        String username = "Ryann";
        String loginusername = "Ryann";

        System.out.println(username.equals(loginusername));
                    scanner.close();//close the Scanner

    }
        }

       


/*
charAt()

int num = 10; // fixed Value
 */
