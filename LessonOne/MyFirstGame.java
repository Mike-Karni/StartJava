public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 80;
        int guessNumber = 70;
        if (secretNumber == guessNumber) {
            System.out.println("Вы победили!!!");
        } else {
                if (guessNumber < secretNumber) {
                    System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                } else {
                    System.out.println("Число " + guessNumber + " больше загаданного компьютером.");
                }
        }
    }
}