package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1() {
        int result = Max.max(100, 2);
        assertThat(result, is(100));
    }
    @Test
    public void whenMax2() {
        int result = Max.max(100, 200);
        assertThat(result, is(200));
    }
    @Test
    public void whenNonMax() {
        int result = Max.max(0, 0);
        assertThat(result, is(0));
    }

}
