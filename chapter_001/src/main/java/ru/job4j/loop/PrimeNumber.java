package ru.job4j.loop;

/**
 * Класс PrimeNumber. Арифметические операции.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class PrimeNumber {
    int count = 0;

    public int calc(int finish) {
        CheckPrimeNumber n = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            if (n.check(i)) {
                count++;
            }
        }
        return count;
    }
}


