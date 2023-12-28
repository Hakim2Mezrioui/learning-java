/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.neastedloop;

/**
 *
 * @author Mezrioui_Hakim
 */
public class NeastedLoop {
    /*
        Nested loop (loop inside loop).
    */
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Outer loop " + i);
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("Nested loop " + j);
//            }
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Outer loop i = " + i);
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("Nested loop j = " + j);
//                for (int k = 1; k <= 2; k++) {
//                    System.out.println("Nested loop k = " + k);
//                }
//            }
//        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer loop i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nested loop j = " + j + " i = " + i);
                for (int k = 1; k <= 2; k++) {
                    System.out.println("Nested loop k = " + k + " i = " + i + " j = " + j);
                }
            }
        }
    }
}
