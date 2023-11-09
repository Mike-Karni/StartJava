public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");
        boolean isMan = false;
        if (!isMan) {
            System.out.println("Этот клиент мужского пола.");
        } else {
            System.out.println("Этот клиент женского пола.");
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

        System.out.println("\n2.Поиск большего числа.");
        byte num1 = 22;
        byte num2 = 11;
        System.out.println("Первое число равно " + num1);
        System.out.println("Второе число равно " + num2);
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        } 

        System.out.println("\n3.Проверка числа.");
        int num3 = -9;
        if (num3 != 0 ) {
            if (num3 % 2 == 1 || num3 % 2 == -1) {
                if (num3 > 0) {
                    System.out.println("Число " + num3 + " положительное и нечетное");
                } else {
                    System.out.println("Число " + num3 + " отрицательное и нечётное");
                }
            } else if (num3 % 2 == 0) {
                if (num3 < 0) {
                    System.out.println("Число " + num3 + " отрицательное и чётное");
                } else {
                    System.out.println("Число " + num3 + " положительное и чётное");
                }
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах.");
        int num4 = 324;
        int num5 = 133;
        int hundreds4 = num4 / 100;
        int tens4 = (num4 / 10) % 10;
        int ones4 = num4 % 10;
        int hundreds5 = num5 / 100;
        int tens5 = (num5 / 10) % 10;
        int ones5 = num5 % 10;
        if (hundreds4 != hundreds5) {
            if (tens4 != tens5) {
                if (ones4 != ones5) {
                    System.out.println("В этих числах нет равных цифр в одинаковых разрядах");
                }
            }
        }
        if (hundreds4 == hundreds5) {
            System.out.println("Одинаковая цифра " + hundreds4 + " в третьем разряде");
        }
        if (tens4 == tens5) {
            System.out.println("Одинаковая цифра " + tens4 + " во втором разряде");
        }
        if (ones4 == ones5) {
            System.out.println("Одинаковая цифра " + ones4 + " в первом разряде");
        }

        System.out.println("\n5.Определение символа по его коду.");
        char symbol = 'X';
        if (symbol > '/' && symbol < ':') {
            System.out.println("Символ " + symbol + " является цифрой"); 
        } else if (symbol > '`' && symbol < '{') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol > '@' && symbol < '[') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой");
        } 

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %.");
        double startMoney = 100000d;
        double sumMoney  = startMoney;
        double sumProfit = 0;
        double percentDiscount = 0.05;
        if (startMoney >= 100000 && startMoney <= 300000) {
            percentDiscount = 0.07;
        } else if (startMoney > 300000) {
            percentDiscount = 0.1;
        }
        sumProfit = startMoney * percentDiscount;
        sumMoney += sumProfit;
        System.out.printf("Сумма вклада = " + startMoney + " Сумма начисленных процентов = %.1f", 
                sumProfit);
        System.out.println(" Итоговая сумма = " + sumMoney + "."); 

        System.out.println("\n7.Определение оценки по предметам.");
        int historyPercent = 59;
        int historyMark = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        } else if (historyPercent > 91 && historyPercent <= 100) {
            historyMark = 5;
        }
        System.out.println("История = " + historyMark);

        int programmingPercent = 92;
        int programmingMark = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91 && programmingPercent <= 100) {
            programmingMark = 5;
        }
        System.out.println("Программирование = " + programmingMark);
        double averageMark = (historyMark + programmingMark) / 2;
        System.out.println("Cредний балл оценок по предметам = " + averageMark);
        double averagePercent = (double) (historyPercent + programmingPercent) / 2;
        System.out.println("Средний процент по предметам = " + averagePercent);

        System.out.println("\n8.Расчёт годовой прибыли.");
        int monthlySales = 13000;
        int rentCost = 5000;
        int productionCost = 9000;
        int annualProfit = (monthlySales - rentCost - productionCost) * 12;
        if (annualProfit < 0 || annualProfit > 0) {
            if (annualProfit > 0) {
                System.out.println("Прибыль за год: +" + annualProfit + " руб.");
            } else {
                System.out.println("Прибыль за год: " + annualProfit + " руб.");
            }
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        } 
    }
}