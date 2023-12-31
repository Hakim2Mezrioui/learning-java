/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method_function_part2_examples;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class Method_function_part2_examples {
    
    /*
        write a java method to find the smallest number among three numbers
    */
    
    static int min1(int n1, int n2, int n3) {
        if(n1 < n2 && n1 < n3)
            return n1;
        
        else if(n2 < n1 && n2 < n3)
            return n2;
        
        else if(n3 < n1 && n3 < n2)
            return n3;
        else 
            return 0;
    }
    
    static int min2(int n1, int n2, int n3) {
        int minNumber = n1;
        
        if(minNumber > n2)
            minNumber = n2;
        
        if(minNumber > n3)
            minNumber = n3;
        return minNumber;
    }
    
    static int max(int n1, int n2, int n3) {
        int maxNumber = n1;
        
        if(maxNumber < n2)
            maxNumber = n2;
        
        if(maxNumber < n3)
            maxNumber = n3;
        return maxNumber;
    }
    
    static float avg(float n1, float n2, float n3) {
//        float average, sum = n1 + n2 + n3;
//        average = sum/3;
//        return average;

        float sum = n1 + n2 + n3;
        return sum / 3;
    }
    
    static int sum(int ...n) {
        int s = 0;
        for(int i:n) {
            s += i;
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Entre the first number: ");
        n1 = in.nextInt();
        System.out.print("Entre the second number: ");
        n2 = in.nextInt();
        System.out.print("Entre the third number: ");
        n3 = in.nextInt();
        
        System.out.println("min = " + min2(n1, n2, n3));
        System.out.println("min = " + max(n1, n2, n3));
        System.out.println("avg = " + avg(n1, n2, n3));
        System.out.println("sum = " + sum(n1, n2, n3, 6, 2, 1));        
    }
}
