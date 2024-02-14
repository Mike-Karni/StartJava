import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    private Player player1;
    private Player player2;
    private String continueGame;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = 0;
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
}