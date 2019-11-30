package ru.job4j.condition;

/**
 * Класс Point. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
    /**
     * Метод Main. Вывод результатов в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
        double result2 = distance(5, 7, 8, 9);
        System.out.println("result (5, 7) to (8, 9) = " + result2);
        double result3 = distance(5137, 745, 867, 925);
        System.out.println("result (5137, 745) to (867, 925) = " + result3);
    }
}