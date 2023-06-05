package org.example;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testGetSide() {
        Point center = new Point(0,0);
        Square s = new Square(center,5);
        assertTrue(s.getSide() == 5);
    }

    public void testSetSide() {
        Point center = new Point(0,0);
        Square s = new Square(center,5);
        s.setSide(10);
        assertTrue(s.getSide() == 10);
    }

    public void testArea() {
        Point center = new Point(0,0);
        Square s = new Square(center,5);
        double area = s.area();
        assertTrue(area == 25);
    }

    public void testPerimeter() {
        Point center = new Point(0,0);
        Square s = new Square(center,5);
        double perimeter = s.perimeter();
        assertTrue(perimeter == 20);
    }

    public void testTestToString() {
        Point center = new Point(0,0);
        Square s = new Square(center,5);
        double side = 5;
        assertTrue(s.toString().equals("Square{" + "side=" + side + '}'));
    }
}