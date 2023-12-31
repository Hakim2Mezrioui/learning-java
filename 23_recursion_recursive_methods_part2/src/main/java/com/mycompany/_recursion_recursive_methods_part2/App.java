/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._recursion_recursive_methods_part2;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    /*
    0 1 2 3 4 5 6 7  8  9  10 ... etc
    0 1 1 2 3 5 8 13 21 34 55 ... 35 etc
    */
    static int fib(int n) {
        if(n==0|n==1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    static int n1=0, n2=1, n3;
    static void printFib(int n) {
        if(n > 0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            printFib(n-1);
        } 
    }
    
    static int sum(int n1, int n2) {
        if(n1 == n2)
            return n1;
        else
            if(n1 < n2)
                return n1 + sum(n1 + 1, n2);
            else
                return n1 + sum(n1 - 1, n2);
    }

    public static void main(String[] args) {
        System.out.println("fib(7) = " + fib(7));
        fib(7);
        
        System.out.print(n1 + " " + n2);
        int num = 5;
        printFib(num - 2);
        
        int res = sum(5, 10);
        System.out.println("sum(10, 5) = " + res);
//        sum = (upper - lower + 1) * (lower + upper) / 2;
        System.out.println("sum = " + ( (10 - 5 + 1) * (5 + 10)/2) );
    }
}
