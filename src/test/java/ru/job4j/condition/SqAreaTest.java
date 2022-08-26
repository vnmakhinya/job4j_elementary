package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K4Then1dot96() {
        double expected = 1.96;
        int p = 7;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        double expected = 3;
        int p = 8;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K6Then2dot48() {
        double expected = 2.48;
        int p = 9;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}