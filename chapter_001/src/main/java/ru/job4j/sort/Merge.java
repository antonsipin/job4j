package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        while (index < rsl.length) {
            if (left.length == 0) {
                rsl = right;
                break;
            }
            if (right.length == 0) {
                rsl = left;
                break;
            }
            if (left[left.length - 1] <= right[0]) {
                for (int i = 0; i < left.length; i++) {
                    rsl[i] = left[i];
                    index++;
                }
                for (int i = 0; i < right.length; i++) {
                    rsl[index] = right[i];
                    index++;
                }
            }
            if (right[right.length - 1] <= left[0]) {
                for (int j = 0; j < right.length; j++) {
                    rsl[j] = right[j];
                    index++;
                }
                for (int j = 0; j < left.length; j++) {
                    rsl[index] = left[j];
                    index++;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
