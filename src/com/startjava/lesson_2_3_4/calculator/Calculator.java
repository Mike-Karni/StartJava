package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        double a = toInt(elements[0]);
        double b = toInt(elements[2]);
        if (Double.isNaN(a) || Double.isNaN(b)) {
            System.out.println("NaN");
        }
        String sign = elements[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> Math.IEEEremainder(a, b);
            case "^" -> Math.pow(a, b);
            default -> Double.NaN;
        };
    }

    private double toInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return Double.NaN;
        }
    }
}