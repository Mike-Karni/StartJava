package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = "";
        while (!inputAnswer.equals("no")) {
            System.out.println("Введите математическое выражение в формате a 'знак операции' b");
            String expression = scanner.nextLine();
            double result = calculator.calculate(expression);
            if (Double.isNaN(result)) {
                continue;
            } else {
                printResult(expression, result);
            }
            System.out.println("\nВы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
        }
        System.out.println("Закончили работу.");
    }

    public static void printResult(String expression, double result) {
        System.out.print(expression + " = ");
        DecimalFormat decimal = new DecimalFormat("#.###");
        System.out.println(decimal.format(result));
    }
}