package ru.job4j.tracker;

public class StartUI {
    private Item[] items;

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                this.items = tracker.findAll(tracker.getItems());
                System.out.println("=== Show all items: ====");
                for (int i = 0; i < tracker.getPosition(); i++) {
                    Item temp = this.items[i];
                    if (temp != null) {
                        System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
                    }
                }
                System.out.println("Число элементов: " + this.items.length);
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Enter item id to replace:");
                System.out.println("Enter new item name:");
                String name = input.askStr("Enter new item name:");
                Item item = new Item(name);
                this.items = tracker.replace(id, item);
                System.out.println("Done");
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                String id = input.askStr("Enter item id to delete the item: ");
                tracker.delete(id);
                System.out.println("Done");
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                String id = input.askStr("=== Enter item id: ====");
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println("Id: " + result.getId() + " Name: " + result.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find item by Name ====");
                String name = input.askStr("Enter item name to find: ");
                Item[] result = tracker.findByName(name);
                for (int i = 0; i < result.length; i++) {
                    Item temp = result[i];
                    if (temp != null) {
                        System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public void showMenu() {
        System.out.println("0. Add new Item" + '\n' + "1. Show all items" + '\n' + "2. Edit item" + '\n' + "3. Delete item" + '\n' + "4. Find item by Id" + '\n' + "5. Find items by name" + '\n' + "6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}