package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 2);
        double dist = a.distance3d(b);
        assertThat(dist, is(2.8284271247461903));
    }

    @Test
    public void distance3d0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        assertThat(dist, is(0.0));
    }

    @Test
    public void distance3d1() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3d(b);
        assertThat(dist, is(0.0));
    }

    @Test
    public void distance3d21() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3d(b);
        assertThat(dist, is(1.7320508075688772));
    }
}
