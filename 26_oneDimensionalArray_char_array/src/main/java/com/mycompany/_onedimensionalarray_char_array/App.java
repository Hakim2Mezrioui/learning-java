/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._onedimensionalarray_char_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class App {
    // arrays (one-dimensional arrays)
    // char array
    public static void main(String[] args) {
        char hello[] = new char[5];
        hello[0]='h';
        hello[1]='e';
        hello[2]='l';
        hello[3]='l';
        hello[4]='o';
        
        for (int i = 0; i < hello.length; i++) {
            System.out.print(hello[i]);
        }
        
        System.out.println(hello);
        
        char hi[] = {'H', 'I'};
        System.out.println(hi);
        
        char aA[] = new char[] {65, 97}; // a = 65, A = 97 code ascii
        System.out.println(aA);
        
        char arr[] = new char[5];
        Scanner in = new Scanner(System.in);
        //System.out.print("entrer des caracteres: ");
        //System.out.println(in.next().toCharArray());
        //System.out.println(in.nextLine().toCharArray());
        
        //String str = in.nextLine();
        //System.out.println(str.toCharArray());
        
        
        char sort[] = new char[]{'C', 'B', 'A'};
        Arrays.sort(sort);
        System.out.println(sort);   
        
        // casting        
        System.out.println((char)67);
        
        
        char list[] = {'d', 'i', 'w', 'x', 'i'};
        String str = new String(list, 1, 3);
        System.out.println(str);
    }
}
