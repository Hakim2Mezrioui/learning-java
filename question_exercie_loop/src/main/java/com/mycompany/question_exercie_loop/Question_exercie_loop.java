/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_exercie_loop;

import java.util.Scanner;

/**
 *
 * @author H-black
 */
public class Question_exercie_loop {

    public static void main(String[] args) {
        /*
            write a programme to print numbers from 1 to 10.
        */
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
//        
//        int c = 0;
//        do {
//            System.out.println("c = " + c);
//            c++;
//        } while (c <= 10);
        
        /*
            write a programme to calculate the sum of 10 floting 
            print numbers using for loop.
        */
        
//        float sum = 0.0f;
//        for(float i = 0.0f; i < 10; i++) {
//            sum += i;
//        }
//        System.out.println("sum = " + sum);
//        
//        Scanner in = new Scanner(System.in);   
//        float somme = 0.0f;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("enter a number: ");
//            float num = in.nextFloat();
//            somme += num;
//        }
//        System.out.println("somme = " + somme);
        
        /*
            write a programme that  asking the user to input a positive integer.
            it should the print the multiplication table of that number
        */
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int num = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, (num * i));
        }
    }
}
