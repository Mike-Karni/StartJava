package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = "yes";
        do {
            if ("yes".equals(inputAnswer)) {
                System.out.println("Введите математическое выражение в формате '2 ^ 10'. ");
                String expression = scanner.nextLine();
                double result = calculator.calculate(expression);
                printResult(result, expression);
            }
            System.out.println("\nВы желаете продолжить вычисления?[yes/no]: ");
            inputAnswer = scanner.nextLine().toLowerCase();
        } while (!"no".equals(inputAnswer));
        System.out.println("Закончили работу.");
    }

    public static void printResult(double result, String expression) {
        DecimalFormat df = new DecimalFormat("#.###");
        if (!Double.isNaN(result)) {
            System.out.print(expression + " = " + df.format(result));
        }
    }
}