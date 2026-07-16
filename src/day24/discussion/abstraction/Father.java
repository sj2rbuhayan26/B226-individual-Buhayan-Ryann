/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion.abstraction;

//concrete class / non abstract method  
public class Father extends Person {
    
    @Override
    public void role(){
        System.out.println("I am a Father to protect Family..");
    }
}
