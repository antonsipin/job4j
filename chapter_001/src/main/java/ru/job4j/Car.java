package ru.job4j;

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
    int age = 35;  // возраст

    char sex = 'м'; // пол
    int height = 186; // рост

    int count = 12240; // количество кирпичей для постройки дома

    long bacila = 20000000000L; // количество бактерий
    long distance = 200000000000L; // расстояние до космических объектов
    boolean isOffer = true; //  разрешение на работу

    long fileSize = 20000000000L; //  размер файла.

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
