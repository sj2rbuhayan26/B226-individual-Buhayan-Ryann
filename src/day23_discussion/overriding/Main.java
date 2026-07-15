/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23_discussion.overriding;

public class Main {

    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("     Family Role");
        System.out.println("=====================");
        //person initiator
        //father parent
        //child child
//        Person father = new Father();
//        Person child = new Child();
//        Person husband = new Husband();
//        
//        father.role();
//        System.out.println("");
//        child.role();
//        System.out.println("");
//        husband.role();
        
        Father father = new Father();
        father.printName();
        
        
        //runtime - exception it show if excute
        //Compile time - it show ide that show red or you are coding
    }
}
