/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23_discussion.overriding;


public class Child extends Person {
    @Override
    public void role(){
        System.out.println("I am a Child"
                + ".i give my respect of my parent");
    }
}
