/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17_discussion;
// Srp - Single Responsibility purpose
//will act as a blueprint of an object that you want to implement
public class Ballpen {
    // attribute // fields 
    String brand;
    String color;
    float pointSize;
    double weigthInGrams;
    
    // purpose // methods
    public void write(){
        System.out.println("Wrinting...");
    }
    public void draw(){
        System.out.println("Texture...");
    }
    public void sketch(){
        System.out.println("Drawing...");
    }
}
