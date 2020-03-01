package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    private static TrackerSingle3 instance;

    private TrackerSingle3() {
    }

    public static TrackerSingle3 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle3();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}