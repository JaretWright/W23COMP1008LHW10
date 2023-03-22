package com.example.w23comp1008lhw10;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            throw new IllegalArgumentException("height must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    public boolean isSquare()
    {
        return width == height;
    }

    public double getArea()
    {//30*20 should return 600
        return height*width;
    }

    public double getPerimeter()
    {
        return 2*width + 2* height;
    }
}
