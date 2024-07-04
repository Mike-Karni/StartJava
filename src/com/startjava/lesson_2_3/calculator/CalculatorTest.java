package com.startjava.lesson_2_3.calculator;


import java.util.Arrays;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Желаете начать вычисления? [yes/no]");
        String inputAnswer = scanner.nextLine().toLowerCase();
        while (!inputAnswer.equals("no")) {
            if (inputAnswer.equals("yes")) {
                System.out.println("Введите математическое выражение в формате a 'знак операции' b");
                calculator.setMath(scanner.nextLine());
                String[] symbols = calculator.getMath().split(" ", 0);
                if (Double.isNaN(Double.parseDouble(symbols[0])) || Double.isNaN(Double.parseDouble(symbols[2]))) {
                    System.out.println("Вы ввели не число");
                }
                for (int i = 0; i < symbols.length; i++) {
                    if (i < 2) {
                        System.out.print(symbols[i] + " ");
                    } else {
                        System.out.print(symbols[i] + " = ");
                    }
                }
                System.out.printf("%.3f", calculator.calculate(calculator.getMath()));
            } else {
                System.out.println("Введите корректный ответ - [yes / no]");
            }
            System.out.println("\nВы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
        }
        System.out.println("Закончили работу.");
    }
}