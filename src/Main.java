public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация " + i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Интерация цикла " + i);
        }


        System.out.println("Задание 3");
        for (int i = 1; i <= 17; i += 2) {
            System.out.println("Интерация цикла " + i);
        }


        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является вискокостным");
        }

        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " делится на 7");
        }
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задание 1");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", i, total);
        }
    }
    public static void task4() {
        System.out.println("Задание 1");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total +  money;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", i, total);
        }
    }
}