public class Calculator {
    public static void main(String[] args) {
        System.out.println("Программа 'Калькулятор'.");
        int a = 5;
        int b = 2;
        int copyB = b;
        int result = 1;
        char sign = '+';
        if (sign == '+') {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '-') {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '*') {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '/') {
            result = a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '^') {
            for (int i = copyB; copyB > 0; copyB--) {
                result *= a;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '%') {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("Вы ввели неправильный знак операции, исправьте ошибку и " + 
                    "перезапустите программу.");
        }





    }
}