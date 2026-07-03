/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13_Activity;

/**
 *
 * @author 03
 */
public class Activity9_Buhayan {

    public static void main(String[] args) {
        String country = "Philippines";

        System.out.println(country.toUpperCase());
        System.out.println("First Character :" + country.charAt(0));
        System.out.println("Last Character :" + country.charAt(10));

        int Pcount = 0;
        int vowelcount = 0;

        // loop through each character in the string
        for (int i = 0; i < country.length(); i++) {

            char ch = country.charAt(i);

            //count the p
            if (ch == 'P' || ch == 'p') {
                Pcount++;
            }
            char lower = Character.toLowerCase(ch);

            //count vowels 
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowelcount++;
            }
        }
        System.out.println("Number of P/p :" + Pcount);
        System.out.println("Total number of vowels :" + vowelcount);
    }
}
