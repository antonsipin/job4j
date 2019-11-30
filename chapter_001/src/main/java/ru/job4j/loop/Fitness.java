package ru.job4j.loop;

/**
 * Класс Fitness. Арифметические операции.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
