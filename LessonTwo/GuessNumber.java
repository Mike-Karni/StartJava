import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int GuessNumber;
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    // while(secretNumber != guessNumber) {
    //     if (guessNumber < secretNumber) {
    //         System.out.println("Число " + guessNumber + " меньше загаданного компьютером.");
    //         //guessNumber = (guessNumber + secretNumber) / 2 + 1;
    //     } else {
    //         System.out.println("Число " + guessNumber + " больше загаданного компьютером.");
    //         //guessNumber = (guessNumber + secretNumber) / 2 - 1;
    //     }
    // }
    // System.out.println("Вы победили!!!");

}