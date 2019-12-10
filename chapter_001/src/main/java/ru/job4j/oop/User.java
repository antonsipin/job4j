package ru.job4j.oop;

public class User {

    /**
     * Поля name и age - поля объекта т.к. они объявлены в области класса User.
     * Переменные can и age объявлены внутри метода canDrive - поэтому они являются локальными переменными.
     */
    private String name;
    private int age;
    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
