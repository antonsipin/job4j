package ru.job4j.loop;

/**
 * Класс Slash. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == column || ((row + column) % 2 == 0) && ((row + column) == size - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод Main. Арифметические операции. Вывод результатов в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
