package ru.job4j;

/**
 * Класс Car. Вычисление дистанции и вывод в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Car {
    private double volume;

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
        boolean canDrive = this.volume > 0;
        if (canDrive) {
            System.out.println("Beep! I can drive!");
        } else {
            System.out.println("Oh. I am tired. I can't drive.");
        }
    }

    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    int age = 35;
    char sex = 'м';
    int height = 186;
    int count = 12240;
    long bacila = 20000000000L;
    long distance = 200000000000L;
    boolean isOffer = true;
    long fileSize = 20000000000L;

    public boolean canDrive() {
        boolean result = this.volume > 0;
        if (result) {
            System.out.println(distance);
        }
        return result;
    }

    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers.");
    }
}
