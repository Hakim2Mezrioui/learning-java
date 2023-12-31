/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticoperators;

/**
 *
 * @author H-black
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        // basic operators (arithmetic Operators)
        byte x = 10;
        System.out.println("x = " + x);
        
        System.out.println((5+6)*2);
        int exp = (5+6)*2;
        System.out.println(exp);
        
        long res = (58393 * 2)/4;
        System.out.println(res);
        
        int resultat = 13/3;
        int reste = 13%3;
        
        System.out.println("13 divise par 3 vaut " + resultat + " le reste est " + reste);
        
        System.out.println(15.3f/(float)3);
        
        float num = 5.3f;
        System.out.println("num " + (int)num); // converstion
        
    }
}
