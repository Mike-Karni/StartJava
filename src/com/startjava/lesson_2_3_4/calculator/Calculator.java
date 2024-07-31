package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.IEEEremainder;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            System.out.println("Вычисление невозможно, вы ввели не числа.");
        }
        String sign = elements[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> (double) a / b;
            case "%" -> IEEEremainder(a, b);
            case "^" -> Math.pow(a, b);
            default -> {
                System.out.println("Ошибочно введённый знак");
                yield Double.NaN;
            }
        };
    }
}