package ru.job4j.array.anton;

/**
 * Класс ArrayChar. Арифметические операции.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
