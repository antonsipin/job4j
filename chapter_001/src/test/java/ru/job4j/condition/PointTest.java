package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double expectedDistance = 2.0;
        double outDistance = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expectedDistance, outDistance, 0.01);
    }
}
