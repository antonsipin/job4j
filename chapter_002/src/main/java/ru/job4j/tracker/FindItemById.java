package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("=== Enter item id: ====");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Id: " + result.getId() + " Name: " + result.getName());
        }
        return true;
    }
}
