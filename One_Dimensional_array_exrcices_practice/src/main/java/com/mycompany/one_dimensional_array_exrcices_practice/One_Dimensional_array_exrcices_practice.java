/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.one_dimensional_array_exrcices_practice;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class One_Dimensional_array_exrcices_practice {

    public static void main(String[] args) {
        /*
        write a java prgram to sum values of an array.
        */
        
//        int numbers[] = {7, 3, 2, 8};
//        int sum = 0;
//        
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }        
//        System.out.println("sum = " + sum);
//        
//        sum = 0;
//        for (int i:numbers) {
//           sum += i;
//        }
//        System.out.println("sum = " + sum);
//        
        /* 
        write a java program to calculate the average value of array
        */
        
//        int nums[] = new int[5];
//        
//        Scanner in = new Scanner(System.in);
//        
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("Entre a Element: ");
//            nums[i] = in.nextInt();
//        }
//        
//        sum = 0;
//        for(int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        
//        double avg = sum/nums.length;
//        System.out.println("average = " + avg);
        
        /*
        Write a java program to test if an array contains a specific value.
        */
        
        int digits[] = {2, 9, 3, 5, 1};
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int digit = in.nextInt();
        
        boolean found = false;
        for(int n:digits) {
            if(n == digit) {
                found = true;
            }
        }
        
        if(found) {
            System.out.println("is found");
        } else {
            System.out.println("not found");
        }
    }
}
