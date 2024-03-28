package com.startjava.lesson_4;

import java.util.Scanner;
public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];
        System.out.print("Введите элементы массивая через запятую: ");
        for (int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < maxLength-1; i++) {
            if (numbers[0] < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }
}
