package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        double expectedSquare = 2;
        double outSquare = SqArea.square(6, 2);
        Assert.assertEquals(expectedSquare, outSquare, 0.01);
    }
}
