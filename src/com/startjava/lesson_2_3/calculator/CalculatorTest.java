package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Желаете начать вычисления? [yes/no]");
        String inputAnswer = scanner.nextLine().toLowerCase();
        while (!inputAnswer.equals("no")) {
            if (inputAnswer.equals("yes")) {
                System.out.print("Введите первое число : ");
                calculator.setNum1(scanner.nextInt());
                System.out.print("Введите знак математической операции : ");
                calculator.setSign(scanner.next().charAt(0));
                System.out.print("Введите второе число : ");
                calculator.setNum2(scanner.nextInt());
                System.out.println("Результат вычисления = " + calculator.calculate());
            } else {
                System.out.println("Введите корректный ответ - [yes / no]");
            }
            System.out.println("Вы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
        }
        System.out.println("Закончили работу.");
    }
}