package ru.job4j.oop;

public class College {
    /**
     * Класс Main. Такое приведения типов называется понижающим приведением (down casting)
     * @param args
     */
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;
    }
}
