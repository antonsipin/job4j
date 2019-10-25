package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int result = Counter.add(1, 10);
        assertThat(result, Matchers.is(30));

    }
}
