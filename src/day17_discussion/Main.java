/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17_discussion;

/**
 *
 * @author 03
 */
public class Main {

    public static void main(String[] args) {
        // instantation
        //class name objectName = new Constructor();

        Ballpen ballpen = new Ballpen();

        ballpen.brand = "Hbw";
        ballpen.color = "Black";
        ballpen.pointSize = 0.5f;
        ballpen.weigthInGrams = 9;

        System.out.println("Ballpen 1");
        System.out.println("Brand : " + ballpen.brand);
        System.out.println("Color : " + ballpen.color);
        System.out.println("Point Size : " + ballpen.pointSize);
        System.out.println("Weigth In Grams : " + ballpen.weigthInGrams);
        System.out.println("");
        ballpen.draw();
        ballpen.write();
        ballpen.sketch();

        System.out.println("");
        
        System.out.println("Ballpen 2");
        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand = "Panda";
        ballpen2.color = "Red";
        ballpen2.pointSize = 0.6f;
        ballpen2.weigthInGrams = 8;
        
        System.out.println("Brand : " + ballpen2.brand);
        System.out.println("color :" + ballpen2.color);
        System.out.println("");
        ballpen2.draw();
        ballpen2.sketch();

        Ballpen ballpen3 = new Ballpen();
        ballpen3.brand = "Pilot";
        ballpen3.color = "Blue";
        ballpen3.pointSize = 0.7f;
        ballpen3.weigthInGrams = 5;

        ballpen3.sketch();

    }
}
