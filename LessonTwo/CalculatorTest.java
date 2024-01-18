import java.util.Scanner;
import java.io.IOException;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Вы желаете продолжить вычисления?[yes/no]: ");
            String text1 = scanner.nextLine();
            if (text1.equals("yes")) {
                System.out.print("Введите первое число : ");
                calculator.setNum1(scanner.nextInt());
                System.out.print("Введите знак математической операции : ");
                calculator.setSign(scanner.next().charAt(0));
                System.out.print("Введите второе число : ");
                calculator.setNum2(scanner.nextInt());
                System.out.println("Результат вычисления = " + 
                        + calculator.calculation(calculator.getNum1(), calculator.getNum2()));
            } else if (text1.equals("no")) {
                System.out.println("Закончили работу");
                break;
            }
        }

    }
}