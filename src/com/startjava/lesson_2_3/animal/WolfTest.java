package src.com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("female");
        wolfOne.setNickName("Dusya");
        wolfOne.setWeight(30);
        wolfOne.setAge(10);
        wolfOne.setColor("White");
        
        System.out.println(wolfOne.getSex());
        System.out.println(wolfOne.getNickName());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}