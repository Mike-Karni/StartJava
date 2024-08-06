package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = "";
        while (!inputAnswer.equals("no")) {
            System.out.println("Введите математическое выражение в формате '2 ^ 10'. ");
            String expression = scanner.nextLine();
            double result = calculator.calculate(expression);
            if (Double.isNaN(result)) {
                continue;
            } else {
                printResult(expression, result);
            }
            System.out.println("\nВы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
            if (!inputAnswer.equals("yes") & !inputAnswer.equals("no")) {
                System.out.println("Введите корректный ответ [yes / no]");
            }
        }
        System.out.println("Закончили работу.");
    }

    public static void printResult(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.print(expression + " = " + df.format(result));
    }
}