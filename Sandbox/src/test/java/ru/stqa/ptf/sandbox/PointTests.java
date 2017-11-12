package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test

    public void TestDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Assert.assertEquals(p2.distance(p1), 5.0);
    }
}
