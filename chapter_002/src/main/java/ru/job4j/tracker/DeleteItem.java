package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter item id to delete the item: ");
        if (tracker.delete(id)) {
            System.out.println("Done");
        } else {
            System.out.println("There is not item which has this id");
        }
        return true;
    }
}
