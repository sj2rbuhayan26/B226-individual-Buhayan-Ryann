/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.paymentmethod;

/**
 *
 * @author 03
 */
public class CashPayment extends Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid P " + amount + "Using Cash Payment");
    }
}
