package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingle2Test {
    @Test
    public void trackerSingle2Testing() {
        Tracker tracker = TrackerSingle2.getInstance();
        Tracker tracker2 = TrackerSingle2.getInstance();
        assertThat(tracker, is(tracker2));
    }
}