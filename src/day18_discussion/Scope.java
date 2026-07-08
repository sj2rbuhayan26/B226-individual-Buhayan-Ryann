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
public class Scope {
    int num = 10;// instance method
    static int num2 = 20;// static method
    
    public static void main(String[] args) {
        String name = "Ryann"; //local variable
        System.out.println(name);
        Scope scope = new Scope();
        System.out.println(scope.num);
        System.out.println(num2);
    }
    public static void sum() {
        Scope scope = new Scope();
        System.out.println(scope.num);
        System.out.println(num2);
    }
    public void product() {
        System.out.println(num2);
    }
    public void greet (){
        // if loop switch
        if (true) {
            int sum = 10;
        }
        for (int i = 0; i < 10; i++) {  
        }
        
    }
}
