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
    
//  if and else
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

// else if
//    Scanner in = new Scanner(System.in);
//    
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
//    else if(num < 0) {
//        System.out.println("The number is negative");
//    } else
//            System.out.println("The number equal zero");
//    
//    }

// operator logic

//    Scanner in = new Scanner(System.in);
//    System.out.print("Enter Your Mark: ");
//    int mark = in.nextInt();
//    
//    if(mark >= 90 && mark < 100) {
//        System.out.println("A");
//    } else if(mark >= 80 && mark < 90) {
//        System.out.println("B");
//    } else if (mark >= 70 && mark < 80) {
//        System.out.println("C");
//    } else if (mark >= 60 && mark < 70) {
//        System.out.println("D");
//    } else {
//        System.out.println("The Mark Not Valid");
//    }


// Ternary operator
// or shorthand if else statement
// shorttest if else
// ?:

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        
//        String result = (num > 0) ? "positif" : "negative";
//        
//        System.out.println(result);
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = in.nextInt();
        
        String res = (mark >= 90 && mark < 100) ? "A" : 
                     (mark >= 80 && mark < 90) ? "B" :
                     (mark >= 70 && mark < 80) ? "C" :
                     (mark >= 60 && mark < 70) ? "D" : 
                     "The Mark Not Valid" ;
        
        System.out.println(res);
        
//        instanceof
        System.out.println(res instanceof String);
                
    }
}