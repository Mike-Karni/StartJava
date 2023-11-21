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

        // System.out.println("\n2.Вывод чисел в порядке убывания");
        // int num1 = 10;
        // int num2 = 5;
        // int num3 = -1;
        // int maxNum = 0;
        // int minNum = 0;
        // if(num1 > num2 && num1 > num3) {
        //     maxNum = num1;
        //     System.out.println("Максимальное число = " + num1);
        // } else if(num2 > num1 && num2 > num3) {
        //     maxNum = num2;
        //     System.out.println("Максимальное число = " + num2);
        // } else {
        //     maxNum = num3;
        //     System.out.println("Максимальное число = " + num3);
        // }
        // if(num1 > num2 && num2 < num3) {
        //     minNum = num2;
        // } else if(num2 > num1 && num1 < num3) {
        //     minNum = num1;
        // } else {
        //     minNum = num3;
        // }
        // for(int i = maxNum - 1; i > minNum; i--) {
        //     System.out.print(i + " ");
        // }

        // System.out.println("\n3.Вывод реверсивного числа");
        // int num4 = 1234;
        // int sum = 0;
        // while(num4 > 0) {
        //     sum += num4 % 10;
        //     System.out.print(num4 % 10 + "");
        //     num4 /= 10;
        // } 
        // System.out.println("\nСумма цифр числа = " + sum);

        // System.out.println("\n4.Вывод цифр в несколько строк");
        // int count = 0;
        // for (int i = 1; i < 24; i+=2) { 
        //     if(count % 5 == 0) {
        //         System.out.println();
        //     } 
        //     System.out.printf("%4d",i);
        //     count++;
        // }
        // if (count % 5 != 0) {
        //     for(int i = count % 5; i < 5;i++) {
        //         System.out.printf("%4d",0);
        //     }
        // }

        System.out.println("\n5.Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int count1 = 0;
        while(num5 % 2 == 0) {
            count1 += 1;
            num5 /= 2;
        }
        int num6 = num5 * (int) Math.pow(2,count1);
        if(count1 % 2 == 0) {
            System.out.println("В " + num6 + " чётное количество двоек - " + count1);
        } else {
            System.out.println("В " + num6 + " нечётное количество двоек - " + count1);
        }

        System.out.println("\n6.Отображение геометрических фигур");
        

    }
}