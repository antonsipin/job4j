package ru.job4j.array.anton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithPrefixNewThenFalse() {
        char[] word = {'H', 'i', ',', 'A', 'l', 'l', '!'};
        char[] post = {'l', '!'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixNewThenTrue() {
        char[] word = {'H', 'i', ',', 'A', 'l', 'l', '!'};
        char[] post = {',', '!'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
