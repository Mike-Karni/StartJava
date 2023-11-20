public class CyclesTheme {
    public static void main(String[] args) {
        // System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        // int startNum = -10;
        // int i = startNum;
        // int finishNum = 21;
        // int evenSum = 0;
        // int oddSum = 0;
        // do {
        //     if(i % 2 == 0) {
        //         evenSum = evenSum + i;
        //     } else {
        //         oddSum = oddSum + i;
        //     }
        //     i++;
        // } while(i <= finishNum);
        // System.out.println("В отрезке ["+ startNum +"," + finishNum + "]" + 
        //         " сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if(num1 > num2 && num1 > num3) {
            maxNum = num1;
            System.out.println("Максимальное число = " + num1);
        } else if(num1 > num2 && num1 < num3) {
            maxNum = num3;
            System.out.println("Максимальное число = " + num3);
        } else if(num1 < num2 && num2 > num3) {
            maxNum = num2;
            System.out.println("Максимальное число = " + num2);
        } else if(num1 < num2 && num2 < num3) {
            maxNum = num3;
            System.out.println("Максимальное число = " + num3);
        }
        System.out.println(maxNum);

        if(num1 > num2 && num2 < num3) {
            minNum = num2;
        } else if(num2 > num1 && num1 < num3) {
            minNum = num1;
        } else {
            minNum = num3;
        }
        System.out.println(minNum);
        for(int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }
        


    }
}