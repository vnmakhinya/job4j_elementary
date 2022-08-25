package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan187Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manHeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanHeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}