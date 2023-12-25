/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selectstatement_if_else_ifelseif;

import java.util.Scanner;

/**
 *
 * @author H-black
 */
public class SelectStatement_if_else_ifElseIf {

    public static void main(String[] args) {
//        int num = 4;
//        if(num == 5)
//            System.out.println("number = 5");
//        
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");

//    Scanner in = new Scanner(System.in);
    
//    System.out.print("Enter a number: ");
//    int num = in.nextInt();
//        
//    if(num > 0) {  
//        System.out.println("The number is positif");
//        if(num % 2 == 0) {            
//            System.out.println("Even number");
//        } else 
//            System.out.println("Odd number");
//    }
//    else {
//        System.out.println("The number is negative");
//    }
//    
//    }

    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = in.nextInt();
        
    if(num > 0) {  
        System.out.println("The number is positif");
        if(num % 2 == 0) {            
            System.out.println("Even number");
        } else 
            System.out.println("Odd number");
    }
    else if(num < 0) {
        System.out.println("The number is negative");
    } else
            System.out.println("The number equal zero");
    
    }
}
