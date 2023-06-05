package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
    public void testGetCenter() {
    }

    public void testSetCenter() {
    }

    public void testArea() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        double area = r.area();
        assertTrue(area == 50);
    }

    public void testPerimeter() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        double perimeter = r.perimeter();
        assertTrue(perimeter == 30);
    }

    public void testGetBase() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        assertTrue(r.getBase() == 5);
    }

    public void testSetBase() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        r.setBase(10);
        assertTrue(r.getBase() == 10);
    }

    public void testGetHeight() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        assertTrue(r.getHeight() == 10);
    }

    public void testSetHeight() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        r.setHeight(20);
        assertTrue(r.getHeight() == 20);
    }

    public void testTestToString() {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center,5,10);
        double base = 5;
        double height = 10;
        assertTrue(r.toString().equals("Rectangle{" + "base=" + base + ", height=" + height + '}'));
    }

    public void testInterstection() {
        Point center1 = new Point(6,4);
        Rectangle r1 = new Rectangle(center1, 8,4);

        Point center2 = new Point (9,4.5);
        Rectangle r2 = new Rectangle(center2,6 ,1);

        assertTrue(r1.Interstection(r2));
    }
}