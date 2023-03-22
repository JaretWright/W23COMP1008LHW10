package com.example.w23comp1008lhw10;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(20,30);
        square = new Rectangle(20,20);
    }

    @org.junit.Test
    public void setHeight() {
        rectangle.setHeight(50);
        assertEquals(50, rectangle.getHeight(),0.0);
    }

    @org.junit.Test
    public void setHeightZero() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
                rectangle.setHeight(0);});
    }

    @org.junit.Test
    public void setHeightNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setHeight(-1.0);});
    }

    @org.junit.Test
    public void setWidth() {
        rectangle.setWidth(100);
        assertEquals(100, rectangle.getWidth(),0.0);
    }

    @org.junit.Test
    public void setWidthNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setWidth(-1.0);});
    }

    @org.junit.Test
    public void setWidthZero() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setWidth(0.0);});
    }

    @org.junit.Test
    public void isSquare() {
        assertTrue(square.isSquare());
    }

    @org.junit.Test
    public void isSquareFalse() {
        assertFalse(rectangle.isSquare());
    }

    @org.junit.Test
    public void getArea() {
        //rectangle is 20x30, so the area should be 20*30=600
        assertEquals(600, rectangle.getArea(),0.01);
    }

    @org.junit.Test
    public void getAreaSquare() {
        //rectangle is 20x20, so the area should be 20*30=600
        assertEquals(400, square.getArea(),0.01);
    }
    @org.junit.Test
    public void getPerimeter() {
        //rectangle that is 20 x 30, the perimeter should be 20+30+20+30=100
        assertEquals(100, rectangle.getPerimeter(),0.0);
    }

    @org.junit.Test
    public void getPerimeterSquare() {
        //rectangle that is 20 x 20, the perimeter should be 20+20+20+20=80
        assertEquals(80, square.getPerimeter(),0.0);
    }


    @org.junit.Test
    public void setWidthZeroConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(100,0);});
    }

    @org.junit.Test
    public void setHeightZeroConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(0,10);});
    }

}