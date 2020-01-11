package ru.job4j.tracker;

public class FindItemByName implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Name ====");
        String name = input.askStr("Enter item name to find: ");
        Item[] result = tracker.findByName(name);
        for (int i = 0; i < result.length; i++) {
            Item temp = result[i];
            if (temp != null) {
                System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
            }
        }
        return true;
    }
}
