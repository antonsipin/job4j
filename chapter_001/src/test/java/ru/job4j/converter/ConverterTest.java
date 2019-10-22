package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expectedRubleToEuro = 2;
        int outRubleToEuro = (int) Converter.rubleToEuro(in);
        Assert.assertEquals(expectedRubleToEuro, outRubleToEuro);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expectedRubleToDollar = 3;
        int outRubleToDollar = (int) Converter.rubleToDollar(in);
        Assert.assertEquals(expectedRubleToDollar, outRubleToDollar);
    }
    @Test
    public void euroToRuble() {
        int in = 140;
        int expectedEuroToRuble = 9800;
        int outEuroToRuble = (int) Converter.euroToRuble(in);
        Assert.assertEquals(expectedEuroToRuble, outEuroToRuble);
    }
    @Test
    public void dollarToRuble() {
        int in = 140;
        int expectedDollarToRuble = 8400;
        int outDollarToRuble = (int) Converter.dollarToRuble(in);
        Assert.assertEquals(expectedDollarToRuble, outDollarToRuble);
    }
}