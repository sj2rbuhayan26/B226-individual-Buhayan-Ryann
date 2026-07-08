/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day18_discussion;

/**
 *
 * @author 03
 */
public class Methodinvocation {

    public static void main(String[] args) {
        Methodinvocation obj = new Methodinvocation();
        obj.b();
        //kahit wala ng class
        a();
    }

    //Static Method 
    public static void a() {
        System.out.println("Accessing static method...");
    }

    //instance Method 
    public static void b() {
        System.out.println("Accessing instance method...");
    }
}
