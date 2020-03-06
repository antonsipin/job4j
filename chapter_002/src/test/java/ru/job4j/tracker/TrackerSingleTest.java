package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void trackerSingleTesting() {
        Tracker tracker = TrackerSingle.getInstance();
        Tracker tracker2 = TrackerSingle.getInstance();
        assertThat(tracker, is(tracker2));
    }
}