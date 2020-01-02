package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tracker {
    public Item[] setItems(Item[] items) {
        this.items = items;
        return items;
    }

    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    public Item[] getItems() {
        return items;
    }

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item[] add(Item item) {
        item.setId(this.generateId());
        items = Arrays.copyOf(this.items, ++position);
        items[position - 1] = item;
        return items;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            Item item = this.items[i];
            String temp = item.getId();
            if (temp.equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] itemsResult = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            Item name = this.items[index];
            if (name != null) {
                if (name.getName().equals(key)) {
                    itemsResult[size] = name;
                    size++;
                }
            }
        }
        itemsResult = Arrays.copyOf(itemsResult, size);
        return itemsResult;
    }

    public Item[] findAll(Item[] items) {
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                this.items[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(this.items, size);
    }

    public Item[] delete(String name) {
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item temp = items[i];
            if (temp.getName().equals(name)) {
                items[i] = null;
                this.items[size] = null;
            }
            size++;
        }
        return Arrays.copyOf(this.items, size);
    }

    public Item[] replace(String oldName, String newName) {
        int size = 0;
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
            size++;
        }
        return Arrays.copyOf(this.items, size);
    }
}
