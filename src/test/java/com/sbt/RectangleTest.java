package com.sbt;

import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;


    @Before
    public void setUp() throws Exception {
        rectangle1 = new Rectangle(0,0);
        rectangle2 = new Rectangle(23.12,12.00);
        rectangle3 = new Rectangle(23,12);
    }

    @org.junit.Test
    public void calculateArea() {
        Assert.assertEquals(rectangle1.calculateArea(), 0, 0.1);
        Assert.assertEquals(rectangle2.calculateArea(), 277.44, 0.1);
        Assert.assertEquals(rectangle3.calculateArea(), 276, 0.1);
    }

    @org.junit.Test
    public void calculatePerimeter() {
        Assert.assertEquals(rectangle1.calculatePerimeter(), 0, 0.1);
        Assert.assertEquals(rectangle2.calculatePerimeter(), 70.24, 0.1);
        Assert.assertEquals(rectangle3.calculatePerimeter(), 70, 0.1);
    }
}
