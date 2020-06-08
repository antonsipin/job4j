package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int j = 0; j < COINS.length; j++) {
            while (balance > 0) {
                for (int i = 0; i < rsl.length; i++) {
                    balance = balance - COINS[j];
                    rsl[i] = COINS[j];
                    size++;
                    if (balance < 0) {
                        rsl[i] = COINS[j + 1];
                        balance = balance + COINS[j + 1];
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
