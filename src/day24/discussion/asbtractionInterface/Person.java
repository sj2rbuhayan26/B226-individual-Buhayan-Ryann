/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion.asbtractionInterface;

//suffix: able
//contract
public interface Person {
    //static constant
    //default : public, static , final
    public static final double FI = 3.14;
    
    
    //abstract method
    //default public , abstract
    public abstract void role();
    
    public abstract void walk();
    
    public abstract void jump();
    
}   
//Multiple Inheritance

//sybclass/Concrete method extends

//
class A extends B implements C, D{}

class B {}

interface C {}

interface D {}
//invenyory management system
/*
createProduts 
viewStocks
updateProducts
DeleteProducts
*/