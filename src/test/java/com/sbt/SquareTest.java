package com.sbt;

import org.junit.*;

import static org.junit.Assert.*;

public class SquareTest {
    private Square square1;
    private Square square2;
    private Square square3;


    @Before
    public void setUp() throws Exception {
        square1 = new Square(0);
        square2 = new Square(12);
        square3 = new Square(23.12);
    }

    @org.junit.Test
    public void calculateArea() {
        Assert.assertEquals(square1.calculateArea(), 0, 0.1);
        Assert.assertEquals(square2.calculateArea(), 144, 0.1);
        Assert.assertEquals(square3.calculateArea(), 534.5344, 0.25);
    }

    @org.junit.Test
    public void calculatePerimeter() {
        Assert.assertEquals(square1.calculatePerimeter(), 0, 0.25);
        Assert.assertEquals(square2.calculatePerimeter(), 48, 0.1);
        Assert.assertEquals(square3.calculatePerimeter(), 92.48, 0.25);

    }
}
