package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter item id to replace:");
        System.out.println("Enter new item name:");
        String name = input.askStr("Enter new item name:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Done");
        } else {
            System.out.println("There is not item which has this id");
        }
        return true;
    }
}
