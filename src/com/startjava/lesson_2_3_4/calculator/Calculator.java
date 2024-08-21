package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Double.NaN;
import static java.lang.Math.IEEEremainder;

public class Calculator {
    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        double a = toInt(elements[0], NaN);
        double b = toInt(elements[2], NaN);
        String sign = elements[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> IEEEremainder(a, b);
            case "^" -> Math.pow(a, b);
            default -> Double.NaN;
        };
    }

    public double toInt(String str, double defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }
}