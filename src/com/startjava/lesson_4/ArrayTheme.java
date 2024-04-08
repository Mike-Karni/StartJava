package com.startjava.lesson_4;

import java.text.DecimalFormat;

import java.util.Arrays;

import java.util.Random;


public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Реверс значений массива.");
        int[] numbers = {1, 3, 2, 4, 5, 7, 6};
        System.out.print("До реверса: ");
        System.out.println(Arrays.toString(numbers));

        int len = numbers.length;
        for (int i = 0  ; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = temp;
        }
        System.out.print("Массив после реверса: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n2.Вычисление факториала.");
        int[] multipliers = new int[10];
        for (int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }
        int factorialResult = 1;
        for (int i = 1; i < multipliers.length - 1; i++) {
            factorialResult *= multipliers[i];
            System.out.print(multipliers[i] + ((i < multipliers.length - 2) ? " * " : " = " + factorialResult));
        }

        System.out.println("\n\n3.Удаление элемента из массива.");
        double[] randomNumbers = new double[15];
        System.out.println("Исходный массив, заполненный пятнадцатью случайными числами в две строки");
        DecimalFormat round = new DecimalFormat("#.###");
        double middleIndexValue = 0;
        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random();
            middleIndexValue = (i == randomNumbers.length / 2) ?
                    middleIndexValue = randomNumbers[randomNumbers.length / 2] : middleIndexValue;
            if (i == randomNumbers.length / 2) {
                System.out.println(round.format(randomNumbers[i]) + " ");
            } else {
                System.out.print(round.format(randomNumbers[i]) + " ");
            }
        }
        System.out.println();
        System.out.println("Изменённый массив, заполненный в две строки");
        int count = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < middleIndexValue) {
                count++;
                System.out.printf(" %.3f ", 0.0001);
            } else if (randomNumbers[i] !=0 && i == randomNumbers.length / 2) {
                System.out.println(round.format(randomNumbers[i]) + " ");
            } else {
                System.out.print(round.format(randomNumbers[i]) + " ");
            }
        }
        System.out.println("\nКоличество обнулённых ячеек равно " + count);
    }
}
