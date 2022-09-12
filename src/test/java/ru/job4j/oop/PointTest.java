package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To10205Then22dot91() {
        double expected = 22.91;
        Point a = new Point(0, 0, 0);
        Point b = new Point(10, 20, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123To321Then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}