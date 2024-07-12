package com.startjava.lesson_2_3.calculator;

import static java.lang.Math.IEEEremainder;

public class Calculator {
    private int num1;

    private String sign;
    private int num2;

    private String line;

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

    public void setMath(String line) { this.line = line; }

    public String getMath() { return line; }

    public double calculate(String line) {
        String[] symbols = line.split(" ", 0);
        double firstOperand = Double.parseDouble(symbols[0]);
        double secondOperand = Double.parseDouble(symbols[2]);
        sign = symbols[1];
        double result = 1;
        switch (sign) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                return IEEEremainder(firstOperand, secondOperand);
            case "%":
                return firstOperand % secondOperand;
            case "^":
                return Math.pow(firstOperand, secondOperand);
            default:
                System.out.println("Неправильный знак математической операции.");
                break;
        }
        return result;
    }

    public void printArray(String[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            if (i < 2) {
                System.out.print(symbols[i] + " ");
            } else {
                System.out.print(symbols[i] + " = ");
            }
        }
    }

    public boolean checkNan(String signs) {
        double a = Double.parseDouble(signs);
        if (Double.isNaN(a) != Double.isNaN(a)) {
            System.out.println("Вы ввели неправильный знак");
        }
        return false;
    }
}