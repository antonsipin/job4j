package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static int random = new Random().nextInt(3);
    public static String answer;

    public static String dialog() {
        if (random == 0) {
            answer = "Да";
        } else if (random == 1) {
            answer = "Нет";
        } else {
            answer = "Может быть";
        }
        return answer;
    }

        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Я великий Оракул. Что ты хочешь узнать?");
            String question = scanner.nextLine();
            System.out.println(dialog());
        }
}
