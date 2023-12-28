/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labeledbreak_labeledcontinue;

/**
 *
 * @author Mezrioui_Hakim
 */
public class LabeledBreak_labeledContinue {
    // labled break statement
    // labelled continue statement
    public static void main(String[] args) {
//        test:{
//            if(5 < 6)
//                break test;
//            
//            System.out.println("hello world");
//            System.out.println("you're welcome");
//        }
        
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if(i == 5)
//                    break;
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        
//        stop:{
//            for (int i = 0; i <= 10; i++) {
//                for (int j = 0; j <= 5; j++) {
//                    if(i == 5)
//                        break stop;
//                    System.out.print("* ");
//                }
//                System.out.println("");
//            }
//        }   


//        stop:for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if(i == 5)
//                    break stop;
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

        
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 10; j++) {
//                if(j > i)
//                    continue ;
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 10; j++) {
//                if(j > i)
//                    continue ;
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        
        
        nextRow:for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j <= 10; j++) {
                if(j > i)
                    continue nextRow;
                System.out.print("* ");
            }
            System.out.println("line #" + i);
        }
    }
}
