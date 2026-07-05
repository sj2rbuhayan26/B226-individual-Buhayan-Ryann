/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author 03
 */
public class presentation_phase {

    public static void main(String[] args) {

        System.out.println("Replace(Method)");
        String replace = "I like badminton.";
        
        // Replaces "badminton" with "basketball".
        String newText = replace.replace("badminton", "basketball");

        // Displays the original string.
        System.out.println("Original : " + replace);

        // Displays the modified string.
        System.out.println("Updated  : " + newText);

    }
}
