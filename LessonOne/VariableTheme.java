public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера.");
        byte coreQuantity = 8;
        short windowsVersion = 11;
        int ram = 16;
        long hdd = 512;
        float frequency = 2.3f;
        double cost = 75141.52d;
        char cpuName = 'M';
        boolean isNew = true;
        System.out.println("Мой компьютер имеет " + coreQuantity + " ядер.");
        System.out.println("На нём установлена " + windowsVersion + " версия Windows.");
        System.out.println("Количество оперативной памяти " + ram + " гигабайт.");
        System.out.println("Размер жесткого диска составляет " + hdd + " гигабайт.");
        System.out.println("Частота процессора " + frequency + " гигагерц.");
        System.out.println("Компьютер куплен за цену " + cost + " рублей.");
        System.out.println("Первый символ названия компьютера " + cpuName);
        System.out.println("Компьютер новый : " + isNew);

    }
}