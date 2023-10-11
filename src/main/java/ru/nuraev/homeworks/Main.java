package ru.nuraev.homeworks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите метод запуска от 1 до 5");
        int a = scanner.nextInt();
        System.out.println(a);
        System.out.println("Hello\nWorld\nfrom\nJava");
        sum3(1, 2, -10);
        selectColor(10);
        compareNumbers(5, 10);
      //  addOrSubtractAndPrint(1, 2, "конец < -20");
        System.out.println("END");
    }

    public static void sum3(int a, int b, int c) {
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
// не понял ТЗ
    public static void addOrSubtractAndPrint() {
        int initValue;
        int delta;
        boolean increment;

// и не понятно как реализовать задание со звездочкой
    }



}

