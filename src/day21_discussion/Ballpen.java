/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21_discussion;

/**
 *
 * @author 03
 */
public class Ballpen {
    //this - refers to the current class object
    //data hiding -> making all the data member private
    // data validation ->  data use setter and getter method 
    private int id;
    private String brand;
    private String color;
    private double price;
    private double pointSize;
    
    //brand1 - conventional / unconventional
    //setter method / mutator method 
    
    //default constructor
    //parameter constructor / setter constructor
    public Ballpen(){
        
    }
    public Ballpen(String brand, String color, double price , double pointSize){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.pointSize = pointSize;
        
        System.out.println("This ballpen is created :");
    }
    //setter]
    public void setId(int id){
        this.id = id;
    }
    public void setBrand(String brand){
       this.brand = brand;
    }
    
    public void setColor(String color){
        this.color = color;
    }  
    public void setPrice(double price){
        this.price = price;
    }
    public void setpointSize(double pointSize){
        this.pointSize = pointSize; 
    }
    // getter method / accessor method
    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public double getpointSize(){
        return pointSize;
    }
}
