package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.IEEEremainder;

import java.util.Scanner;

public class Calculator {
    private static String expression;

    public void setExpression() {
        Scanner scanner = new Scanner(System.in);
        this.expression = scanner.nextLine();
    }

    public String getExpression() {
        return expression; }

    public double calculate() {
        setExpression();
        String[] symbols = expression.split(" ");
        int a = Integer.parseInt(symbols[0]);
        int b = Integer.parseInt(symbols[2]);
        String sign = symbols[1];
        switch (sign) {
            case "+":
                return (double) a + (double) b;
            case "-":
                return (double) a - (double) b;
            case "*":
                return (double) a * (double) b;
            case "/":
                return (double) a / (double) b;
            case "%":
                return IEEEremainder(a, b);
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("Неправильно введённое выражение для вычисления");
                return Double.NaN;
        }

        /* switch (sign) {
            case "+":
                printArray(symbols);
                return Integer.parseInt(symbols[0]) + Integer.parseInt(symbols[2]);
            case "-":
                printArray(symbols);
                return Integer.parseInt(symbols[0]) - Integer.parseInt(symbols[2]);
            case "*":
                printArray(symbols);
                return Integer.parseInt(symbols[0]) * Integer.parseInt(symbols[2]);
            case "/":
                printArray(symbols);
                return (double) Integer.parseInt(symbols[0]) / (double) Integer.parseInt(symbols[2]);
            case "%":
                printArray(symbols);
                return IEEEremainder(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
            case "^":
                printArray(symbols);
                return Math.pow(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
            default:
                return Double.NaN;
        } */
    }
}