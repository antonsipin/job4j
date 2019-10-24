package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void thenMaxFirst() {
        int result = SqMax.max(10, 4, 2, 1);
        assertThat(result, is(10));
    }
    @Test
    public void thenMaxSecond() {
        int result = SqMax.max(10, 40, 2, 1);
        assertThat(result, is(40));
    }
    @Test
    public void thenMaxThird() {
        int result = SqMax.max(10, 4, 20, 1);
        assertThat(result, is(20));
    }
    @Test
    public void thenMaxForth() {
        int result = SqMax.max(10, 4, 2, 100);
        assertThat(result, is(100));
    }
    @Test
    public void thenNonMax() {
        int result = SqMax.max(0, 0, 0, 0);
        assertThat(result, is(0));
    }
}
