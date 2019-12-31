package ru.job4j.tracker;

import java.util.Scanner;
import java.util.Arrays;

public class StartUI {
    private Item[] items;

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                this.items = tracker.findAll(tracker.getItems());
                System.out.println("=== Show all items: ====");
                for (int i = 0; i < this.items.length; i++) {
                    Item temp = this.items[i];
                    System.out.println(" Id: " + temp.getId() + " Name: " + temp.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Enter item name to rename:");
                String oldName = scanner.nextLine();
                System.out.println("Enter new item name:");
                String newName = scanner.nextLine();
                for (int i = 0; i < this.items.length; i++) {
                    Item temp = this.items[i];
                    if (temp != null) {
                        if (temp.getName().equals(oldName)) {
                            temp.setName(newName);
                        }
                        System.out.println("Id: " + temp.getId() + " Name: " + temp.getName());
                    } else {
                        System.out.println("There are not items to edit");
                    }
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter item name to delete the item: ");
                String name = scanner.nextLine();
                for (int i = 0; i < items.length; i++) {
                    Item temp = items[i];
                    if (temp.getName().equals(name)) {
                        items[i] = null;
                    }
                }
                this.items = tracker.setItems(items);
                System.out.println("Done");
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.println("=== Enter item id: ====");
                String id = scanner.nextLine();
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println("Id: " + result.getId() + " Name: " + result.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find item by Name ====");
                System.out.print("Enter item name to find: ");
                String name = scanner.nextLine();
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

    private void showMenu() {
        System.out.println("0. Add new Item" + '\n' + "1. Show all items" + '\n' + "2. Edit item" + '\n' + "3. Delete item" + '\n' + "4. Find item by Id" + '\n' + "5. Find items by name" + '\n' + "6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}