/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.break_continue;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class Break_Continue {
    /*
        Branching Statements
        The break Statement: Causes immediate exit from control structure
        The continue Statement: Skips remaining statement in loop body
    */
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            if(i == 4) 
//                break;
//            System.out.println("i = " + i);
//        }
//        System.out.println("---------------------------------------");
//        for (int i = 0; i <= 10; i++) {
//            if(i == 4) 
//                continue;
//            System.out.println("i = " + i);
//        }        
        
//        System.out.println("---------------------------------------");
//        for (int i = 0; i <= 10; i++) {
//            if(i <= 4) 
//                continue;
//            System.out.println("i = " + i);
//        }
        
//        System.out.println("---------------------------------------");
//        for (int i = 0; i <= 10; i++) {
//            if(i <= 4) 
//                break;
//            System.out.println("i = " + i);
//        }
        
//        exercice
        System.out.println("Test your self: ");
        System.out.println("What is '5+10/2*10 = ?'");
        
        float userAnswer, theCorrectAnswer = 55;
        boolean questionAnswer = false;
        
        Scanner in = new Scanner(System.in);
        
        for(int i = 1; i <= 3; i++) {
            userAnswer = in.nextFloat();
            if(userAnswer == theCorrectAnswer) {
                questionAnswer = true;
                System.out.println("Your Answer is correct");
                break;
            }else if(userAnswer != theCorrectAnswer) {
                if(i == 3) 
                    continue;
                System.out.println("Chance #" + (i+1) + " : ");
            }
        }
    }
}
