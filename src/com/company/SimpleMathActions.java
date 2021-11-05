package com.company;

import com.company.Main;

public class SimpleMathActions
{
    public static void addition(double num1, double num2){
        double num3 = num1 + num2;
        if(num3 % 1 == 0) {
            System.out.print((int)num3);
        }
        else System.out.print(num3);
        /**
         * Если число не является дробью, то оно преобразовывается в int, иначе просто выводится
         * */
    }
    public static void subtraction(double num1, double num2){
        double num3 = num1 - num2;
        if(num3 % 1 == 0) {
            System.out.print((int)num3);
        }
        else System.out.print(num3);
    }
    public static void multiplication(double num1, double num2){
        double num3 = num1 * num2;
        if(num3 % 1 == 0) {
            System.out.print((int)num3);
        }
        else System.out.print(num3);
    }
    public static void division(double num1, double num2){
        if(num1 % num2 % 1 == 0){
            System.out.print((int)num1 / num2);
        }
        else System.out.print(num1 / num2 + "." + num1 % num2);
    }
}
