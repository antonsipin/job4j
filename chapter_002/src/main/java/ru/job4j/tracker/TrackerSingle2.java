package ru.job4j.tracker;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.TrackerSingle;

class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();

    public TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker2 = TrackerSingle2.getInstance();
    }
}