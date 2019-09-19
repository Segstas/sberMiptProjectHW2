package com.sbt;

public class Rectangle  implements Figure {
    private double width;
    private double length;

    public Rectangle (double width, double length) {
        this.length = length;
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double calculateArea() {
        return width*length;
    }
    public double calculatePerimeter() {
        return 2*width+2*length;
    }

}
