/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8_Discussion;

import java.util.Scanner;


public class ConditionalStatement {
    public static void main(String[] args) {
        
        // Predefine username and password 
        String username = "ryann";
        String password = "ryann123";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Sign Up  ===");
        // Create Scanner object to accept input from the user
        System.out.print("Enter Username : ");// Ask User for Usernam
        String loginusername = input.nextLine();// Get the User input
        System.out.print("Enter Password : " );// Ask user Password
        String loginpassword = input.nextLine();
        
        //Chech if both username and password match the predefined values
        if (loginusername.equals(username)&& loginpassword.equals(password)){
           System.out.println("Login Success : " + " Welcome ! ," + username);
        }   else {
                System.out.println("Invalid username or password");
                }
//        if(loginusername.equals(username)&& loginpassword.equals(password)){
//            System.out.println("Login Successful");
//        } else if (loginusername.equals(username)&& !loginpassword.equals(password)){
//            System.out.println("Incorrect Password");
//        }else{
//            System.out.println("Incorrect Username");
//        }
               
        
        // close the scanner
        input.close();
    }
}
