package com.startjava.lesson_4;

import java.text.DecimalFormat;

import static java.lang.Math.round;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива.");
        int[] numbers = {1, 3, 2, 4, 5, 7, 6};
        StringBuilder sb = new StringBuilder();
        System.out.print("До реверса: ");
        sb.append("[");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length -1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        StringBuilder sb1 = new StringBuilder();
        System.out.print("После реверса: ");
        sb1.append("[");
        for (int i = 0; i < numbers.length; i++) {
            sb1.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb1.append(", ");
            }
        }
        sb1.append("]");
        System.out.println(sb1);

        System.out.println("\n2.Вычисление факториала.");
        int[] factorialNumbers = new int[10];
        for (int i = 0; i < factorialNumbers.length; i++) {
            factorialNumbers[i] = i;
        }
        int factorialResult = 1;
        for (int i = 1; i < factorialNumbers.length -1; i++) {
            factorialResult *= factorialNumbers[i];
            System.out.print((i < factorialNumbers.length - 2) ? factorialNumbers[i] + " * " :
                    factorialNumbers[i] + " = " + factorialResult);
        }

        System.out.println("\n\n3.Удаление элемента из массива.");
        double[] randomNumbers = new double[15];
        double middleIndexValue = 0;
        System.out.println("Исходный массив, заполненный пятнадцатью случайными числами в две строки");
        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (double) round(Math.random() * 1000) / 1000;
            middleIndexValue = (i == randomNumbers.length / 2) ?
                    middleIndexValue = randomNumbers[randomNumbers.length / 2] : middleIndexValue;
            if (i == randomNumbers.length / 2) {
                System.out.println(randomNumbers[i] + " ");
            } else {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println(middleIndexValue);
        System.out.println();
        System.out.println("Изменённый массив, заполненный в две строки");
        int count = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < middleIndexValue) {
                count++;
                System.out.print(String.format("0.000 ",0));
            } else if (randomNumbers[i] !=0 && i == randomNumbers.length / 2) {
                System.out.println(randomNumbers[i] + " ");
            } else {
                System.out.print(randomNumbers[i] + " ");
            }
        }
        System.out.println("\nКоличество обнулённых ячеек равно " + count);

    }
}
