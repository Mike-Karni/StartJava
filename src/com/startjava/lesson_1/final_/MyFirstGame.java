package src.com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 80;
        int guessNumber = 100000;
            while(secretNumber != guessNumber) {
                if (guessNumber < secretNumber) {
                    System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                    guessNumber = (guessNumber + secretNumber) / 2 + 1;
                } else {
                    System.out.println("Число " + guessNumber + " больше загаданного компьютером.");
                    guessNumber = (guessNumber + secretNumber) / 2 - 1;
                }
            }
            System.out.println("Вы победили!!!");
    }
}