/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_dicussion;

/**
 *
 * @author 03
 */
public class LogicalOperator {
    public static void main(String[] args) {
        // && logical
//        int num = 100;
//        int num1 = 200;
//        
//        boolean result = num < num1 && num >num1;
//        
//        System.out.println(result);
        
        /*  &&          Result
            T   T       T
            T   F       F
            F   T       F
            F   F       F
        */
        
        /* ||           Result
            T   T       T
            T   F       T
            F   T       T
            F   F       F
        */
         boolean hasTicket = true;
         boolean isVaccinationCard = true;
         boolean isStudent = false;
         boolean isSeniorCitizen = true;
         boolean isLoggedIn = true;
         
         // May Ticket ako -> pwede ako pumasok sa cinehan (&&)
         System.out.println("Allowed  to enter in cinema : " + (hasTicket && isVaccinationCard));
         
         //May Ticket Student/Senior Citizen -> Discounted (||)
         System.out.println("Not Discounted : " + (isStudent && isSeniorCitizen));
         System.out.println("Eligble for Discounted : " + (isStudent || isSeniorCitizen));
         
         //Hindi naka log In sa App (!)NOT
         System.out.println("Can Reserved Seat :" + isLoggedIn);
         System.out.println("Can't Reserved Seat : " + !isLoggedIn);
    }
}
