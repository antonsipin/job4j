package ru.job4j.loop;

/**
 * Класс Counter. Арифметические операции.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
        for (int num = start; num <= finish; num++) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}