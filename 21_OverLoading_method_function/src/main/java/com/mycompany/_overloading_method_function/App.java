/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._overloading_method_function;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
    
    public static float sum(float n1, float n2) {
        return n1 + n2;
    }
    
    public static float sum(float n1, int n2) {
        return n1 + n2;
    }
    
    // exemple
    
    static float order(float total) {
        return total;
    }
    
    static float order(float total, int deliveryCosts) {
        return total + deliveryCosts;
    }
    
    static float order(float total, int deliveryCosts, String Promo) {
        return total + deliveryCosts - 2;
    }
    
    static void fun() {
        System.out.print("fun");
    }
    
    static void fun(int x) {
        fun();
        System.out.println("x = " + x);
    }
    
    public static void main(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println("sumInt = " + sum(10, 50));
        System.out.println("sumFloat = " + sum(3.2f, 4.3f));
        System.out.println("sumFloatInt = " + sum(1.3f, 3));
        
        fun(10);
        
        main(20);
    }
}
