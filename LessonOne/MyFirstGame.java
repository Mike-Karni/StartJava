public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 80;
        int guessNumber = 80;
        if (secretNumber == guessNumber) {
            System.out.println("Вы победили!!!");
        } else {
            while (guessNumber != secretNumber) {
                if (guessNumber < 0 || guessNumber > 100) {
                    System.out.println("Вы ввели число не из полуинтервала (0,100].Вы проиграли.");
                } else if (guessNumber < secretNumber) {
                    System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                } else if (guessNumber > secretNumber) {
                    System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                }
            break;
            }
        }
    }
}