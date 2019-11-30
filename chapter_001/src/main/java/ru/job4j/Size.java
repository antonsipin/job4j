package ru.job4j;

/**
 * Класс Size. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Size {
    public int add(int left, int right) {
        int result = left + Math.abs(right);
        return result;
    }

    public void info(int size) {
        System.out.println("Your size is : " + size);
    }

    /**
     * Метод Main. Вывод результатов в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        Size size = new Size();
        int nike = 10;
        int puma = 50;
        int value = size.add(nike, puma);
        size.info(value);
    }
}