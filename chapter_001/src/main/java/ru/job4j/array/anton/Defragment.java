package ru.job4j.array.anton;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String cell = array[i];
            int j;
            if (cell == null) {
                j = i;
                while (array[j] == null && j < array.length - 1) {
                    j++;
                    array[i] = array[j];
                }
                array[j] = cell;
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
