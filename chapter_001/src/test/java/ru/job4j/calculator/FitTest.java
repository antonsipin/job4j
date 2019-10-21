package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 180;
        double expectedmanWeight = 92;
        double outmanWeight = Fit.manWeight(in);
        Assert.assertEquals(expectedmanWeight, outmanWeight, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 180;
        double expectedwomanWeight = 80.5;
        double outwomanWeight = Fit.womanWeight(in);
        Assert.assertEquals(expectedwomanWeight, outwomanWeight, 0.01);
    }
}
