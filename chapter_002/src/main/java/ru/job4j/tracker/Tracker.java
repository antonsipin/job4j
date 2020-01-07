package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    public Item[] getItems() {
        return items;
    }

    public int getPosition() {
        return position;
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

    public Item[] findByName(String key) {
        Item[] itemsResult = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
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
        return Arrays.copyOf(items, position);
    }

    public void delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int distPos = index;
            int size = position - index;
            System.arraycopy(items, start, items, distPos, size);
            items[position] = null;
            position--;
        } else {
            System.out.println("There is not item which has this id");
        }
    }

    public Item[] replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
        } else {
            System.out.println("There is not item which has this id");
        }
        return items;
    }

    int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        Item result = null;
        if (index != -1) {
            result = items[index];
        } else {
            System.out.println("There is not item which has this id");
        }
        return result;
    }
}
