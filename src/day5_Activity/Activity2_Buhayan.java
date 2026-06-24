/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_Activity;

/**
 *
 * @author 03
 */
public class Activity2_Buhayan {
    public static void main(String[] args) {
         double income = 50000;  
         double foodAllowance = 15000;
         double transportation = 2500;  
         double rent = 4500;  
         double utilityBill = 3500;   
         
         double foodpercent = (foodAllowance / income)* 100;
         double transportationpercent = (transportation / income)* 100;
         double rentpercent = (rent / income)* 100;
         double utilitybillpercent = (utilityBill / income)*100;

         double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill);
         
         System.out.println("Income : " + (int) income);
         System.out.printf("Food Allowance: %.1f%%\n", foodpercent);
         System.out.printf("Transportation: %.1f%%\n", transportationpercent);
         System.out.printf("Rent: %.1f%%\n", rentpercent);
         System.out.printf("Utility Bill: %.1f%%\n", utilitybillpercent);
         System.out.println("Remaining Balance: " + (int) remainingBalance);
    }
    
}
