package ru.job4j.condition;

/**
 * Класс SqArea. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class SqArea {
    public static double square(int p, int k) {
        return (p / (2 * k + 2)) * (k * p / (2 * k + 2));
    }

    /**
     * Метод Main.
     *
     * @param args - аргументы метода.
     */
    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
