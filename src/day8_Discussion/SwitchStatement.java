/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8_Discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Main Menu ==");
        System.out.println("1.Start Game");
        System.out.println("2.Load Game");
        System.out.println("3.Settings");
        System.out.println("4.Exit");
        
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        
        switch (num){
            case 1 :
                System.out.println("You selected Optiom 1 : Start Game ");
                break;
            case 2 :
                System.out.println("You selected Option 2 : Load Game");
                break;
            case 3 :
               System.out.println("You selected Option 3 : Settings");
                break;
            case 4 :
                System.out.println("You selected Option 4 : Exit");    
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
        
        
        input.close();        
//            if(choice == 1){
//            System.out.println("You selected Option 1 : Start Game");
//          } else if (choice == 2){
//                System.out.println("You selected Option 2 : Load Game");
//          }  else if(choice == 3){    
//               System.out.println("You selected Option 3 : Settings");
//          }  else if (choice == 4){
//                System.out.println("You selected Option 4 : Exit");    
//          } else{
//                System.out.println("Invalid choice. Please try again.");
//          }
//            
    }
}
