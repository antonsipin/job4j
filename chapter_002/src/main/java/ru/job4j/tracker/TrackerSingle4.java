package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public enum TrackerSingle4 {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle4 trackerSingle4 = TrackerSingle4.INSTANCE;
    }
}