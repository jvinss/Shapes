package org.example;

import junit.framework.TestCase;

public class HexagonTest extends TestCase {

    public void testGetSide() {
        Point center = new Point(0,0);
        Hexagon h = new Hexagon(center, 5);
        double side = h.getSide();
        assertTrue(side == 5);
    }

    public void testSetSide() {
        Point center = new Point(0,0);
        Hexagon h = new Hexagon(center, 5);
        h.setSide(10);
        double side = h.getSide();
        assertTrue(side == 10);
    }

    public void testArea() {
        Point center = new Point(0,0);
        Hexagon h = new Hexagon(center, 5);
        double area = ((3 * Math.sqrt(3))* 5 * 5)/2;
        assertTrue(h.area() == area);
    }

    public void testPerimeter() {
        Point center = new Point(0,0);
        Hexagon h = new Hexagon(center, 5);
        assertTrue(h.perimeter() == 30);
    }

    public void testTestToString() {
        Point center = new Point(0,0);
        Hexagon h = new Hexagon(center, 5);
        double side = 5;
        assertTrue(h.toString().equals("Hexagon{" + "side=" + side + ", center=" + center + '}'));
    }
}