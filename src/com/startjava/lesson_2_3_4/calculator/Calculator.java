package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import static java.lang.Math.IEEEremainder;

public class Calculator {
    private int num1;

    private String sign;
    private int num2;

    private String expression;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(String sign) { this.sign = sign; }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMath(String expression) { this.expression = expression; }

    public String getMath() { return expression; }

    public double calculate() {
        Scanner scanner = new Scanner(System.in);
        setMath(scanner.nextLine());
        String[] symbols = expression.split(" ");
        int a = Integer.parseInt(symbols[0]);
        int b = Integer.parseInt(symbols[2]);
        sign = symbols[1];
        int result = 1;
        switch (sign) {
            case "+":
                printArray(symbols);
                return a + b;
            case "-":
                printArray(symbols);
                return a - b;
            case "*":
                printArray(symbols);
                return a * b;
            case "/":
                printArray(symbols);
                return (double) a / (double) b;
            case "%":
                printArray(symbols);
                return IEEEremainder(a, b);
            case "^":
                printArray(symbols);
                return Math.pow(a, b);
            default:
                System.out.println("Неправильно введённое выражение для вычисления");
                return Double.NaN;
        }
//        switch (sign) {
//            case "+":
//                printArray(symbols);
//                return Integer.parseInt(symbols[0]) + Integer.parseInt(symbols[2]);
//            case "-":
//                printArray(symbols);
//                return Integer.parseInt(symbols[0]) - Integer.parseInt(symbols[2]);
//            case "*":
//                printArray(symbols);
//                return Integer.parseInt(symbols[0]) * Integer.parseInt(symbols[2]);
//            case "/":
//                printArray(symbols);
//                return (double) Integer.parseInt(symbols[0]) / (double) Integer.parseInt(symbols[2]);
//            case "%":
//                printArray(symbols);
//                return IEEEremainder(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
//            case "^":
//                printArray(symbols);
//                return Math.pow(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
//            default:
//                return Double.NaN;
//        }
    }

    public void printArray(String[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            if (i < 2) {
                System.out.print(symbols[i] + " ");
            } else {
                System.out.print(symbols[i] + " = ");
            }
        }
        calculate();
    }
}