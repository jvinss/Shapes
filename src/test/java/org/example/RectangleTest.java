package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
    public void testGetCenter() {
    }

    public void testSetCenter() {
    }

    public void testArea() {
        Rectangle r = new Rectangle(5,10);
        double area = r.area();
        assertTrue(area == 50);
    }

    public void testPerimeter() {
        Rectangle r = new Rectangle(5,10);
        double perimeter = r.perimeter();
        assertTrue(perimeter == 30);
    }

    public void testGetBase() {
        Rectangle r = new Rectangle(5,10);
        assertTrue(r.getBase() == 5);
    }

    public void testSetBase() {
        Rectangle r = new Rectangle(5,10);
        r.setBase(10);
        assertTrue(r.getBase() == 10);
    }

    public void testGetHeight() {
        Rectangle r = new Rectangle(5,10);
        assertTrue(r.getHeight() == 10);
    }

    public void testSetHeight() {
        Rectangle r = new Rectangle(5,10);
        r.setHeight(20);
        assertTrue(r.getHeight() == 20);
    }

    public void testTestToString() {
        Rectangle r = new Rectangle(5,10);
        double base = 5;
        double height = 10;
        assertTrue(r.toString().equals("Rectangle{" + "base=" + base + ", height=" + height + '}'));
    }
}