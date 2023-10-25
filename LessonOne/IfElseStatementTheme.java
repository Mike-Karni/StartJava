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
        int num3 = 1;
        if (num3 != 0 ) {
            if (num3 % 2 == 0 && num3 > 0) {
                System.out.println("Число " + num3 + " является чётным  и положительным.");
            } else if (num3 % 2 == 1 && num3 > 0) {
                System.out.println("Число " + num3 + " является нечётным и положительным.");
            } else if(num3 % 2 == 0 && num3 < 0) {
                System.out.println("Число " + num3 + " является чётным и отрицательным.");
            } else if( - (num3 % 2) == 1 && num3 < 0) {
                System.out.println("Число " + num3 + " является нечётным и отрицательным.");
            }
        } else {
            System.out.println("Число " + num3 + " равно нулю");
        }
        /*
        if (num3 % 2 == 0 && num3 > 0) {
            System.out.println("Число " + num3 + " чётное  и положительное");
        } else if (num3 % 2 == 1 && num3 > 0) {
            System.out.println("Число " + num3 + " нечётное и положительное");
        } else if (num3 % 2 == 0 && num3 < 0) {
            System.out.println("Число " + num3 + " чётное и отрицательное");
        } else if ( - (num3 % 2) == 1 && num3 < 0) {
            System.out.println("Число " + num3 + " нечётное и отрицательное");
        } else {
            System.out.println("Число " + num3 + " равно нулю");
        }*/
/*
        System.out.println("\nПоиск одинаковых цифр в числах.\n");
        int num4 = 123;
        int num5 = 126;
        int hundreds4 = num4 / 100;
        int tens4 = (num4 / 10) % 10;
        int ones4 = num4 % 10;
        int hundreds5 = num5 / 100;
        int tens5 = (num5 / 10) % 10;
        int ones5 = num5 % 10;
        if (hundreds4 != hundreds5 && tens4 != tens5 && ones4 != ones5) {
            System.out.println("В этих числах нет равных цифр, стоящих в одинаковых разрядах");
        } else if (hundreds4 == hundreds5) {
            System.out.println("Числа " + num4 + " и " + num5 + " имеют равные цифры в третьем " +
                    "разряде");
        } else if (tens4 == tens5) {
            System.out.println("Числа " + num4 + " и " + num5 + " имеют равные цифры во втором " +
                    "разряде");
        }*/
    }
}