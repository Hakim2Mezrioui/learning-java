/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._passin_arrays_to_methods;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    public static void print(int []x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("x[%d] = %d \n", i, x[i]);
        }
    }
    
    static int[] getArray() {
//        int ar[]={4,5,6};
//        return ar;

        return new int[] {3, 9, 2};
    }
    
    static void setArray(int []x ) {
        x[0] = 50;
    }
    
    static void setVar(int x) {
        x = 50;
    }
    
    public static void main(String[] args) {
        int digits[] = {3, 6, 9, 2, 3};
        
//        print(new int[] {1,2,3,4,5});

//        int arr[] = getArray();
//        System.out.println(arr[0]);
        
//        int arr1[] = {1, 2, 3};
//        int arr2[] = {40, 50, 60};        
//        arr1 = arr2;
//        arr2[0] = 100;
//        arr1[0] = 500;
//        System.out.println(arr1[0]);
        
//        int ls[] = {10, 20, 30};
//        setArray(ls);
//        System.out.println(ls[0]);

//        int y = 5;
//        setVar(y);
//        System.out.println(y);

        int arr1[] = {1, 2, 3};
        int arr2[] = {40, 50, 60};
        int arr3[] = {70, 80, 90};
        
        arr1 = arr2 = arr3;
        arr1[0] = 0;
        
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
    }
 }

