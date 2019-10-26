package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int value = 2; value <= finish; value++) {
            if (((value == 2) || (value % 2 != 0)) && (value % 1 == 0) && (value % value == 0)) {
                count++;
            }
        }
        return count;
    }
}
