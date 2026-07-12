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
public class Main {

    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("panda", "blue", 24, 15);
        ballpen.setBrand("Pilot");
        ballpen.setColor("Black");
        ballpen.setId(5);
        ballpen.setPrice(15.50);
        ballpen.setpointSize(0.9);

        ballpen.getBrand();
        ballpen.getColor();
        ballpen.getPrice();
        ballpen.getpointSize();
        ballpen.getId();

        System.out.println("Brand : " + ballpen.getBrand());
        System.out.println("Color : " + ballpen.getColor());
        System.out.println("Price : " + ballpen.getPrice());
        System.out.println("Point Size : " + ballpen.getpointSize());
        System.out.println("Id : " + ballpen.getId());
    }
}
