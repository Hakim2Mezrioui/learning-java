/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._one_dimensional_array_exercice_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {

    public static void main(String[] args) {
        /*
        Write a java program to sum values of an array.
        */
//        int digits[] = {8, 9, 2, 3};
//        int sum = 0;
        
//        for(int i = 0; i < digits.length; i++) {
//            sum += digits[i];
//        }
        
//        for(int i:digits) {
//            sum += i;
//        }
        
//        System.out.println("la somme est: " + sum);
        
        /*
        Write a program to calculate the average value of array
        */
        
//        int digits[] = {8, 9, 2, 3};
//        int sum = 0;
//        
//        for(int i:digits) {
//            sum += i;
//        }
//        
//        double average = (double)sum / digits.length;
//        System.out.println("average = " + average + " " + sum + " " + digits.length);

        /*
        Write a java program to test if an array contains a specific value.
        */
        
//        int list[] = new int[]{3, 46, 9, 29};
//        Scanner in = new Scanner(System.in);
//        System.out.print("Entrer un nombre: ");
//        int numCherche = in.nextInt();
//        
//        boolean found = false;
//        for(int num:list) {
//            if(num == numCherche) {
//                found = true;
//            }
//        }
//        
//        String res = found ? "Found" : "Not Found";
//        System.out.println("the nombre is " + res);
        
        int list[] = new int[]{3, 46, 9, 29};
        
        int max = list[0];
        int min = list[0];
        
        for(int i = 0; i < list.length; i++) {
            if(list[i] > max) {
                max = list[i];
            }
            if(list[i] < min) {
                min = list[i];
            }
        }
        
        System.out.println("max = " + max + " min = " + min);
        
        /*
        Write a program to sort a numeric array
        */
        
        int nums[] = {83, 29, 1, 39, 0, 2, 3};
        Arrays.sort(nums);
        
        for(int i:nums) {
            System.out.print(i + " ");
        }
    }
}
