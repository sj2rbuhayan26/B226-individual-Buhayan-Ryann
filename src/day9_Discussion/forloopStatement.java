/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9_Discussion;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class forloopStatement {

    public static void main(String[] args) {
        //Syntax for loop

        for (int i = 1; i <= 5; i++){// ++ increment / -- Decrement
            System.out.println(i);//code Block / statement
        }
        for(int i = 0; i <= 5; i++){           System.out.println(i + 1 +": Ryann");
        } 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        
        int num = input.nextInt();

        int product = 1;
        for (int i = 1; i <=  num ; i++) {
            product *= i;
        }
        System.out.println("Your total Product : " + product  );
        
        //Print the first five even numbers
       for(int i = 1; i <= 10; i++){
          if (i % 1 == 0){
              System.out.println(i);
          }
       }
       
    }
}
