/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._recursion_recursive_methods_part1;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    // recursion methods
    
    /*
    recursion in jave is a process in which a method calls itself continously.
    a method in jave that calls itself is called recursive method.
    */
    
//    static void fun() {
//        System.out.println("Hi");
//        fun();
//    }  // stack over flow error = like = infinite loop
    
    
//    static int count = 0;
//    static void fun() {
//        count++;
//        if(count <= 5) {
//            System.out.println("Hi");
//            fun();
//        }
//    }
    
    
//    static int count = 0;
//    static void fun() {
//        if(count == 5) { // base case
//            return;
//        }
//        count++;
//        System.out.println("Hi");
//        fun();
//    }
    
//    static int fact(int n) { //5! = 5*4*3*2*1
//        if(n == 1 || n == 0) {
//            return 1;            
//        }
//        return n * fact(n-1);
//        /*
//        5 * fact(4) // 120
//            4 * fact(3) // 24
//                3 * fact(2) // 6
//                    2 * fact(1) // 2
//                        1
//        */
//    }
    
//    static int fact(int n) {
//        if(n < 1) {
//            return 1;
//        }
//        System.out.println("# " + n);
//        return fact(n - 1);
//    }
    
//    static void func(int n) {
//        if(n < 1) {
//            return;
//        }
//        System.out.println("# " + n);
//        func(n - 1);
//    }
    
    static void func(int n) {
        if(n < 1) {
            return;
        }
        func(n - 1);
        /*
        fact
        */
        System.out.println("# " + n);
    }
    
    public static void main(String[] args) {
//        fun();
//        System.out.println("fact(5) = " + fact(5));
//        fact(5);
        func(5);
    }
}
