package com.sbt;

import org.junit.*;

import static org.junit.Assert.*;



public class CircleTest {
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;


    @Before
    public void setUp() throws Exception {
         circle1 = new Circle(0);
         circle2 = new Circle(23);
         circle3 = new Circle(23.12);
    }

    @org.junit.Test
    public void calculateArea() {
        Assert.assertEquals(circle1.calculateArea(), 0, 0.25);
        Assert.assertEquals(circle2.calculateArea(),1661.9025,0.25);
        Assert.assertEquals(circle3.calculateArea(), 1679.2893, 0.25);
    }

    @org.junit.Test
    public void calculatePerimeter() {
        Assert.assertEquals(circle1.calculatePerimeter(), 0, 0.25);
        Assert.assertEquals(circle2.calculatePerimeter(), 144.51326, 0.25);
        Assert.assertEquals(circle3.calculatePerimeter(),  145.26724, 0.25);
    }
}
