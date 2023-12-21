public class Calculator {
    public static void main(String[] args) {
        System.out.println("Программа 'Калькулятор'.");
        int a = 5;
        int b = 4;
        int result = 1;
        char sign = '%';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            int count = 0;
            for (int i = b; b > 0; b--) {
                result *= a;
                count++;
            }
            b = count;
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Вы ввели неправильный знак операции, исправьте ошибку и " + 
                    "перезапустите программу.");
            return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}