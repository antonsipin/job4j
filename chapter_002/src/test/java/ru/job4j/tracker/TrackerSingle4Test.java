package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingle4Test {
    @Test
    public void trackerSingle4Testing() {
        TrackerSingle4 tracker = TrackerSingle4.INSTANCE;
        TrackerSingle4 tracker2 = TrackerSingle4.INSTANCE;
        assertThat(tracker, is(tracker2));
    }
}