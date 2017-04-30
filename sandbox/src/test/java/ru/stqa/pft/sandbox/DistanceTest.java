package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by IEUser on 4/29/2017.
 */
public class DistanceTest {

    @Test
    public void testDistanceOne(){
        Point a = new Point(2,3);
        Point b = new Point(1,3);
        Assert.assertEquals(a.distance(b), 1.0);
    }

    @Test
    public void testDistanceTwo(){
        Point a = new Point(-3,167);
        Point b = new Point(1, -12);
        Assert.assertEquals(a.distance(b), 179.0446871593793);
    }
    @Test
    public void testDistanceThree(){
        Point a = new Point(0,0);
        Point b = new Point(0,0);
        Assert.assertEquals(a.distance(b), 0.0);
    }

}
