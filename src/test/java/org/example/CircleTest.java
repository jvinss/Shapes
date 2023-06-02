package org.example;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testGetCenter() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);

        Point centerTest = new Point(0,0);
        assertTrue(c.getCenter().toString().equals(centerTest.toString()));
    }

    public void testSetCenter() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);
        Point newCenter = new Point(5,5);
        c.setCenter(newCenter);

        assertTrue(c.getCenter().equals(newCenter));
    }

    public void testGetRadius() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);

        double testRadius = 5;
        double radius = c.getRadius();

        assertTrue(testRadius == radius);
    }

    public void testSetRadius() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);

        c.setRadius(10);
        double testRadius = 10;
        double radius = c.getRadius();
        assertTrue(testRadius == radius);
    }

    public void testArea() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);
        double area = c.getRadius() * c.getRadius() * Math.PI;

        assertTrue(area == c.area());
    }

    public void testPerimeter() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);
        double p = c.getRadius() * 2 * Math.PI;

        assertTrue(p == c.perimeter());
    }

    public void testTestToString() {
        Point center = new Point(0,0);
        Circle c = new Circle(center,5);
        double radius = 5;
        Point centerTest = new Point(0,0);

        assertTrue(c.toString().equals("Circle{" + "radius=" + radius + ", center=" + center + '}'));
    }
}