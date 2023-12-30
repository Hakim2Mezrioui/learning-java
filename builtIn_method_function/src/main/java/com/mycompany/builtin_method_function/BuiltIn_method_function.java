/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builtin_method_function;

//import static java.lang.Math.abs;
//import static java.lang.Math.ceil;
import static java.lang.Math.*;

/**
 *
 * @author Mezrioui_Hakim
 */
public class BuiltIn_method_function {
    // built-in functions - methods
    /*
    Java Number Methods: https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
    Java Number Methods (Math): https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
    Java String Methods
    Java Character Methods
    Java Array Methods
    */
    
    /*
    static double	abs(double a)
    static float	abs(float a)
    static int          abs(int a)
    static long         abs(long a)
    static double	ceil(double a)
    static double	floor(double a)
    static double	max(double a, double b)
    static float	max(float a, float b)
    static int          max(int a, int b)
    static double	min(double a, double b)
    static float	min(float a, float b)
    static int          min(int a, int b)
    static double	pow(double a, double b)
    static double	random()
    static long         round(double a)
    static double	rint(double a)
    */

    public static void main(String[] args) {
//        System.out.println("abs = " + abs(-1.1));
//        System.out.println("abs = " + ceil(-1.1));
//        System.out.println("floor = " + Math.floor(1.9));
//        System.out.println("round = " + round(2.3));
//        System.out.println("round = " + round(2.6));
//        System.out.println("sqrt = " + sqrt(9));
//        System.out.println("pow = " + pow(3, 2));
//        System.out.println("random = " + random());
//        System.out.println("random = " + random() * 10); // 0 to 10
//        (random() * ((max-min)+1))+min;
//        System.out.println("random = " + ((random() * (7-4)+1)+4));
        int r = (int) ((random() * (7-4)+1)+4);
        System.out.println("random = " + r);
    }
}
