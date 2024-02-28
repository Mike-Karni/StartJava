package com.startjava.lesson_1.base;

public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера.\n");
        byte coreQuantity = 8;
        short windowsVersion = 11;
        int ram = 16;
        long hdd = 512;
        float frequency = 2.3f;
        double cost = 75141.52d;
        char cpuName = 'M';
        boolean isNew = true;
        System.out.println("Мой компьютер имеет " + coreQuantity + " ядер.");
        System.out.println("На нём установлена " + windowsVersion + " версия Windows.");
        System.out.println("Количество оперативной памяти " + ram + " гигабайт.");
        System.out.println("Размер жесткого диска составляет " + hdd + " гигабайт.");
        System.out.println("Частота процессора " + frequency + " гигагерц.");
        System.out.println("Компьютер куплен за цену " + cost + " рублей.");
        System.out.println("Первый символ названия компьютера " + cpuName);
        System.out.println("Компьютер новый : " + isNew);

        System.out.println("\n2.Расчёт стоимости товара со скидкой.\n");
        double penCost = 100d;
        double bookCost = 200d;
        double discount = 0.11d;
        double sumCost = penCost + bookCost;
        double discountCost = sumCost * discount;
        double discountPrice = sumCost - discountCost;//
        System.out.println("Cтоимость товаров без скидки : " + sumCost + " рублей.");
        System.out.println("Сумма скидки : " + discountCost + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой : " + discountPrice + " рублей.");

        System.out.println("\n3.Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n");
        byte byteMax = 127;
        System.out.println("Максимальное значение  byte числа равно " + byteMax + ".");
        byteMax++;
        System.out.println("Значение инкремента максимального значения byte равно " + byteMax++);
        short shortMax = 32_767;
        System.out.println("Максимальное значение  short числа равно " + shortMax + ".");
        shortMax++;
        System.out.println("Значение инкремента максимального значения short равно " + shortMax++);
        int intMax = 2_147_483_647;
        System.out.println("Максимальное значение int числа равно " + intMax);
        intMax++;
        System.out.println("Значение инкремента максимального значения int равно " + intMax++);
        long longMax = 9_223_372_036_854_775_807l;
        System.out.println("Максимальное значение long числа равно " + longMax);
        longMax++;
        System.out.println("Значение инкремента максимального значения long равно " + longMax++);
     
        System.out.println("\n5.Перестановка значений переменных\n");
        System.out.println("Смена значений двух переменных с использованием третьей переменной.");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходное значение первой переменной = " + num1 + ",исходное значение " +
                "второй переменной = " + num2 + ".");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Значение первой переменной после перестановки = " + num1);
        System.out.println("Значение второй переменной после перестановки = " + num2);
        System.out.println("Смена значений переменных с использованием арифметических операций");
        System.out.println("Исходное значение переменной num1 равно " + num1);
        System.out.println("Исходное значение переменной num2 равно " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значение первой переменной после перестановки = " + num1);
        System.out.println("Значение второй переменной после перестановки = " + num2);
        System.out.println("Перестановка значений с использование побитовой операции");
        System.out.println("Исходное значение переменной num1 равно " + num1);
        System.out.println("Исходное значение переменной num2 равно " + num2);
        num1 ^= num2; 
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Значение первой переменной после перестановки = " + num1);
        System.out.println("Значение второй переменной после перестановки = " + num2);

        System.out.println("\n6.Вывод символов и их кодов\n");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tidle = '~';
        System.out.println((int) dollar + " = " + dollar);
        System.out.println((int) asterisk + " = " + asterisk);
        System.out.println((int) atSign + " = " + atSign);
        System.out.println((int) verticalBar + " = " + verticalBar);
        System.out.println((int) tidle + " = " + tidle);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backSlash + underscore + underscore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа\n");
        int num3 = 123;
        int hundreds = num3 / 100;
        int tens = (num3 / 10) % 10;
        int ones = num3 % 10;
        System.out.println("Число " + num3 + " содержит " + hundreds + " сотню.");
        System.out.println("Число " + num3 + " содержит " + tens + " десятка.");
        System.out.println("Число " + num3 + " содержит " + ones + " единицы.");

        System.out.println("\n9.Вывод времени\n");
        int ss = 86399;
        int hh = ss / 3600;
        int mm = (ss / 60) % 60;
        int ss1 = ss % 60;
        System.out.println(hh + ":" + mm + ":" + ss1);
    }
}
