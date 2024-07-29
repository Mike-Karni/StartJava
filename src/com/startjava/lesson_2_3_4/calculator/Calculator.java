package com.startjava.lesson_2_3_4.calculator;

import javax.sound.midi.Soundbank;

import static java.lang.Math.IEEEremainder;

import java.util.Scanner;

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
//        int a = Integer.parseInt(symbols[0]);
//        int b = Integer.parseInt(symbols[2]);
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
                return Double.NaN;
        }
    }
}