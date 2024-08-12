package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.IEEEremainder;

public class Calculator {
    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double result = 0;
        try {
            int a = Integer.parseInt(elements[0]);
            int b = Integer.parseInt(elements[2]);
            String sign = elements[1];
            result = switch (sign) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> (double) a / b;
                case "%" -> IEEEremainder(a, b);
                case "^" -> Math.pow(a, b);
                default -> Double.NaN;
            };
        } catch (NumberFormatException e) {
            System.out.println("Вычисление невозможно, вы ввели не числа.");
        }
        return result;
    }
}