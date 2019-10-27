package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when4Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 70, 50);
        assertThat(year, is(4));
    }

    @Test
    public void when9Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(5000, 1000, 12);
        assertThat(year, is(9));
    }
}
