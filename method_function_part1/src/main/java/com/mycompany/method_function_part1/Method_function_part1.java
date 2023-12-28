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
    }

    public static void main(String[] args) {
        greeting();
        greeting();
        
        int res = sumTowNumbers(3, 5);
        System.out.println("sum = " + res);
    }
}
