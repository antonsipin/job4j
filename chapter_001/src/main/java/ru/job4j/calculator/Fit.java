package ru.job4j.calculator;

/**
 * Класс Fit. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    /**
     * Метод Main.
     *
     * @param args - аргументы метода.
     */
    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(180);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 180 is " + woman);
    }
}
