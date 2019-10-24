package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 4, 2);
        assertThat(result, is(10));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 40, 2);
        assertThat(result, is(40));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 4, 20);
        assertThat(result, is(20));
    }
    @Test
    public void whenNonMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 10, 10);
        assertThat(result, is(10));
    }
}
