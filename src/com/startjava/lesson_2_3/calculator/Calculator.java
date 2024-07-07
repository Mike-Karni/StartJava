package com.startjava.lesson_2_3.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    private int num1;
    //private char sign;

    private String sign;
    private int num2;

    private String line;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    //public void setSign(char sign) { this.sign = sign; }

    public void setSign(String sign) { this.sign = sign; }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMath(String line) { this.line = line; }

    public String getMath() { return line; }

//    public double calculate() {
//        double result = 1;
//        switch(sign) {
//            case '+' :
//                return num1 + num2;
//            case '-' :
//                return num1 - num2;
//            case '*' :
//                return num1 * num2;
//            case '/' :
//                return num1 / num2;
//            case '%' :
//                return num1 % num2;
//            case '^' :
//                for (int i = 0; i < num2; i++) {
//                    result *= num1;
//                }
//                return result;
//            default :
//                System.out.println("Неправильный знак математической операции.");
//                break;
//        }
//        return result;
//    }

    public double calculate(String line) {
//        Scanner scanner = new Scanner(System.in);
//        line = scanner.nextLine();
        String[] symbols = line.split(" ", 0);
        double firstOperand = Double.parseDouble(symbols[0]);
        double secondOperand = Double.parseDouble(symbols[2]);
        sign = symbols[1];
        double result = 1;
        switch(sign) {
            case "+" :
                return firstOperand + secondOperand;
            case "-" :
                return firstOperand - secondOperand;
            case "*" :
                return firstOperand * secondOperand;
            case "/" :
                return firstOperand / secondOperand;
            case "%" :
                return firstOperand % secondOperand;
            case "^" :
                return Math.pow(firstOperand,secondOperand);
            default :
                System.out.println("Неправильный знак математической операции.");
                break;
        }
        return result;
    }
     public void printResult(double result) {
         DecimalFormat d = new DecimalFormat("#.###");
         String[] digits = new String[d.format(result).length()];


     }
}