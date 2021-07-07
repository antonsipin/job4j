package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenSecondPriorityIsHighest() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenThirdPriorityIsHighest() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 50));
        queue.put(new Task("middle", 10));
        queue.put(new Task("urgent", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenFirstPriorityIsHighest() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("urgent", 0));
        queue.put(new Task("low", 10));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
