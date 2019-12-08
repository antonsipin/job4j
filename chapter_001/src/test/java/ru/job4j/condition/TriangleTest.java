package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNonExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.exist(2.0, 2.0, 4.0);
        assertThat(result, is(false));
    }
    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.period(2.0, 2.0, 4.0);
        assertThat(result, is(4.0));
    }
    @Test
    public void area() {
        Point a = new Point(4, 0);
        Point b = new Point(4, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, is(1.9999999999999993));
    }
}