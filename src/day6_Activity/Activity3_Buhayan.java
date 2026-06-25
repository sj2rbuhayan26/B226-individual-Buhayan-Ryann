/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_Activity;

/**
 *
 * @author 03
 */
public class Activity3_Buhayan {
    public static void main(String[] args) {
        // Age must be 18 or above.
        //Must have a valid ID.
            int age = 20;
            boolean hasValidID = true;

            boolean allowed = (age >= 18)&& hasValidID;

            String responce = allowed ? "Access Granded" : "Access Denied";
            
            System.out.println(responce);
   
         // No classes if it is a weekend OR a holiday.
         boolean isWeekend = true;
         boolean isHoliday = false;
         
         String classes = (isWeekend || isHoliday)? "No Classes Today" : "Yes Class Today";
         
         System.out.println(classes);
          
         //75 and above = Passed
         //Below 75 = Failed
         int score = 85;

        String result = (score >= 75) ? "Passed" : "Failed";
        

        System.out.println(result);
        
         // The larger number is : 25
         int num1 = 10;
         int num2 = 25;
         
         int larger = (num1 > num2) ? num1 : num2;
         
         System.out.println("The Larger number : " + larger);
    }
}
