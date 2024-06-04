package com.startjava.lesson_4;

import java.util.Arrays;

import java.util.Scanner;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
//        System.out.println("\n1.Реверс значений массива");
//        int[] numbers = {1, 3, 2, 4, 5, 7, 6};
//        System.out.print("До реверса: ");
//        System.out.println(Arrays.toString(numbers));
//
//        int len = numbers.length;
//        for (int i = 0; i <= len / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[--len];
//            numbers[len] = temp;
//        }
//        System.out.print("После реверса: ");
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.println("\n2.Вычисление факториала");
//        int[] multipliers = new int[10];
//        int len1 = multipliers.length;
//        for (int i = 0; i < len1; i++) {
//            multipliers[i] = i;
//        }
//        int factorial = 1;
//        for (int i = 1; i < len1 - 1; i++) {
//            factorial *= multipliers[i];
//            System.out.print(multipliers[i] + ((i < len1 - 2) ? " * " : " = " + factorial));
//        }
//
//        System.out.println("\n\n3.Удаление элемента из массива");
//        double[] randomNumbers = new double[15];
//        System.out.println("Значение до модификации");
//        double middleIndexValue = 0;
//        int len2 = randomNumbers.length;
//        for(int i = 0; i < len2; i++) {
//            randomNumbers[i] = Math.random();
//            middleIndexValue = randomNumbers[len2 / 2];
//        }
//        for (int i = 0; i < len2; i++) {
//            if (i == len2 / 2) {
//                print("%.3f%n", randomNumbers[i]);
//            } else {
//                print("%.3f ", randomNumbers[i]);
//            }
//        }
//        System.out.println("\nЗначения после модификации");
//        int count = 0;
//        for (int i = 0; i < len2; i++) {
//            if (randomNumbers[i] < middleIndexValue) {
//                count++;
//                System.out.printf("%.3f ", 0.0);
//            } else if (randomNumbers[i] !=0 && i == len2 / 2) {
//                print("%.3f%n", randomNumbers[i]);
//            } else {
//                print("%.3f ", randomNumbers[i]);
//            }
//        }
//        System.out.println("\nКоличество обнулённых ячеек равно " + count);

//        System.out.println("\n4.Вывод алфавита лесенкой");
//        int len3 = 26;
//        char[] alphabet = new char[len3];
//        int i = 0;
//        for (char ch = 'Z'; ch >= 'A'; ch--) {
//            alphabet[i] = (char) ('A'+ i);
//            i++;
//        }
//        StringBuilder line = new StringBuilder();
//        for (i = len3 - 1; i >= 0; i--) {
//            for (int j = 0; j <= 0; j++) {
//                line.append(alphabet[i]);
//                System.out.println(line);
//            }
//        }
//
//        System.out.println("\n5.Заполнение массива уникальными цифрами");
//
//        int len4 = 30;
//        int startInterval = 40;
//        int endInterval = 100;
//        int[] uniqueNumbers = new int[len4];
//        for (int i = 0; i < len4; i++) {
//            uniqueNumbers[i] = (int) ((Math.random() * (endInterval - startInterval) + startInterval));
//            for (int j  = 0; j < i; j++) {
//                if (uniqueNumbers[i] == uniqueNumbers[j]) {
//                    uniqueNumbers[i] = (int) ((Math.random() * (endInterval - startInterval) + startInterval));
//                    i--;
//                    break;
//                }
//            }
//        }
//        Arrays.sort(uniqueNumbers);
//        int count1 = 1;
//        for (int i = 0; i < len4; i++) {
//            if (count1 % 10 == 0) {
//                System.out.println(uniqueNumbers[i]);
//            } else {
//                System.out.print(uniqueNumbers[i] + " ");
//            }
//            count1++;
//        }
//
        System.out.println("\n6.Игра 'Виселица'");
        String[] words = {/*"болт","сорт", "сПОрт", "Бой", "пчЕла", "ДАр", "успех", "ежовик",*/ "маска"};
        Random random = new Random();
        String secretWord = words[random.nextInt(words.length)].toUpperCase();
        System.out.println("Секретное слово : " + secretWord);
        String[] gallows = {"_______",
                "|     |",
                "|     @",
                "|    /|\\",
                "|    / \\"};
        char[] secretLetters = new char[secretWord.length()];
        Arrays.fill(secretLetters,'*');
        for (char letter : secretLetters) {
            System.out.print(letter);
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int attempt = gallows.length;
        while (attempt > 0 && !String.valueOf(secretLetters).equals(secretWord)) {
            System.out.println("\nСлово " + String.valueOf(secretLetters));
            System.out.println("\nВведите букву для угадывания");
            char guessLetter = scanner.nextLine().toUpperCase().charAt(0);
            int countSameLetters = 0;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guessLetter) {
                    secretLetters[i] = guessLetter;
                    countSameLetters++;
                    if (attempt < gallows.length) {
                        attempt += countSameLetters;
                        for(int j = 0; j <= gallows.length - attempt; j++ ) {
                            System.out.println(gallows[j]);
                        }
                    }
                }
            }
            if (!secretWord.contains(String.valueOf(guessLetter))) {
                attempt--;
                for(int j = 0; j <= gallows.length - attempt - 1; j++ ) {
                    System.out.println(gallows[j]);
                }
            }
            System.out.println("Оставшееся количество попыток : " + attempt);
        }
        System.out.println("Загаданное слово " + secretWord);
    }
    /*public static void print(String text, double number) {
        System.out.printf(text, number);
    }*/
}
