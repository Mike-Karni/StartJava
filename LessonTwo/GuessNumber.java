import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int GuessNumber;
    private Player player1;
    private Player player2;
    private String continueGame;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = 0;
        System.out.println("Желаете продолжить игру? Введите [yes/no]");
        String continuationGame = scanner.nextLine();
        while(!"no".equals(continuationGame)) {
            if("yes".equals(continuationGame)) {
                int secretNumber = (int) (Math.random() * 101);
                while(secretNumber != guessNumber) {
                    System.out.print("Попытка угадать число игрока " + player1 + " : ");
                    guessNumber = scanner.nextInt();
                    if (guessNumber < secretNumber) {
                        System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                    } else if (guessNumber > secretNumber) {
                        System.out.println("Число " + guessNumber + " больше загаданного компьютером.");
                    } else {
                        System.out.println("Победил игрок " + player1);
                        continue;
                    }
                    System.out.print("Попытка угадать игрока " + player2 + " : ");
                    guessNumber = scanner.nextInt();
                    if (guessNumber < secretNumber) {
                        System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
                    } else if (guessNumber > secretNumber) {
                        System.out.println("Число " + guessNumber + " больше загаданного компьютером.");
                    } else  {
                        System.out.println("Победил игрок " + player2);
                        continue;
                    }
                }
            }
        System.out.println("Желаете продолжить игру? Введите [yes/no]");
        continuationGame = scanner.nextLine();
        }
    }
}