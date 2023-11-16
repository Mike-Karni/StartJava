public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int i = startNum;
        int finishNum = 21;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if(i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
            i++;
        } while(i <= finishNum);
        System.out.println("В отрезке ["+ startNum +"," + finishNum + "]" + 
                " сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);



    }
}