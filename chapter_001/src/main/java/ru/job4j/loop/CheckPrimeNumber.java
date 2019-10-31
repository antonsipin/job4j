package ru.job4j.loop;

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
