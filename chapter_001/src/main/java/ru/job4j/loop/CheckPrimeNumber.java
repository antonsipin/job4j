package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0 || num == 1) {
                if (num % i == 0) {
                    prime = false;
                }
            } else if (num % 1 == 0 && num % i == 0) {
                prime = true;
            }
        }
        return prime;
    }
}
