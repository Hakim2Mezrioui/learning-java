/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._one_dimensional_arrays_1d_array;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    /*
    An array is a container object
    that holds a fixed number of values of a single type
    */
    public static void main(String[] args) {
        int []n = new int[5]; // or int n[] = new int[5];
        n[0] = 15;
        n[1] = 33;
        n[2] = 52;
        n[3] = 85;
        n[4] = 55;
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
        System.out.println(n[4]);
        
//        n[10] = 40; error array index out of bounds exception
//        System.out.println(n[10]);

        int num[] = {3, 29, 5};
        System.out.println("length = " + num.length);
        
//        num[7] = 47; // error: java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(num[7]); 
        double dbl[] = new double[6];
        System.out.println(dbl[0]);
        
        boolean []bool = new boolean[2];
        System.out.println(bool[0]);
        
        String str[] = new String[3];
        System.out.println(str[0]);
        
//        String []names = {"hakim", "adam", "yassin"};
        String names[] = new String[]{"hakim", "adam", "yassin", "ossama"} ;
        
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.println("name # " + i + " " + names[i]);
        }
        
        for (String name:names) {
            System.out.println(name);
        }
    }
}