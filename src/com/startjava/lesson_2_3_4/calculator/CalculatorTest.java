package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
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
                double result = calculator.calculate();
                DecimalFormat decimal = new DecimalFormat("#.###");
                System.out.println(decimal.format(result));
            } else {
                System.out.println("Введите корректный ответ - [yes / no]");
            }
            System.out.println("Вы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
        }
        System.out.println("Закончили работу.");
    }
}