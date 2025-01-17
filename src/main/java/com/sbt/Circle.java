package com.sbt;

public class Circle implements com.sbt.Figure {
    private double radius;


    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
