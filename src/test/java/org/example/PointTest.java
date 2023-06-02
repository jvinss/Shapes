package org.example;

import junit.framework.TestCase;

public class PointTest extends TestCase {

    public void testGetX() {
        Point p = new Point(0,0);
        double x = p.getX();
        assertTrue(x == 0);
    }

    public void testSetX() {
        Point p = new Point(0,0);
        p.setX(5);
        double x = p.getX();
        assertTrue(x == 5);
    }

    public void testGetY() {
        Point p = new Point(0,0);
        double y = p.getY();
        assertTrue(y == 0);
    }

    public void testSetY() {
        Point p = new Point(0,0);
        p.setY(5);
        double y = p.getY();
        assertTrue(y == 5);
    }

    public void testTestToString() {
        Point p = new Point(0,0);
        double x = 0;
        double y = 0;
        String test = "Point{" + "x=" + x + ", y=" + y + '}';
        assertTrue(p.toString().equals(test));
    }
}