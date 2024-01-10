/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._multidimensional_arrays_and_passing_multidimensional_arrays_to_methods;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    
    static void print(int[][] list) {
        
        for(int row = 0; row < list.length; row++) {
            for(int col = 0; col < list[row].length; col++) {
                System.out.print(list[row][col] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
//        int arr[] = new int[5]; // one dimentional array

//        int [][]arr = new int[3][];
//        arr[0] = new int[4]; // row
//        arr[1] = new int[4]; // row
//        arr[2] = new int[4]; // row
//        
//        arr[0][0] = 55;
//        arr[0][1] = 99;
//        arr[0][2] = 59;
//        arr[0][3] = 88;
//        
//        arr[1][0] = 66;
//        arr[1][1] = 20;
//        arr[1][2] = 45;
//        arr[1][3] = 78;
//        
//        arr[2][0] = 32;
//        arr[2][1] = 66;
//        arr[2][2] = 12;
//        arr[2][3] = 63;
        
        
//        ---------------------------

//        int [][]arr = new int[][] {
//            {1, 5, 8},
//            {5, 6},
//            {4},
//        };
//        
//        System.out.println("length of row #1: " + arr[0].length);
//        System.out.println("length of row #2: " + arr[1].length);
//        System.out.println("length of row #3: " + arr[2].length);      
//        System.out.println("length of array : " + arr.length);
//        
//        for(int row = 0; row < arr.length; row++) {
//            for(int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        
//        for(int[] row:arr) { // with foreach
//            for(int col:row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
        
        //        ---------------------------
        
//        int [][]arrTransform = new int[][] { // 2 X 3
//            {1, 3, 5},
//            {2, 4, 6},
//        };
//        
//        for(int row = 0; row < 3; row++) {
//            for(int col = 0; col < 2; col++) {
//                System.out.print(arrTransform[col][row] + " ");
//            }
//            System.out.println();
//        }

        //        ---------------------------
        int [][]arr = new int[][] {
            {1, 5, 8},
            {5, 6},
            {4},
        };
        
        print(arr);
    }
}
