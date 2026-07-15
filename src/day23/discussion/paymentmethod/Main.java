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
public class Main {

    public static void main(String[] args) {
        Payment gcash = new GcashPayment();
        Payment credit = new CreditPayment();
        Payment cash = new CashPayment();
        
        gcash.pay(1000 );
        credit.pay(1500 );
        cash.pay(500 );
        
        
        
    }
}
