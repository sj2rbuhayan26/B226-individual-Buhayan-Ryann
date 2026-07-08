/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17_activity;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("==== Intro of OOP ====");
        System.out.println("  Activity 13 Day 17 ");
        System.out.println("======================");

        

                 
                    Cellphone cellphone = new Cellphone();

                    cellphone.brand = "Infinix";
                    cellphone.color = "Ligth blue";
                    cellphone.size = 6.9f;
                    cellphone.storage = 256;

                    System.out.println("Brand Phone : " + cellphone.brand);
                    System.out.println("Color : " + cellphone.color);
                    System.out.println("Size : " + cellphone.size);
                    System.out.println("Memory Storage : " + cellphone.storage);

                    System.out.println("======================");
                    System.out.println("       Purpose        ");
                    System.out.println("======================");

                    cellphone.communication();
                    cellphone.information();
                    cellphone.navigation();
                   
                    System.out.println("======================");
                    System.out.println("");

                  
                    Cellphone cellphone2 = new Cellphone();

                    cellphone2.brand = "Samsung";
                    cellphone2.color = "Black";
                    cellphone2.size = 7f;
                    cellphone2.storage = 128;

                    System.out.println("Brand Phone : " + cellphone2.brand);
                    System.out.println("Color : " + cellphone2.color);
                    System.out.println("Size : " + cellphone2.size);
                    System.out.println("Memory Storage : " + cellphone2.storage);

                    System.out.println("======================");
                    System.out.println("       Purpose        ");
                    System.out.println("======================");

                    cellphone2.information();
                    cellphone2.navigation();
                    System.out.println("======================");
                   
                    Cellphone cellphone3 = new Cellphone();

                    cellphone3.brand = "Iphone";
                    cellphone3.color = "White";
                    cellphone3.size = 6f;
                    cellphone3.storage = 64;

                    System.out.println("Brand Phone : " + cellphone3.brand);
                    System.out.println("Color : " + cellphone3.color);
                    System.out.println("Size : " + cellphone3.size);
                    System.out.println("Memory Storage : " + cellphone3.storage);

                    System.out.println("======================");
                    System.out.println("       Purpose        ");
                    System.out.println("======================");

                    cellphone3.communication();
                    cellphone3.navigation();
                    System.out.println("======================");
                  

       

    }
}
