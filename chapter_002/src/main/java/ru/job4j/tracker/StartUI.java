package ru.job4j.tracker;

public class StartUI {
    private static Item[] items;

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Tracker tracker) {
        items = tracker.findAll(tracker.getItems());
        System.out.println("=== Show all items: ====");
        for (int i = 0; i < tracker.getPosition(); i++) {
            Item temp = items[i];
            if (temp != null) {
                System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
            }
        }
        System.out.println("Число элементов: " + items.length);
    }

    public static void replaceItem(Input input, Tracker tracker) {
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter item id to delete the item: ");
        if (tracker.delete(id)) {
            System.out.println("Done");
        } else {
            System.out.println("There is not item which has this id");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("=== Enter item id: ====");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Id: " + result.getId() + " Name: " + result.getName());
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by Name ====");
        String name = input.askStr("Enter item name to find: ");
        Item[] result = tracker.findByName(name);
        for (int i = 0; i < result.length; i++) {
            Item temp = result[i];
            if (temp != null) {
                System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
            }
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowItems(),
                new ReplaceItem(),
                new DeleteItem(),
                new FindItemById(),
                new FindItemByName(),
                new Exit(),
        };
        new StartUI().init(input, tracker, actions);
    }
}