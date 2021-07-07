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

    @Test
    public void whenNonMaxFour() {
        int result = Max.max(0, 0, 0, 0);
        assertThat(result, is(0));
    }

    @Test
    public void whenNonMaxTree() {
        int result = Max.max(0, 0, 0);
        assertThat(result, is(0));
    }

    @Test
    public void whenMax2Four() {
        int result = Max.max(100, 200, 100, 100);
        assertThat(result, is(200));
    }

    @Test
    public void whenMax4Four() {
        int result = Max.max(100, 200, 100, 500);
        assertThat(result, is(500));
    }

    @Test
    public void whenMax3Four() {
        int result = Max.max(100, 200, 5000, 500);
        assertThat(result, is(5000));
    }

    @Test
    public void whenMax1Four() {
        int result = Max.max(30000, 20000, 5000, 500);
        assertThat(result, is(30000));
    }

    @Test
    public void whenMax3Tree() {
        int result = Max.max(100, 200, 1000);
        assertThat(result, is(1000));
    }

    @Test
    public void whenMax2Tree() {
        int result = Max.max(100, 2000, 1000);
        assertThat(result, is(2000));
    }

    @Test
    public void whenMax1Tree() {
        int result = Max.max(10000, 2000, 1000);
        assertThat(result, is(10000));
    }
}

