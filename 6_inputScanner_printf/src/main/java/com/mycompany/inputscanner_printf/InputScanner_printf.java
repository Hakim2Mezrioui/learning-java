/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputscanner_printf;
import java.util.Scanner;

/**
 *
 * @author Mezrioui_Hakim
 */
public class InputScanner_printf {
    //input
    /*
        nextBoolean()
        nextByte()
        nextShort()
        nextLong()
        nextFloat()
        nextDouble()
        next()
        nextLine()
    */
    
    // formating
    /*
        d: [byte, short int, long]
        f: [float, double]
        cC: charactere capital C will uppercase the letter
        sS: String Capital S will uppercase all the letters in the string
        n: new line
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int f = input.nextInt();
        System.out.println("number = " + f);
        
        
        // la somme
        System.out.print("Entre the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Entre the second number: ");
        float num2 = input.nextFloat();
        
        System.out.printf("num1 = %.2f num2 = %.3f \n", num1, num2);
        System.out.println("result = " + (num1 + num2));
        
        System.out.print("Entre your first name: ");
        String fname = input.next();
        System.out.print("Entre your second name: ");
        String lname = input.next();
        System.out.printf("Hello %S %s%n", fname, lname);   
        
        System.out.print("enter a caractère: ");
        char caractere = input.next().charAt(0);
        System.out.printf("caractère: %s%n", caractere);
        
//        System.out.println("Entre you sentence with space: ");
//        String phraseOne = input.next();
//        System.out.println("Enter you Sentence with space also: ");
        String phraseTwo = input.nextLine();
//        System.out.println(phraseOne);
        System.out.println(phraseTwo);
    }
}
