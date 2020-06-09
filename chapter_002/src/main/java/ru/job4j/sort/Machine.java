package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        int count = 0;
        while (balance != 0) {
            for (int j = 0; j < COINS.length - 1; j++) {
                for (int i = count; i < rsl.length; i++) {
                    balance = balance - COINS[j];
                    rsl[i] = COINS[j];
                    size++;
                    if (balance < 0) {
                        rsl[i] = COINS[j + 1];
                        balance = balance + COINS[j] - COINS[j + 1];
                        count = i + 1;
                        break;
                    } else {
                        if (balance == 1) {
                            rsl[i + 1] = COINS[j + 2];
                            balance = 0;
                            break;
                        }
                    }
                }
                if (balance == 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
