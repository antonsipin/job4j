package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (i % 2 != 0 || i == 2) {
                count++;
            }
        }
        return count;
    }
}
