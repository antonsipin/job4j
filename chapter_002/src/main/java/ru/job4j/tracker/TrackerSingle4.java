package ru.job4j.tracker;

import ru.job4j.tracker.Item;

enum TrackerSingle4 {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle4 tracker = TrackerSingle4.INSTANCE;
    }
}