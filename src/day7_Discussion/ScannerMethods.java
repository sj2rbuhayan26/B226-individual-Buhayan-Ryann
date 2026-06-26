/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_Discussion;

import java.util.Scanner;
                //User Input
public class ScannerMethods {
    public static void main(String[] args) {
   //Class  Object
    Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Full Name :");
        String name = input.nextLine();//String Input

        System.out.print("Age : ");
        int age = input.nextInt();//Int Input
        
        System.out.print("Salary : ");
        double salary = input.nextDouble();//Double input

        
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
      

    }
}
