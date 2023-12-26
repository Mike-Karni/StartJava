public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "female";
        wolfOne.nickName = "Pampuha";
        wolfOne.weight = 60;
        wolfOne.age = 7;
        wolfOne.color = "white";
        System.out.println(wolfOne.sex);
        System.out.println(wolfOne.nickName);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}