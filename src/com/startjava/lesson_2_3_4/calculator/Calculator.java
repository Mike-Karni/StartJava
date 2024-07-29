package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.IEEEremainder;

import java.util.Scanner;

@SuppressWarnings("checkstyle:RightCurly")
public class Calculator {
    private static String expression;

    public static void setExpression() {
        Scanner scanner = new Scanner(System.in);
        expression = scanner.nextLine();
    }

    public static String getExpression() {
        return expression; }

    public double calculate() {
        String[] symbols = expression.split(" ");
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(symbols[0]);
            b = Integer.parseInt(symbols[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неправильный ввод выражения.");
        }
        String sign = symbols[1];
        return switch (sign) {
            case "+" -> (double) a + (double) b;
            case "-" -> (double) a - (double) b;
            case "*" -> (double) a * (double) b;
            case "/" -> (double) a / (double) b;
            case "%" -> IEEEremainder(a, b);
            case "^" -> Math.pow(a, b);
            default -> Double.NaN;
        };
    }
}