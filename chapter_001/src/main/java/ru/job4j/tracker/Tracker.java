package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
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
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (item != null) {
                String temp = item.getId();
                if (temp.equals(id)) {
                    result = item;
                    break;
                }
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
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null) {
                itemsWithoutNull[size] = name;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }
}