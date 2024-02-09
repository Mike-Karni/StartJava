import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите имя");
    String name1 = scanner.nextLine();
    String name2 = scanner.nextLine();
    Player player1 = new Player(name1);
    Player player2 = new Player(name2);
    System.out.println("Имя первого игрока " + player1.getName());
    System.out.println("Имя второго игрока " + player2.getName());
    

    //int a = (int) (Math.random() * 101);

    }
}