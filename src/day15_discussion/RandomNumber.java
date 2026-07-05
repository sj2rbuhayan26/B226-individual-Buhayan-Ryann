/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day15_discussion;

/**
 *
 * @author 03
 */
public class RandomNumber {

    public static void main(String[] args) {
        System.out.println("LOTTO");

        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 58) + 1;
            System.out.print("Lotto Numbers :");
            System.out.println("[" + (i + 1) + "]: " + randomNumber);
        }

        System.out.println("");
        System.out.println("BINGO");

        int roll = (int) (Math.random() * 75) + 1;
        String letter;
        if (roll <= 15) {
            letter = "B";
        } else if (roll <= 30) {
            letter = "I";
        } else if (roll <= 45) {
            letter = "N";
        } else if (roll <= 60) {
            letter = "G";
        } else {
            letter = "O";
        }
    
        System.out.println("Sa Letrang " + letter + " : " + roll);
    //Lotto Simulator (1 - 58)
    //String into integer 
    System.out.println (

    "");
    System.out.println (
    "Sample2");
        String x = "10";

    int num = Integer.valueOf(x);

    System.out.println (num);

    //downcasting //upcasting
    int nom = 20;

    double nums = nom; //upcasting

    float y = 10.4f;

    int num2 = (int) y;

}
}
//casting 
//parsing - convert String into primitive data to vice versa
