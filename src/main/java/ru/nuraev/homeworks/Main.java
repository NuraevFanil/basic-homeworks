package ru.nuraev.homeworks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");
        greetings();
        checkSign(1, 2, -10);
        selectColor(10);
        compareNumbers(5, 10);
        addOrSubtractAndPrint(10, 5, true);
        scanner(1,2,3,4,5);

        System.out.println("END");
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0)

            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void selectColor(int data) {
        int color = 21;
        if (color <= 10)
            System.out.println("Красный");
        if (color > 10 && color <= 20)
            System.out.println("Желтый");
        if (color > 20) System.out.println("Зеленый");
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b)
            System.out.println("a >= b");
        else System.out.println("a < b");
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int res1 = initValue + delta;
        int res2 = initValue - delta;
        if (increment = true)
            System.out.println(res1);
        else System.out.println(res2);
    }

    public static void scanner (int a, int b, int c, int d, int e) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите метод запуска от 1 до 5");
        int result = scanner.nextInt(greetings();); //не могу вот тут определиться как вызвать
                    System.out.println(result);
    }

}

