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
        // System.out.println("Желаете продолжить игру? Введите [yes/no]");
        String continuationGame = scanner.nextLine();
        while(!"no".equals(continuationGame)) {
            if("yes".equals(continuationGame)) {
                game.start();
            }
            System.out.println("Желаете продолжить игру? Введите [yes/no]");
            continuationGame = scanner.nextLine();
        }
    }
}

