package com.startjava.lesson_2_3.animal;

public class Wolf {
    private String sex;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Волк идёт.");
    }

    public void sit() {
        System.out.println("Волк сидит.");
    }

    public void run() {
        System.out.println("Волк бежит.");
    }

    public void howl() {
        System.out.println("Волк воет.");
    }

    public void hunt() {
        System.out.println("Волк охотится.");
    }
}