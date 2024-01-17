import java.util.Scanner;

public class Calculator {
    private int num1;
    private char sign;
    private int num2;
    private int result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        switch(sign) {
            case '+' :
                this.sign = sign;
                break;
            case '-' :
                this.sign = sign;
                break;
            case '*' :
                this.sign = sign;
                break;
            case '/' :
                this.sign = sign;
                break;
            case '%' :
                this.sign = sign;
                break;
            case '^' :
                this.sign = sign;
                break;
            default :
                System.out.println("Введённая математическая операция не поддерживается.");
                break;
        }
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getSubtract(int num1, int num2) {
        return num1 - num2;
    }

    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int getDivide(int num1, int num2) {
        return num1 / num2;
    }

    public int getRestDivide(int num1, int num2) {
        return num1 % num2;
    }

    public int getDegree(int num1, int num2) {
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}