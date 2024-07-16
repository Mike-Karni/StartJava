package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока : ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока : ");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);
        String inputAnswer = scanner.nextLine();
        while(!"no".equals(inputAnswer)) {
            if("yes".equals(inputAnswer)) {
                game.start();
            }
            System.out.println("Желаете продолжить игру? Введите [yes/no]");
            inputAnswer = scanner.nextLine();
        }
    }
}

