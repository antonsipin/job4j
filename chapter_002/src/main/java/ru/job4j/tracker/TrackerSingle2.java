package ru.job4j.tracker;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.TrackerSingle;

class TrackerSingle2 {
    private static final Tracker INSTANCE = new Tracker();

    public TrackerSingle2() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        Tracker tracker2 = TrackerSingle2.getInstance();
    }
}