package com.startjava.lesson_2_3.person;

public class Person {
    String sex = "male";
    String name = "Trofim";
    float height = 1.89f;
    float weight = 99.9f;
    int age = 29;

    void walk() {
        System.out.println("Трофим быстро ходит!");
    }

    void sit() {
        System.out.println("Трофим сидит.");
    }

    void run() {
        System.out.println("Трофим быстро бежит.");
    }

    void speak() {
        System.out.println("Трофим говорит спокойно и размеренно.");
    }

    void learnJava() {
        System.out.println("Трофим усердно учит Java.");
    }
}