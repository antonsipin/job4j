package ru.job4j.tracker;

import ru.job4j.tracker.Item;

class TrackerSingle3 {
    private static Tracker instance;

    private TrackerSingle3() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}