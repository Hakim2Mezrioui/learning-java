/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.do_while_loop;

import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class Do_while_loop {

    public static void main(String[] args) {
//        int count = 0;
//        do {
//            System.out.println("Java");
//            count++;
//        } while (count < 5);
        
//        do {
//            System.out.println("Java");
//            count++;
//        } while (count < -1);

// -------------------------------------
        Scanner in = new Scanner(System.in);
        char letter;
        int count = 0;
        
        do {
            letter = in.next().charAt(0);
            if(letter != 'q') count++;
        } while (letter != 'q');
        System.out.println("number of caractere is " + count);
    }
}
