/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25_discussion.enumaration;

import java.util.Scanner;

/**
 *
 * @author 03
 */
public class Menu {

    static Scanner scanner = new Scanner(System.in);

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Month currentMonth = Month.JANUARY;

        switch (currentMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:

                System.out.println("Its a winter Season");
                break;

            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("its a Spring Season");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Its a Summer Season");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Fall Season");
                break;
            default :
                System.out.println("Unknown Month..");
                return;
        }

    }
}
