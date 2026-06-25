/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_dicussion;

/**
 *
 * @author 03
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //Syntax
        // (cond) ? : true block : false block;
        // Positive or Negative
        
        int num = 1;
        int num1 = 2;
        
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println(result);

        //Fever or Normal Temp
        
        float temp = 40.5f;
        
        String tempResult = temp >= 40.2 ? "Fever" : "Normal Temp";
        
        System.out.println(tempResult);
        
        //Neutral , Positive or Negative
        int num2 = -1;
        
        String results = (num2 == 0) ? "Neutral"
                : (num2 > 0) ? "Positive"
                : (num2 > 100) ? "Number is greater than 10"
                : "Negative";
        System.out.println( "Your Result : " + results);
     }
}
