package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Anton Sipin (anton.sipin@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                        .append("   +" + '\n')
                        .append(" +   +" + '\n')
                        .append("+     +" + '\n')
                        .append(" +++++" + '\n')
                        .toString()
                )
        );
    }
}