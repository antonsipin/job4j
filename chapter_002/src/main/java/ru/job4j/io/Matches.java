package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static int count = 11;
    public static int input = 0;

    public static void main(String[] args) {
        while (count > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Игрок 1, введите количество спичек от 1 до 3:");
            input = scanner.nextInt();
            count -= input;
            if (count > 0) {
                System.out.println("На поле осталось " + count + " спичек");
            } else {
                if (count <= 0) {
                    System.out.println("На поле осталось 0 спичек. Игрок 1 победил");
                    break;
                }
            }
            System.out.println("Игрок 2, введите количество спичек от 1 до 3:");
            input = scanner.nextInt();
            count -= input;
            if (count > 0) {
                System.out.println("На поле осталось " + count + " спичек");
            } else {
                if (count <= 0) {
                    System.out.println("На поле осталось 0 спичек. Игрок 2 победил");
                    break;
                }
            }
        }
    }
}
