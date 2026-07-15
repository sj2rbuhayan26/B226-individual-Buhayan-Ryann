/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.paymentmethod;

public class GcashPayment extends Payment {
    
    @Override
    public void pay(double amount){
        System.out.println("Pay P " + amount + "Using Gcash Payment");
    }
    
    @Override
    public void deposit(double amout, String refNum){
        System.out.println("Deposit...");
    }
}
