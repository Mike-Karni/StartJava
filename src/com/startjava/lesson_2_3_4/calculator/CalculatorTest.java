package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите математическое выражение в формате a 'знак операции' b");
            Calculator.setExpression();
            double result = calculator.calculate();
            if (Double.isNaN(result)) {
                System.out.println("Неверный ввод выражения");
            } else {
                printArray(Calculator.getExpression());
                DecimalFormat decimal = new DecimalFormat("#.###");
                System.out.println(decimal.format(result));
            }
            System.out.println("\nВы желаете продолжить вычисления?[yes/no]: ");
            String inputAnswer = scanner.nextLine().toLowerCase();
            if (inputAnswer.equals("no")) {
                break;
            }
        }
        System.out.println("Закончили работу.");
    }

    public static void printArray(String expression) {
        String[] symbols = expression.split(" ");
        for (int i = 0; i < symbols.length; i++) {
            if (i < 2) {
                System.out.print(symbols[i] + " ");
            } else {
                System.out.print(symbols[i] + " = ");
            }
        }
    }
}