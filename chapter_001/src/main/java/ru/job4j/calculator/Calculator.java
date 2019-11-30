package ru.job4j.calculator;

/**
 * Класс Calculator. Арифметические операции с переменными first и second. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Метод Main.
     *
     * @param args - аргументы метода.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
