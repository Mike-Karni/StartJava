public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера.");
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

        System.out.println("\n2.Расчёт стоимости товара со скидкой.");
        double penCost = 100d;
        double bookCost = 200d;
        double discount = 0.11d;
        double sumGoods = penCost + bookCost;
        double sumDiscount = sumGoods * discount;
        double totalCost = sumGoods - sumDiscount;
        System.out.println("Cтоимость товаров без скидки : " + sumGoods + " рублей.");
        System.out.println("Сумма скидки : " + sumDiscount + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой : " + totalCost + " рублей.");

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
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
     
        System.out.println("\n5.Перестановка значений переменных");
        System.out.println("Смена значений двух переменных с использованием третьей переменной.");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходное значение первой переменной = " + num1 + ",исходное значение " +
                "второй переменной = " + num2 + ".");
        int temp = num1;
        int shiftNum1 = num2;
        int shiftNum2 = temp;
        System.out.println("Значение первой переменной после перестановки = " + shiftNum1);
        System.out.println("Значение второй переменной после перестановки = " + shiftNum2);
        System.out.println("Смена значений переменных с использованием арифметических операций");
        int shiftNum4 = num1 + num2;// n1
        int shiftNum3 = shiftNum4 - num1; //n2
        System.out.println("Значение первой переменной после перестановки = " + shiftNum3);
        shiftNum4 = shiftNum4 - shiftNum3;//n1
        System.out.println("Значение второй переменной после перестановки = " + shiftNum4);
        System.out.println("Перестановка значений с использование побитовой операции");
        num1 ^= num2; 
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Значение первой переменной после перестановки = " + num1);
        System.out.println("Значение второй переменной после перестановки = " + num2);

        System.out.println("\n6.Вывод символов и их кодов");
        char codeChar1 = 36;
        char codeChar2 = 42;
        char codeChar3 = 64;
        char codeChar4 = 124;
        char codeChar5 = 126;
        System.out.println((int) codeChar1 + " = " + codeChar1);
        System.out.println((int) codeChar2 + " = " + codeChar2);
        System.out.println((int) codeChar3 + " = " + codeChar3);
        System.out.println((int) codeChar4 + " = " + codeChar4);
        System.out.println((int) codeChar5 + " = " + codeChar5);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = 47;
        char backSlash = 92;
        System.out.println("    " + slash + backSlash + "    ");
        System.out.println("   " + slash + "  " + backSlash + "   ");
        char underscore = 95;
        char leftParenthesis = 40;
        char rightParenthesis = 41;
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                backSlash + "   ");
        System.out.println(" " + slash + "      " + backSlash + "  ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backSlash + underscore + underscore + backSlash + " ");
    }
}
