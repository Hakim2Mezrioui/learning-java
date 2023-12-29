/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method_function_part1;

/**
 *
 * @author Mezrioui_Hakim
 */
public class Method_function_part1 {
    
    static void greeting() {
        System.out.println("Hello World!");
        System.out.println("You're welcome");
    }
    
    static int sumTowNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum;

        return n1 + n2;
    }
    
    static void sumTowNumbers2(int n1, int n2) {
        if (n1 == 0 && n2 == 0) 
            return;
        System.out.println("sum = " + (n1 + n2));
    }

    public static void main(String[] args) {
        greeting();
        greeting();
        
        System.out.println("------------------------------");
//        string salution = greeting(); // error because the greeting function return void
        
        System.out.println("------------------------------");
        
        int res = sumTowNumbers(3, 5);
        System.out.println("sum = " + res);
        System.out.println("sum = " + sumTowNumbers(2, 3));
        
        System.out.println("------------------------------");

        sumTowNumbers2(0, 0);
    }
}
