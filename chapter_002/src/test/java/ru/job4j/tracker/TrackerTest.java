package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test name");
        Item[] items = new Item[5];
        items[0] = tracker.add(item);
        items[2] = tracker.add(item);
        items[4] = tracker.add(item);
        Item[] itemsWithoutNull = {item, null, item};
        Item[] result = tracker.findAll(items);
        assertThat(result, is(itemsWithoutNull));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item[] items = new Item[5];
        items[0] = tracker.add(item1);
        items[2] = tracker.add(item2);
        items[4] = tracker.add(item3);
        Item[] result = tracker.findByName("test1");
        Item[] itemsResult = {item1};
        assertThat(result, is(itemsResult));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test name");
        item1.setId(item1.getId());
        Item[] items = new Item[5];
        items[0] = tracker.add(item1);
        Item result = tracker.findById(item1.getId());
        assertThat(result, is(item1));
    }
}
