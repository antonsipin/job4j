package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == column) {
                    System.out.print("0");
                } else if (((column == size - 1) && (row == 0)) || ((column == 0) && (row == size - 1)) || ((column == size - 2) && (row == size - 4)) || ((column == size - 4) && (row == size - 2))) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
