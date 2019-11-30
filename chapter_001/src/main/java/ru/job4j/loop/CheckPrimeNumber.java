package ru.job4j.loop;

/**
 * Класс CheckPrimeNumber. Арифметические операции.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            } else {
                prime = true;
            }
        }
        if (num == 2) {
            prime = true;
        }
        return prime;
    }
}
