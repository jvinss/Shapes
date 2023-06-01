package org.example;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testGetSide() {
        Square s = new Square(5);
        assertTrue(s.getSide() == 5);
    }

    public void testSetSide() {
        Square s = new Square(5);
        s.setSide(10);
        assertTrue(s.getSide() == 10);
    }

    public void testArea() {
        Square s = new Square(5);
        int area = s.area();
        assertTrue(area == 25);
    }

    public void testPerimeter() {
        Square s = new Square(5);
        int perimeter = s.perimeter();
        assertTrue(perimeter == 20);
    }
}