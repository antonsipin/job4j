package ru.job4j.tracker;

public class ShowItems implements UserAction {
    private Item[] items;

    @Override
    public String name() {
        return "=== Show all items: ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        items = tracker.findAll(tracker.getItems());
        System.out.println("=== Show all items: ====");
        for (int i = 0; i < tracker.getPosition(); i++) {
            Item temp = items[i];
            if (temp != null) {
                System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
            }
        }
        System.out.println("Число элементов: " + items.length);
        return true;
    }
}
