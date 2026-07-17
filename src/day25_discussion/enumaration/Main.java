/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25_discussion.enumaration;

/**
 *
 * @author 03
 */
public class Main {
 enum Day {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
    
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        
        if (today == Day.MONDAY || today == Day.TUESDAY) {
            System.out.println("Start of the week");
        }else if(today == Day.WEDNESDAY || today == Day.THURSDAY) {
            System.out.println("Its the second day");
        }else if(today == Day.FRIDAY || today == Day.SATURDAY){
            System.out.println("Its the middle of week");
        }else{
            System.out.println("Weekend!");
        }
    }
}
