package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item[] items = {item1, null, item2, null, item3};
        Item[] itemsWithoutNull = {item1, item2, item3};
        Item[] result = tracker.findAll(items);
        assertThat(result, is(itemsWithoutNull));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = tracker.findByName("test1");
        Item[] itemsResult = {item1};
        assertThat(result, is(itemsResult));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Item");
        item1.setId(item1.getId());
        tracker.add(item1);
        Item result = tracker.findById("Item1");
        assertThat(result, is(item1));
    }

    @Test
    public void delete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = tracker.delete("test1");
        Item[] expectedResult = {null, item2, item3};
        assertThat(result, is(expectedResult));
    }

    @Test
    public void replace() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = tracker.replace("test1", "Item1");
        Item[] expectedResult = {item1, item2, item3};
        assertThat(result, is(expectedResult));
    }
}
