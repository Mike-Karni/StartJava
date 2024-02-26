package src.com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int counter = startNum;
        int finishNum = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= finishNum);
        System.out.println("В отрезке ["+ startNum +", " + finishNum + "]" + 
                " сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num3;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num2 && num3 > num1) {
            max = num3;
        }
        if (num1 > num2 && num2 < num3) {
            min = num2;
        } else if (num2 > num1 && num3 > num1) {
            min = num1;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа");
        int num4 = 1234;
        int sum = 0;
        while (num4 > 0) {
            int digit = num4 % 10;
            sum += digit;
            System.out.print(digit);
            num4 /= 10;
        } 
        System.out.println("\nСумма цифр числа = " + sum);

        System.out.println("\n4.Вывод цифр в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) { 
            if (count % 5 == 0) {
                System.out.println();
            } 
            System.out.printf("%4d", i);
            count++;
        }
        if (count % 5 != 0) {
            for (int i = count % 5; i < 5; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int copyNum5 = num5;
        int countTwos = 0;
        while (num5 > 0) {
            int digit = num5 % 10;
            if (digit == 2) {
                countTwos++;
            }
            num5 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + copyNum5 + " чётное количество двоек - " + countTwos);
        } else {
            System.out.println("В " + copyNum5 + " нечётное количество двоек - " + countTwos);
        }

        System.out.println("\n6.Отображение геометрических фигур");
        count = 0;
        for (int i = 1; i < 51; i++) {
            if (count % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
            count++;
        }
        System.out.println("\n");

        int row = 5;
        int countSymbol = 5;
        int column = 0;
        while (row >= column) {
            while (countSymbol > column) {
                System.out.print("#");
                countSymbol--;
            }
            System.out.println();
            row--;
            countSymbol = row;
        }

        count = 2;
        int index = 2;
        column = 9;
        do {
            System.out.print('$');
            if (index == count) {
                if (count / 4 == 0) {
                    count++;
                } else {
                    count--;
                }
                System.out.println();
                index = 1;
            }
            index++;
            column--;
        } while (column != 0);

        System.out.println("\n\n7.Отображение ASCII-символов");
        System.out.printf("%-11s%-11s%11s", "DECIMAL", "CHARACTER", "DESCRIPTION\n");
        for(char i = 39; i < 48; i += 2) {
            System.out.printf("%-15s%-11s%-20s%n", (int) i, i, Character.getName(i));
        }
        for(char i = 98; i < 123; i += 2) {
            System.out.printf("%-15s%-11s%-20s%n", (int) i, i, Character.getName(i));
        }

        System.out.println("\n8.Проверка, является ли число палиндромом.");
        int num6 = 1234321;
        int copyNum6 = num6;
        int reverseNum = 0;
        while(num6 > 0) {
            int digit = num6 % 10;
            reverseNum = reverseNum * 10 + digit;
            num6 /= 10;
        }
        if(reverseNum == copyNum6) {
            System.out.println("Число " + copyNum6 + " является палиндромом");
        } else {
            System.out.println("Число " + copyNum6 + " не является палиндромом");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        int num7 = 123321;
        int copyNum7 = num7;
        count = 0;
        int sumDigits = 0;
        int sumHalfDigits = 0;
        while (count < 6) { 
            sumDigits += num7 % 10;
            num7 /= 10;
            if (count == 2) {
                sumHalfDigits = sumDigits;
            }
            count++;
        }
        int check = sumDigits / sumHalfDigits;
        if (check == 2) {
            System.out.println("Число " + copyNum7 + " является счастливым.");
        } else {
            System.out.println("Число " + copyNum7 + "  не является счастливым.");
        }

        System.out.println("\n10.Отображение таблицы умножения Пифагора");
        System.out.printf("%21s%n", "ТАБЛИЦА ПИФАГОРА\n");
        System.out.print("  ");
        for(int i = 2; i < 10; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        for(int i = 2; i < 28; i++) {
            System.out.print("_");
        }

        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 2; j < 10; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
     }
}