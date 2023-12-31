/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_loop;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class While_Loop {

    public static void main(String[] args) {
        // count ontrolled while loop
        // infinite loop        
//        while(true) {
//            System.out.println("Hi");
//        }
        
//        int count = 1;
//        
//        while(count <= 5) {
//            System.out.println("Hi #" + count);
//            ++count;  // increment prefix
//        }
        
//        System.out.println("count = " + count); // count = 6 au final
        
//        -----------------------------------------

//        int count = 5;
//        
//        while(count >= 1) {
//            System.out.println("Hi #" + count);
//            count--;  // increment postfix
//        }
//        
//        System.out.println("count = " + count); // count = 0 au final

//        -----------------------------------------        
        
//        int count = 5;
//        
//        while(count >= 1) {
//            System.out.println("Hi #" + count);
//            count -= 2;
//        }
//        
//        System.out.println("count = " + count); // count = -1 au final

//        -----------------------------------------

//        int count = 1;
//        
//        while(count++ <= 5) {
//            System.out.println("Hi #" + count);
//        }
//        
//        System.out.println("count = " + count); // count = 7 au final

//        -----------------------------------------

//        int count = 1;
//        
//        while(++count <= 5) {
//            System.out.println("Hi #" + count);
//        }
//        
//        System.out.println("count = " + count); // count = 6 au final

//        ----------------------------------------- 

        // flag controlled while loop
        
//        char letter = 'a';
//        int count = 0;
//        
//        Scanner in = new Scanner(System.in);
//        boolean flag = true;
//        
//        while(flag) {
//            letter = in.next().charAt(0);
//            count++;
//            
//            if(letter == 'q') {
//                flag = false;
//            }
//        }
//        System.out.println("number of caractere is " + count);
    
        // sentinel controlled while loop
        
        Scanner in = new Scanner(System.in);
        float sum = 0;
        float grade = 0;
        int count = 0;
        while (grade != -1) {
            System.out.print("Enter grade #" + (count + 1) + ": ");
            grade = in.nextFloat();
            if(grade != -1) {
                sum += grade;
                count++;
            }
        }
        
        System.out.printf("Avg = %.2f", (sum/count));
    }
}
