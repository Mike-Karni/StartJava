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
        this.sign = sign;
        // switch(sign) {
        //     case '+' :
        //         this.sign = sign;
        //         break;
        //     case '-' :
        //         this.sign = sign;
        //         break;
        //     case '*' :
        //         this.sign = sign;
        //         break;
        //     case '/' :
        //         this.sign = sign;
        //         break;
        //     case '%' :
        //         this.sign = sign;
        //         break;
        //     case '^' :
        //         this.sign = sign;
        //         break;
        //     default :
        //         System.out.println("Введённая операция не поддерживается, перезапустите программу.");
        //         break;
        // }
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int checkSign(int num1, int num2) {
        switch(getSign()) {
            case '+' : 
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default : 
                System.out.println("Неправильный знак математической операции.");
                break;
        }
        return result;
    }

}