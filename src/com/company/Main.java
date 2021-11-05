package com.company;

import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вас приветствует калькулятор 1.0");
        System.out.println("Введите пожалуйста свои числа: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Ваши числа приняты, выберите действие которое будет производится с числами: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Работа с матрицами");
        int actNum = scanner.nextInt();
        actions(actNum, num1, num2);
    }

    static void actions(int Int, double num1, double num2){
        switch(Int){
            case 1:
                System.out.print("Результат операции: ");
                SimpleMathActions.addition(num1, num2);
                break;
            case 2:
                System.out.print("Результат операции: ");
                SimpleMathActions.subtraction(num1, num2);
                break;
            case 3:
                System.out.print("Результат операции: ");
                SimpleMathActions.multiplication(num1, num2);
                break;
            case 4:
                System.out.print("Результат операции: ");
                SimpleMathActions.division(num1, num2);
                break;
            case 5:
                System.out.print("Результат операции: ");
                break;
            default:
                System.out.println("Ошибка. Неизвестное число. Попробуйте ещё раз.");
                break;
        }
    }
}