/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion.arrayList;

import java.util.ArrayList;

/**
 *
 * @author 03
 */
public class ArrayListDiscussion {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Dodge");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Buggati");
        cars.add("Ferrari");
        
        cars.add(1,"Lightning McQueen");
        
        System.out.println(cars.get(0));
        System.out.println(cars.get(cars.size() -1));
        
        
        cars.set(1, "Dodge");
        
        System.out.println(cars.get(1));
        
        cars.remove(1);
        cars.remove("Toyota");
        System.out.println(cars);
    }
    
    /*
    Crud Operator
    Create - create
    Read - get
    Update - set
    Delete - remove
    
    Delete all - removeall() / clear()
    */
}
