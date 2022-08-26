package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when02To20Then2dot83() {
        double expected = 2.83;
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        }

    @Test
    public void when12To23Then1dot41() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43To23Then2() {
        double expected = 2;
        int x1 = 4;
        int y1 = 3;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when62To41Then2dot24() {
        double expected = 2.24;
        int x1 = 6;
        int y1 = 2;
        int x2 = 4;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}

