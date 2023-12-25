/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch_statements;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class Switch_Statements {

    public static void main(String[] args) {
        int x = 2;
//        switch(x) {
//            case 1:
//                System.out.println("case #1");
//                break;
//            case 2:
//                System.out.println("case #2");
//                break;
//            case 3: 
//                System.out.println("case #3");
//                break;
//            default:
//                System.out.println("It is not an option");
//        }


        
//        int day = 7;
//        switch(day) { //byte, short, and int primitive data types
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("It is not a number of week");
//        }


        
        // calculatrice
        // * / % + -
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre one of these operators: * / % + -");
        char operator = in.next().charAt(0);
        
        int n1, n2;
        System.out.print("Entre n1: ");
        n1 = in.nextInt();
        System.out.print("Entre n2: ");
        n2 = in.nextInt();
        
        switch(operator) {
            case '*':
                System.out.printf("res = %d", (n1 * n2));
                break;
            case '/':
                System.out.printf("res = %d", (n1 / n2));
                break;
            case '%':{
                System.out.printf("res = %d", (n1 % n2));
                break;
            }
            case '+':
                System.out.printf("res = %d", (n1 + n2));
                break;
            case '-':
                System.out.printf("res = %d", (n1 - n2));
                break;
        }
        
    }
}
