package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива");
        int[] numbers = {1, 3, 2, 4, 5, 7, 6};
        System.out.print("До реверса: ");
        System.out.println(Arrays.toString(numbers));

        int len = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = temp;
        }
//        for (int i = len - 1; i > 0; len--) {
//            int temp = numbers[i];
//            numbers[i] = numbers[len];
//            numbers[len] = temp;
//        }
        System.out.print("После реверса: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n2.Вычисление факториала");
        int[] multipliers = new int[10];
        int len1 = multipliers.length;
        for (int i = 0; i < len1; i++) {
            multipliers[i] = i;
        }
        int factorial = 1;
        for (int i = 1; i < len1 - 1; i++) {
            factorial *= multipliers[i];
            System.out.print(multipliers[i] + ((i < len1 - 2) ? " * " : " = " + factorial));
        }

        System.out.println("\n\n3.Удаление элемента из массива");
        double[] randomNumbers = new double[15];
        System.out.println("Исходный массив, заполненный пятнадцатью случайными числами в две строки");
        double middleIndexValue = 0;
        int len2 = randomNumbers.length;
        for(int i = 0; i < len2; i++) {
            randomNumbers[i] = Math.random();
            middleIndexValue = randomNumbers[len2 / 2];
            if (i == len2 / 2) {
                print("%.3f%n", randomNumbers[i]);
            } else {
                print("%.3f ", randomNumbers[i]);
            }
        }
        System.out.println("\nИзменённый массив, заполненный в две строки");
        int count = 0;
        for (int i = 0; i < len2; i++) {
            if (randomNumbers[i] < middleIndexValue) {
                count++;
                System.out.printf("%.3f ", 0.0);
            } else if (randomNumbers[i] !=0 && i == len2 / 2) {
                print("%.3f%n", randomNumbers[i]);
            } else {
                print("%.3f ", randomNumbers[i]);
            }
        }
        System.out.println("\nКоличество обнулённых ячеек равно " + count);


//        System.out.println("\n4.Вывод алфавита лесенкой");
//        char[] letters = new char[92];
//        for(char i = 'A' ; i < '['; i++) {
//            letters[i] = i;
//            System.out.print(letters[i] + " ");
//        }
    }

    public static void print(String text, double number) {
        System.out.printf(text, number);
    }
}
