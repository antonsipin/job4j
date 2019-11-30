package ru.job4j.condition;

/**
 * Класс Max. Операции сравнения.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Max {
    public static int max(int first, int second) {
        boolean condition = (first > second);
        int result = condition ? first : second;
        return result;
    }
}
