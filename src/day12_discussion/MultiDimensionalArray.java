/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12_discussion;

/**
 *
 * @author 03
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // systax on how declare a multi dimensional array
        String[][] colors = {
            {"white", "yellow", "pink"},//0
            {"black", "brown", "gray"},//1
            {"green"}//2
        };

        //                  rows and columms
        System.out.println(colors[0][1]);
        System.out.println(colors.length);

        //Traverse a multip-dimensional array isong for-loop
        //              0 < 3
        for (int i = 0; i < colors.length; i++) {//outer loop
            //              0 <  3
            for (int j = 0; j < colors[i].length; j++) {
                //                        0  0
                System.out.println(colors[i][j]);//inner loop
            }
            System.out.println("");//new line
        }
        
        //Traverse a multi-dimensional array usign nested for each loop
        for (String[] row : colors) {
            for (String column : row) {
                System.out.println(column);
            }
            System.out.println("");
        }

    }
}
