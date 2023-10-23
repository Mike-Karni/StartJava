public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java\n");
        boolean man = false;
        if (!man) {
            System.out.println("Этот клиент мужского пола.");
        } else {
            System.out.println("Этот клиент жеского пола.");
        }
        short age = 20;
        if (age > 18) {
            System.out.println("Вы являетесь совершеннолетним.");
        } else {
            System.out.println("Вы ещё несовершеннолетний.");
        }
        float height = 1.9f;
        if (height < 1.8) {
            System.out.println("Вы невысокого роста.");
        } else {
            System.out.println("У вас высокий рост.");
        }
        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается с буквы М.");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается с буквы I.");
        } else {
            System.out.println("Ваше имя начинается не с букв М или I.");
        }

        System.out.println("\n2.Поиск большего числа.\n");
        byte num1 = 22;
        byte num2 = 11;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа.\n");
        int num3 = 0;
        if (num3 % 2 == 0 && num3 > 0) {
            System.out.println("Число чётное  и положительное");
        } else if (num3 % 2 == 1 && num3 > 0) {
            System.out.println("Число нечётное и положительное");
        } else if (num3 % 2 == 0 && num3 < 0) {
            System.out.println("Число чётное и отрицательное");
        } else if ( - (num3 % 2) == 1 && num3 < 0) {
            System.out.println("Число нечётное и отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}